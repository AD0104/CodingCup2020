/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daniel.alejandro.contreras.martinez.concurso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class main {

    public static void main(String[] args) throws IOException {        
        Scanner s = new Scanner(System.in);
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n;
        n = Integer.parseInt(br.readLine());
       if(n>= 1 && n <=100){
        int matriz[][] = new int[n][n];
        for (int col = 0; col < matriz.length; col++) {
            for (int fil = 0; fil < matriz[col].length; fil++) {
            //    System.out.println("da la posicion [" + col + "] [" + fil + "]");
              
                matriz[col][fil] =Integer.parseInt(br.readLine());
                 System.out.print(" ");
            }
            System.out.println();
        }
       int  x = sumaDiagonal(matriz);
        System.out.println(x);
        
           for (int col = 0; col < matriz.length; col++) {
            for (int fil = 0; fil < matriz[col].length; fil++) {
                System.out.print(" "+matriz[col][fil]);

            }
            System.out.println(" ");
        }
       }
        
    }

    private static int sumaDiagonal(int[][] matriz) {    
       int sumaDiagonal = 0;
    for(int i = 0, j = 0; i < matriz.length && j < matriz[i].length; i++, j++){
       sumaDiagonal += matriz[i][j];
    }
    
     return sumaDiagonal;  
}
    }
