public class Main {
    public static void main(String[] args) {

        var p = new Person();
        var cat = new Cat();
        p.AddNewCat(cat);
        p.PetCat(cat);
        p.CallCat(cat);
        p.PetCat(cat);
    }
}