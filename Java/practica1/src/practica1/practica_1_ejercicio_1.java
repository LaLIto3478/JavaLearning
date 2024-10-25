package practica1;

import javax.swing.JOptionPane;

public class practica_1_ejercicio_1 {

    public static void main(String[] args) {
        
        //DECLARAR VARIABLE
        float A=0, B=0, suma=0, resta=0, mult=0, div=0, modulo=0;
        
        // PEDIR AL USUARIO EL VALOR DE LOS NUMEROS 'A' Y 'B'
        A = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de A: "));
        B = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de B: "));
        
        // OPERACIONES
        suma = A + B;
        resta = A- B;
        mult = A * B;
        div = A / B;
        modulo = A % B;
        
        // MOSTRAR EN PANTALLA LOS RESULTADOS
        JOptionPane.showMessageDialog(null, "El valor de la suma de A y B es: " +suma + "\n" + "El valor de la resta de A y B es: " +resta + "\n" + "El valor de la multiplicacion es: " + mult + "\n" + "El valor de la division es: " +div + "\n"+"El valor del modulo es: " +modulo);

    }
    
}