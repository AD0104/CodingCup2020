import java.util.Scanner;
public class problema_g {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1,x2,y1,y2,h1,h2,w1,w2;
        //figura A
        x1=sc.nextInt();
        y1=sc.nextInt();
        w1=sc.nextInt();
        h1=sc.nextInt();

        //figura B
        x2=sc.nextInt();
        y2=sc.nextInt();
        w2=sc.nextInt();
        h2=sc.nextInt();

        //casos 3,5,7
        if(x1 < x2){
            if(y1 < y2){
                System.out.println(5);
                return;
            }else if(y1 == y2){
                System.out.println(3);
                return;
            }else{
                System.out.println(7);
                return;
            }
        }else if (x1 > x2){
            if(y1 < y2){
                System.out.println(5);
                return;
            }else if(y1 == y2){
                System.out.println(3);
                return;
            }else{
                System.out.println(7);
                return;
            }
        }
    }
}
