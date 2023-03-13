package br.com.bootcamp.dio.dominio;

public class Curso extends Conteudo {



    private  int cargaHoraria;





    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO+getCargaHoraria();
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", desc='" + getDesc()+ '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
