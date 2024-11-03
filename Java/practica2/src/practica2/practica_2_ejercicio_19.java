package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_19 {
    
    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int P1 = 0, P2 = 0, P3 = 0, P4 = 0;
        
        //PEDIR AL USUARIO LAS VARIABLES
        P1 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL PRIMER PALITO: "));
        P2 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL SEGUNDO PALITO: "));
        P3 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL TERCER PALITO: "));
        P4 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL CUARTO PALITO: "));
        
        if (P1 == P2){
            if (P1 == P3){
                JOptionPane.showMessageDialog(null, "1");
            }
            else{
                if (P1 == P4){
                    JOptionPane.showMessageDialog(null, "1");
                }
                else{
                    JOptionPane.showMessageDialog(null, "0");
                }
            }
        }
        else{
            if (P2 == P3){
                if (P2 == P4){
                    JOptionPane.showMessageDialog(null, "1");
                }
                else{
                    JOptionPane.showMessageDialog(null, "0");
                }
            }
            else{
                if (P1 == P3){
                    if (P1 == P4){
                        JOptionPane.showMessageDialog(null, "1");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "0");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "0");
                }
            }
        }
    }
}
