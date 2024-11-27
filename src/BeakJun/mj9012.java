package BeakJun;
import java.util.Scanner;

public class mj9012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();//숫자 입력
        int[] ccnt=new int[n];
        int[] cnt=new int[n];
        String[] b=new String[n];

        for(int i=0;i<n;i++){
            b[i]=in.next();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<b[i].length();j++) {
                if (b[i].charAt(j) == '(') {
                    cnt[i] += 1;
                }
                if(b[i].charAt(j) == ')'){
                    ccnt[i] += 1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(ccnt[i]==cnt[i]){
                System.out.println("YES");
            }
             else if(b[i].length()%2==1){
                if(b[i].charAt(0)==')'){
                    System.out.println("NO");
                }

            }
            else{
                System.out.println("NO");
            }
        }
    }
}
