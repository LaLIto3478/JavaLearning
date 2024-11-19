package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_9 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        String aux;
        char vocal = ' ';
        boolean esvocal = true;
        // PEDIR AL USUARIO EL TEXTO A EVALUAR
        do{
            vocal = JOptionPane.showInputDialog("INGRESE UNA LETRA").charAt(0);
            aux = String.valueOf(vocal).toLowerCase();
            vocal = aux.charAt(0);
            if (vocal == 97){
                esvocal = false;
                JOptionPane.showMessageDialog(null, "la primer vocal escrita fue: " + '"' + vocal +'"');
            }
            else if (vocal == 101){
                esvocal = false;
                JOptionPane.showMessageDialog(null, "la primer vocal escrita fue: " + '"' + vocal +'"');
            }
            else if (vocal == 105){
                esvocal = false;
                JOptionPane.showMessageDialog(null, "la primer vocal escrita fue: " + '"' + vocal +'"');
            }
            else if (vocal == 111){
                esvocal = false;
                JOptionPane.showMessageDialog(null, "la primer vocal escrita fue: " + '"' + vocal +'"');
            }
            else if (vocal == 117){
                esvocal = false;
                JOptionPane.showMessageDialog(null, "la primer vocal escrita fue: " + '"' + vocal +'"');
            }
        }while(esvocal);
    }
}
