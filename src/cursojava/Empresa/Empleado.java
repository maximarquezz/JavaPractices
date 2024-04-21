package cursojava.Empresa;

import java.time.LocalDate;

public class Empleado {
    
    //VARIABLES
    private String nombre;
    private int sueldo;
    private LocalDate fechaAlta;
    private int id;

    //CONSTRUCTORES
    public Empleado(String nombre, int sueldo, int año, int mes, int dia){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fechaAlta = LocalDate.of(año, mes, dia);
        this.id = id_increment;
        id_increment++;
    }
    
    public Empleado(String nombre){
        this(nombre, 30000, 2024, 04, 19);
        this.id = id_increment;
        id_increment++;
    }

    //MÉTODOS
    public int subirSueldo(int aumento){
        return sueldo += aumento;
    }

    //GETTERS
    public int getID(){
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setFechaAlta(int año, int mes, int dia) {
        this.fechaAlta = LocalDate.of(año, mes, dia);
    }
    
    //STATIC (variables, constantes o métodos)
    private static int id_increment = 1;
    public static int getId_increment(){
        return id_increment;
    }

}
