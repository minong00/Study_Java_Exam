package b.cSwitch;

public class fixedSwitch {
    public static void main(String[] args) {
        int a=1;
        switch (a) {
            case 1 -> a=3;//이런식으로 사용한다
            case 2 -> a=4;
            case 3 -> a=5;
            case 4 -> a=6;
            case 5 -> a=7;

            default -> a=8;
        }

    }
}
