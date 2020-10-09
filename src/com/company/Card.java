package com.company;

public class Card {
    private String valor;
    private Palo palo;
    private Color color;
    public enum Palo{
        TREBOLES,CORAZONES,PICAS,DIAMANTES
    }
    public enum Color{
        NEGRO,ROJO
    }


    public Card(String valor, Palo palo,Color color) {
        this.valor = valor;
        this.palo = palo;
        this.color=color;
    }
    public void imprimir(){
        System.out.println(palo+" " + color+" "+valor);
    }
}


