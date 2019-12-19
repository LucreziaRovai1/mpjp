package s070;

public class Main {
    public static void main(String[] args) {
        Barker[] barkers = new Barker[2];//array di reference a interface. L'interfaccia non ha il costruttore, quindi new barker da solo non è fattibile. L'array di interfaccia invece si può fare, mettendoci elementi che implementano la mia interfaccia.
        
        barkers[0] = new Fox();
        barkers[1] = new Dog();

        for(Barker barker: barkers) {
            System.out.println(barker.bark());
        }
        
        BarkAndWag baw = new Dog();
        System.out.println(baw.tailWaggingSpeed());

        Dog dog = new Dog();
        System.out.println(dog.bark(3));//il metodo bark contiene un parametro di tipo intero, ma nell'interface io ho solo bark senza l'intero tra parentesi. Quello lo trovo in Dog.java, quindi lo posso applicare solo ad un oggetto e non ad un interface.
    }
}
