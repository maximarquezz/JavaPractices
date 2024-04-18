package cursojava.Vehiculos;

public class Auto {
    
    //ATRIBUTOS COMUNES
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    
    //ATRIBUTOS VARIABLES
    String color;
    boolean asientosCuero;
    boolean climatizador;
    
    //CONSTRUCTOR
    public Auto(String color, boolean asientosCuero, boolean climatizador){
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
        
        this.color = color;
        this.asientosCuero = asientosCuero;
        this.climatizador = climatizador;
    }

    //GETTERS
    public int getRuedas() {
        return ruedas;
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getMotor() {
        return motor;
    }

    public int getPesoPlataforma() {
        return peso_plataforma;
    }

    public String getColor() {
        return color;
    }

    public boolean isAsientosCuero() {
        return asientosCuero;
    }

    public boolean isClimatizador() {
        return climatizador;
    }
    
    //SETTERS
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public void setPeso_plataforma(int peso_plataforma) {
        this.peso_plataforma = peso_plataforma;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAsientosCuero(boolean asientosCuero) {
        this.asientosCuero = asientosCuero;
    }

    public void setClimatizador(boolean climatizador) {
        this.climatizador = climatizador;
    }
    
    
    
}
