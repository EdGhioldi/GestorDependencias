package GestorDependencias;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<PersonaData> listaPersonas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el nombre de la persona:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese el apellido de la persona:");
            String apellido = scanner.nextLine();

            System.out.println("Ingrese la fecha de nacimiento de la persona (en formato yyyy-MM-dd):");
            LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());

            PersonaData persona = new PersonaData(nombre, apellido, fechaNacimiento);
            listaPersonas.add(persona);

            System.out.println("Desea ingresar otra persona? (si/no)");
            String opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("no")) {
                continuar = false;
            }
        }

        System.out.println("Listado de personas:");
        for (PersonaData persona : listaPersonas) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellido: " + persona.getApellido());
            System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
            System.out.println("       ----------");
        }
    }
}
