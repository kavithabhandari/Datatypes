package JavaPackage;

public class dowhileloop {

	public static void main(String[] args) {
		int i = 1;
		do 
		{
			System.out.println(i);
			i++;
		}
		while(i>10);
		
		//Difference btw while and do while in while loop if condition is false it will not print anything but in do while
		//it will execute atleast once
		
		// below is while example
		
		while(i>10)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("out of while loop");
	}
	

}
