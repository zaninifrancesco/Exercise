package com.company;

public class dipendente {

    private String nome;
    private String dipartimento;
    private float stipendio;
    private int numeroId;
    private int ruolo;

    public dipendente(float salario, String name, int role, String dipartimento, int id){
        this.nome = name;
        this.ruolo = role;
        this.stipendio = salario;
        this.dipartimento = dipartimento;
        this.numeroId = id;
    }


    public void cambiaDipartimento(){
        this.dipartimento = "Bababuoei";
    }

    public void aumentaStipendio(float perc){
        float temp;
        temp = (perc / 100) * this.stipendio;
        this.stipendio += temp;
    }

    public void showInfo(){
        System.out.println("NOME: " + this.nome + "\nSALDO: " + this.stipendio + "\nDIPARTIMENTO: " + this.dipartimento + "\nID: " + this.dipartimento + "\nRUOLO: " + this.numeroId);
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public float getStipendio() {
        return stipendio;
    }

    public String getNome() {
        return nome;
    }

    public int getRuolo() {
        return ruolo;
    }
}
