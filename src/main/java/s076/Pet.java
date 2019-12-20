package s076;

public class Pet {
	private static final String DEFAULT_NAME = "My pet";
	private static final String DEFAULT_COLOR = "white";
	private String name;
	private String color;
	
	
	public Pet() {//se io faccio un new pet senza passare parametri, è equivalente a chiamare un pet con un nome di default, quindi passa alla riga 14. Ma allora passerà anche un default color, e così via.
		this (DEFAULT_NAME);
	}

	public Pet(String name) {// se uno mi chiama pet chiamando solo il nome, io vado alla riga 15 e gli ritorno anche il colore di default
		this (name, DEFAULT_COLOR);
//		this.name = name; per non ripeterle, cancello e scrivo la riga 10
//		this.color = DEFAULT_COLOR;
	}

	public String getColor() {//andando su Source > generate getter and setter. Get serve a far accedere a certe proprietà della mia classe
		return color;
	}

	public void setColor(String color) {//se voglio che il mio utente possa modificare la mia proprietà, io uso il setter.
		this.color = color;
	}

	public Pet(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}
}