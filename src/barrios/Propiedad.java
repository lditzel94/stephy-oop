package barrios;

public abstract class Propiedad {
    protected String calle;
    protected int numero;

    public String getCalle() {
        return calle;
    }

    public void setCalle( String calle ) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero( int numero ) {
        this.numero = numero;
    }

    public abstract double calcularImpuesto();
}