package s076;

public class Main {
    public static void main(String[] args) {
        Dog tom = new Dog("Tom");

        String name = tom.getName();
        double speed = tom.getSpeed();

        System.out.println("Name and speed: " + name + ", " + speed);
        System.out.println("Color: "  + tom.getColor()); //noi stiamo lavorando su Pet, ma pet essendo un Dog può essere chiamato anche qua.
        // se voglio cambiare il colore al mio Tom metto tom.setColor.
    }
}
