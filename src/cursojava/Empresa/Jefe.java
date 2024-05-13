package cursojava.Empresa;

public final class Jefe extends Empleado implements iJefes{  //FINAL detiene la cadena de la herencia en esta clase.
    
    //VARIABLES
    private int incentivo;

    //CONSTRUCTORES
    public Jefe(String nombre, int sueldo, int año, int mes, int dia, int incentivo){
        super(nombre, sueldo, año, mes, dia);
        this.incentivo = incentivo;
    }
    
    //SETTERS
    public void setIncentivo(int incentivo){
        this.incentivo = incentivo;
    }
    
    //GETTERS
    @Override
    public int getSueldo(){
        int sueldoJefe = super.getSueldo();
        return sueldoJefe + incentivo;
    }
    
    //INTERFACES
    @Override
    public String tomarDecisiones(String decision){
        return "El jefe ha tomado la decisión de: " + decision;
    }
    
    @Override
    public double establecerBonus(double bonus) {
        if (bonus < iEmpleados.MIN_BONUS){
            System.out.println("ERROR: el mínimo de bonus es: " + iEmpleados.MIN_BONUS);
            return 0;
        }
        else{
            return bonus;
        }
    }
}
