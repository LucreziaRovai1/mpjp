package s049;

public class AboutString {
    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        System.out.println("char at position 1 in s: " + s.charAt(1));// mi stampa il carattere che è in posizione 1, quindi "e"

        System.out.println("s < t: " + s.compareTo(t));//confronta s con t
        System.out.println("t > s: " + t.compareTo(s));

        System.out.println("concat s and t: " + s.concat(t));

        System.out.println("t contains u? " + t.contains(u));

        String u2 = t.substring(1, 3);//genera una nuova stringa
        System.out.println("u2 = t.substring(1, 3): " + u2); // l'elemento a sinistra è incluso, a destra escluso
        System.out.println("t.substring(3): " + t.substring(3));// qui significa, dalla posizione 3 in poi.

        System.out.println("u equals u2? " + u.equals(u2));//c'è "or" in tutte e due, sono uguali. il metodo equal guarda il contenuto.
        System.out.println("u == u2? " + (u == u2));//il reference delle due stringhe è diverso

        System.out.println("First index of 'l' is s: " + s.indexOf('l'));// cerco l'indice di un carattere all'interno della stringa.Se ce ne sono più di una mi calcola solo la prima
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));
        System.out.println("there is no 'x' in s: " + s.indexOf('x'));
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));//l'indice della stringa 'll'
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));//se non c'è mi ricorda -1

        System.out.println("check if an empty string is empty: " + "".isEmpty());//vuota, non che sia null

        System.out.println("s length: " + s.length());//nelle stringhe lenght è un metodo e non una proprietà

        String s2 = s.replace('l', 'q');
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

        String[] splits = "one for me, one for you".split(" ");//trasforma la stringa in un array di stringhe. lo spazio bianco in questo caso è quello che mi fa lo split.
        System.out.println("Splitting: ");
        for (String token : splits) {
            System.out.println(token);
        }
        String joined = String.join(" ", splits);//capisco che è un metodo statico perché a sinistra del punto c'è il nome della classe e non l'oggetto
        System.out.println("Joining back [" + joined + "]");

        System.out.println("upper: " + s.toUpperCase());//non mi cambia la scritta corrente, mi fornisce una copia
        System.out.println("lower: " + "SHUT UP!".toLowerCase());

        System.out.println("trim [" + " la la la ".trim() + "]");//elimina gli spazi bianchi all'inizio e alla fine della mia stringa.
        
        String x = null;
        System.out.println("Sort of safe toString(): " + String.valueOf(x));//valueof è un metodo che mi crea una stringa a partire dall'x che gli passo 
    }
}
