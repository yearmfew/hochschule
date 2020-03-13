
public class Ueb8{
	public static void main (String[] args){
// Write your codes...


		//Eingabe zahlein = new Eingabe();

		//myMethods myMethods = new myMethods();



		int zahl1, zahl2;
		do{	

			System.out.println("Ausgeben Sie erste nummer");


			zahl1 = Eingabe.zahleingeben();
		} while (myMethods.check(zahl1, 1, 8));	


		do{	

			System.out.println("Ausgeben zweite erste nummer");


			zahl2 = Eingabe.zahleingeben();
		} while (myMethods.check(zahl2, 2, 4));	


		double result = myMethods.Leistungberechnen(zahl1, zahl2);
		System.out.println(result);

	}
}

