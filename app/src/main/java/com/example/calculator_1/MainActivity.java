package com.example.calculator_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText ;
    TextView textView ;
    Expression e ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         editText = findViewById(R.id.e1);
       textView = findViewById(R.id.t1);
         e = new Expression();
    }
    public void onClick(View v){
        int id = v.getId();
        if (id == R.id.b1) {
            String infix = editText.getText().toString();
            StringBuffer postfix = toPostfix(infix);
            textView.setText(toValue(postfix));
        }
    }
    public static StringBuffer toPostfix(String infix){     //中缀表达式转化成后缀表达式
        Stack<String> stack = new SeqStack<>(infix.length());      //运算符栈
        StringBuffer postfix = new StringBuffer(infix.length()*2);    //后缀表达式字符串
        int i=0;
        while(i<infix.length())
        {
            char ch=infix.charAt(i);
            switch (ch){
                case '+':
                case '-':
                    while (!stack.isEmpty()&&!stack.peek().equals(")"))
                        postfix.append(stack.pop());
                    stack.push(ch+"");
                    i++;break;
                case '*':
                case '/':
                    while (!stack.isEmpty()&&(stack.peek().equals("*")||stack.peek().equals("/")))
                        postfix.append(stack.pop());
                    stack.push(ch+"");
                    i++;break;
                case '(':
                    stack.push(ch+"");
                    i++;break;
                case ')':
                    String out = stack.pop();
                    while (out!=null&&!out.equals("(")){
                        postfix.append(out);
                        out = stack.pop();
                    }
                    i++;break;
                default:
                    while (i<infix.length()&&ch>='0'&&ch<='9'){
                        postfix.append(ch);
                        i++;
                        if(i<infix.length())
                            ch = infix.charAt(i);
                    }
                    postfix.append(" ");
            }
        }
        while (!stack.isEmpty())
            postfix.append(stack.pop());
        return postfix;
    }
    public static int toValue(StringBuffer postfix){
        Stack<Integer> stack = new LinkedStack<>();
        int value =0;
        for(int i=0;i<postfix.length();i++){
            char ch = postfix.charAt(i);
            if(ch>'0'&&ch<='9'){
                value = 0;
                while (ch != ' ') {
                    value=value*10+ch-'0';
                    ch = postfix.charAt(++i);
                }
                stack.push(value);
            }
            else {
                if(ch!=' '){
                    int y = stack.pop(),x=stack.pop();
                    switch (ch){
                        case '+':value = x+y;break;
                        case '-':value = x-y;break;
                        case '*':value =x*y;break;
                        case '/':value =x/y;break;
                    }
                    System.out.print(x+(ch+"")+y+"="+value+",");
                    stack.push(value);
                }
            }
        }
        return stack.pop();
    }
}