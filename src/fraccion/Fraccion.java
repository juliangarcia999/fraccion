package fraccion;
import java.util.*;
public class Fraccion {
    private float numerador;
    private float denominador;
    public float invierte;
    public float multiplica;
    public float divide;

    public Fraccion() {
    }
    
    public Fraccion(float numerador, float denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public float getNumerador() {
        return numerador;
    }

    public void setNumerador(float numerador) {
        this.numerador = numerador;
    }

    public float getDenominador() {
        return denominador;
    }

    public void setDenominador(float denominador) {
        this.denominador = denominador;
    }

    public float getInvierte() {
        return invierte;
    }

    public void setInvierte(float invierte) {
        this.invierte = invierte;
    }

    public float getMultiplica() {
        return multiplica;
    }

    public void setMultiplica(float multiplica) {
        this.multiplica = multiplica;
    }

    public float getDivide() {
        return divide;
    }

    public void setDivide(float divide) {
        this.divide = divide;
    }
    public static float invierte (float numerador, float denominador){
       return (1/(numerador/denominador));
    
    }
    public static float multiplica (float numerador, float denominador){
        return (numerador*numerador)/(denominador*denominador);

    }
     public static float divide (float numerador, float denominador){
        return (numerador*denominador)/(denominador*numerador);

    }
     public String toString() {
        String fraccion;
        fraccion = "Invierte: " + this.invierte + "\tMultiplica: " + this.multiplica + "\tDivide: " + this.divide;
        return fraccion;
    }
   
}
    

