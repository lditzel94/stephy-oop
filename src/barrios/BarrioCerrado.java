package barrios;

import java.util.ArrayList;
import java.util.List;

public class BarrioCerrado extends Propiedad implements Agregable {
    private int multiplicador = 500;
    private List<Propiedad> propiedades = new ArrayList<>();


    @Override
    public double calcularImpuesto() {
        double subTotal = 0;

        for ( Propiedad propiedad : propiedades ) {
            subTotal += propiedad.calcularImpuesto();
        }

        return subTotal * multiplicador;
    }

    @Override
    public void agregar( Propiedad propiedad ) {
        propiedades.add( propiedad );
    }
}
