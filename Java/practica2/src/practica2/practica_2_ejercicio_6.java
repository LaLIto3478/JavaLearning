package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_6{

    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int año = 0;
        
        //PEDIR AL USUARIO LAS VARIABLES
        año = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL AÑO A EVALUAR: "));
        
        // PROCESAMIENTO
        if (año % 4 == 0){
            if (año % 100 == 0){
                if(año % 400 == 0){
                    JOptionPane.showMessageDialog(null, "Su año SI es bisiesto");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Su año NO es bisiesto");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Su año SI es bisiesto");}
        }
        else {
            JOptionPane.showMessageDialog(null, "Su año NO es bisiesto");
        }
    }
}
