package practica1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

public class practica_1_ejercicio_11 {
    
    public static void main(String[] args) {
        // DECLARAR VARIABLES
        double r = 0, h = 0, area = 0, volumen = 0;
        final double pi = 3.1416;
        
        // PEDIR AL USUARIO EL RADIO Y LA ALTURA
        r = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL RADIO DE SU CILINDRO: "));
        h = Double.parseDouble(JOptionPane.showInputDialog("INGRESE LA ALTURA DE SU CILINDRO: "));
        
        // PROCESAMIENTO
        BigDecimal bd = new BigDecimal(2*pi*r*h + 2*pi*Math.pow(r, 2)).setScale(2, RoundingMode.HALF_DOWN);
        area = bd.doubleValue();
        BigDecimal db = new BigDecimal(pi * Math.pow(r, 2) * h).setScale(2, RoundingMode.HALF_DOWN);
        volumen = db.doubleValue();
        
        // IMPRIMIR EN PANTALLA EL RESULTADO
        JOptionPane.showMessageDialog(null, "AREA="+area + "\n" + "VOLUMEN="+volumen);
        
    }
    
}
