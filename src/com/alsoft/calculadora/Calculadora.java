package com.alsoft.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Calculadora extends Activity implements OnClickListener{
	Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,dividir,multiplicar,sumar,restar,resultado,borrar;
	TextView pantalla;
	String operacion="";
	int txtresultado=0,a=0,b=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculadora);
		this.pantalla=(TextView)this.findViewById(R.id.textview0);
		this.btn_0=(Button)this.findViewById(R.id.btn0);
		this.btn_0.setOnClickListener(this);
		this.btn_1=(Button)this.findViewById(R.id.btn1);
		this.btn_1.setOnClickListener(this);
		this.btn_2=(Button)this.findViewById(R.id.btn2);
		this.btn_2.setOnClickListener(this);
		this.btn_3=(Button)this.findViewById(R.id.btn3);
		this.btn_3.setOnClickListener(this);
		this.btn_4=(Button)this.findViewById(R.id.btn4);
		this.btn_4.setOnClickListener(this);
		this.btn_5=(Button)this.findViewById(R.id.btn5);
		this.btn_5.setOnClickListener(this);
		this.btn_6=(Button)this.findViewById(R.id.btn6);
		this.btn_6.setOnClickListener(this);
		this.btn_7=(Button)this.findViewById(R.id.btn7);
		this.btn_7.setOnClickListener(this);
		this.btn_8=(Button)this.findViewById(R.id.btn8);
		this.btn_8.setOnClickListener(this);
		this.btn_9=(Button)this.findViewById(R.id.btn9);
		this.btn_9.setOnClickListener(this);
		this.dividir=(Button)this.findViewById(R.id.division);
		this.dividir.setOnClickListener(this);
		this.multiplicar=(Button)this.findViewById(R.id.multiplicacion);
		this.multiplicar.setOnClickListener(this);
		this.sumar=(Button)this.findViewById(R.id.suma);
		this.sumar.setOnClickListener(this);
		this.restar=(Button)this.findViewById(R.id.resta);
		this.restar.setOnClickListener(this);
		this.resultado=(Button)this.findViewById(R.id.igual);
		this.resultado.setOnClickListener(this);
		this.borrar=(Button)this.findViewById(R.id.btnce);
		this.borrar.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub 			
		switch(arg0.getId()){
			case R.id.btn0:
				valor("0");
				break;
			case R.id.btn1:
				valor("1");
				break;
			case R.id.btn2:
				valor("2");
				break;
			case R.id.btn3:
				valor("3");
				break;
			case R.id.btn4:
				valor("4");
				break;
			case R.id.btn5:
				valor("5");
				break;
			case R.id.btn6:
				valor("6");
				break;
			case R.id.btn7:
				valor("7");
				break;
			case R.id.btn8:
				valor("8");
				break;
			case R.id.btn9:
				valor("9");
				break;
			case R.id.btnce:
				this.pantalla.setText("0");
				a=0;b=0;
				operacion="";
				this.txtresultado=0;
				break;
			case R.id.division:
				if(operacion.compareTo("/")==0){					
					b=Integer.parseInt(this.pantalla.getText().toString());
					a=a/b;
					b=0;
				}else{
					a=Integer.parseInt(this.pantalla.getText().toString());
					operacion="/";									
				}
				this.pantalla.setText("0");
				break;
			case R.id.multiplicacion:
				if(operacion.compareTo("x")==0){					
					b=Integer.parseInt(this.pantalla.getText().toString());
					a=a*b;
					b=0;
				}else{
					a=Integer.parseInt(this.pantalla.getText().toString());
					operacion="x";									
				}
				this.pantalla.setText("0");
				break;
			case R.id.resta:
				if(operacion.compareTo("-")==0){					
					b=Integer.parseInt(this.pantalla.getText().toString());
					a=a-b;
					b=0;	
				}else{
					a=Integer.parseInt(this.pantalla.getText().toString());
					operacion="-";									
				}
				this.pantalla.setText("0");
				break;
			case R.id.suma:				
				if(operacion.compareTo("+")==0){					
					b=Integer.parseInt(this.pantalla.getText().toString());
					a=a+b;
					b=0;							
				}else{
					a=Integer.parseInt(this.pantalla.getText().toString());
					operacion="+";									
				}
				this.pantalla.setText("0");
				break;			
			case R.id.igual:
				b=Integer.parseInt(this.pantalla.getText().toString());
				if(operacion.equals("+")){					
					txtresultado=a+b;					
				}else if(operacion.equals("-")){
					txtresultado=a-b;
				}else if(operacion.equals("x")){
					txtresultado=a*b;
				}else if(operacion.equals("/")){
					txtresultado=a/b;					
				}
				a=0;
				operacion="";
				this.pantalla.setText(""+txtresultado);
				break;
		}
	}
	public void valor(String valor) {
		String concatenar="";	
		concatenar=this.pantalla.getText().toString();
		if(concatenar.equals("0")){
			concatenar=valor;
		}else{
			concatenar=concatenar+valor;				
		}
		this.pantalla.setText(concatenar);	
	}
}
