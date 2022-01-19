package Ch14.Excersises.AnimalExcersise;

class Animal {
    public void printAnimal() {
        System.out.println("I am an Animal.");
    }
}

class Mammal extends Animal {
    public void printMammal() {
        System.out.println("I a warm-blooded vertebrate animal of a class that is distinguished by the possession of hair or fur, "+
                "the secretion of milk by females for the nourishment of the young, and (typically) the birth of live young.");
    }
}

class Bat extends Mammal {
    public void printBat(){
        System.out.println("I give people rabies");
    }
}

class Horse extends Mammal {
    public void printHorse(){
        System.out.println("I have hooves.");
    }
}