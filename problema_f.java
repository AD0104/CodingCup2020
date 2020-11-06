import java.util.Scanner;
public class problema_f{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=0;
        int[] array = new int[n];
        if(n == 1){
            num=sc.nextInt();
            System.out.println(num);
            return;
        }
        for(int i=0; i < n; i++){
            array[i] = sc.nextInt();
        }        
        System.out.println(1);
    }
}