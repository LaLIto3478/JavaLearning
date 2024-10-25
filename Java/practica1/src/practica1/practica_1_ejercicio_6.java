package practica1;

import javax.swing.JOptionPane;

public class practica_1_ejercicio_6 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int C = 0, K = 0, F = 0, R = 0;
        
        // PEDIR AL USUARIO EL VALOR DE LOS GRADOS CENTÍGRADOS
        C = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los grados centígrados que desea coonvertir: "+ "\n\nNOTA: DEBE SER UN VALOR ENTRE -273 Y 1000"));
        
        if (C >= -273){
            if (C<= 100) {
            // PROCESAMIENTO
            F = C * 9/5 + 32;
            K = C + 273;
            R = C * 4/5;

            // IMPRIMIR LOS RESULTADOS DE LAS CONVERSIONES
            JOptionPane.showMessageDialog(null, K + " " + F + " " + R);
            }else{
                JOptionPane.showMessageDialog(null, "FUERA DE RANGO");}
        }else{
            JOptionPane.showMessageDialog(null, "FUERA DE RANGO");}

    }
        
}
