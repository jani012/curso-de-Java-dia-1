package cursojavadia2;

public class Persona {

    private String Nombre;
    private int Edad;
    private char Sexo;

    public Persona(String Nombre, int Edad, char Sexo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Sexo = Sexo;
    }

    public Persona() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    @Override
    public String toString() {
        return "Nombre:"+Nombre+"\nedad:" +Edad+"\nsexo"+Sexo;
    }
    
    
    
}
