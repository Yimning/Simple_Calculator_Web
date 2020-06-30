package cn.calculator;

import java.math.BigDecimal;

//封装计算器数据的Bean 	
public class calculator {

	private String firstNum = "0" ;
	private String secondNum = "0";
	private char oper = '+';
	private String result = "0";
	
	public String getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(String firstNum) {
		this.firstNum = firstNum;
	}
	public String getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(String secondNum) {
		this.secondNum = secondNum;
	}
	public char getOper() {
		return oper;
	}
	public void setOper(char oper) {
		this.oper = oper;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	public void calculate(){
		
		BigDecimal first = new BigDecimal(this.firstNum);
		BigDecimal second = new BigDecimal(this.secondNum) ;
		
		switch(this.oper){
		case '+':
			this.result = first.add(second).toString();
			break;
		case '-':
			this.result = first.subtract(second).toString();
			break;
		case '*':
			this.result = first.multiply(second).toString();
			break;
		case '/':
				this.result = first.divide(second,10,BigDecimal.ROUND_HALF_UP).toString();
			
			break;
		default : break;
		}
		
	}
	
}