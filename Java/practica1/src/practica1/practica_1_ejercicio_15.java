package practica1;

import javax.swing.JOptionPane;

public class practica_1_ejercicio_15 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int T = 0, B = 0, x = 0;
        
        // PEDIR AL USUARIO 'T' Y 'B'
        T = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NÚMERO DE TAMALES ROBADOS: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NÚMERO DE MIEMBROS DE LA BANDA: "));
        
        // PROCESAMIENTO
        if (0 <= T){
            if (T <= 1000000){
                if (2 <= B && B <= 100){
                    
                    x = T / 2;
                    x = x + (T % 2);
                    B = B - 1;
                    x = x + ((T-x) % B);
                    
                    // MOSTRAR EN PANTALLA LOS RESULTADOS
                    JOptionPane.showMessageDialog(null, x);
                    
                }else{
                JOptionPane.showMessageDialog(null, "FUERA DE RANGO");}
            
            }else{
            JOptionPane.showMessageDialog(null, "DEMASIADOS TAMALES ROBADOS!!! \n  DEBEN SER MENOS DE 1,000,000");}
        
        }else{
        JOptionPane.showMessageDialog(null, "LA BANDA ROBATAMALES NO PUEDEN HABER ROBADO MENOS DE CERO TAMALES");}
        
    }
    
}