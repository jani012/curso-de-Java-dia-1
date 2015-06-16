/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavadia2;

/**
 *
 * @author Marga
 */
public class Profesor extends Persona {

    private String profesion;
    private int Años_Experiencia;

    public Profesor(String profesion, int Años_Experiencia, String Nombre, int Edad, char Sexo) {
        super(Nombre, Edad, Sexo);
        this.profesion = profesion;
        this.Años_Experiencia = Años_Experiencia;
    }

    public Profesor(String profesion, int Años_Experiencia) {
        super();
        this.profesion = profesion;
        this.Años_Experiencia = Años_Experiencia;
    }

    public Profesor() {
        super();
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getAños_Experiencia() {
        return Años_Experiencia;
    }

    public void setAños_Experiencia(int Años_Experiencia) {
        this.Años_Experiencia = Años_Experiencia;
    }

    @Override
    public String toString() {
        return super.toString()+"Profesion :"+profesion+"Años_Experiencia"+Años_Experiencia; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
