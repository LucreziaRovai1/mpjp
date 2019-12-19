package s062;

public class Scope {
    private static int staticMember = 5;
    private long member = 5;

    public void f() {//questo metodo non è statico, non lo posso richiamare nell'ultimo blocco. per farlo, dovrei creare un nuovo oggetto e chiamare con il punto il metodo
        int local = 7;//questa local non ha niente a che fare con quella sotto
        if (staticMember == 2) {//static member invece è statica e quindi la posso accedere ovunque
            short inner = 12;
            staticMember = 1 + inner;
            member = 3 + local;
        }
    }

    public void g() {
        System.out.println(member);
    }
    
    public static void main(String[] args) {//non vede member perché non ho l'oggetto di tipo scope, poiché private long member non è un metodo statico, quindi la classe non lo legge. Bisognerebbe creare un oggetto nella classe.
        double local = 5;
        System.out.println(local);
        staticMember = 12;
    }
}
