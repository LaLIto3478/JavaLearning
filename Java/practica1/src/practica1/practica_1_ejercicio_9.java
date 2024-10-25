package practica1;

import javax.swing.JOptionPane;

public class practica_1_ejercicio_9 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int n = 0, Vi = 0, Vs = 0;
        
        // PEDIR AL USUARIO EL NÚMERO DE DADOS APILADOS
        n = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NÚMERO DE DADOS APILADOS"));
        
        //PROCESAMIENTO
        if (n >= 1){
            if (n <= 1000000){
            Vs = 14 * n + 6;
            Vi = 14 * n + 1;
            
            // IMPRIMIR EN PANTALLA LOS RESULTADOS
            JOptionPane.showMessageDialog(null, Vi +" "+ Vs);
            }else{
                
            JOptionPane.showMessageDialog(null, "FUERA DE RANGO");}
        }else{
            
        JOptionPane.showMessageDialog(null, "FUERA DE RANGO");}
    }
    
}
