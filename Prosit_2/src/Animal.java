public class Animal {

    String family, name;
    int age;
    boolean isMammal;

    Animal(){}

    Animal(String family, String name, int age, boolean
            isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString(){
        return "Animal{family: "+this.family+", name: "+this.name+", age: "+this.age+", isMammal: "+isMammal+"}";
    }

}
