package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_11{

    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int A = 0, B = 0, C = 0, D = 0;
        
        //PEDIR AL USUARIO LAS VARIABLES
        A = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE A: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE B: "));
        C = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE C: "));
        D = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE D: "));
        
        // PROCESAMIENTO
        if (A > B){
            if (A > C){
                if (A > D){
                    JOptionPane.showMessageDialog(null, "EL NÚMERO CON EL VALOR MAYOR ES A. \nEL VALOR DE A ES: "+ A);
                }
                else{
                    JOptionPane.showMessageDialog(null, "EL NÚMERO CON EL VALOR MAYOR ES D. \nEL VALOR DE D ES: "+ D);
                }
            }
            else{
                if (C > D){
                    JOptionPane.showMessageDialog(null, "EL NÚMERO CON EL VALOR MAYOR ES C. \nEL VALOR DE C ES: "+ C);
                }
                else{
                    JOptionPane.showMessageDialog(null, "EL NÚMERO CON EL VALOR MAYOR ES D. \nEL VALOR DE D ES: "+ D);
                }
            }
        }
        else{
            if (B > C){
                if (B > D){
                    JOptionPane.showMessageDialog(null, "EL NÚMERO CON EL VALOR MAYOR ES B. \nEL VALOR DE B ES: "+ B);
                }
                else{
                    JOptionPane.showMessageDialog(null, "EL NÚMERO CON EL VALOR MAYOR ES D. \nEL VALOR DE D ES: "+ D);
                }
            }
            else{
                if (C > D){
                    JOptionPane.showMessageDialog(null, "EL NÚMERO CON EL VALOR MAYOR ES C. \nEL VALOR DE C ES: "+ C);
                }
                else{
                    JOptionPane.showMessageDialog(null, "EL NÚMERO CON EL VALOR MAYOR ES D. \nEL VALOR DE D ES: "+ D);
                }
            }
        }
    }
}
