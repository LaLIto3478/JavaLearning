package practica1;

import javax.swing.JOptionPane;

public class practica_1_ejercicio_12 {

    public static void main(String[] args) {
        // }DECLARAR VARIABLES
        int a = 0, b = 0;
        double c = 0;
        
        // PEDIR AL USUARIO LOS VALORES DE LOS CATETOS
        a = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL CATETO 'a': "));
        b = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL CATETO 'b': "));
        
        // PROCESAMIENTO
        c = Math.pow(a, 2) + Math.pow(b, 2);
        
        // IMPRIMIR EN PANTALLA EL CUADRADO DE LA LONGITUD DE LA HIPOTENUSA
        JOptionPane.showMessageDialog(null, c);
        
    }
    
}
