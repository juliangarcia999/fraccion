
package fraccion;

public class Fraccionmain {

    public static void main(String[] args) {
          
        Fraccion fraccion = new Fraccion();
        fraccion.setNumerador(0);
        fraccion.setDenominador(0);
        //En los parentesis de cada system.out al lado de cada fraccion.metodo se cambian los valores.
        Fraccion invierte = new Fraccion();
        System.out.println("Inversion: "+fraccion.invierte(8, 2));
        Fraccion multiplica = new Fraccion();
        System.out.println("Multiplicacion: "+fraccion.multiplica(6,3));
        Fraccion divide = new Fraccion();
        System.out.println("Division: "+fraccion.divide(9, 3));
    }
    
}
