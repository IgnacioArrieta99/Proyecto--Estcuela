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
public class Colegio {

    public static void main(String[] args) {
        
        ArrayList<Alumno> ListaAlumnos=new ArrayList<Alumno>();
        
        
        
        Aula aula1 = new Aula(5, 20, 15, "Matematicas", 60);
        Aula aula2 = new Aula(3, 15, 10, "filosofia", 20);
        Aula aula3 = new Aula(7, 23, 14, "Fisica", 45);
        
        Profesor profesor1 = new Profesor("Jorge",30,"Masculino",20,"Matematicas");
        Profesor profesor2 = new Profesor("Marta",26,"Femenino",30,"Matematicas");
        Profesor profesor3 = new Profesor("Emilio",50,"Masculino",27,"Fisica");        


        ListaAlumnos.add(new Alumno("Manuel",19,"Masculino",9,20,"Matematicas"));
        ListaAlumnos.add(new Alumno("Sofia",20,"Femenino",7,28,"Filosofia"));
        ListaAlumnos.add(new Alumno("Luis",18,"Masculino",7,29,"Fisica"));
        ListaAlumnos.add(new Alumno("Maria",19,"Femenino",8,26,"matematias"));
        ListaAlumnos.add(new Alumno("Jose",20,"Masculino",10,23,"Fisica"));
        ListaAlumnos.add(new Alumno("Laura",18,"Femenino",7,27,"Filosofia"));
        
        
        System.out.println(aula1.IniciarClases(profesor1)+" en el aula 1");
        System.out.println("");
        System.out.println(aula2.IniciarClases(profesor2)+" en el aula 2");
        System.out.println("");
        System.out.println(aula3.IniciarClases(profesor3)+" en el aula3");
        System.out.println("");
        System.out.println("");
        System.out.println("*****Lista de varones*****");
        for (Alumno ListaA : ListaAlumnos) {
            
            if (ListaA.getSexo()=="Masculino") {
                System.out.println(ListaA);
            }
        }
        System.out.println("");
        System.out.println("*****Lista de mujeres*****");
        for (Alumno ListaA : ListaAlumnos) {
            if (ListaA.getSexo()=="Femenino") {
                System.out.println(ListaA);
                
            }
            
        }
        

         
        
        
        
/*        super.Nombre=Nombre;
        super.Edad=Edad;
        super.Sexo=Sexo;*/

        
        
        
        
    }
    
}
