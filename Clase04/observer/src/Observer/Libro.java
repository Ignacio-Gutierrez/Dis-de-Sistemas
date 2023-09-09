package Observer;

public class Libro {
    private String estado;
    private String titulo;

    public Libro() {
    }

    public Libro(String estado, String titulo) {
        this.estado = estado;
        this.titulo = titulo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
