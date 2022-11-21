public class Main {
    public static void main(String[] args) {

        var p = new Person();
        var cat = new Cat("Дуся");
        var dog = new Dog("Тоби");
        p.addNewPet(cat);
        p.callPet(cat);
        p.petTheAnimal(cat);
        p.addNewPet(dog);
        p.callPet(dog);
        p.petTheAnimal(dog);

    }
}