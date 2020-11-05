import java.util.ArrayList;
import java.util.Scanner;
public class problema_a{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            float number = sc.nextFloat();
            al.add(Math.log(number));
        }
    }
}