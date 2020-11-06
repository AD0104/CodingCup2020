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
                    movN(array);
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
    public static void movN(int array[][]){
        for (int i = array[0].length-1; i >= 0; i--) {
            for (int j = array.length-1; j >= 0; j--) {
                System.out.print(array[j][i]+" ");
            }
            System.out.println();
        }
    }
    
}
