package dsa_with_java;

public abstract class ArithmeticOperation 
{
	
 abstract void add(int num1,int num2);
}
class Sum extends ArithmeticOperation
{
	void add(int num1,int num2) {
		int c=num1+num2;
		IO.println(c);
		
	}
}

