package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_16{

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int A1, B1, C1, A2, B2, C2;
        
        // PEDIR AL USUARIO LAS VARIABLES A USAR
        A1 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE LA DIMENSION A1: "));
        B1 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE LA DIMENSION B1: "));
        C1 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE LA DIMENSION C1: "));
        A2 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE LA DIMENSION A2: "));
        B2 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE LA DIMENSION B2: "));
        C2 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE LA DIMENSION C2: "));
        
        // PROCESAMIENTO
        if (A1 == A2){
            if (B1 == B2){
                if (C1 == C2){
                    JOptionPane.showMessageDialog(null, 1);
                }
                else{
                    JOptionPane.showMessageDialog(null, 0);
                }
            }
            else if (C1 == B2){
                if (B1 == C2){
                    JOptionPane.showMessageDialog(null, 1);
                }
                else{
                    JOptionPane.showMessageDialog(null, 0);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, 0);
            }
        }
        else if (A1 == B2){
            if (B1 == A2){
                if (C1 == C2){
                    JOptionPane.showMessageDialog(null, 1);
                }
                else{
                    JOptionPane.showMessageDialog(null, 0);
                }
            }
            else if (B1 == C2){
                if (C1 == A2){
                    JOptionPane.showMessageDialog(null, 1);
                }
                else{
                    JOptionPane.showMessageDialog(null, 0);
                }
            }
            else{
            JOptionPane.showMessageDialog(null, 0);
            }
        }
        else if (A1 == C2){
            if (B1 == A2){
                if (C1 == B2){
                    JOptionPane.showMessageDialog(null, 1);
                }
                else{
                    JOptionPane.showMessageDialog(null, 0);
                }
            }
            else if (B1 == B2){
                if (C1 == A2){
                    JOptionPane.showMessageDialog(null, 1);
                }
                else{
                    JOptionPane.showMessageDialog(null, 0);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, 0);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "0");
        }
    }
}
