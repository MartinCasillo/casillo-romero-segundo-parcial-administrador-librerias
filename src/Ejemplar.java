class Ejemplar {
    private int numero;
    private String estado;
    private String condicion;

    public Ejemplar(int numero, String estado, String condicion) {
        this.numero = numero;
        this.estado = estado;
        this.condicion = condicion;
    }

    public int getNumero() {
        return numero;
    }

    public String getEstado() {
        return estado;
    }

    public String getCondicion() {
        return condicion;
    }

    @Override
    public String toString() {
        return "Ejemplar{" +
                "numero=" + numero +
                ", estado='" + estado + '\'' +
                ", condicion='" + condicion + '\'' +
                '}';
    }
}