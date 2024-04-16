package cursojava;

public class DoWhile {
    
    public static void main(String args[]){
        
        int contador = 1; // Inicializamos el contador

        do {
            System.out.println(contador); // Imprimimos el valor del contador
            contador++; // Incrementamos el contador en 1
        } while (contador <= 5); // Repetimos el bucle mientras el contador sea menor o igual a 5
        
    }
    
}
