import java.text.DecimalFormat;
import java.util.Scanner;
public class problema_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //peso p, distancia d
        float p=0,d=0;
        double precio=0.25;
        double suma=0, mult=0;
        for (int i = 0; i < n; i++) {
            p=sc.nextFloat();
            d=sc.nextFloat();
            mult=precio*d;
            mult = mult * (float)(p/100);
            suma+=mult;            
        }
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(suma));
    }
}
