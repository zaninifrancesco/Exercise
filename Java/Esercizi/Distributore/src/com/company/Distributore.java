package com.company;

public class Distributore
{
    private int prezzo;
    private String nome;

    public Distributore(int p,String n)
    {
        this.prezzo = p;
        this.nome = n;
    }

    public int getPrezzo(){
        return prezzo;
    }

    public String getNome(){
        return nome;
    }

}
