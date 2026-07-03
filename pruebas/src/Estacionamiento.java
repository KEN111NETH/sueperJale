import java.util.ArrayList;

public class Estacionamiento {

    private ArrayList<Vehiculo> vehiculos;

    public Estacionamiento() {
        vehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void imprimirReporte() {

        double total = 0;

        System.out.println("===== REPORTE DEL ESTACIONAMIENTO =====");

        for (Vehiculo v : vehiculos) {

            double costo = v.calcularCostoEstacionamiento();

            System.out.println("--------------------------------");
            System.out.println("Tipo: " + v.getClass().getSimpleName());
            System.out.println("Placa: " + v.getPlaca());
            System.out.println("Horas: " + v.getHorasEstacionado());
            System.out.println("Costo: $" + costo);

            total += costo;
        }

        System.out.println("--------------------------------");
        System.out.println("TOTAL RECAUDADO: $" + total);
    }

}