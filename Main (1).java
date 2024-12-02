import java.util.Scanner;  

public class AppConsola {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        int opcion;  

        do {  
            // Mostrar el menú  
            System.out.println("----- Menú -----");  
            System.out.println("1. Saludar");  
            System.out.println("2. Calcular la suma");  
            System.out.println("3. Despedirse");  
            System.out.println("4. Salir");  
            System.out.print("Selecciona una opción: ");  

            // Leer la opción del usuario  
            opcion = scanner.nextInt();  
            scanner.nextLine(); // Limpiar el buffer  

            switch (opcion) {  
                case 1:  
                    // Saludar  
                    System.out.print("Por favor, introduce tu nombre: ");  
                    String nombre = scanner.nextLine();  
                    System.out.println("¡Hola, " + nombre + "! Bienvenido a la aplicación!");  
                    break;  
                case 2:  
                    // Calcular la suma  
                    System.out.print("Introduce el primer número: ");  
                    int num1 = scanner.nextInt();  
                    System.out.print("Introduce el segundo número: ");  
                    int num2 = scanner.nextInt();  
                    int suma = num1 + num2;  
                    System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);  
                    scanner.nextLine(); // Limpiar el buffer  
                    break;  
                case 3:  
                    // Despedirse  
                    System.out.print("Por favor, introduce tu nombre: ");  
                    String nombreDespedida = scanner.nextLine();  
                    System.out.println("¡Hasta luego, " + nombreDespedida + "! Que tengas un gran día!");  
                    break;  
                case 4:  
                    // Salir  
                    System.out.println("Saliendo de la aplicación. ¡Hasta pronto!");  
                    break;  
                default:  
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");  
            }  

            System.out.println(); // Línea en blanco para separar las iteraciones  
        } while (opcion != 4); // Repetir hasta que el usuario elija salir  

        // Cerrar el escáner  
        scanner.close();  
    }  
}