package factories;

import barrios.*;

public class Factory {
    private static Factory instancia = new Factory();

    private Factory() {
    }

    public static Factory getInstancia() {
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
