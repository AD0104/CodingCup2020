import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class problema_c {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entry = br.readLine();
        String[] splittedEntry = entry.split(" ");
        int a = Integer.parseInt(splittedEntry[0]);
        int c = Integer.parseInt(splittedEntry[1]);
        int m = Integer.parseInt(splittedEntry[2]);
        int seed = Integer.parseInt(splittedEntry[3]);
        operacion(a, c, m, seed);
    }
    // (a*xn+c) mod m
    public static void operacion(int a, int c, int m , int seed){
        int x=seed;
        ArrayList<Integer> al = new ArrayList<>();
        al.add(x);
        for (int i = 0; i < m; i++) {
            x = (a*x+c) % m;
            al.add(x);
        }
        int antes_de_repetir=0, unicos=0,repetidos=0;
        for (int i = 0; i < al.size(); i++) {
            int num = al.get(i);
            for (int j = 0; j < al.size(); j++) {
                if(i != j){
                    if(!al.contains(num)){

                    }
                }
            }
        }
    }   
}
