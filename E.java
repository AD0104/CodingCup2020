import java.util.Scanner;

public class E {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        String color;

        color = s.next();
        x = s.nextInt();
        if (x >= 1 && x <= 1000) {
            if (color.equals("R") || color.equals("A") || color.equals("V")) {
                switch(color){
                    case "R":
                        if(x%2== 1){
                            color = "A";
                            System.out.println(color);
                        }else if(x%2 !=1){
                            color = "V";
                            System.out.println(color);
                        }
                        break;
                    case "A":
                        break;
                    case "V":
                        break;
                }
                
                
            }
        }
    }

}
