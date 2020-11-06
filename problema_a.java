import java.util.Scanner;
public class problema_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int array[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        String config = sc.next();
        String[] opciones = config.split("");
        for (int i = 0; i < opciones.length; i++) {
            switch(opciones[i]){
                case "N":
                    break;
                case "S":
                    break;
                case "E":
                    break;
                case "O":
                    break;
            }
        }
    }
}
