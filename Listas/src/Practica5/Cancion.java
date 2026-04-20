
package Practica5;

public class Cancion {
    private String titulo;
    private String interprete;
    private float duracion;
    
    public Cancion(String titulo, String interprete, float duracion){
        this.titulo = titulo;
        this.interprete = interprete;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", interprete=" + interprete + ", duracion=" + duracion + '}';
    }
    
}
