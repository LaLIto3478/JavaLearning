package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_1sol2 {
    
    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int a = 0, b = 0, c = 0;
        
        // PEDIR AL USUARIO LAS VALORES 
        a = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE 'A': "));
        b = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE 'b': "));
        c = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE 'c': "));
        
        // PROCESAMIENTO
        if (a < b && b < c){
            JOptionPane.showMessageDialog(null, "EL VALOR CENTRAL ES: "+ b);
        }
        else{
            if(b < a && a < c){
                JOptionPane.showMessageDialog(null, "EL VALOR CENTRAL ES: "+ a);
            }
            else{
                if (b < c && c < a){
                    JOptionPane.showMessageDialog(null, "EL VALOR CENTRAL ES: "+ c);
                }
                else{
                    if (c < b && b < a){
                        JOptionPane.showMessageDialog(null, "EL VALOR CENTRAL ES: "+ b);
                    }
                    else{
                        if (c < a && a < b){
                            JOptionPane.showMessageDialog(null, "EL VALOR CENTRAL ES: "+ a);
                        }
                        else{
                            if(a < c && c < b){
                                JOptionPane.showMessageDialog(null, "EL VALOR CENTRAL ES: "+ c);
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "SUS NÚMEROS SON IGUALES!!!");
                            }
                        }
                    }
                }
            }
        }
    }
}
