/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootp2.e1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
        Alumno a2 = new Alumno(30900923, "Mayra", "Sosa", 21);
        Alumno a3 = new Alumno(32455634, "Cristy", "Yalez", 23);
        //crear materias
        Materia m1 = new Materia(120, "Ingenieria", 32);
        Materia m2 = new Materia(121, "Quimica", 30);
        Materia m3 = new Materia(119, "Lengua", 34);
        
        // fecha
        LocalDate fecha = LocalDate.now();
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       // String hoy = sdf.format(fecha);
        
        Inscripcion insc = new Inscripcion(m1, fecha); //inscripcion o cursada 2018 materia
        //agrego los alumnos a materia 1 : Ingeniería
        insc.agregarIncripto(a1);
        insc.agregarIncripto(a1);
        
        insc.agregarIncripto(a2);
        insc.agregarIncripto(a3);
        // Crear cursadas de Quimica y Lengua
        Inscripcion insc2 = new Inscripcion(m2, fecha);
        Inscripcion insc3 = new Inscripcion(m3, fecha);
        //agrego alumno "a1" inscripto TAMBIEN A m2 y m3
        insc2.agregarIncripto(a1);
        insc3.agregarIncripto(a1);
        // Otro alumno (Mayra) se inscribe a Quimica (m2)...
        insc2.agregarIncripto(a2);
        
        JOptionPane.showMessageDialog(null, "Mostrando una fecha "+ fecha);
        JOptionPane.showMessageDialog(null, insc.inscriptos.get(0).nombre);
        insc.cargaCalificacion(a1, 8.75); 
        
        JOptionPane.showConfirmDialog(null, "La calificacion del pibe es: " + insc.inscriptos.get(0).getNota());
        insc.mostrarInscriptos();
        insc2.mostrarInscriptos();
        insc3.mostrarInscriptos();
        
        System.out.println("Lista de Materias que cursa: " + a2.getNombre()); 
        insc.mostrarMaterias(a2);  //si
        insc2.mostrarMaterias(a2);  //Si
        insc3.mostrarMaterias(a2);   // No
    }
    
    
}

