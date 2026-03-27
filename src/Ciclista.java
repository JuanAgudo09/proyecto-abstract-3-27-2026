public class Ciclista extends Atleta implements Evaluable {
    private double distanciaRecorrida;
    private double duracionHoras;

    public Ciclista(String nombreCompleto, int edadAnios, int horasEntrenadas,
                    double distanciaRecorrida, double duracionHoras) {
        super(nombreCompleto, edadAnios, horasEntrenadas);
        this.distanciaRecorrida = distanciaRecorrida;
        this.duracionHoras = duracionHoras;
    }

    @Override
    public double calcularRendimiento() {
        return distanciaRecorrida / duracionHoras;
    }

    @Override
    public String clasificarNivel() {
        double rendimientoActual = calcularRendimiento();
        if (rendimientoActual < 30) return "Básico";
        else if (rendimientoActual <= 70) return "Competente";
        else return "Elite";
    }

    @Override
    public double calcularBono() {
        String categoria = clasificarNivel();
        switch (categoria) {
            case "Básico": return 50000;
            case "Competente": return 150000;
            default: return 300000;
        }
    }
}
