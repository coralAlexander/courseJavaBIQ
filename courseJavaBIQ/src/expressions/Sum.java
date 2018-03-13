package expressions;

public class Sum extends AbstractClass {
   
	public Sum(Expression ex1, Expression ex2) {
		super(ex1,ex2);	
	}
	@Override
	public String toString() {
		return "(" + ex1 + " + " + ex2 + ")";
	}

	@Override
    public double evaluate() {
		return ex1.evaluate() + ex2.evaluate();
	}  

}
