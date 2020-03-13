import java.util.Date;

public class datum{

public static String aktuellDatum(){

	String aktuellDatum;
	Date datum = new Date();
	aktuellDatum = datum.toString();
	return aktuellDatum;
}	


}