package cursojava.Empresa;

public abstract class Persona {
    
    //STATIC (variables, constantes o métodos)
    private static int id_increment = 1;
    
    public static int getId_increment(){
        return id_increment;
    }
    
    //ATRIBUTOS
    private String nombre;
    private int id;
    
    //CONSTRUCTORES
    public Persona(String nombre){
        this.nombre = nombre;
        this.id = id_increment;
        id_increment++;
    }
    
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public int getID(){
        return id;
    }
    
    //SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //ABSTRACT
    public abstract String getType();
}
