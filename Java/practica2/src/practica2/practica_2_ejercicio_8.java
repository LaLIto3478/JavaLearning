package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_8{

    public static void main(String[] args) {
        //DECLARAR VARIBLES
        char LETRA;
        int calificacion = 0;
        
        //PEDIR AL USUARIO LA VARIABLE 
        LETRA = JOptionPane.showInputDialog("INGRESE LA CALIFICACIÓN").charAt(0);
        
        // PROCESAMIENTO
        switch (LETRA) {
            case 'A':
                calificacion = 4;
                JOptionPane.showMessageDialog(null,"La calificación numérica es: " + calificacion);
                break;
            case 'B':
                calificacion = 5;
                JOptionPane.showMessageDialog(null,"La calificación numérica es: " + calificacion);
                break;
            case 'C':
                calificacion = 6;
                JOptionPane.showMessageDialog(null,"La calificación numérica es: " + calificacion);
                break;
            case 'D':
                calificacion = 7;
                JOptionPane.showMessageDialog(null,"La calificación numérica es: " + calificacion);
                break;
            case 'E':
                calificacion = 8;
                JOptionPane.showMessageDialog(null,"La calificación numérica es: " + calificacion);
                break;
            case 'F':
                calificacion = 9;
                JOptionPane.showMessageDialog(null,"La calificación numérica es: " + calificacion);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Su calificación alfabética DEBE estar en el rango entre A y F!!!");
                break;
        }
    }
}
