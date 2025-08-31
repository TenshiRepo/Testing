
class Animal {
    String name;
    int age;
    String species;
     static int count = 0;
   
   
    Animal(String name, int age, String species){
        this.name = name;
        this.age = age;
        this.species = species;
        count++;
    }

    static int getCount(){
        return count;
    }

    Animal (){
        this("Unknown", 67, "Unknown");

    }


    void eat(){
        System.out.println("Animal is eating");
    }
    
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class Mammal extends Animal {
    String gender;

    Mammal(String name, int age, String species, String gender){
    super(name, age, species);
    this.gender = gender;
    }

    Mammal(int age){
        this("Max", age, "Bird", "Female");
        
    }

    void giveBirth(){
        System.out.println("Mammal is giving birth");
    }

    void eat(){
        System.out.println("Mammal is eating");
    }
    void displayInfo(){
        System.out.print(name);
        System.out.print(", " + age);
        System.out.print(", " + species);
        System.out.print(", " + gender);
    }
}

class Bird extends Animal {
    String feathers;

    void fly(){
        System.out.println("Bird is flying");
    }
    void sleep(){
        System.out.println("Bird is sleeping");
    }    
}

class Reptile extends Animal{
    String skin;

    void sunbathe(){
        System.out.println("Reptile is sunbathing");
    }

    void eat(){
        System.out.println("Reptile is eating");
    }

    public static void main(String[] args) {
        
        Animal animal = new Animal("Jdhajd", 8, "Dog");
        Animal a1 = new Animal("HAHAH", 9, "Cat");
        // Mammal m1 = new Mammal("Doggy", 10, "Dog", "Male");
        // Bird b1 = new Bird();
        // Reptile r1 = new Reptile();
        Mammal mammal = new Mammal(9);

        
        mammal.displayInfo();
        System.out.println();
       
        // m1.giveBirth();
        // b1.fly();
       System.out.println("Total counts: " +  Animal.getCount());
      



    }
}
