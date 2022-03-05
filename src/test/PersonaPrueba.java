
package test;

import domain.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("nelson", 1000, false);
        
        System.out.println("el nombre y demas datos son "+ persona1.getNombre()+" "+persona1.getSueldo()+" "+persona1.isEliminado());
        persona1.setNombre("alejandro");
        persona1.setSueldo(2000.00);
        persona1.setEliminado(true);
        System.out.println("persona1 = " + persona1.getNombre()+" "+persona1.getSueldo()+" "+persona1.isEliminado());
    }
}
