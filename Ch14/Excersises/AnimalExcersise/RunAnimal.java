package Ch14.Excersises.AnimalExcersise;

public class RunAnimal {
    public static void main(String args[]){
        Bat myBat = new Bat();
        Horse myHorse = new Horse();

        myBat.printAnimal();
        myBat.printMammal();
        myBat.printBat();

        System.out.println();

        myHorse.printAnimal();
        myHorse.printMammal();
        myHorse.printHorse();
    }
}
