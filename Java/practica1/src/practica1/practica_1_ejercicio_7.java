package practica1;

import javax.swing.JOptionPane;

public class practica_1_ejercicio_7 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        double a = 0, b = 0, c = 0, x1 = 0, x2 = 0;
        
        // PEDIR AL USUARIO EL VALOR DE LOS COEFICIENTES a, b, Y c
        a = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL COEFICIENTE a: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL COEFICIENTE b: "));
        c = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL COEFICIENTE c: "));
        
        if ((Math.pow(b, 2) - 4*a*c) >= 0){ //probar a = 5, b = 4, c = 10
            // PROCESAMIENTO
            x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
            x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
            
            // IMPRIMIR LOS VALORES DE x
            JOptionPane.showMessageDialog(null, "la primera posible soluciónde x es: " +x1);
            JOptionPane.showMessageDialog(null, "la segunda posible solución de x es : " +x2);
        }
        
        else{
            JOptionPane.showMessageDialog(null, "SU ECUACIÓN CUADRÁTICA NO ES POSIBLE \nLAS RAIZ CUADRADA NO PUEDE SER MENOR A CERO");
        }
            
    }
        
}