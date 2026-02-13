
/**
 * Clase DemoDistancia — clase principal de demostración.
 * Subtema 2.2 — Instanciación de objetos Punto y Distancia.
 * Subtema 2.4 — Paso de objetos como argumentos (paso por referencia).
 */
public class DemoDistancia {

    public static void main(String[] args) {
// Subtema 2.2 — Instanciación de objetos Punto
        Punto puntoA = new Punto("A", 3, -5);
        Punto puntoB = new Punto("B", -2, 6);

// Subtema 2.2 — Instanciación de Distancia pasando objetos Punto
// El constructor de Distancia recibe dos objetos Punto como argumentos
        Distancia d1 = new Distancia(puntoA, puntoB);
// Subtema 2.4 — Invocación de métodos y recepción de retorno
        System.out.println("\n--- Cálculo de distancias ---");
        System.out.printf("Valor numérico d1: %.4f%n", d1.getDistancia());
        
    }
}
