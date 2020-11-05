import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class problema_a{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Float> al = new ArrayList<>();
        float sum=0;

        for (int i = 0; i < n; i++) {
            float number = sc.nextFloat();
            al.add((float) Math.log(number));
            sum+=al.get(i);
        }
        float prom = sum/n;
        float var = (float)(Math.pow(sum-prom,2)/(n-1));
        float desv_est = (float) Math.sqrt(var);

        float ln_vs = prom-2*desv_est;
        float ln_s = prom-desv_est;
        float ln_m = prom;
        float ln_l = prom+desv_est;
        float ln_vl=prom+2*desv_est;

        float vs=(float)(Math.exp(ln_vs));
        float s=(float)(Math.exp(ln_s));
        float m=(float)(Math.exp(ln_m));
        float l=(float)(Math.exp(ln_l));
        float vl=(float)(Math.exp(ln_vl));

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(vs));
        System.out.println(df.format(s));
        System.out.println(df.format(m));
        System.out.println(df.format(l));
        System.out.println(df.format(vl));
    }
}