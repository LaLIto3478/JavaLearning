package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_12 {
    
    public static void main(String[] args) {
        // DECLARAR VARIABLES A USAR
        int a = 0, b = 0, c = 0;

        // PEDIR AL USUARIO LAS VARIABLES
        a = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE C: "));

        // PROCESAMIENTO
        if (a != b && b != c){
            if (a < b){
                if (b < c){
                    JOptionPane.showMessageDialog(null, c + " " + b + " " + a); 
                }
                else{
                    if (a < c){
                        JOptionPane.showMessageDialog(null, b + " " + c + " " + a);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, b + " " + a + " " + c); 
                    }
                }
            }
            else{
                if (a < c){
                    JOptionPane.showMessageDialog(null, c + " " + a + " " + b);
                }
                else {
                    if (b < c){
                        JOptionPane.showMessageDialog(null, a + " " + c + " " + b);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, a + " " + b + " " + c);
                    }
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "SUS NÚMEROS SON IGUALES!!!\nEL ORDEN SERÍA: " + a + " " + b + " " + c);
        }
    }
}
