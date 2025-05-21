import java.util.*;

public class DesglosadorIA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu meta: ");
        String meta = scanner.nextLine();

        List<String> tareas = desglosarMeta(meta);

        System.out.println("\nTareas generadas:");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }

        scanner.close();
    }

    public static List<String> desglosarMeta(String meta) {
        List<String> tareas = new ArrayList<>();

        tareas.add("Investigar sobre '" + meta + "'");
        tareas.add("Hacer un plan para '" + meta + "'");
        tareas.add("Realizar la primera acción para '" + meta + "'");

        return tareas;
    }
}
