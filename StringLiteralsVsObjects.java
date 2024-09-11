package JavaPackage;

public class StringLiteralsVsObjects {
	public static void main(String[] args) {
		String str1 = "kavitha";
		String str2 = new String("kavitha");
		String str3 = "kavitha";
		
		System.out.println(str1==str3);
		
		System.out.println(str1==str2);
	}
	

}
