public class Zoo {


    Animal[] animals;
    String name, city;
    final int NB_CAGES=25;

    int nbrAnimals=0;
    Zoo(String name, String city ) {
        animals = new Animal[NB_CAGES];
        this.name = name;
        this.city = city;
    }

    //empty constructor
    Zoo() {
    this.animals = new Animal[NB_CAGES];
    }

    void displayZoo(){
        System.out.println("Zoo: {Name: "+this.name+ ", city: "+city+", NbCages: "+NB_CAGES+"}");
    }

    @Override
    public String toString(){
        return "Zoo: {Name: "+this.name+ ", city: "+city+", NbCages: "+NB_CAGES+"}";
    }

    boolean addAnimal(Animal animal){
        if (searchAnimal(animal) != -1 )
            return false;
        if (nbrAnimals == NB_CAGES)
            return false;
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println("Animal was added succefully!");
        return true;

    }

    //Instruction 11
    void displayAnimals(){
        System.out.println("Liste des animaux de "+ name +" :" );
        for (int i=0;i < nbrAnimals;i++)
            System.out.println(animals[i]);
    }

    //instruction 11
    int searchAnimal(Animal animal){
        int index = -1;
        for (int i=0;i<nbrAnimals;i++)
        {
            if (animal.name == animals[i].name)
                return i;
        }

        return index;
    }


    boolean removeAnimal(Animal animal){
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return  false;
        for (int i=indexAnimal;i<nbrAnimals;i++){
            animals[i] = animals[i+1];
        }
        animals[nbrAnimals] = null;
        nbrAnimals --; // nbrAnimals = nbrAnimals-1;
        System.out.println(animal.name+ " was removed successfully!");
        return true;
    }



    boolean isZooFull(){

        if (nbrAnimals>= NB_CAGES)
            return true;
        return false;
        //return nbrAnimals>=NB_CAGES;
    }


    Zoo compareZoo(Zoo z1, Zoo z2){
        if (z1.nbrAnimals< z2.nbrAnimals)
            return z2;
        else if(z1.nbrAnimals>z2.nbrAnimals)
            return z1;
        System.out.println("Both of them have the same number of animal");
        return null;

    }


}
