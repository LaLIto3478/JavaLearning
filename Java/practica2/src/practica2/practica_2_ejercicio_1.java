package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_1 {
    
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
                    JOptionPane.showMessageDialog(null,"El número central es: "+ b); 
                }
                else { 
                    if (a < c){
                        JOptionPane.showMessageDialog(null,"El número central es: "+ c);
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "El número central es: "+ a);//
                    }
                }
            }
            else{
                if (a < c){
                    JOptionPane.showMessageDialog(null,"El número central es: "+ a);
                }
                else {
                    if (b < c){
                        JOptionPane.showMessageDialog(null,"El número central es: "+ c);
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"El número central es: "+ b);
                    }
                }
                    }
    }
    else{
            JOptionPane.showMessageDialog(null, "Sus números son iguales!!!");
        }
    }
    
}
