package s050;

public class AboutStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(20);
        StringBuilder sb3 = new StringBuilder("hello");
        
        System.out.println("capacity 1: " + sb.capacity());//capacity=quanto spazio ha java per lavorarci sopra
        System.out.println("capacity 2: " + sb2.capacity());
        System.out.println("capacity 3: " + sb3.capacity());
        
        System.out.println("appending: " + sb3.append(' ').append("world"));//aggiungo caratteri allo stringbuilder corrente, non creo una nuova stringa
        
        System.out.println("char at position 1 in sb3 is '" + sb3.charAt(1) + "'");
        
        System.out.println("deleting: " + sb3.delete(5, 10).deleteCharAt(2));//ritorna un reference allo stringbuilder corrente, in tutti questi casi
        
        System.out.println("index of \"elo\": " + sb3.indexOf("elo"));//sì, parte dall'indice 1
        
        System.out.println("inserting \"lo c\" at 3: " + sb3.insert(3, "lo c"));
        
        System.out.println("current sb3 length: " + sb3.length());
        
        System.out.println("replace section 2-7 with \"r r\": " + sb3.replace(2, 7, "r r"));
        
        System.out.println("reversing: " + sb3.reverse());
        
        sb3.setCharAt(5, 'a');
        System.out.println("setCharAt: " + sb3);//per modificare un carattere nella stringa
        
        sb3.setLength(3);
        System.out.println("setLength: " + sb3);//tipicamente per accorciare la stringa, quello che non uso viene buttato via
    }
}
