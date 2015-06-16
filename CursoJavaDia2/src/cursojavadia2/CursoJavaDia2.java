
package cursojavadia2;


public class CursoJavaDia2 {

    
    public static void main(String[] args) {
        
        Persona pj= new Persona("Jani", 23, 'f');
        
        Estudiante e1= new Estudiante("233231","ing.informatica",pj.getNombre(),pj.getEdad(),pj.getSexo());
        
        Profesor prof1= new Profesor("Ingeniero",14,pj.getNombre(),pj.getEdad(),pj.getSexo());
    }
}
