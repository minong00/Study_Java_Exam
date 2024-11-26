package b.cSwitch;

public class switchCase {
    public static void main(String[] args) {

        int a=1;
        switch(a){

            case 1: {
                System.out.println();
                break;//브레이크를 쓰면 다름 케이스로 안넘어감
            }
            case 2:{
                //케이스도 여러개 가능
            }
        default:{
            //디폴트도 있다
        }
        }

    }
}
