package practica1;

import javax.swing.JOptionPane;

public class practica_1_ejercicio_3 {
    
    public static void main(String[] args) {
        // PRIMER SOLUCIÓN CON VARIABLE AUXILIAR
        // DECLARAR VARIABLES
        float a = 0, b = 0;
        float c = 0; //VARIABLE AUXILIAR USADA SOLO EN LA SOLUCIÓN 1)
        
        // PEDIR AL USUARIO EL VALOR DE LOS NUMEROS DE LAS DOS VARIABLES 'a' Y 'b'
        a = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la variable 'a'"));
        b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la variable 'b'"));
        
        // PROCESAMIENTO
        c = a;
        a = b;
        b = c;
        
        // IMPRIMIR EL RESULTADO DE LA PRIMERA SOLUCIÓN
        JOptionPane.showMessageDialog(null, "Las variables con valores intercambiados son: " + "\n" + "a = " +a +"\n" + "b =" +b);
        
        
        // SEGUNDA SOLUCION SIN VARIABLE AUXILIAR
        // DECLARAR VARIABLES
        a = 0;
        b = 0;
        
        // PEDIR AL USUARIO EL VALOR DE LAS VARIABLES
        a = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la variable 'a'"));
        b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la variable 'b'"));
        
        // PROCESAMIENTO
        a = a + b;
        b = a - b;
        a = a - b;
        
        // IMPRIMIR EL RESULTADO DE LA SEGUNDA SOLUCIÓN
        JOptionPane.showMessageDialog(null, "Las variables con valores intercambiados son:" + "\n" + "a =" +a +"\n" + "b =" +b);

    }
    
}