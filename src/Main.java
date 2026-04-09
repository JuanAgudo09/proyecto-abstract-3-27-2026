public class Main {
    public static void main(String[] args) {

        Ciclista ciclista1 = new Ciclista("Carlos", 25, 10, 300, 5);
        Boxeador boxeador1 = new Boxeador("Luis", 28, 8, 80, 3);
        Voleibolista voleibolista1 = new Voleibolista("Ana", 22, 6, 20, 10);

        Atleta[] listaAtletas = {ciclista1, boxeador1, voleibolista1};

        double mayorRendimiento = 0;
        Atleta mejorParticipante = null;

        for (Atleta atletaActual : listaAtletas) {
            atletaActual.mostrarDatos();

            double rendimiento = atletaActual.calcularRendimiento();
            System.out.println("Rendimiento: " + rendimiento);

            Evaluable evaluacion = (Evaluable) atletaActual;
            System.out.println("Nivel: " + evaluacion.clasificarNivel());
            System.out.println("Bono: " + evaluacion.calcularBono());

            System.out.println("----------------------");

            if (rendimiento > mayorRendimiento) {
                mayorRendimiento = rendimiento;
                mejorParticipante = atletaActual;
            }
        }

        System.out.println(" Mejor atleta:");
        if (mejorParticipante != null) {
            mejorParticipante.mostrarDatos();
            System.out.println("Rendimiento: " + mayorRendimiento);
        }
    }
}