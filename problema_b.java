import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class problema_b {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> calificaciones = new ArrayList<>();
        ArrayList<Integer> promedios = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String entry = br.readLine();
            String[] entradas = entry.split(" ");
            calificaciones.add(Integer.parseInt(entradas[0]));
            promedios.add(Integer.parseInt(entradas[1]));
        }
        for (int i = 0; i < calificaciones.size(); i++) {
            for (int j = 0; j < calificaciones.get(i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int suma=0;
        for (int i = 0; i < calificaciones.size(); i++) {
            suma+=calificaciones.get(i);
        }
        int promedio = suma/n;
        if(promedio >= 6)
            System.out.println(promedio+"\n:)");
        else
            System.out.println("0\n:(");
    }
}
