import java.util.Scanner;

public class Eingabe
{

      public static int zahleingeben()
      {
        int zahl;
		Scanner s = new Scanner(System.in);
        zahl = s.nextInt();
        return zahl;
       }
}