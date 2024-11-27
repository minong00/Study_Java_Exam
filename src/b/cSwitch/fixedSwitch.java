package b.cSwitch;

public class fixedSwitch {
    public static void main(String[] args) {
        int a=1;

        String b= "2";
        switch (a) {
            case 1 -> a=3;
            case 2 -> a=4;
            case 3 -> a=5;
            case 4 -> a=6;
            case 5 -> a=7;
        }
        /*
        b=switch (a) {
            //case 1 ->
                //yield "2";
            case 2 -> a=4;
            case 3 -> a=5;
            case 4 -> a=6;
            case 5 -> a=7;
        }
*/
    }
}
