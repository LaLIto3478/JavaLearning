package practica3;

import javax.swing.JOptionPane;

public class practica_3_ejercicio_2 {

    public static void main(String[] args) {
        // DECLARAR VARIABLES
        float materias = 0, calificacion = 0, aprobadas = 0, reprobadas = 0, promediototal = 0, promedioreprobadas = 0, promedioaprobadas = 0;
        boolean bandera;
        String validador = " ";
        
        // PEDIR AL USUARIO LAS MATERIAS y validacion de que sea un entero.
        do {
            validador = JOptionPane.showInputDialog("¿Cuántas materias cursó el estudiante?");
            bandera = true;
            
            for (int i = 0 ; i < validador.length() ; i++){
                if (validador.charAt(i) < 48 || validador.charAt(i) > 57){
                    JOptionPane.showMessageDialog(null, "ERROR: Entero NO válido");
                    bandera = false;
                    break;
                }
            }
        } while(bandera == false);
        
        // PROCESAMIENTO
        materias = Float.parseFloat(validador);
        validador = " ";
        if (materias > 0){
            for (int i = 1 ; i <= materias ; i++){
                // PEDIR UNA CALIFICACION Y VALIDAR QUE SEA UN VALOR NÚMÉRICO
                do{
                    validador = JOptionPane.showInputDialog("INGRESE UNA CALIFICACION \nNOTA: Tiene que ser una califcación entre el 0 y 10.");
                    bandera = true;
                    for (int j = 0 ; j < validador.length() ; j++){
                        if (validador.charAt(j) < 46 || validador.charAt(j) == 47 ||validador.charAt(j) > 57){
                            JOptionPane.showMessageDialog(null, "ERROR: calificacion NO válida");
                            bandera = false;
                            break;
                        }
                        
                    calificacion = Float.parseFloat(validador);
                        if (calificacion < 0){
                            JOptionPane.showMessageDialog(null, "ERROR: Su calificación DEBE ser entre 0 y 10.");
                            bandera = false;
                            break;
                        }
                        if (calificacion > 10){
                            JOptionPane.showMessageDialog(null, "ERROR: Su calificación DEBE ser entre 0 y 10.");
                            bandera = false;
                            break;
                        }
                    }
                } while(bandera == false);
                
                calificacion = Float.parseFloat(validador);
                if (calificacion >= 6){
                    aprobadas++;
                    promedioaprobadas += calificacion;
                }
                else{
                    reprobadas++;
                    promedioreprobadas += calificacion;
                }
                promediototal += calificacion;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El estudiante no pudo haber cursado cero o menos materias.");
        }
        
        promediototal /= materias;
        if (aprobadas > 0){
            promedioaprobadas /= aprobadas;
            if (reprobadas > 0){
                promedioreprobadas /= reprobadas;
                JOptionPane.showMessageDialog(null, "MATERIAS: " + materias + "\nMaterias reprobadas: " + reprobadas + "\nMaterias aprobadas: "+ aprobadas + "\nPromedio de las calificaciones: " + promediototal + "\nPromedio de las calificaciones de las materias aprobadas: " + promedioaprobadas + "\nPromedio de las calificaciones de las materias reprobadas: "+ promedioreprobadas);
            }
            else{
                JOptionPane.showMessageDialog(null, "MATERIAS: " + materias + "\nMaterias reprobadas: " + "el alumno no reprobó ninguna materia."+ "\nMaterias aprobadas: "+ aprobadas + "\nPromedio de las calificaciones: " + promediototal + "\nPromedio de las calificaciones de las materias aprobadas: " + promedioaprobadas + "\nPromedio de las calificaciones de las materias reprobadas: "+ "el estudiante no reprobó ni una materia.");
            }
        }
        else{
            if (reprobadas > 0){
                promedioreprobadas /= reprobadas;
                JOptionPane.showMessageDialog(null, "MATERIAS: " + materias + "\nMaterias reprobadas: " + reprobadas+ "\nMaterias aprobadas: "+ "el estudiante no aprobó ni una materia. " + "\nPromedio de las calificaciones: " + promediototal + "\nPromedio de las calificaciones de las materias aprobadas: " + "el estudiante no aprobó ni una materia." + "\nPromedio de las calificaciones de las materias reprobadas: "+ promedioreprobadas);
            }
        }
    }
}
