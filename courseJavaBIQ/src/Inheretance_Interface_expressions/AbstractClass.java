package Inheretance_Interface_expressions;

public abstract class AbstractClass implements Expression  {

	protected Expression ex1;
	protected Expression ex2;
	
	public AbstractClass(Expression ex1, Expression ex2) {
		this.ex1=ex1;
		this.ex2=ex2;
	}	
}
