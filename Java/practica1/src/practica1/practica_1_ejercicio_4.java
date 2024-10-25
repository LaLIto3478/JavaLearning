package practica1;

import javax.swing.JOptionPane;

public class practica_1_ejercicio_4 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        float a =0, b = 0, c =0, d = 0, mult = 0, sum = 0, media = 0;
        
        // PEDIR AL USUARIO EL VALOR DE LAS CUATRO VARIABLES
        a = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la variable 'a': "));
        b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la variable 'b': "));
        c = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la variable 'c': "));
        d = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de la variable 'd': "));
        
        // PROCESAMIENTO
        mult = a * b * c * d;
        sum = a + b + c + d;
        media = sum / 4;
        
        // IMPRIMIR LOS RESULTADOS
        JOptionPane.showMessageDialog(null, "El producto de los numeros es: "+ mult);
        JOptionPane.showMessageDialog(null, "La sumatoria de sus variables es: "+ sum);
        JOptionPane.showMessageDialog(null, "La media de sus variables es: "+media);
            
    }
    
}