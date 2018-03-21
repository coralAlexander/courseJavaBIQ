package Inheretance_Interface_expressions;

public class Number implements Expression {
    private double  num;
	public Number(double num) {
		this.num=num;
	}
	@Override
	public double evaluate() {
		return num;
	}
	@Override
	public String toString() {
		
		if (num < 0) {
			return "("+num+")";	
		}
		else {
			return ""+num;
		}
		
	}

}
