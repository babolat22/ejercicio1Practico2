/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootp2.e1;

import java.util.ArrayList;

/**
 *
 * @author juanj
 */
public class Materia {
    int codMateria;
    String nombreMat;
    int cantHoras;
    ArrayList<Inscripcion> cursada;
 
    public Materia(int codMateria, String nombreMat, int cantHoras) {
        this.codMateria = codMateria;
        this.nombreMat = nombreMat;
        this.cantHoras = cantHoras;
        
    }
    public int getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(int codMateria) {
        this.codMateria = codMateria;
    }

    public String getNombreMat() {
        return nombreMat;
    }

    public void setNombreMat(String nombreMat) {
        this.nombreMat = nombreMat;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public ArrayList<Inscripcion> getCursada() {
        return cursada;
    }

    public void setCursada(ArrayList<Inscripcion> cursada) {
        this.cursada = cursada;
    }

   

        
}
