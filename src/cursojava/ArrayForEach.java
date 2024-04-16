package cursojava;

import javax.swing.JOptionPane;

public class ArrayForEach {
    
    public static void main(String args[]){
        
        /*Un ejemplo de otra sintaxis para definir un array,
        en este inicializamos el array reservando una cantidad
        de espacio en memoria específico.*/
        int[] example = new int[1];
        //En esta la inicializamos y ya ingresamos los valores.
        int[] numeros = {51, 12, 76, 82, 23};
        
        //--- EJEMPLO DE PRUEBA ---
        String[] paises = new String[5];
        
        //Con un bucle for común podríamos llenar el array.
        for (int i = 0; i < paises.length; i++){
            paises[i] = JOptionPane.showInputDialog("Introduzca un pais");
        }
        
        //Y con un bucle foreach podríamos recorrer el array.
        for (String pais : paises){
              System.out.println(pais);
        }
    }
    
}
