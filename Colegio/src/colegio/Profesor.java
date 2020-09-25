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
public class Profesor extends Persona{
    
    
    
    int Asistencia;
    String MateriaProf;

    public Profesor(String Nombre, int Edad,String Sexo,int Asistencia, String MateriaProf) {        
        super.Nombre=Nombre;
        super.Edad=Edad;
        super.Sexo=Sexo;
        this.Asistencia = Asistencia;
        this.MateriaProf = MateriaProf;

    }
    
    
    
    public Profesor(){
        super();
    }

    public int getAsistencia() {
        return Asistencia;
    }

    public void setAsistencia(int Asistencia) {
        this.Asistencia = Asistencia;
    }

    public String getMateriaProf() {
        return MateriaProf;
    }

    public void setMateria(String Materia) {
        this.MateriaProf = Materia;
    }


    
    


    




    

}




