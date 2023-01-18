package com.mathmaurer.jeu;

//***** La classe Chrono g�re un flux ind�pendant du flux principal qui ex�cute la m�thode run() *****//
public class Chrono implements Runnable {

    //**** VARIABLES **//
    private final int PAUSE = 3; // temps d'attente entre 2 tours de boucle : 3 millisecondes


    //**** METHODES **//
    @Override
    public void run() {

        while (true) {
            Main.scene.repaint(); // Appel de la m�thode PaintComponent de l'objet scene
            try {
                Thread.sleep(PAUSE);
            } // temps de pause du flux (3 ms)
            catch (InterruptedException e) {
            }
        }
    }
}