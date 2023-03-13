package br.com.bootcamp.dio.dominio;

public abstract class Conteudo {

    protected static final Double XP_PADRAO =10d;

    private String  titulo;
    private String  desc;

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

    public abstract  double  calcularXp();

}
