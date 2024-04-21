package cursojava;

import javax.swing.JOptionPane;

public class GeneralTests {
    
    public static void main(String args[]){
        
       int a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el termino A de la ecuacion cuadratica"));
       int b = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el termino B de la ecuacion cuadratica"));
       int c = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el termino C de la ecuacion cuadratica"));
       
       double raizUno = (-b + Math.sqrt(Math.pow(b, 2) -4 * a * c)) / (2 * a);
       double raizDos = (-b - Math.sqrt(Math.pow(b, 2) -4 * a * c)) / (2 * a);
       
       System.out.println("X1: " + raizUno + "\nX2: " + raizDos);

    }   
}
