// Bai lam lab06

class Expression{
	public String toString(){
		return null;
	}
	public int evaluate(){
		return 0;
	}
}
class Numeral extends Expression{
	private int value;
	public Numeral( int x){
		value = x;
	}
	public Numeral(){
		value = 0;
	}
	public String toString(){
		return value + " ";
	}
	public int evaluate(){
		return value;
	}
}
class Square extends Expression{
	private Expression expression;
	public Square ( Expression x){
		expression  = x;
	}
	public String toString(){
		return expression.toString() + "^2";
	}
	public int evaluate(){
		return expression.evaluate() * expression.evaluate();
	}
}
class BinaryExpression extends Expression{
	public Expression left(){
		return null;
	}
	public Expression right(){
		return null;
	}
}
class Addition extends BinaryExpression{
	private Expression left;
	private Expression right;
	public Addition (  Expression l, Expression r){
		left = l;
		right = r;
	}
	public String toString(){
		return "(" + left.toString() + "+" + right.toString() + ")";
	}
	public int evaluate() {
		return left.evaluate() + right.evaluate();
	}
}
class Subtraction extends BinaryExpression{
	private Expression left;
	private Expression right;
	public Subtraction(  Expression l, Expression r){
		left = l;
		right = r;
	}
	public String toString(){
		return "(" + left.toString() + "-" + right.toString() + ")";
	}
	public int evaluate() {
		return left.evaluate() - right.evaluate();
	}
}
class Multiplication extends BinaryExpression{
	private Expression left;
	private Expression right;
	public Multiplication (  Expression l, Expression r){
		left = l;
		right = r;
	}
	public String toString(){
		return "(" + left.toString() + "*" + right.toString() + ")";
	}
	public int evaluate() {
		return left.evaluate() * right.evaluate();
	}
}
class Division extends BinaryExpression{
	private Expression left;
	private Expression right;
	public Division (  Expression l, Expression r){
		left = l;
		right = r;
	}
	public String toString(){
		return "(" + left.toString() + "/" + right.toString() + ")";
	}
	public int evaluate() {
		if(right.evaluate() != 0)
			return (left.evaluate() / right.evaluate());
		else return 0;
	}
}
public class ExpresstionTest
{
	public static void main (String [] args)
	{
		Numeral e3 = new Numeral(3);
		Expression e32 = new Square( e3);
		Expression e321 = new Addition(e32, new Numeral(2));
		
		Expression e = new Square(e321);
		
		System.out.println(e+" = " + e.evaluate());
		
		
		Numeral a3 = new Numeral(3);
		Expression a32 = new Square( a3);
		Expression a321 = new Subtraction(a32, new Numeral(2));
		
		Expression a = new Square(a321);
		
		System.out.println(a+" = " + a.evaluate());
		
		
		Numeral b3 = new Numeral(3);
		Expression b32 = new Square( b3);
		Expression b321 = new Multiplication(b32, new Numeral(2));
		
		Expression b = new Square(b321);
		
		System.out.println(b+" = " + b.evaluate());
		
		Numeral c3 = new Numeral(3);
		Expression c32 = new Square( c3);
		Expression c321 = new Division(c32, new Numeral(2));
		
		Expression c = new Square(c321);
		
		System.out.println(c+" = " + c.evaluate());
	}

}