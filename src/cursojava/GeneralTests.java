package cursojava;

import java.util.Scanner;


public class GeneralTests {
    
    public static void main(String args[]){
        
       /*Hacer un programa para que un comercio ingrese por teclado la recaudación en
        pesos para cada una de las cuatro semanas del mes. El programa debe listar la
        recaudación promedio por semana y el porcentaje de recaudación por semana*/
       
       Scanner input = new Scanner(System.in);
       int[] dias = new int[7];
       int[] semanas = new int[4];
       int acumulado_total = 0;
       
       int semana1, semana2, semana3, semana4;
       semana1 = semana2 = semana3 = semana4 = 0;
       
       int semana_promedio, semana_porcentaje;
       
       for (int i = 1; i <= dias.length; i++){
           for (int j = 1; i <= semanas.length; i++){
               System.out.println("Día " + i + ", semana " + j + ". Recaudado:");
               acumulado_total += input.nextInt();
               
               if (i == 7 && j == 1){
                   semana1 = acumulado_total / 7;
               }
               if (i == 7 && j == 2){
                   semana2 = acumulado_total / 7;
               }
               if (i == 7 && j == 3){
                   semana3 = acumulado_total / 7;
               }
               if (i == 7 && j == 4){
                   semana4 = acumulado_total / 7;
               }
           }
       }
       
    }   
}
