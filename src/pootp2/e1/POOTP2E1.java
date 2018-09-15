/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootp2.e1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;



/**
 *
 * @author juanj
 */
public class POOTP2E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a1 = new Alumno(28184893, "Juanjo", "Saez", 37);
        Materia m1 = new Materia(120, "Ingenieria", 32);
        Date fecha = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String hoy = sdf.format(fecha);
        Inscripcion insc = new Inscripcion(m1, sdf.format(fecha));
        insc.agregarIncripto(a1);
        JOptionPane.showMessageDialog(null, hoy);
        JOptionPane.showMessageDialog(null, insc.inscriptos.get(0).nombre);
    }
    
    
}

