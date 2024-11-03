package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_5 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        double numero = 0;
        double aux = 0;
        
        // PEDIR AL USUARIO EL NÚMERO QUE QUIERE EVALUAR
        numero = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL NÚMERO QUE QUIERE EVALUAR: "));
        
        // PROCESAMIENTO
        aux = numero % 1;
                
        if (aux == 0){
            JOptionPane.showMessageDialog(null, "Su número NO tiene parte fraccionaria.");
        }else{
        JOptionPane.showMessageDialog(null, "Su número SI tiene parte fraccionaria. "+ "\nSu parte fraccionaria es: " +aux);}
        
    }
    
}