package com.example.calculator_1;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity{

    StringBuilder str;

    Button num0,num1,num2,num3,num4,num5,num6,num7,num8,num9,add,sub,mul,div,l_bracket,r_bracket
            ,point,pai,percent,result,help,ac,del,quit,sin,cos,tan,factorial,square,menu;
    EditText edit_box;
    Expression e ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        str = new  StringBuilder();
        edit_box = findViewById(R.id.edit1);
        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        l_bracket = findViewById(R.id.l_bracket);
        r_bracket = findViewById(R.id.r_bracket);
        del = findViewById(R.id.del);
        point = findViewById(R.id.point);
        pai = findViewById(R.id.pai);
        result = findViewById(R.id.result);
        help = findViewById(R.id.help);
        ac = findViewById(R.id.ac);
        percent = findViewById(R.id.percent);
        quit = findViewById(R.id.quit);
        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        factorial = findViewById(R.id.factorial);
        square = findViewById(R.id.square);
        menu = findViewById(R.id.menu);
        e = new Expression();


        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("0");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("1");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("2");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("3");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("4");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("5");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("6");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("7");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("8");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("9");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("+");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("-");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("*");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("/");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        l_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("(");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        r_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append(")");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append(".");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        pai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append(Math.PI+"");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.append("/100");
                edit_box.setText(str);
                edit_box.setSelection(edit_box.getText().length());
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer stringBuffer = Expression.toPostfix(str.toString());
                double result = Expression.toValue(stringBuffer);
                String re = result+"";
                edit_box.setText(re);
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.delete(0,str.length());
                edit_box.setText(null);
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str.delete(str.length()-1,str.length());
                edit_box.setText(str);
            }
        });
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,change.class));
            }
        });
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            Log.i("info","landscape"); // 横屏
            sin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double result = getSin(str+"");
                    String r = result+"";
                    edit_box.setText(r);
                }
            });
            cos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double result = getCos(str.toString());
                    String r = result+"";
                    edit_box.setText(r);
                }
            });
            tan.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double result = getTan(str.toString());
                    String r = result+"";
                    edit_box.setText(r);
                }
            });
            factorial.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
            square.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double result = getSquare(str+"");
                    String r = result+"";
                    edit_box.setText(r);
                }
            });
            help.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("这是一个帮助").setTitle("帮助框");
                    builder.setPositiveButton("返回", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Toast.makeText(MainActivity.this,"已返回",Toast.LENGTH_LONG).show();
                        }
                    });
                    builder.show();
                }
            });

        } else if(this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            Log.i("info","portrait"); // 竖屏
        }
    }
    public double getSin(String string){
        double a = Double.parseDouble(string);
        return Math.sin(a*180/Math.PI);
    }
    public double getCos(String string){
        double a = Double.parseDouble(string);
        return Math.cos(a*180/Math.PI);
    }
    public double getTan(String string){
        double a = Double.parseDouble(string);
        return Math.sin(a*180/Math.PI);
    }
    public double getSquare(String string){
        double a = Double.parseDouble(string);
        return Math.pow(a,2);
    }
}