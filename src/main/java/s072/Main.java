package s072;

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate
//        Abstract ma = new Abstract();
//        Abstract2 ma2 = new Abstract2();

        Abstract ma = new Concrete();//lo posso fare perché concrete è una classe derivata da astratto.
        ma.anAbstractMethod();

        Abstract2 ma2 = new Concrete2();
        ma2.aConcreteMethod();
    }
}
