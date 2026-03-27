public abstract class Atleta {
    protected String nombreCompleto;
    protected int edadAnios;
    protected int horasEntrenadas;

    public Atleta(String nombreCompleto, int edadAnios, int horasEntrenadas) {
        this.nombreCompleto = nombreCompleto;
        this.edadAnios = edadAnios;
        this.horasEntrenadas = horasEntrenadas;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Edad: " + edadAnios);
        System.out.println("Horas de entrenamiento: " + horasEntrenadas);
    }

    public abstract double calcularRendimiento();
}
