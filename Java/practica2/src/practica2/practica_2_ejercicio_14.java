package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_14{

    public static void main(String[] args) {
        //DECLARAR VARIABLES QUE SE VAN A PEDIR
        float distancia = 0, estancia = 0;

        // DECLARAR VARIABLES PARA EL PROCESAMIENTO
        float preciototal = 0;
        
        // PEDIR VARIABLES
        distancia = Float.parseFloat(JOptionPane.showInputDialog("¿Qué distancia viajará su vuelo?"));
        estancia = Float.parseFloat(JOptionPane.showInputDialog("¿Qué duración tendrá su estancia?"));
        
        //PROCESAMIENTO
        preciototal = distancia * 150;
        if (distancia > 800){
            if (estancia > 7){
                preciototal *= .70f;
                JOptionPane.showMessageDialog(null, "El precio de su boleto será de: "+preciototal+" pesos.");
            }
            else{
                JOptionPane.showMessageDialog(null, "El precio de su boleto será de: "+preciototal+" pesos.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El precio de su boleto será de: "+preciototal+" pesos.");
        }
    }
}
