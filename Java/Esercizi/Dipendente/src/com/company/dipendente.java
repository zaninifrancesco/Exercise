package com.company;

public class dipendente {
    private float salario;
    private String nome;
    private String ruolo;

    public dipendente(float salario, String name, String role){
        this.nome = name;
        this.ruolo = role;
        this.salario = salario;
    }

    public float getSalario(){
        return this.salario;
    }

    public String getNome(){
        return this.nome;
    }

    public String getRuolo(){
        return this.ruolo;
    }

    public void modificaStipendio(float perc){
        float temp;
        temp = (perc / 100) * this.salario;
        this.salario += temp;
    }

}
