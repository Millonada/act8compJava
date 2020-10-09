package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Deck  {

    public static void main(String[] ar){
        Deck deck=new Deck();
        Scanner leer = new Scanner(System.in);

        int opc;
        boolean bandera=false;
        do{
        System.out.println("-------------Menu de Opciones----------");
        System.out.println("--- 1 : Shuffle ");
        System.out.println("--- 2 : Head ");
        System.out.println("--- 3 : Pick ");
        System.out.println("--- 4 : Hand");
        System.out.println("--- 5 : Mostrar todas las cartas ");
        System.out.println("--- 6 : Salir ");
        opc= leer.nextInt();

            switch (opc) {
                case 1:
                    //se mescla el mazo
                    deck.mesclar();
                    deck.numeroCartas();
                    break;
                case 2:
                    // se muestra la primera carta del mazo
                    deck.sacarPrimeraCarta();
                    deck.numeroCartas();

                    break;
                case 3:
                    deck.sacarCartaAzar();
                    deck.numeroCartas();
                    break;
                case 4:
                    deck.cincoCartas();
                    deck.numeroCartas();
                    break;
                case 5:
                    deck.imprimirMazo();
                    deck.numeroCartas();
                    break;
                case 6:
                    System.out.println("Saliendo");
                    bandera=true;
                    break;
                default:
                    System.out.println("Opcion no definidad");
                    break;
            }
        }while(bandera !=true);



    }

    private ArrayList<Card> cards;

    public Deck() {

        cards=new ArrayList<Card>(52);
        cards.add(new Card("2",Card.Palo.TREBOLES,Card.Color.NEGRO));
        cards.add(new Card("2",Card.Palo.CORAZONES,Card.Color.ROJO));
        cards.add(new Card("2",Card.Palo.PICAS,Card.Color.NEGRO));
        cards.add(new Card("2",Card.Palo.DIAMANTES,Card.Color.ROJO));

        cards.add(new Card("3",Card.Palo.TREBOLES,Card.Color.NEGRO));
        cards.add(new Card("3",Card.Palo.CORAZONES,Card.Color.ROJO));
        cards.add(new Card("3",Card.Palo.PICAS,Card.Color.NEGRO));
        cards.add(new Card("3",Card.Palo.DIAMANTES,Card.Color.ROJO));

        cards.add(new Card("4",Card.Palo.TREBOLES,Card.Color.NEGRO));
        cards.add(new Card("4",Card.Palo.CORAZONES,Card.Color.ROJO));
        cards.add(new Card("4",Card.Palo.PICAS,Card.Color.NEGRO));
        cards.add(new Card("4",Card.Palo.DIAMANTES,Card.Color.ROJO));


        cards.add(new Card("5",Card.Palo.TREBOLES,Card.Color.NEGRO));
        cards.add(new Card("5",Card.Palo.CORAZONES,Card.Color.ROJO));
        cards.add(new Card("5",Card.Palo.PICAS,Card.Color.NEGRO));
        cards.add(new Card("5",Card.Palo.DIAMANTES,Card.Color.ROJO));

        cards.add(new Card("6",Card.Palo.TREBOLES,Card.Color.NEGRO));
        cards.add(new Card("6",Card.Palo.CORAZONES,Card.Color.ROJO));
        cards.add(new Card("6",Card.Palo.PICAS,Card.Color.NEGRO));
        cards.add(new Card("6",Card.Palo.DIAMANTES,Card.Color.ROJO));

        cards.add(new Card("7",Card.Palo.TREBOLES,Card.Color.NEGRO));
        cards.add(new Card("7",Card.Palo.CORAZONES,Card.Color.ROJO));
        cards.add(new Card("7",Card.Palo.PICAS,Card.Color.NEGRO));
        cards.add(new Card("7",Card.Palo.DIAMANTES,Card.Color.ROJO));

        cards.add(new Card("8",Card.Palo.TREBOLES,Card.Color.NEGRO));
        cards.add(new Card("8",Card.Palo.CORAZONES,Card.Color.ROJO));
        cards.add(new Card("8",Card.Palo.PICAS,Card.Color.NEGRO));
        cards.add(new Card("8",Card.Palo.DIAMANTES,Card.Color.ROJO));

        cards.add(new Card("9",Card.Palo.TREBOLES,Card.Color.NEGRO));
        cards.add(new Card("9",Card.Palo.CORAZONES,Card.Color.ROJO));
        cards.add(new Card("9",Card.Palo.PICAS,Card.Color.NEGRO));
        cards.add(new Card("9",Card.Palo.DIAMANTES,Card.Color.ROJO));

        cards.add(new Card("10",Card.Palo.TREBOLES,Card.Color.NEGRO));
        cards.add(new Card("10",Card.Palo.CORAZONES,Card.Color.ROJO));
        cards.add(new Card("10",Card.Palo.PICAS,Card.Color.NEGRO));
        cards.add(new Card("10",Card.Palo.DIAMANTES,Card.Color.ROJO));

        cards.add(new Card("j",Card.Palo.TREBOLES,Card.Color.NEGRO));
        cards.add(new Card("j",Card.Palo.CORAZONES,Card.Color.ROJO));
        cards.add(new Card("J",Card.Palo.PICAS,Card.Color.NEGRO));
        cards.add(new Card("J",Card.Palo.DIAMANTES,Card.Color.ROJO));

        cards.add(new Card("Q",Card.Palo.TREBOLES,Card.Color.NEGRO));
        cards.add(new Card("Q",Card.Palo.CORAZONES,Card.Color.ROJO));
        cards.add(new Card("Q",Card.Palo.PICAS,Card.Color.NEGRO));
        cards.add(new Card("Q",Card.Palo.DIAMANTES,Card.Color.ROJO));

        cards.add(new Card("K",Card.Palo.TREBOLES,Card.Color.NEGRO));
        cards.add(new Card("K",Card.Palo.CORAZONES,Card.Color.ROJO));
        cards.add(new Card("K",Card.Palo.PICAS,Card.Color.NEGRO));
        cards.add(new Card("K",Card.Palo.DIAMANTES,Card.Color.ROJO));

        cards.add(new Card("A",Card.Palo.TREBOLES,Card.Color.NEGRO));
        cards.add(new Card("A",Card.Palo.CORAZONES,Card.Color.ROJO));
        cards.add(new Card("A",Card.Palo.PICAS,Card.Color.NEGRO));
        cards.add(new Card("A",Card.Palo.DIAMANTES,Card.Color.ROJO));

    }

    public void imprimirMazo(){
        for(Card cards :cards){
            cards.imprimir();
        }
    }

    public void mesclar(){
        Collections.shuffle(cards);
        System.out.println("-----Mazo barajeado");
    }
    public void numeroCartas(){
        System.out.println("-----Numero de cartas en mazo: "+cards.size());
    }
    public void sacarPrimeraCarta(){
        System.out.println("-----La primera carta del mazo:");
        cards.get(1).imprimir();
    }
    public void sacarCartaAzar(){
        Random numeroAzar=new Random();
        int aleatorio=numeroAzar.nextInt(52);
        cards.get(aleatorio).imprimir();
        cards.remove(aleatorio);
    }
    public void cincoCartas(){
        Random numeroAzar=new Random();

        int aleatorio1=numeroAzar.nextInt(52);
        int aleatorio2=numeroAzar.nextInt(52);
        int aleatorio3=numeroAzar.nextInt(52);
        int aleatorio4=numeroAzar.nextInt(52);
        int aleatorio5=numeroAzar.nextInt(52);

        cards.get(aleatorio1).imprimir();
        cards.remove(aleatorio1);

        cards.get(aleatorio2).imprimir();
        cards.remove(aleatorio2);

        cards.get(aleatorio3).imprimir();
        cards.remove(aleatorio3);

        cards.get(aleatorio4).imprimir();
        cards.remove(aleatorio4);

        cards.get(aleatorio5).imprimir();
        cards.remove(aleatorio5);

    }



}
