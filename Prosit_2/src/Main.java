public class Main {
    public static void main(String[] args)
    {
        Animal lion = new Animal();
        lion.name = "Simba";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Wildlife Park";
        myZoo.city = "Ariana";
        myZoo.animals = new Animal[25];

        Animal tiger = new Animal("tiger","tiger",2,true);
        Animal fish = new Animal("fish","fishy",1,false);

        //Display myZoo data
        //myZoo.displayZoo();

        //instruction 8
        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(lion);
        System.out.println(tiger.toString());
        System.out.println(fish);

        //Add Animal
        //myZoo.addAnimal(lion);
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(tiger));
        System.out.println(myZoo.addAnimal(fish));
        //System.out.println(myZoo.nbrAnimals); //3
        //System.out.println(myZoo.animals.length); //25*/
        //for (int i=0;i<30;i++)
            //System.out.println(myZoo.addAnimal(lion));
        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(lion)); //0
        Animal turtle=new Animal("Testudines","Turtle",10,false);
        System.out.println(myZoo.searchAnimal(turtle)); // -1
        myZoo.addAnimal(turtle);
        System.out.println(myZoo.nbrAnimals);
        System.out.println(myZoo.removeAnimal(tiger));
        System.out.println(myZoo.nbrAnimals);

        Zoo zoo = new Zoo();

        zoo.addAnimal(tiger);

        System.out.println(zoo.compareZoo(zoo,myZoo));

    }
}