import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un nombre " + (i + 1) + ": ");
            nombres.add(scanner.nextLine());
        }

        System.out.println("\nNombres en orden inverso:");
        Collections.reverse(nombres);
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("Ingrese un numero hasta donde quiere que llegue la tabla ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            int tabla = i * numero;
            System.out.println(i + " * " + numero + " = " + tabla);
        }

    }
}