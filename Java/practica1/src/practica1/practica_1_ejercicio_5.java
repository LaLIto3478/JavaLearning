package practica1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

public class practica_1_ejercicio_5 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        // LA NOTA A CORRESPONDE A TAREAS, LA NOTA B CORRESPONDE AL EXAMEN 
        float A = 0, B = 0, promedio = 0;
        float pesonotaA = (float) 3.5, pesonotaB = (float) 7.5;
        
        // PEDIR AL USUARIO EL VALOR DE LAS VARIABLES DE PUNTO FLOTANTE QUE CORRESPONDEN A LAS CALIFICACIONES
        A = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificación de las tareas del estudiante"));
        B = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la califcación del examen del estudiante"));
        
        // PROCESAMIENTO
        BigDecimal bd = new BigDecimal((A * pesonotaA)/11 + (B * pesonotaB)/11).setScale(5, RoundingMode.CEILING);
        promedio = bd.floatValue();
        
        // IMPRIMIR EL PROMEDIO
        JOptionPane.showMessageDialog(null, "PROMEDIO = "+promedio);
    
    }
    
}
