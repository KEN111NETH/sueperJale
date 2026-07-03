import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Estacionamiento estacionamiento = new Estacionamiento();

        int opcion;

        do {

            System.out.println("\n===== ESTACIONAMIENTO =====");
            System.out.println("1. Registrar Auto");
            System.out.println("2. Registrar una Moto");
            System.out.println("3. Registrar Camión");
            System.out.println("4. Imprimir un Reporte");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Placa del auto: ");
                    String placaAuto = sc.nextLine();

                    System.out.print("Horas estacionado: ");
                    int horasAuto = sc.nextInt();
                    sc.nextLine();

                    estacionamiento.registrarVehiculo(
                            new Auto(placaAuto, horasAuto));

                    System.out.println("Auto registrado correctamente.");
                    break;

                case 2:

                    System.out.print("Placa de la moto: ");
                    String placaMoto = sc.nextLine();

                    System.out.print("Horas estacionado: ");
                    int horasMoto = sc.nextInt();
                    sc.nextLine();

                    estacionamiento.registrarVehiculo(
                            new Moto(placaMoto, horasMoto));

                    System.out.println("Moto registrada correctamente.");
                    break;

                case 3:

                    System.out.print("Placa del camión: ");
                    String placaCamion = sc.nextLine();

                    System.out.print("Horas estacionado: ");
                    int horasCamion = sc.nextInt();
                    sc.nextLine();

                    estacionamiento.registrarVehiculo(
                            new Camion(placaCamion, horasCamion));

                    System.out.println("Camión registrado correctamente.");
                    break;

                case 4:

                    estacionamiento.imprimirReporte();
                    break;

                case 5:

                    System.out.println("arigato gosaimas por usar el sistema.");
                    break;

                default:

                    System.out.println("Opción inválida.");

            }

        } while (opcion != 5);

        sc.close();
    }
}