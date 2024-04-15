package cursojava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Switch {
    
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        double res;
        System.out.println("""
                           CALCULAR AREA
                           1. Cuadrado
                           2. Rectangulo
                           3. Circulo
                           4. Triangulo
                           """);
        int num = input.nextInt();
        
        if (num > 4 && num < 1){
            System.err.close();
        }
        else{
            switch (num){
                case 1 -> {
                    int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el lado del cuadrado en CM"));
                    
                    if(Double.isNaN(lado)){
                        System.out.println("\nERROR: No introduciste un numero.");
                    }
                    else{
                       res = lado*lado;
                        System.out.println("\nEl area del cuadrado es de: " + res + "cm."); 
                    }
                }
                case 2 -> {
                    int ancho = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el ancho del rectangulo en CM"));
                    int alto = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el alto del rectangulo en CM"));
                    
                    if(Double.isNaN(ancho) || Double.isNaN(alto)){
                        System.out.println("\nERROR: No introduciste un numero.");
                    }
                    else{
                        res = ancho*alto;
                        System.out.println("\nEl area del rectangulo es de: " + res + "cm.");
                    }
                }
                case 3 -> {
                    double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el radio del circulo en CM"));
                    
                    if(Double.isNaN(radio)){
                        System.out.println("\nERROR: No introduciste un numero.");
                    }
                    else{
                        res = Math.PI * Math.pow(radio, 2);
                        System.out.println("\nEl area del circulo es de: " + res + "cm.");
                    }
                }
                case 4 ->{
                    int base = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el ancho del rectangulo en CM"));
                    int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el ancho del rectangulo en CM"));
                    
                    if(Double.isNaN(base) || Double.isNaN(altura)){
                        System.out.println("\nERROR: No introduciste un numero.");
                    }
                    else{
                        res = (base*altura)/2;
                        System.out.println("\nEl area del triangulo es de: " + res + "cm.");
                    }
                }
            }
        }
        
    }
    
}
