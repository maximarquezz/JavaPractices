package cursojava;

import java.util.Scanner;

public class If {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = input.nextInt();
        
        /*Condicional IF, se pueden usar IFs separados con su respectivo else,
        o bien anidar IFs uno dentro de otro (cambia la lógica)*/
        //Se pueden usar operadores lógicos
        
        if (edad < 18 || edad >= 60){
            System.out.println("No podes entrar, o sos muy pendejo o estas hecho mierda (" + edad + ")");
        }
        else if (edad >= 18 && edad < 60){
            System.out.println("Podes pasar flaco (" + edad + ")");
        }
        
    }
    
}
