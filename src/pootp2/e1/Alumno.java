/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootp2.e1;

/**
 *
 * @author juanj
 */
public class Alumno {
    int dni;
    String nombre;
    String apellido;
    int edad;
    Inscripcion cursa;
    double nota;        //Este atributo es vacio. solo se llena en el listado de inscriptos

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }
 
    public Alumno(int dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        
    }
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Inscripcion getCursa() {
        return cursa;
    }

    public void setCursa(Inscripcion cursa) {
        this.cursa = cursa;
    }

    public Alumno() {
    }

   
    
   
}
