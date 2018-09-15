/*
  El sistema debe permitir
cargar la calificación (nota) final cuando un alumno rinde un examen final.
Inicialmente el sistema está pensado para registrar la última calificación obtenida.

 */
package pootp2.e1;

import java.util.ArrayList;


/**
Como prueba inicial el sistema al ejecutarse deberá imprimir en la consola las
materias a en las que un alumno está inscripto, y posteriormente los alumnos que
cursan una materia en particular. 
 */
public class Inscripcion {
    ArrayList<Alumno> inscriptos;
    Materia asignatura;
    String fecha;
    ArrayList<Integer> notas;

    public Inscripcion(Materia asignatura, String fecha) {
        this.asignatura = asignatura;
        this.fecha = fecha;
        inscriptos = new ArrayList<Alumno>();
    }

       
    public void agregarIncripto(Alumno a){
        if(!inscriptos.contains(a))
                inscriptos.add(a);
    }
    
}
