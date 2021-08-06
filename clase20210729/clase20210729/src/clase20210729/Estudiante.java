
package clase20210729;

import java.util.ArrayList;
import java.util.Date;

public class Estudiante {
    private int cuenta;
    private String nombre;
    private String carrera;
    private Date fecha;
    private ArrayList <String> clasesAprobadas = new ArrayList();
    private ArrayList <String> clasesRepro = new ArrayList();
    
    public Estudiante(){
        
    }
    public Estudiante (int x){
        setCuenta(x);
    }
    
    
    
    
    
    public void setCuenta(int x){
        if(x > 9999999 && x < 20000000){
            this.cuenta = x;
        }
        
    }
    public int getCuenta(){
        return cuenta;
    }
    
    public void setNombre(String x){
        this.nombre = x;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCarrera(String x){
        this.carrera = x;
    }
    public String getCarrera(){
        return carrera;
    }
    public void setFecha(Date x){
        this.fecha = x;
    }
    public Date getFecha(){
        return fecha;
    }
    
    public void setCA(ArrayList<String> x){
        this.clasesAprobadas = x;
    }
    public ArrayList<String> getCA(){
        return clasesAprobadas;
    }
    
    public void setCR(ArrayList<String> x){
        this.clasesRepro = x;
    }
    public ArrayList<String> getCR(){
        return clasesRepro;
    }
    
    
    public String toString(){
        return "El estudiante es: "+nombre+" estudia: "+ carrera+
                " clases cursadas: "+clasesAprobadas;
        
    }
    
    
    
}
