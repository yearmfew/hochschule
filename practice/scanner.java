import java.util.Scanner;

public class scanner{

	// function to take number from user
	public static int inputNumber(){

		int num;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		return num;
	}
	// function to take text from user
	public static String inputString(){
		String text;
		Scanner s = new Scanner(System.in);
		text = s.nextLine();
		return text;
	}



}