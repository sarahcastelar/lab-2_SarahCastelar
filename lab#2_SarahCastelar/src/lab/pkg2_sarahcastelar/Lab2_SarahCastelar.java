package lab.pkg2_sarahcastelar;

import clases.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Lab2_SarahCastelar {
Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
       //nota, examen, 
       ArrayList preguntas = new ArrayList();
       ArrayList respuestas = new ArrayList();
       int option = -1;
       ArrayList lista = new ArrayList();
       ArrayList examen = new ArrayList();
       ArrayList alumnos = new ArrayList();
       Examen e = new Examen();
       Alumno a = new Alumno();
       
       while (option != 4){
           option = Integer.parseInt(
                    JOptionPane.showInputDialog(""
                    + "1. Administracion \n"
                    + "2. Crear Cuenta \n"
                    + "3. Log In \n"
                    + "4. Salir \n")
                );
           
           if (option == 1) {//OPCION DE ADMINISTRACION
               int option2 = Integer.parseInt(
                    JOptionPane.showInputDialog(""
                    + "1. Crear Examen \n"
                    + "2. Revisar Examenes \n"
                    + "3. Ver Notas \n"
                    + "4. Modificar notas \n")
                );
               
               if (option2 == 1) {
                 
                 String preguntaIndividual = "", respuestaIndividual = "";
                 int resp = 1;
                 
                 String NoExamen =JOptionPane.showInputDialog("Codigo del examen ");
                 examen.add(NoExamen); //esto me va servir para ver cuantos examenes para mas tarde
                 String nombreAsignatura =JOptionPane.showInputDialog("Ingrese nombre de la Clase ");
                 
                   while (resp == 1){
                       preguntaIndividual =JOptionPane.showInputDialog("Ingrese pregunta: ");
                       preguntas.add(preguntaIndividual);
                       respuestaIndividual =JOptionPane.showInputDialog("Ingrese respuesta: ");
                       respuestas.add(respuestaIndividual);
                       resp = Integer.parseInt(JOptionPane.showInputDialog("desea agregar mas preguntas? ["
                               + "Ingrese 1 si su respuesta es si.]"));
                   }
                   
                   lista.add(new Examen(NoExamen, nombreAsignatura, preguntas, respuestas));
               }
               
               if (option2 == 2) { //REVISAR EXAMENES
                   //sout que examen desea ingresar
                   String salida = "";
                   for (Object t : examen) {
                           salida += t + "\n";
                   }
                   String CodigoExamen =JOptionPane.showInputDialog("Ingrese Codigo de examen que desea revisar:\n "+salida);
                   //e.Examen(CodigoExamen,preguntas,respuestas);
                   //JOptionPane.showMessageDialog(null, Examen());
                   //System.out.println(Examen(CodigoExamen));
                   //if (Examen(CodigoExamen)  == CodigoExamen)) {//si es el mismo codigo
                       //sout las preguntas y respuestas
                       //sout el toString de la clase examen
                  // }
               }
           }//fin de administracion
           
           if (option == 2) {
               String nombre =JOptionPane.showInputDialog("Ingrese nombre: ");
               String NoCuenta =JOptionPane.showInputDialog("Ingrese numero de cuenta: ");
               String fechaNacimiento =JOptionPane.showInputDialog("Ingrese su fecha de nacimiento: ");
               String edad = JOptionPane.showInputDialog("Ingrese edad: ");
               String ciudad  =JOptionPane.showInputDialog("Ingrese ciudad de residencia: ");
               String nacionalidad =JOptionPane.showInputDialog("Ingrese su nacionalidad: ");
               String ID =JOptionPane.showInputDialog("Ingrese su numero de ID: ");
               String user =JOptionPane.showInputDialog("Ingrese un username: ");
               String password =JOptionPane.showInputDialog("Ingrese una contrasena: ");
               //ALGO PARA SABER LAS NOTAS DEL ESTUDIANTE. H A C E  L O 
               alumnos.add( new Alumno(nombre, NoCuenta, fechaNacimiento, edad, ciudad, nacionalidad, ID,
                        user, password)); //en alumnos agrego toda la info de cada alumno
               lista.add(NoCuenta);
               lista.add(user);
               lista.add(password);
               //Alumno(nombre, NoCuenta, fechaNacimiento, edad, ciudad, nacionalidad, ID,user, password);
           }//fin de crear cuenta alumno
           
           if (option == 3) {
             String NoCuenta =JOptionPane.showInputDialog("Ingrese numero de cuenta: ");
             String user =JOptionPane.showInputDialog("Ingrese Username: ");  
             String password =JOptionPane.showInputDialog("Ingrese contrasena: ");
             //comparar nocuenta con todos los de la lista del alumno
               System.out.println(lista);
               if (lista.contains(NoCuenta)) {
                   int pos = lista.indexOf(NoCuenta);
                   if (lista.get(pos+1).equals(user) && lista.get(pos+2).equals(password)){
                       //que se vean los datos del estudiante que entro a su account.
                       //la pos de alumnos y lista es la misma. siempre.
                       int posModificar = Integer.parseInt(JOptionPane.showInputDialog(null, alumnos.get(pos)
                       + "Ingrese la posicion que quiera modificar \n "
                       + "si no desea modificar algo, ingrese -1."));//FUNCIONA MEJOR
                       if (posModificar == 0) {
                           //((Rectangulo) lista.get(pos)).setLargo(l);
                           a.setNombre(JOptionPane.showInputDialog("Ingrese texto nuevo:"));
                       }
                   }else{
                       JOptionPane.showMessageDialog(null, "Ingreso invalido, intentelo de nuevo.");
                   }
               }
               
             
             
           }
       }
    }
    
}
