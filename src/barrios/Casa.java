package barrios;

public class Casa extends Propiedad {
    private double impuestoBase = 1000;

    @Override
    public double calcularImpuesto() {
        double incremento = impuestoBase * 0.1;

        if ( calle.equals( "Av. San Martín" ) ) impuestoBase += incremento;

        return impuestoBase;
    }
}
