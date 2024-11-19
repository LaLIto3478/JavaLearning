package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_30 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        float potencia = 0, X = 0, conta = 1;
        int n = 0;
        boolean bandera;
        
        // PEDIR AL USUARIO LAS VARIABLES
        do {
            bandera = true;
            try{
                X = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la base de su exponenciación: \nNota: Debe ser distinto de cero."));
                if (X == 0){
                    JOptionPane.showMessageDialog(null, "ERROR: Su base NO puede ser igual a cero.");
                    bandera = false;
                }
                n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente que debe ser un entero."));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Números NO válidos. \nVuelva a ingresar sus valores.");
                bandera = false;
            }
        }while(bandera == false);
        // PROCESAMIENTO
        potencia = X;
        if (n != 0){
            while (conta < Math.abs(n)){
                potencia *= X;
                conta++;
            }
        }
        else{
            potencia = 1;
        }
        
        if (n < 0){
            potencia = 1/potencia;
        }
        JOptionPane.showMessageDialog(null, "El resultado de su exponenciación es: "+potencia);
    }
}
