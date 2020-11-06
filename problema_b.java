import java.util.Scanner;
public class problema_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,w=0,h=0,x=0,y=0;
        for (int i = 0; i < n; i++) {
            c=sc.nextInt();
            w=sc.nextInt();
            h=sc.nextInt();
            for (int j = 0; j < c; j++) {
                x=sc.nextInt();
                y=sc.nextInt();
                
            }
            if(w > 4){
                System.out.println("SAFE");
            }else{
                System.out.println("RISKY");
            }
        }
    }
}
