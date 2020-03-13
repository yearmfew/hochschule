/*		import java.lang.Math;


		public class übungen7{
			public static double zinssatz (int betrag, double z1, double z2){

				double result = betrag * Math.pow((1+z1/100),z2);
				return result;


			}


			public static void main (String[] args){
		// Write your codes...

				



				double result = zinssatz(100, 8, 10);
				System.out.println(result);
			}
		}*/





		public class übungen7{

			public static int mitt(int z1, int z2, int z3){

				int mittlerwert = (z1 + z2 + z3) / 3;

				return mittlerwert;


			}

			public static void main (String[] args){
		// Write your codes...

				System.out.println(mitt(5, 10, 15));

			}
		}