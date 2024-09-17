package JavaPackage;

public class ternaryoperatordemo {

	public static void main(String[] args) {
		//variable = (condition)? TrueExpression : FalseExpression;
		int num1 = 30;
		int num2 = 60;
		
		String result = (num1 > num2)? "num1>num2" : "num2>num1";
		System.out.println(result);

	}

}
