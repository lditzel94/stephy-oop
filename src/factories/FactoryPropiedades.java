package factories;

import barrios.*;

public class FactoryPropiedades {
    private static FactoryPropiedades instancia = new FactoryPropiedades();

    private FactoryPropiedades() {
    }

    public static FactoryPropiedades getInstancia() {
        return instancia;
    }

    public Propiedad crearPropiedad( String tipo ) {
        switch ( tipo ) {
            case "casa":
                return new Casa();
            case "barrio":
                return new BarrioCerrado();
            case "edificio":
                return new Edificio();
            case "ph":
                return new PH();
            default:
                return null;
        }
    }
}
