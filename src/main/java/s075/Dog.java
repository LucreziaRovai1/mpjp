package s075;

public class Dog {
	private static final String DEFAULT_NAME = "???";
	private static final int DEFAULT_WEIGHT = 7;

	private String name;
	private int weight;

	public Dog() {//chiamo il costruttore alla riga 22, mettendogli un nome di default
		this(DEFAULT_NAME, DEFAULT_WEIGHT);
	}

	public Dog(String name) {//il nome è quello che mi dice l'utente, il peso è di default
		this(name, DEFAULT_WEIGHT);
	}

	public Dog(int weight) {
		this(DEFAULT_NAME, weight);
	}

	public Dog(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {//se voglio leggere una proprietà chiamo un "getter": quello che mi ritorna un valore
		return name;
	}

    @Override
    public String toString() {
        return "S75Dog [name=" + name + ", weight=" + weight + "]";
    }
}
