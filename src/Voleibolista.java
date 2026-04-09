public class Voleibolista extends Atleta implements Evaluable {
    private int saquesExitosos;
    private int bloqueosRealizados;

    public Voleibolista(String nombreCompleto, int edadAnios, int horasEntrenadas,
                        int saquesExitosos, int bloqueosRealizados) {
        super(nombreCompleto, edadAnios, horasEntrenadas);
        this.saquesExitosos = saquesExitosos;
        this.bloqueosRealizados = bloqueosRealizados;
    }

    @Override
    public double calcularRendimiento() {
        return (saquesExitosos * 2) + (bloqueosRealizados * 3);
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