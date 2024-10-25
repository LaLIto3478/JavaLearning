package practica1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.swing.JOptionPane;

public class practica_1_ejercicio_10 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        double P = 0, R = 0, V1 = 0, V2 = 0, VREL = 0, T = 0;
        
        // PEDIR AL USUARIO LAS VARIABLES 'P' Y 'R' QUE CORRESPONDEN AL TIEMPO EN SEGUNDOS DE AMBOS ANIMALES
        R = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL TIEMPO EN SEGUNDOS QUE LE TOMA AL RATÓN DAR UNA VUELTA COMPLETA: "));
        P = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL TIEMPO EN SEGUNDOS QUE LE TOMA AL PATO DAR UNA VUELTA COMPLETA: "));
        
        // PROCESAMIENTO
        if (1 <= R){
            if (R < P){
                if (P <= 100){
                V1 = 1/R;
                V2 = 1/P;
                VREL = V1 - V2;      
                //T =  Math.round((1/VREL)*1000000.0)/1000000.0;
                BigDecimal bd = new BigDecimal(1/VREL).setScale(1, RoundingMode.HALF_UP);
                T = bd.doubleValue();
                
                //IMPRIMIR EN PANTALLA EL RESULTADO
                JOptionPane.showMessageDialog(null, T);
                }else{
                JOptionPane.showMessageDialog(null, "EL TIEMPO EN SEGUNDOS DEL PATO NO PUEDE SEER MAYOR A 100");}
            
            }else{
            JOptionPane.showMessageDialog(null, "EL TIEMPO DEL PATO NO PUEDE SER MENOR AL DEL RATÓN");}
        
        }else{
        JOptionPane.showMessageDialog(null, "EL TIEMPO DEL RATÓN NO PUEDE SER MENOR A 1");}
    }
    
}
