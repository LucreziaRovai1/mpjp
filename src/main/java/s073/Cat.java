package s073;

public class Cat extends Mammal {
    private Tail tail;

    public Cat(int gestationDays, int tailLen) {//riconosco che è il costruttore perché ha lo stesso nome della classe e non ha un tipo, public non è un tipo
        super(gestationDays);//Super= dobbiamo risalire la gerarchia e richiamare un qualcosa che sta alla base. Anche questo è un costruttore
        this.tail = new Tail(tailLen);
    }

    @Override
    public String toString() {
        return "Cat [tail=" + tail + ", gestation=" + gestation + "]";//tail è di tipo Tail, ovvero il nome della classe
    }//riesco a vedere gestation perché la classe madre è protected quindi la figlia può vedere proprietà e metodi della classe madre.
}
