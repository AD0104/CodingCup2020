/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package daniel.alejandro.contreras.martinez.concurso;

import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class J {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int tiempo=0;
        String [][] matriz = new String[y][x];
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
              matriz[i][j] = "V";               
            }       
        }
        int p1x = s.nextInt();
        int p1y = s.nextInt();
        int p2x = s.nextInt();
        int p2y = s.nextInt();      
        matriz[p1y-1][p1x-1]="1";
        matriz[p2y-1][p2x-1]="2";
        int bloques = s.nextInt();
        for (int i = 0; i < bloques; i++) {
        int bx = s.nextInt();
        int by = s.nextInt();
        matriz[by-1][bx-1]="E";
        }
        String aux="";
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j].equals("1")){
                    if(matriz[i+1][j].equals("V")&&matriz[i][j+1].equals("V")){
                        matriz[i][j]="V";
                        matriz[i][j+1]="1";
                        tiempo ++;
                    }
                    if(matriz[i][j].equals("2")){
                        if(matriz[j+1][j].equals("V")){
                            matriz[i][j]="V";
                          matriz[i+1][j]="2";
                          tiempo++;
                        }
                        if(matriz[i][j].equals("1") == matriz[i][j].equals("2")){
                            System.out.println(tiempo);
                        }
                    }
                }
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println();
        }
       
        
    }
}
