
package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        //System.out.println("emleado= "+ empelado);
        System.out.println("empleado.obtenerDetalles()"); //Si queremos acceder a métodos Escritor
        //empleado.getTipoEscritura(); No se puede hacer
        //downcasting
        //((Escritor)empleado).getTipoEscritura(); //tenemos 2 opciones: esta es una
        Escritor escritor = (Escritor)empleado; //Esta es la segunda opción
        escritor.getTipoEscritura();
        
        //Upcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
}
