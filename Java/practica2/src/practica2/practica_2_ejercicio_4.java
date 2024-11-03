package practica2;

import javax.swing.JOptionPane;

public class practica_2_ejercicio_4 {

    public static void main(String[] args) {
        // Declarar variables
        float tarifa = 0, sueldo = 0;
        int horas = 0;
        String nombre;
        
        // Pedir al usuario las variables
        tarifa = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la tarifa por hora que se le pagará al empleado: "));
        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas por el empleado: "));
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente: ");
        
        // PROCESAMIENTO
        if (horas <= 35){
            sueldo = horas * tarifa;
        }
        else{
            sueldo = (35 * tarifa) + ((horas - 35) * tarifa * 3/2);
        }
        
        if (sueldo <= 10000){
            JOptionPane.showMessageDialog(null, "Nombre del empleado: "+nombre+"\nNómina semanal: "+sueldo);
        }
        else if (sueldo > 10000 && sueldo <12200){
                sueldo = sueldo * 4/5;
                JOptionPane.showMessageDialog(null, "Nombre del empleado: "+nombre+"\nNómina semanal: "+sueldo);
        }
        else{
        sueldo = sueldo * 7/10;
        JOptionPane.showMessageDialog(null, "Nombre del empleado: "+nombre+"\nNómina semanal: "+sueldo);
        }   
    }
}

