package calculos;

public class CalculoEngrenagemDenteReto {

    public static double calcularDiametro(int numeroDeDentes, double modulo) {
        return (numeroDeDentes + 2) * modulo;
    }

    public static double calcularModulo(double diametro, int numeroDeDentes){
        return diametro / (numeroDeDentes + 2);
    }

    public static int calcularNumeroDeDentes(double diametro, double modulo){
        return (int) (diametro / modulo) - 2;
    }
}

