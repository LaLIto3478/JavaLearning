package practica1;

import javax.swing.JOptionPane;

public class practica_1_ejercicio_8 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int C = 0, P = 0, H = 0;
        
        // PEDIR AL USUARIO EL VALOR DE 'C', 'P' Y 'H'
        C = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NÚMERO DE CACHORROS QUE LA PERRITA DE DON PANCHO DIÓ A LUZ: "));
        if (C >= 0) {
            P = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NÚMERO DE CACHORROS QUE DON PANCHO INICIALMENTE PLANEA QUEDARSE: "));
            if (P >= 0) {
                H = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NÚMERO DE HIJOS DE DON PANCHO: "));
                if (H <= 1000){
                    C = C - P;
                    P = P + (C % (H + 1));
                    JOptionPane.showMessageDialog(null, P);
                }
                else{
                JOptionPane.showMessageDialog(null, "DON PANCHO NO PUEDE TENER MÁS DE 1000 HIJOS");}
                
            
            }
            else{
            JOptionPane.showMessageDialog(null, "LOS CACHORROS QUE DON PANCHO INICIALMENTE QUIERE QUEDARSE NO PUEDE SER MENOS DE CERO!!!");}
        
        }
        else{
        JOptionPane.showMessageDialog(null, "LA PERRITA DE DON PANCHO NO PUDO HABER PARIDO MENOS DE UN CACHORRO!!!");}
    }
    
}
