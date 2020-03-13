import java.lang.Math;
import java.util.Scanner;

public class übungen{
	
// square function Start
	public static double Leistungberechnen (double zahl1, double zahl2){
		

		double result = Math.pow(zahl1,zahl2);
		return result;
	}
// square function End

// check function Start

	public static boolean check(double zahl1, int zahl2, int zahl3){


		if (zahl1 < zahl2 || zahl1 >zahl3){

			System.out.println("Sie müssen ein nummer zwischen 1 und 8 eingeben");
			return true;
		}else {
			return false;
		}
		
	}


// check function End


	public static void main (String[] args){
		// Write your codes...
		
		double zahl1, zahl2;
		do{	
			Scanner input = new Scanner(System.in);
			System.out.println("Ausgeben Sie erste nummer");


			zahl1 = input.nextDouble();
		} while (check(zahl1, 1, 8));	


		do{	
			Scanner input = new Scanner(System.in);
			System.out.println("Ausgeben zweite erste nummer");


			zahl2 = input.nextDouble();
		} while (check(zahl2, 2, 4));	


		double result = Leistungberechnen(zahl1, zahl2);
		System.out.println(result);


	}





}
