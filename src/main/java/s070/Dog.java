package s070;

public class Dog implements BarkAndWag {
    @Override
    public String bark() {
        return "woof!";
    }

    public String bark(int count) {//è diverso dal primo string bark, perché c'è il parametro dentro. Il nome bark in questo caso ha due significati=overload
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(bark());//ripete woof
        }

        return sb.toString();
    }

    @Override
    public int tailWaggingSpeed() {
        return BarkAndWag.AVG_WAGGING_SPEED;
    }
}