package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_10{

    public static void main(String[] args) {
        //DECLARAR VARIABLES
        int numero = 0, digitos = 0;
        
        // PEDIR AL USUARIO EL NÚMERO:
        numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NÚMERO A EVALUAR: "));
        
        // PROCESAMIENTO
        if (numero / 1 <= -1 || numero / 1 >= 1 || numero == 0){
            digitos++;
            if (numero / 10 <= -1 || numero / 10 >= 1){
                digitos++;
                if (numero / 100 <= -1 || numero / 100 >= 1){
                    digitos++;
                    if (numero / 1000 <= -1 || numero / 1000 >= 1){
                        JOptionPane.showMessageDialog(null, "Su número tiene más de tres dígitos.");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Su número tiene tres dígitos.");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Su número tiene dos dígitos.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Su número tiene un dígito.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Su número no tiene ni un dígito");
        }   
    }
}
