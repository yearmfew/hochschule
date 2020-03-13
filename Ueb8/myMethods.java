import java.lang.Math;

public class myMethods {
	// Write your codes...



// square function Start
	public static double Leistungberechnen (int zahl1, int zahl2){


		double result = Math.pow((double)zahl1, (double)zahl2);
		return result;
	}
// square function End

// check function Start

	public static boolean check(int zahl1, int zahl2, int zahl3){


		if (zahl1 < zahl2 || zahl1 >zahl3){

			System.out.println("Sie müssen ein nummer zwischen " + zahl2 + " und " + zahl3 + " eingeben");
			return true;
		}else {
			return false;
		}

	}


// check function End

	public static void main (String[] args){


	}
}