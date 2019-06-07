package br.edu.unibratec.psc.dbdemo.filme;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filme {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String nomeFilme;
private String descriacao;

    public void setId(Integer id) {
    this.id = id;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public String getDescriacao() {
        return descriacao;
    }

    public void setDescriacao(String descriacao) {
        this.descriacao = descriacao;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }




}