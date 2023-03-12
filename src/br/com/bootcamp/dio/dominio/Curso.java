package br.com.bootcamp.dio.dominio;

public class Curso {

    private  String titulo;
    private  String desc;

    private  int cargaHoraria;


    public Curso(String titulo, String desc, int cargaHoraria) {
        this.titulo = titulo;
        this.desc = desc;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", desc='" + desc + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
