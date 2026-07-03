public class TarifaCamion implements Tarifa {

    @Override
    public double calcular(int horas) {
        return (horas * 4.0) + 5.0;
    }

}