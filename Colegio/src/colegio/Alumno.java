/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**
 *
 * @author alumno
 */
public class Alumno extends Persona{

    public Alumno(String Nombre, int Edad,String Sexo,double notas, int Asistencia, String Materia) {
        super.Nombre=Nombre;
        super.Edad=Edad;
        super.Sexo=Sexo;
        this.notas = notas;
        this.Asistencia = Asistencia;
        this.Materia = Materia;
    }
    
    
    public Alumno(){
    super();}
    
    double notas;
    int Asistencia;
    String Materia;
    

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    }

    public int getAsistencia() {
        return Asistencia;
    }

    public void setAsistencia(int Asistencia) {
        this.Asistencia = Asistencia;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }


    
    
    public String toString(){
    return "Nombre: "+Nombre+" //"+" Sexo "+Sexo+" //"+" Edad: "+Edad+" //"+" Nota: "+notas+" //"+" Asistencia: "+Asistencia+" //"+" Materia: "+Materia;
    }
    
    
    
   
   
       
    
    
    
    
    
}
