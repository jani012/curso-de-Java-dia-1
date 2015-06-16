package cursojavadia2;

public class Estudiante extends Persona {

    private String ficha_academica;
    private String Carrera;

    public Estudiante(String ficha_academica, String Carrera, String Nombre, int Edad, char Sexo) {
        super(Nombre, Edad, Sexo);
        this.ficha_academica = ficha_academica;
        this.Carrera = Carrera;
    }

    public Estudiante(String ficha_academica, String Carrera) {
        super();
        this.ficha_academica = ficha_academica;
        this.Carrera = Carrera;
    }

    public Estudiante() {
        super();
    }

    public String getFicha_academica() {
        return ficha_academica;
    }

    public void setFicha_academica(String ficha_academica) {
        this.ficha_academica = ficha_academica;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return super.toString()+ "Ficha Academica:"+ficha_academica+"Carrera:" +Carrera; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
