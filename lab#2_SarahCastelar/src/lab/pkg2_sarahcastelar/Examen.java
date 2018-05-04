
package lab.pkg2_sarahcastelar;

import java.util.ArrayList;


public class Examen {
    
    private String NoExamen; //numero de examen
    private String NombreAsignatura; 
    private ArrayList preguntas = new ArrayList(); //cantidad de preguntas y respuestas 
    private ArrayList respuestas = new ArrayList();;

    public Examen() {
    }

    public Examen(String NoExamen, ArrayList preguntas, ArrayList respuestas) {
        this.NoExamen = NoExamen;
        this.preguntas = preguntas;
        this.respuestas = respuestas;
    }

    public Examen(String NoExamen, String NombreAsignatura, ArrayList preguntas, ArrayList respuestas) {
        this.NoExamen = NoExamen;
        this.NombreAsignatura = NombreAsignatura;
        this.preguntas = preguntas;
        this.respuestas = respuestas;
    }

    public int getRespuestas(int pos) {
        return preguntas.indexOf(pos);
    }

    public void setRespuestas(ArrayList respuestas) {
        this.respuestas = respuestas;
    }

    public String getNoExamen() {
        return NoExamen;
    }

    public void setNoExamen(String NoExamen) {
        this.NoExamen = NoExamen;
    }

    public String getNombreAsignatura() {
        return NombreAsignatura;
    }

    public void setNombreAsignatura(String NombreAsignatura) {
        this.NombreAsignatura = NombreAsignatura;
    }

    public int getPreguntas(int pos) {
        return preguntas.indexOf(pos);
    }

    public void setPreguntas(ArrayList preguntas) {
        this.preguntas = preguntas;
    }

    @Override
    public String toString() {
        return "Examen numero: " + NoExamen +  "\n" 
                + "Nombre Asignatura: " + NombreAsignatura +  "\n" 
                + "preguntas:" + preguntas +  "\n"  
                + "respuestas: " + respuestas + "\n";
    }
    
    
    
    
}
