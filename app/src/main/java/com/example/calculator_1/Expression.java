package com.example.calculator_1;

import java.util.Stack;

public class Expression {
    public static  StringBuffer toPostfix(String infix){     //中缀表达式转化成后缀表达式
        Stack<String> stack = new Stack<>();      //运算符栈
        StringBuffer postfix = new StringBuffer(infix.length()*2);    //后缀表达式字符串
        int i=0;
        while(i<infix.length())
        {
            char ch=infix.charAt(i);
            switch (ch){
                case '+':
                case '-':
                    while (!stack.isEmpty()&& !stack.peek().equals("(")) {
                        postfix.append(stack.pop());
                    }
                    stack.push(ch+" ");
                    i++;break;
                case '*':
                case '/':
                    while (!stack.isEmpty()&&(stack.peek().equals("*")||stack.peek().equals("/")))
                        postfix.append(stack.pop());
                    stack.push(ch+" ");
                    i++;break;
                case '(':
                    stack.push(ch+" ");
                    i++;break;
                case ')':
                    String out = stack.pop();
                    while (out!=null&&!out.equals("(")){
                        postfix.append(out);
                        out = stack.pop();
                    }
                    i++;break;
                default:
                    while (i<infix.length()&&ch>='0'&&ch<='9'||ch=='.'){
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
    public static  Double toValue(StringBuffer postfix){
        Stack<Double> stack = new Stack<>();
        double value = 0.0;
        String string = postfix.toString();
        String[] str = string.split(" ");  //以空格作为标识放入String字符串数组

        for (String s : str) {
            //运算后的数入栈
            if(isNum(s)) {             //判断该数组元素是否是数字
                value = Double.parseDouble(s);
            }                               //当当前数组元素类型不是数字时，操作数栈出栈两个元素运算
            else {
                Double y = stack.pop();
                Double x = stack.pop();
                switch (s) {
                    case "+":
                        value = x + y;
                        break;
                    case "-":
                        value = x - y;
                        break;
                    case "*":
                        value = x * y;
                        break;
                    case "/":
                        value = x / y;
                        break;
                }
            }
            stack.push(value);
        }


        return stack.pop();
    }

    public static boolean isNum(String s) {
        boolean is = false;
        for(int i=0;i<s.length();i++) {
            is = Character.isDigit(s.charAt(i));
        }
        return is;
    }
    public String calculate(String infix){
        StringBuffer postfix = toPostfix(infix);
        double result = toValue(postfix);
        return result+"";
    }
}
