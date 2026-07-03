public abstract class Vehiculo {

    private String placa;
    private int horasEstacionado;
    private Tarifa tarifa;

    public Vehiculo(String placa, int horasEstacionado, Tarifa tarifa) {
        this.placa = placa;
        this.horasEstacionado = horasEstacionado;
        this.tarifa = tarifa;
    }

    public String getPlaca() {
        return placa;
    }

    public int getHorasEstacionado() {
        return horasEstacionado;
    }

    public double calcularCostoEstacionamiento() {
        return tarifa.calcular(horasEstacionado);
    }

}