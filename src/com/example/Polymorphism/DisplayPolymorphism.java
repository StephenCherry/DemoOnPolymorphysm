package com.example.Polymorphism;
//Implementing Polymorphism in Java. Check out the snippets bellow.
public class DisplayPolymorphism {
    public static void main(String[] args) {
        AnimalSounds animalSounds = new AnimalSounds();
        CatSound catSound = new CatSound();
        CattleSound cattleSound = new CattleSound();
        BirdSound birdSound = new BirdSound();

        animalSounds.Sound();
        catSound.Sound();
        cattleSound.Sound();
        birdSound.Sound();
    }
}
