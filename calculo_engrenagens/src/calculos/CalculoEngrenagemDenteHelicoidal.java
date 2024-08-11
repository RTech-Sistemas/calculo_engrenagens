package calculos;

public class CalculoEngrenagemDenteHelicoidal {
    public static double calculoEngrenagemHelicoidal(double modulo, int numeroDeDentes, double angulo){
        double anguloRad = Math.toRadians(angulo);
        return ((modulo * numeroDeDentes) / Math.cos(anguloRad)) + (2 * modulo);
    }
}
