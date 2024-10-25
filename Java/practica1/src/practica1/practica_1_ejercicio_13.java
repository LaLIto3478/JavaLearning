package practica1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class practica_1_ejercicio_13 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        double R = 0, suma5 = 0, cuadrado = 0, untercio = 0, cubo = 0;
        
        // PEDIR AL USUARIO EL NÚMERO INICIAL
        R = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL NÚMERO INICIAL: "));
        
        // PROCESAMIENTO
        if (1 <= R){
            if (R <= 20){
            DecimalFormat formato = new DecimalFormat ("#.000000");
            
            BigDecimal sbd = new BigDecimal(R + 5).setScale(6, RoundingMode.CEILING);
            suma5 = sbd.doubleValue();
            
            BigDecimal cbd = new BigDecimal((float)Math.pow(suma5, 2)).setScale(6, RoundingMode.CEILING);
            cuadrado = cbd.doubleValue();
            
            BigDecimal utbd = new BigDecimal(cuadrado / (R/3)).setScale(6, RoundingMode.CEILING);
            untercio = utbd.doubleValue();
            
            BigDecimal cbbd = new BigDecimal((float) Math.pow(untercio, 3)).setScale(8, RoundingMode.CEILING);
            cubo = cbbd.doubleValue();
            
            //MOSTRAR EN PANTALLA LOS RESULTADOS
            JOptionPane.showMessageDialog(null, formato.format(R) + " " +formato.format(suma5) + " " + formato.format(cuadrado) + " " + formato.format(untercio) + " " + formato.format(cubo));
            
            }else{
            JOptionPane.showMessageDialog(null, "FUERA DE RANGO");}
        
        }else{
        JOptionPane.showMessageDialog(null, "FUERA DE RANGO");}
        
    }
    
}
