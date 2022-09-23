import barrios.Municipio;
import factories.FactoryPropiedades;

public class Main {
    public static void main( String[] args ) {
        Municipio municipio = new Municipio();

        FactoryPropiedades factoryPropiedades = FactoryPropiedades.getInstancia();
        FactoryPropiedades factoryPropiedades1 = FactoryPropiedades.getInstancia();
        System.out.println( factoryPropiedades );
        System.out.println( factoryPropiedades1 );

        /*Propiedad casa = factory.crearPropiedad( "casa" );
        Propiedad barrio = factory.crearPropiedad( "barrio" );
        Propiedad edificio = factory.crearPropiedad( "edificio" );

        casa.setCalle( "Av. San Martín" );
        casa.setNumero( 1200 );

        barrio.setCalle( "Santa Fe" );
        barrio.setNumero( 500 );

        edificio.setCalle( "Cabildo" );
        edificio.setNumero( 2000 );

        municipio.agregar( casa );
        municipio.agregar( barrio );
        municipio.agregar( edificio );

        municipio.mostrar();*/
    }
}