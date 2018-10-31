/*
  El sistema debe permitir
cargar la calificación (nota) final cuando un alumno rinde un examen final.
Inicialmente el sistema está pensado para registrar la última calificación obtenida.

 */
package pootp2.e1;

import java.time.LocalDate;
import java.util.ArrayList;


/**
Como prueba inicial el sistema al ejecutarse deberá imprimir en la consola las
materias a en las que un alumno está inscripto, y posteriormente los alumnos que
cursan una materia en particular. 
 */
public class Inscripcion {
    ArrayList<Alumno> inscriptos;
    Materia asignatura;
    LocalDate fecha;
    int i=0;
    //ArrayList<Integer> notas;

    public Inscripcion(Materia asignatura, LocalDate fecha) {
        this.asignatura = asignatura;
        this.fecha = fecha;
        inscriptos = new ArrayList<>();
    }

       
    public void agregarIncripto(Alumno a){
        if(!inscriptos.contains(a))
                inscriptos.add(a);
        else
            System.out.println("Alumno ya inscripto! "+ a.getNombre()+" "+a.getApellido());
        
    }
    
    public void cargaCalificacion(Alumno a, double calif){
             if(inscriptos.contains(a)) a.setNota(calif); 
             else System.out.println("Upps...El alumno no esta en la cursada! ");    
    }
    
    public void mostrarInscriptos(){
        System.out.println("Lista de Inscriptos a: " + asignatura.getNombreMat()); 
        inscriptos.forEach((inscripto) -> {
            System.out.println("-->" + inscripto.getNombre()+" "+inscripto.getApellido() + " "+ inscripto.getDni());
        });
    }
    
    public void mostrarMaterias(Alumno al){
           if(inscriptos.contains(al))
              System.out.println("--> CURSA " + asignatura.nombreMat);
        
    }
}