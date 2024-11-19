package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_11 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        float N = 0, calificacion = 0, promedioaprobadas = 0, promedioreprobadas = 0, Naprobadas = 0, Nreprobadas = 0;
        boolean datos = true;
        boolean bandera;
        String aux = " ";
        
        // PEDIR AL USUARIO EL NÚMERO DE CALIFICACIONES Y VALIDAR

        do{
            aux = JOptionPane.showInputDialog("INGRESE EL NÚMERO DE CALIFICACIONES");
            bandera = true;
            for (int i = 0 ; i < aux.length() ; i++){
                if (aux.charAt(i) < 48 || aux.charAt(i) > 57){
                    bandera = false;
                    JOptionPane.showMessageDialog(null, "ERROR: ¡Entero NO válido!");
                    break;
                }
            }
        }while(bandera == false); 
        N = Float.parseFloat(aux);
        
    for (int i = 0 ; i < N ; i++){
        do{
            aux = JOptionPane.showInputDialog("INGRESE EL VALOR DE UNA CALIFICACIÓN");
            bandera = true;
            
            for (int j = 0 ; j < aux.length() ; j++){
                if (aux.charAt(j) < 46 || aux.charAt(j) > 57 || aux.charAt(j) == 47){
                    JOptionPane.showMessageDialog(null, "ERROR: Calificación NO válida.");
                    bandera = false;
                    break;
                }
            }
            if (bandera == true){
                calificacion = Float.parseFloat(aux);
                if (calificacion < 0){
                    JOptionPane.showMessageDialog(null, "ERROR: Su calificación DEBE ser entre 0 y 10!");
                    bandera = false;
                }
                if (calificacion > 10){
                    JOptionPane.showMessageDialog(null, "ERROR: Su calificación DEBE ser entre 0 y 10!");
                    bandera = false;
                }
            }
        } while(bandera == false);
        
        if (calificacion >= 6){
            promedioaprobadas += calificacion;
            Naprobadas++;
        }
        else{
            promedioreprobadas += calificacion;
            Nreprobadas++;
        }
    }
    promedioreprobadas /= Nreprobadas;
    promedioaprobadas /= Naprobadas;
    
    JOptionPane.showMessageDialog(null, "ESTADÍSTICA" + "\nPROMEDIO DE LAS CALIFICACIONES APROBATORIAS: "+promedioaprobadas + "\nPROMEDIO DE LAS CALIFICACIONES REPROBATORIAS: "+promedioreprobadas);
    }
}
