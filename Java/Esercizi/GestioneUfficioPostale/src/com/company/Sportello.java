package com.company;


import java.util.LinkedList;

public class Sportello {

    private LinkedList<Cliente> lista_clienti = new LinkedList<>();
    private String tipo_sportello;
    private boolean isAperto;

    public Sportello(String tipo_sportello, boolean isAperto) {
        this.tipo_sportello = tipo_sportello;
        this.isAperto = isAperto;
    }


    public void aggiungiallaCoda(Cliente cliente){
        lista_clienti.add(cliente);
    }

    public void vediLista(){
        for (Cliente cl : lista_clienti) {
            System.out.println(cl);
        }
    }

    public boolean isAperto() {
        return isAperto;
    }

    public void setAperto(boolean aperto) {
        this.isAperto = aperto;
    }

    public boolean serviCliente(float quantita){
        if(lista_clienti.getFirst().getSaldo() >= quantita){
            lista_clienti.getFirst().setSaldo(lista_clienti.getFirst().getSaldo() - quantita);
            return true;
        }
        return false;
    }

    public boolean rimuoviCliente(){
        if(lista_clienti.size() > 0){
            lista_clienti.removeFirst();
            return true;
        }
        return false;
    }

    public Cliente getPrimoCliente(){
        return lista_clienti.getFirst();
    }

    public boolean controlloCodaVuota(){
        if(lista_clienti.size() == 0){
            return false;
        }
        return true;
    }

    public String getTipo_sportello() {
        return tipo_sportello;
    }

}
