package br.com.bootcamp.dio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String  desc;

    private final LocalDate dataInicial= LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);



    private Set<Dev>DevsInscritos = new HashSet<>();
    private Set<Conteudo>conteudo = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return DevsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        DevsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudo() {
        return conteudo;
    }

    public void setConteudo(Set<Conteudo> conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(desc, bootcamp.desc) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(DevsInscritos, bootcamp.DevsInscritos) && Objects.equals(conteudo, bootcamp.conteudo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, desc, dataInicial, dataFinal, DevsInscritos, conteudo);
    }
}
