package barrios;

import java.util.ArrayList;
import java.util.List;

public class Municipio implements Agregable {
    private List<Propiedad> propiedades = new ArrayList<>();


    public void mostrar() {
        for ( Propiedad propiedad : propiedades ) {
            System.out.println( "Calle: " + propiedad.calle );
            System.out.println( "Número: " + propiedad.numero );
            System.out.println( "Impuesto: " + propiedad.calcularImpuesto() );
        }
    }

    @Override
    public void agregar( Propiedad propiedad ) {
        propiedades.add( propiedad );
    }
}
