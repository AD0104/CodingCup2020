import java.util.Scanner;

public class E {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        String color;

        color = s.next();
        x = s.nextInt();
        if (x >= 1 && x <= 1000) {
            if (color.equals("R")) {
                if (x % 2 == 1) {
                    color = "A";
                                        System.out.println(color);

                } else if (x % 2 == 0) {
                    color = "V";
                                        System.out.println(color);

                }
            } else if (color.equals("A")) {
                if (x % 2 == 1) {
                    color = "V";
                                        System.out.println(color);

                } else if (x % 2 != 1) {
                    color = "R";
                                        System.out.println(color);

                }
            } else if (color.equals("V")) {
                if (x % 2 == 1) {
                    color = "R";
                                        System.out.println(color);

                } else if (x % 2 != 1) {
                    color = "A";
                                        System.out.println(color);

                }

            }
        }
    }

}
