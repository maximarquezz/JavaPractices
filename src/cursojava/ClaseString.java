package cursojava;

public class ClaseString {
    
    public static void main(String args[]){
        
        String cadena1 = "Hola, me llamo Maximiliano Ezequiel Marquez";
        String cadena2 = "Vivo en Nogoya, Entre Rios.";
        
        //Retornar longitud de una cadena
        System.out.println(cadena1.length());
        
        //Retorna el caracter del índice pasado como parámetro
        System.out.println(cadena1.charAt(0));
        
        //Compara dos cadenas
        System.out.println(cadena1.equals(cadena2));
        
        //Compara dos cadenas (no tiene encuenta mayúsculas o minúsculas)
        System.out.println(cadena1.equalsIgnoreCase(cadena2));
        
        /*Crea una subcadena de una cadena según el índice por el que comienza a sustraer,
        y el índice por el que termina de sustraer*/
        System.out.println(cadena1.substring(0, 2));
        
        //Evalúa si la primer cadena contiene ciertos caracteres u otra cadena
        System.out.println(cadena1.contains("Hola"));
        
        //Evalúa si la cadena comienza con cierto argumento
        System.out.print(cadena1.startsWith("Hola"));
        
        //Evalúa si la cadena termina con cierto argumento
        System.out.println(cadena1.endsWith("Marquez"));
        
        //Concatena una cadena con otra (o argumentos)
        System.out.println(cadena1.concat(cadena2));
        
        //Comprueba si una cadena está vacía o tiene solo espacios blancos
        System.out.println(cadena1.isBlank());
        
        //Comprueba si una cadena está vacía
        System.out.println(cadena1.isBlank());
        
        //Devuelve una cadena sin los espacios en blanco al principio y final
        System.out.println(cadena1.trim());
        
        /*Divide una cadena según el parámetro pasado en el "regex", que puede ser
        por ejemplo, una coma.
        Además crea un array luego de dividir la cadena original
        */
        String[] array1 = cadena1.split(",");
        for (String array : array1){
            System.out.println(array);
        }
        
        //Matches() compara una cadena con un patrón de caracteres específico
        String password = "MyPassw0rd"; // La contraseña proporcionada por el usuario
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        // Explicación del patrón:
        // ^(?=.*[0-9])     - Al menos un dígito
        // (?=.*[a-z])      - Al menos una letra minúscula
        // (?=.*[A-Z])      - Al menos una letra mayúscula
        // (?=.*[@#$%^&+=]) - Al menos un carácter especial
        // (?=\S+$)         - No se permiten espacios en blanco
        // .{8,}            - Al menos 8 caracteres de longitud

        if (password.matches(pattern)) {
            System.out.println("La contraseña es válida.");
        } else {
            System.out.println("La contraseña no cumple con los requisitos.");
        }

    }
    
}
