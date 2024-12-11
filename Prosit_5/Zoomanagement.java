public class Zoomanagement {

        public static void main(String[] args) {
                Animal lion = new Animal("Cats", "Simba", 8, true);
                Animal dog = new Animal("Canine", "Snoopy", 2, true);

                Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
                Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


                System.out.println(myZoo.addAnimal(lion));
                System.out.println(myZoo.addAnimal(dog));
                System.out.println(myZoo.addAnimal(dog));

                myZoo.displayAnimals();

                System.out.println(myZoo.searchAnimal(dog));
                Animal dog2 = new Animal("Canine", "lll", 2, true);
                System.out.println(myZoo.searchAnimal(dog));

                //   System.out.println(myZoo.removeAnimal(dog));
                myZoo.displayAnimals();


                System.out.println(myZoo);

                myZoo.addAnimal(lion);
                myZoo.addAnimal(dog);
                myZoo.addAnimal(dog2);
                myZoo.displayAnimals();
                System.out.println("a" + myZoo.removeAnimal(lion));
                myZoo.displayAnimals();
                System.out.println("a" + myZoo.removeAnimal(dog2));
                myZoo.displayAnimals();
                System.out.println("a" + myZoo.removeAnimal(dog));
                myZoo.displayAnimals();

                System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
                System.out.println(myZoo.isZooFull());




                Aquatic aquaticAnimal = new Aquatic();

                Dolphin dolphin = new Dolphin("Cetaceans", "Flipper", 5, true, "Ocean", 20.5f);
                Penguin penguin = new Penguin("Birds", "Pingu", 3, false, "Arctic", 15.0f);
                Terrestrial terrestrialAnimal = new Terrestrial("Mammals", "Elephant", 10, true, 4);


                System.out.println(dolphin);
                System.out.println(penguin);
                System.out.println(terrestrialAnimal);

                dolphin.swim();
                penguin.swim();
                aquaticAnimal.swim();

        }

}