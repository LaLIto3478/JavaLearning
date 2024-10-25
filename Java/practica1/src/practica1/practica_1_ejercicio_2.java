package practica1;

import javax.swing.JOptionPane;

public class practica_1_ejercicio_2 {
    
    public static void main(String[] args) {
        
        // DECLARAR VARIABLE
        int a = 0, resultado = 0;
        
        // PEDIR AL USUARIO EL VALOR DE LOS NUMEROS 'A'
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero: "));
        
        // OPERACIONES
        resultado = 2*a*25;
        
        // MOSTRAR EN PANTALLA LOS RESULTADOS
        JOptionPane.showMessageDialog(null, "El resultado es: "+resultado);
        
    }
    
}
