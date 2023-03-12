package br.com.bootcamp.dio.dominio;

import java.time.LocalDate;

public class Mentorias {

    private  String titulo;
    private  String desc;
    private LocalDate data;


    public Mentorias(String titulo, String desc, LocalDate data) {
        this.titulo = titulo;
        this.desc = desc;
        this.data = LocalDate.now();
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentorias{" +
                "titulo='" + titulo + '\'' +
                ", desc='" + desc + '\'' +
                ", data=" + data +
                '}';
    }
}
