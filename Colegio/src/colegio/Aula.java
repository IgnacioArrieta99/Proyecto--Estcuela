/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import java.util.ArrayList;


/**
 *
 * @author alumno
 */
public class Aula {
    int Num_ID;
    int Capacidad;
    int CantAlumnos;
    String Materia;
    int CantClases;

    public Aula(int Num_ID, int Capacidad, int CantAlumnos, String Materia, int CantClases) {
        this.Num_ID = Num_ID;
        this.Capacidad = Capacidad;
        this.CantAlumnos = CantAlumnos;
        this.Materia = Materia;
        this.CantClases = CantClases;
    }

    
    
    
    
    public int getNum_ID() {
        return Num_ID;
    }

    public void setNum_ID(int Num_ID) {
        this.Num_ID = Num_ID;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public int getCantAlumnos() {
        return CantAlumnos;
    }

    public void setCantAlumnos(int CantAlumnos) {
        this.CantAlumnos = CantAlumnos;
    }

    public String getMateria() {
        return Materia;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public int getCantClases() {
        return CantClases;
    }

    public void setCantClases(int CantClases) {
        this.CantClases = CantClases;
    }
    
    
    
    
    public boolean porcentajeAlumno(int Capacidad, int CantAlumnos){
      int contador=0;
      boolean cantA=true;
        if (contador>=(CantAlumnos/2)) {
            cantA=false;
            
        }
        return cantA;
    
    }
    
    
    
    public boolean porcentajeProf(int CantClases,Profesor prof1 ){
        if (this.CantClases>prof1.getAsistencia()) {
            return true;
            
        }else
        return false;
                
                
        
    }
    
    public boolean MismaMat(Profesor prof1){
       
        while (true) {            
          
            
            if (this.Materia==prof1.getMateriaProf()) {
              
            return true;
            }else{
               
                return false;
                
                
            }
        }
        
      
 
    }

    public String IniciarClases(Profesor prof1){
        if (MismaMat(prof1)&&porcentajeAlumno(Capacidad, CantAlumnos)&&porcentajeProf(CantClases, prof1)) {
            return "Se puede dar clases";
        }
        return "No se puede dar clases ";
    }
    
        
        
        
  
        
    
                
        
        
      
    }
    
    
    
    
    

