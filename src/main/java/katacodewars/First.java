package katacodewars;

public class First {
	static String noSpace(final String x) {

		return x.replace(" ", ""); // rimpiazza lo spazio bianco con la sottostringa vuota. così facendo abbiamo creato un nuovo oggetto nello heap	

	}
} // è il più rapido, si poteva anche utilizzare lo stringbuilder e un ciclo for (int i=0; i<x.length;i++). 
// poi mi metto char cur=x.charAt(i);
// if (cur != ' ') {
//sb.append (cur)}
//return sb.toString()

//n.b: il carattere tab si indica '/t'; il vai a capo come '/n'. Quindi avrei messo, per essere più precisa:
// if (!Character.isWhitespace (cur)) (è un booleano, quindi NON voglio che quello sia uno spazio bianco, per appenderlo)

		