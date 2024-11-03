package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_2 {
    
    public static void main(String[] args) {
        // declarar variables
        double numero = 0, raiz = 0;

        
        // pedir el número
        numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DEL NÚMERO: "));
        
        // procesamiento
        if (numero >= 0){
            raiz = Math.pow(numero, 0.5);
            JOptionPane.showMessageDialog(null, raiz);
        
        }
        else {
            JOptionPane.showMessageDialog(null, "No hay solución real");
        } 
    }
}
