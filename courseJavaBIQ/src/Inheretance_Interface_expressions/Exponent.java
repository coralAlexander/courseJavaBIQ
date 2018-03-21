package Inheretance_Interface_expressions;

public class Exponent extends AbstractClass {

	public Exponent(Expression ex1, Expression ex2) {
		super(ex1,ex2);	
	}
	@Override
	public String toString() {
		return "(" + ex1 + " ^ " + ex2 + ")";
	}

	@Override
	public double evaluate() {
		return Math.pow(ex1.evaluate(),ex2.evaluate());
	}
	
	

}
