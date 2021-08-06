
package clase20210729;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Clase20210729 {
    public static void main(String[] args) {
        
        ArrayList cosas  = new ArrayList(); 
        
        int opcion =0;
        
        while(opcion!= 8){
            opcion =Integer.parseInt(
            JOptionPane.showInputDialog("1. Agregar alumno\n"
            +"2. Agregar una palabra\n"
            +"3. Listar Alumnos\n"
            +"4. Modificar anio Ingreso\n"
            +"5. Eliminar Alumno\n"
            +"6. Agregar Clase aprobada a un alumno\n"
            +"7. Eliminar Clase Aprobada\n"
            + "8. Salir"));
            
            switch(opcion){
                case 1:{
                    int c;
                    String n, cc;
                    
                    c=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuenta"));
                    
                    n = JOptionPane.showInputDialog("Ingrese nombre");
                    cc = JOptionPane.showInputDialog("Ingrese carrera");
                    
                    Estudiante t = new Estudiante();
                    t.setCuenta(c);
                    t.setNombre(n);
                    t.setCarrera(cc);
                    t.setFecha(new Date(121,1,1));
                    
                    cosas.add(t);
                    
                    break;
                }case 2:{
                    String p = JOptionPane.showInputDialog("Escriba una palabrota");
                    cosas.add(p);
                    
                    break;
                }case 3:{
                    String salida = "";
                    
                    for(Object t : cosas){
                        if( t instanceof Estudiante){
                            salida+= cosas.indexOf(t)+ "- "+t+"\n";
                        }
                        
                    }
                    JOptionPane.showMessageDialog(null, salida);
                    
                    break;
                }case 4:{
                    
                    int p,a;
                    p = Integer.parseInt(JOptionPane.showInputDialog("Posicion del estudiante a modificar"));
                    
                    if(cosas.get(p) instanceof Estudiante ){
                        
                        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo anio"));
                        
                        ((Estudiante)cosas.get(p)).getFecha().setYear(a);
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "No es estudiante");
                    }
                    
                    break;
                } case 5:{
                    
                    int p = Integer.parseInt(JOptionPane.showInputDialog("Posicion a eliminar"));
                    cosas.remove(p);
                    
                    break;
                }case 6:{
                    
                    int p;
                    p = Integer.parseInt(JOptionPane.showInputDialog("Posicion del estudiante"));
                    
                    if(cosas.get(p) instanceof Estudiante ){
                        
                        String c = JOptionPane.showInputDialog("Clase aprobada");
                        
                        ((Estudiante)cosas.get(p)).getCA().add(c); // linea mas importanteee
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "No es estudiante");
                    }
                    
                    break;
                }case 7:{
                    
                            
                    int p;
                    p = Integer.parseInt(JOptionPane.showInputDialog("Posicion del estudiante"));
                    
                    if(cosas.get(p) instanceof Estudiante ){
                        
                        int c = Integer.parseInt(JOptionPane.showInputDialog("Posicion clase"));
                        
                        ((Estudiante)cosas.get(p)).getCA().remove(c); // linea mas importanteee
                        
                    }else{
                        JOptionPane.showMessageDialog(null, "No es estudiante");
                    }
                    
                }
            }
            
        }
        
    }
    
}
