package cursojava;

/*El package por defecto es java.lang, para usar uno externo
se debe importar de esta manera*/
import java.util.Scanner;

/*Se puede importar la clase específica o
el package completo, pero consume más recursos reservando
más espacio en memoria para dicho package*/
import java.util.*;


public class ClaseScanner {
    
    public static void main(String args[]){
        
        /*Para usar la clase Scanner y sus respectivos métodos
        debemos construir instancias u objetos de dicha clase:
        Primero va la palabra reservada asociada al NOMBRE de la clase,
        luego el nombre que le daremos a ese objeto o instancia,
        el operador de asignación "igual". Nuestro objeto tendrá el valor
        de "new Scanner()" que será el constructor al que debemos pasarle
        un parámetro, en este caso "System.in" ya que queremos introducir
        datos a través de la consola de NetBeans.
        
        SIEMPRE que queremos crear un objeto de cualquier clase se usa
        la palabra reservada "new" para que el IDE sepa que estamos
        llamando a un constructor de dicha clase para darle un estado
        inicial al mismo.
        */
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = input.nextLine();
        System.out.println("Tu nombre es " + nombre);
    }
    
}
