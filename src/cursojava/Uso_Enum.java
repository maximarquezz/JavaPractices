package cursojava;

enum Talla{
    
    SMALL("S"), MID("M"), LONG("L"), EXTRA_LONG("XL");
    
    //ATRIBUTOS
    private String abreviatura;
    
    //CONSTRUCTORES
    private Talla(String abreviatura){
        this.abreviatura = abreviatura;
    }
    
    //GETTER
    public String getAbreviatura(){
        return abreviatura;
    }
    
}

public class Uso_Enum {
    
}
