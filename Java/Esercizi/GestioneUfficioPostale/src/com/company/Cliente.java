package com.company;

public class Cliente {

    private String nome;
    private float saldo;
    private float saldo_depositato;

    public Cliente(String nome, float saldo, float saldo_depositato) {
        this.nome = nome;
        this.saldo = saldo;
        this.saldo_depositato = saldo_depositato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo_depositato() {
        return saldo_depositato;
    }

    public void setSaldo_depositato(float saldo_depositato) {
        this.saldo_depositato = saldo_depositato;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " saldo: " + this.saldo + " saldo depositato: " + this.saldo_depositato;
    }
}
