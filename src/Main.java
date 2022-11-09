public class Main {
    public static void main(String[] args) {

        var p = new Person();
        var cat = new Cat("Дуся");
        var dog = new Dog("Тоби");
        p.AddNewPet(cat);
        p.CallPet(cat);
        p.PetPet(cat);
        p.AddNewPet(dog);
        p.CallPet(dog);
        p.PetPet(dog);
    }
}