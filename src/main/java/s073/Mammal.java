package s073;

public abstract class Mammal {
    protected int gestation;//proprietà

    public Mammal(int gestation) {//è un costruttore perché ha lo stesso nome della classe
        this.gestation = gestation;//this è il reference all'oggetto corrente. voglio mettere gestation nella proprietà gestation
    }

    @Override
    public String toString() {                       
    	//metodo che mi ritorna una nuova stringa
        return "Mammal [gestation=" + gestation + "]";//implicitamente la classe madre di mammal sarà Objet sicuramente
    }
}
