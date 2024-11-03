package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_3 {
    
    public static void main(String[] args) {
        //declarar variables
        float a = 0, b = 0, x = 0;
        
        //pedir al usuario los valores de las variables
        a = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE 'a': "));
        b = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL VALOR DE B: "));
        
        //PROCESAMIENTO
        if (a != 0){
            x = -b / a;
            JOptionPane.showMessageDialog(null, x);
        }
        else if (a == 0){
            if (b != 0){
                JOptionPane.showMessageDialog(null, "solución imposible");
            }
            else{
            JOptionPane.showMessageDialog(null, "solución indeterminada");
            }
        }
    }
}
