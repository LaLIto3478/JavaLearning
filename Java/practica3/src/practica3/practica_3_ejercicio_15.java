package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_15 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        float caja = 5000, egresos = 0, pagosnorealizados = 0;
        boolean bandera, paron;
        
        // PROCESAMIENTO
        do{
            paron = false;
            do {            //PEDIR EL EGRESO Y VALIDAR QUE SEA UN NÚMERO
                bandera = true;
                try{
                    egresos = Float.parseFloat(JOptionPane.showInputDialog("INGRESE UN EGRESO DE LA EMPRESA"));
                }catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "ERROR: Valor númerico NO válido. " + ex.getMessage());
                        bandera = false;
                }
            }while(bandera == false);

            if(egresos != -1){      // RESTAR EL EGRESO A LA CAJA
                if (caja >= egresos){
                    caja -= Math.abs(egresos);
                }
                else{
                    JOptionPane.showMessageDialog(null, "La caja no tiene suficiente saldo para pagarlo, ingrese otro egreso. \nSaldo actual: "+caja);
                }
                
                if (caja == 0){
                    JOptionPane.showMessageDialog(null, "La caja ya NO tiene saldo!!!: \nSaldo actual: "+caja);
                    paron = true;
            }
            }

        }while(egresos != -1 && paron == false);
        
        // IMPRIMIR EN PANTALLA
        if (paron == false){
            JOptionPane.showMessageDialog(null, "Saldo actual de la caja: "+caja);
        }
    }
}
