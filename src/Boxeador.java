public class Boxeador extends Atleta implements Evaluable {
    private int totalGolpes;
    private int victorias;

    public Boxeador(String nombreCompleto, int edadAnios, int horasEntrenadas,
                    int totalGolpes, int victorias) {
        super(nombreCompleto, edadAnios, horasEntrenadas);
        this.totalGolpes = totalGolpes;
        this.victorias = victorias;
    }

    @Override
    public double calcularRendimiento() {
        return (totalGolpes * 0.5) + (victorias * 10);
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