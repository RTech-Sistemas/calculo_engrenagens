package calculos;

public class CalculoEntrecentro {

    private static double calcularDiametroPrimitivo(double modulo, int numeroDeDentes){
        return modulo * numeroDeDentes;
    }

    public static double calcularEntrecentro(double modulo, int numeroDeDentes1, int numeroDeDentes2){
        double diametro1 = calcularDiametroPrimitivo(modulo, numeroDeDentes1);
        double diametro2 = calcularDiametroPrimitivo(modulo, numeroDeDentes2);
        return (diametro1 + diametro2) / 2;
    }

}
