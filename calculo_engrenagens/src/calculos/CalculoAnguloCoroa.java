package calculos;

public class CalculoAnguloCoroa {

    public static double calcular(double semFim, double modulo, int numeroDeEntradas){
        double resultado = (semFim - (2 * modulo)) / modulo;
        double cotangenteInvertida = Math.atan(1 / resultado);
        double resultadoFinal = cotangenteInvertida * numeroDeEntradas;
        return Math.toDegrees(resultadoFinal);
    }

    public static String converterParaGMS(double anguloEmGraus) {
        int grausInteiros = (int) anguloEmGraus;
        double minutosDecimais = (anguloEmGraus - grausInteiros) * 60;
        int minutosInteiros = (int) minutosDecimais;
        int segundosInteiros = (int) Math.round(minutosDecimais - minutosInteiros) * 60;

        return String.format("%d° %d' %d\"%n", grausInteiros, minutosInteiros, segundosInteiros);
    }
}


