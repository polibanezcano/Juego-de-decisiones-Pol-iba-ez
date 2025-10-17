import java.util.Scanner;

public class salut {
    public static void main(String[] args) {
        // * scanner
        Scanner e = new Scanner(System.in); 

        // * declaración de variables
        // menu
        int opcion;
        
        // datos personales
        String Nombre;
        int Edad;
        double Peso, Altura;
        
        // * mostrar menu
        System.out.println("1:Introducir datos");
        System.out.println("2:Modificacion de los datos");
        System.out.println("3:Visualizar datos");
        System.out.println("4:Salir");

        // * obtener opcion
        System.out.println("Elige una opción:");
        opcion = e.nextInt();
        e.nextLine();

        // * procesar opcion
        switch(opcion){
                case 1: // ? obtener datos personales
                    System.out.println("Intrduce tu nombre:");
                    Nombre = e.nextLine();
                    System.out.println("Itroduce tu edad:");
                    Edad = e.nextInt();
                    System.out.println("Introduce tu peso:");
                    Peso = e.nextDouble();
                    System.out.println("Introduce tu altura:");
                    Altura = e.nextDouble();
                    System.out.println("Has intrducido los datos correctamente :)");
                    break;
                case 2: 

        }
    }
}
