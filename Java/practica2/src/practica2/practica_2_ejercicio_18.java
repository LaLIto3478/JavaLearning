package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_18 {
    
    public static void main(String[] args) {
        // DECLARAR VARIABLES
        float calificacion = 0;
        
        //PEDIR AL USUARIO LA VARIABLE A EVALUAR
        calificacion = Float.parseFloat(JOptionPane.showInputDialog("INGRESE EL VALOR DE LA CALIFICACIÓN: "));
        
        //
        if (calificacion < 6){
            JOptionPane.showMessageDialog(null, "Reprobatoria");
        }
        else{
            JOptionPane.showMessageDialog(null, "Aprobatoria");
        }
    }
}
