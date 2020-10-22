package com.company;

import java.awt.*;
import java.io.IOException;
import java.util.*;

public class Deck {

    public static void main(String[] ar) {
        Deck deck = new Deck();


        boolean bandera = false;
        do {

            try {
                switch (deck.showMenu()) {
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
                         System.out.println("Saliendo");
                         bandera = true;



                        break;
                    default:
                        System.out.println("Opcion no definidad");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor solo utiliza numeros.(1-5)");
            }

        } while (bandera != true);


    }

    public int showMenu() {
        int opc;
        Scanner leer = new Scanner(System.in);

        System.out.println("-------------Bienvenido a Poker!----------");
        System.out.println("-------------Selecciona una opcion----------");
        System.out.println("--- 1 : Mezclar el deck ");
        System.out.println("--- 2 : Sacar una carta ");
        System.out.println("--- 3 : Carta al azar ");
        System.out.println("--- 4 : Generar mano de 5 cartas");
        // System.out.println("--- 5 : Mostrar todas las cartas ");
        System.out.println("--- 5 : Salir ");

        opc = leer.nextInt();
        return opc;


    }

    private ArrayList<Card> cards;

    public Deck() {

        cards = new ArrayList<Card>(52);
        cards.add(new Card("2", Card.Palo.TREBOLES, Card.Color.NEGRO));
        cards.add(new Card("2", Card.Palo.CORAZONES, Card.Color.ROJO));
        cards.add(new Card("2", Card.Palo.PICAS, Card.Color.NEGRO));
        cards.add(new Card("2", Card.Palo.DIAMANTES, Card.Color.ROJO));

        cards.add(new Card("3", Card.Palo.TREBOLES, Card.Color.NEGRO));
        cards.add(new Card("3", Card.Palo.CORAZONES, Card.Color.ROJO));
        cards.add(new Card("3", Card.Palo.PICAS, Card.Color.NEGRO));
        cards.add(new Card("3", Card.Palo.DIAMANTES, Card.Color.ROJO));

        cards.add(new Card("4", Card.Palo.TREBOLES, Card.Color.NEGRO));
        cards.add(new Card("4", Card.Palo.CORAZONES, Card.Color.ROJO));
        cards.add(new Card("4", Card.Palo.PICAS, Card.Color.NEGRO));
        cards.add(new Card("4", Card.Palo.DIAMANTES, Card.Color.ROJO));


        cards.add(new Card("5", Card.Palo.TREBOLES, Card.Color.NEGRO));
        cards.add(new Card("5", Card.Palo.CORAZONES, Card.Color.ROJO));
        cards.add(new Card("5", Card.Palo.PICAS, Card.Color.NEGRO));
        cards.add(new Card("5", Card.Palo.DIAMANTES, Card.Color.ROJO));

        cards.add(new Card("6", Card.Palo.TREBOLES, Card.Color.NEGRO));
        cards.add(new Card("6", Card.Palo.CORAZONES, Card.Color.ROJO));
        cards.add(new Card("6", Card.Palo.PICAS, Card.Color.NEGRO));
        cards.add(new Card("6", Card.Palo.DIAMANTES, Card.Color.ROJO));

        cards.add(new Card("7", Card.Palo.TREBOLES, Card.Color.NEGRO));
        cards.add(new Card("7", Card.Palo.CORAZONES, Card.Color.ROJO));
        cards.add(new Card("7", Card.Palo.PICAS, Card.Color.NEGRO));
        cards.add(new Card("7", Card.Palo.DIAMANTES, Card.Color.ROJO));

        cards.add(new Card("8", Card.Palo.TREBOLES, Card.Color.NEGRO));
        cards.add(new Card("8", Card.Palo.CORAZONES, Card.Color.ROJO));
        cards.add(new Card("8", Card.Palo.PICAS, Card.Color.NEGRO));
        cards.add(new Card("8", Card.Palo.DIAMANTES, Card.Color.ROJO));

        cards.add(new Card("9", Card.Palo.TREBOLES, Card.Color.NEGRO));
        cards.add(new Card("9", Card.Palo.CORAZONES, Card.Color.ROJO));
        cards.add(new Card("9", Card.Palo.PICAS, Card.Color.NEGRO));
        cards.add(new Card("9", Card.Palo.DIAMANTES, Card.Color.ROJO));

        cards.add(new Card("10", Card.Palo.TREBOLES, Card.Color.NEGRO));
        cards.add(new Card("10", Card.Palo.CORAZONES, Card.Color.ROJO));
        cards.add(new Card("10", Card.Palo.PICAS, Card.Color.NEGRO));
        cards.add(new Card("10", Card.Palo.DIAMANTES, Card.Color.ROJO));

        cards.add(new Card("j", Card.Palo.TREBOLES, Card.Color.NEGRO));
        cards.add(new Card("j", Card.Palo.CORAZONES, Card.Color.ROJO));
        cards.add(new Card("J", Card.Palo.PICAS, Card.Color.NEGRO));
        cards.add(new Card("J", Card.Palo.DIAMANTES, Card.Color.ROJO));

        cards.add(new Card("Q", Card.Palo.TREBOLES, Card.Color.NEGRO));
        cards.add(new Card("Q", Card.Palo.CORAZONES, Card.Color.ROJO));
        cards.add(new Card("Q", Card.Palo.PICAS, Card.Color.NEGRO));
        cards.add(new Card("Q", Card.Palo.DIAMANTES, Card.Color.ROJO));

        cards.add(new Card("K", Card.Palo.TREBOLES, Card.Color.NEGRO));
        cards.add(new Card("K", Card.Palo.CORAZONES, Card.Color.ROJO));
        cards.add(new Card("K", Card.Palo.PICAS, Card.Color.NEGRO));
        cards.add(new Card("K", Card.Palo.DIAMANTES, Card.Color.ROJO));

        cards.add(new Card("A", Card.Palo.TREBOLES, Card.Color.NEGRO));
        cards.add(new Card("A", Card.Palo.CORAZONES, Card.Color.ROJO));
        cards.add(new Card("A", Card.Palo.PICAS, Card.Color.NEGRO));
        cards.add(new Card("A", Card.Palo.DIAMANTES, Card.Color.ROJO));

    }

    public void imprimirMazo() {
        for (Card cards : cards) {
            cards.imprimir();
        }
    }

    public void mesclar() {
        Collections.shuffle(cards);
        System.out.println("-----Mazo barajeado");
    }

    public void numeroCartas() {
        System.out.println("-----Numero de cartas en mazo: " + cards.size());
    }

    public void sacarPrimeraCarta() {
        System.out.println("-----La primera carta del mazo:");
        cards.get(0).imprimir();
    }

    public void sacarCartaAzar() {
        Random numeroAzar = new Random();
        try {
            int size = cards.size();
            int aleatorio = numeroAzar.nextInt(size);
            cards.get(aleatorio).imprimir();
            cards.remove(aleatorio);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No hay mas cartas en el mazo");
            System.exit(0);
        } catch (IllegalArgumentException a) {
            System.out.println("Termino el juego, Nos quedamos sin cartas");
            System.exit(0);
        }

    }

    public void cincoCartas() {

        Random numeroAzar = new Random();
        try {
            int size = random();

            int aleatorio1 = numeroAzar.nextInt(size);
            int aleatorio2 = numeroAzar.nextInt(size);
            int aleatorio3 = numeroAzar.nextInt(size);
            int aleatorio4 = numeroAzar.nextInt(size);
            int aleatorio5 = numeroAzar.nextInt(size);

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
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No hay mas cartas en el mazo");
            System.exit(0);
        } catch (IllegalArgumentException a) {
            System.out.println("Termino el juego, Nos quedamos sin cartas");
            System.exit(0);
        }

    }

    public int random() {
        Random random = new Random();
        int n = cards.size();
        int numero = random.nextInt(n);
        return numero;
    }


}
