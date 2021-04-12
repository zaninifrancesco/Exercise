/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lessons.Enum;

/**
 *
 * @author francesco
 */
public enum Gender {
//    LUNEDI,
//    MARTEDI,
//    MERCOLEDI,
//    GIOVEDI,
//    VENERDI,
//    SABATO,
//    DOMENICA,
    MASCHIO(18, "Arci"),
    FEMMINA(6, "Pagnotta");

    int eta;
    String nome;

    private Gender(int eta, String nome) {
        this.eta = eta;
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public String getNome() {
        return nome;
    }

}
