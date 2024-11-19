package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_20 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        int ancho = 0, altura = 0, j = 1;
        boolean bandera;
        String rectangulo = "";
        
        // PEDIR ANCHO Y ALTURA
        do {
            bandera = true;
            try{
                ancho = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL ANCHO DE SU RECTANGULO"));
                altura = Integer.parseInt(JOptionPane.showInputDialog("INGRESE LA ALTURA DE SU RECTANGULO"));
                
                if (ancho <= 0){
                    JOptionPane.showMessageDialog(null, "Su rentangulo NO puede tener dimensiones menores o iguales a cero, vuelva a ingresar sus dimensiones.");
                    bandera = false;
                }
                else if (altura <= 0){
                    JOptionPane.showMessageDialog(null, "Su rectangulo NO puede tener dimensiones menores o iguales a cero, vuelva a ingresar sus dimensiones.");
                    bandera = false;
                }
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido, vuelva a ingresar sus valores. " + ex.getMessage());
                bandera = false;
            }
        }while(bandera == false); 
     
        for (int i = 0 ; i < ancho * altura ; i++){
            rectangulo += "*";
            if (i == (ancho * j) - 1){
                rectangulo += "\n";
                j++;
            }
        }
        
        // IMPRIMIR EN PANTALLA
        JOptionPane.showMessageDialog(null, rectangulo);
    }
}
