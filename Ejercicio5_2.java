public class Ejercicio5_2 {

    public static void main(String[] args) {
        // Declaramos los datos de la teoría
        Teoria teoria1 = new Teoria("Modelo de 3 Etapas de Lewin", "Lewin", "Dividido en 3 etapas que buscan ententer y getionar el cambio", 1940, "en uso","modelo","compuesto por 3 etapas","compuesto por tres fases descongelamiento, cambio, recongelamiento","realizar un cambio con tres pasos");
        Teoria teoria2 = new Teoria("Modelo de Cambio Planeado de Lippitt", "Lippitt", "Descompone el cambio en siete etapas, desde el diagnóstico del problema hasta la estabilización del cambio.", 1958, "en desuso","modelo","Se enfoca en el proceso de cambio planificado con un enfoque en la dinámica de las relaciones","Diagnóstico, Evaluación de Motivación, Definición de Progresos, Actuar como agente de cambio, Estabilización, Seguimiento, Finalización","Guiar a las organizaciones a través de un cambio estructurado y mantener la estabilidad post-cambio");
        Teoria teoria3 = new Teoria("Teoría del Cambio de Everett Rogers", "Rogers", "Explica cómo las innovaciones se difunden en una organización o sociedad, desde los innovadores hasta los rezagados.", 1962, "en uso","teoría","Se centra en cómo los individuos y grupos adoptan nuevas ideas o tecnologías.","Innovadores, Adoptadores tempranos, Mayoría temprana, Mayoría tardía, Rezagados.","Facilitar la adopción de innovaciones a través de la comprensión de los factores que afectan su difusión.");
        

        // Imprimimos la información de las teorías
        System.out.println(teoria1);
        System.out.println(teoria2);  
        System.out.println(teoria3);
    }
}

class Teoria {

    String name;
    String author;
    String description;
    int creationDate;
    String state;
    String type;
    String characteristics;
    String plan;
    String objectives;

    // Constructor
    public Teoria(String name, String author, String description, int creationDate, String state, String type, String characteristics,String plan,String objectives) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.creationDate = creationDate;
        this.state = state;
        this.type = type;
        this.characteristics = characteristics;
        this.plan = plan;
        this.objectives = objectives;
    }

    // Método para imprimir la información de la teoría
    public String toString() {
        String resultado;
        resultado ="Teoría: " + name + "\nauthor: " + author + "\ndescription: " + description + "\nFecha de Creación: " + creationDate;
        return resultado;
    }


}
