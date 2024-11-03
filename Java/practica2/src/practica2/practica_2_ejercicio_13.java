package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_13 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        double a = 0, b = 0, c = 0, x1 = 0, x2 = 0, raiz = 0;
        
        // PEDIR AL USUARIO EL VALOR DE LOS COEFICIENTES a, b, Y c
        a = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL COEFICIENTE a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL COEFICIENTE b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL COEFICIENTE c: "));
        
        if ((Math.pow(b, 2) - 4*a*c) >= 0){ //probar a = 1, b = 4, c = 5
            // PROCESAMIENTO
            x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
            x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
            
            // IMPRIMIR LOS VALORES DE x
            JOptionPane.showMessageDialog(null, "la primera posible soluciónde x es: " +x1);
            JOptionPane.showMessageDialog(null, "la segunda posible solución de x es : " +x2);
        }
        
        else{
            // PROCESAMIENTO            
            raiz = Math.sqrt(Math.abs(Math.pow(b, 2) - 4*a*c));
            
            // IMPRIMIR LOS VALORES DE x
            JOptionPane.showMessageDialog(null, "la primera posible soluciónde x es: " + "("+ -b + " + " + raiz + "i)" + "/" + 2*a);
            JOptionPane.showMessageDialog(null, "la segunda posible solución de x es : " + "(" + -b + " - " + raiz + "i)" + "/" + 2*a);
        }
            
    }
        
}
