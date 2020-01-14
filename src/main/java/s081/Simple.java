package s081;

public class Simple {// è unchecked perché qua(signature del metodo) non ho messo il "throws"
	public int negate(int value) {
		if (value == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Can't negate MIN_VALUE");// perché la prima cella è sempre riservata al
																			// segno, quindi tra i valori -128 e 127 non
																			// esiste il corrispettivo positivo di -128
		}
		return -value;
	}

	public int negate2(int value) throws MyNegateException {
		if (value == Integer.MIN_VALUE) {
			throw new MyNegateException(Integer.MAX_VALUE);
		}
		return -value;
	}

	public static void main(String[] args) {

		Simple simple = new Simple();
		
		try {
			int value = Integer.parseInt(args[0]);
			System.out.println("Negate " + value);
			int x = simple.negate2(value);
			System.out.println("My value negated is: " + x);
		} catch (MyNegateException mne) {
			System.out.println("My value negated is close to: " + mne.getAlternativeValue());
			return; //metto return perché il metodo è void e devo fargli capire che ha finito e deve terminare l'esecuzione in quel punto

		} catch (NumberFormatException | ArrayIndexOutOfBoundsException ex ) {
			System.out.println("Pass me an integer!");
			return;
		}
	}
}

class MyNegateException extends Exception {
	private static final long serialVersionUID = 1L;
	private int alternativeValue;

	public MyNegateException(int alternativeValue) {// inizializzo la proprietà attraverso il costruttore
		this.alternativeValue = alternativeValue;
	}

	public int getAlternativeValue() {// metto get per ritornarmi qual è questo valore, poiché essendo private non lo
										// so
		return alternativeValue; // non c'è modo di cambiarlo perché è privata, se non col setter.
	}
}
