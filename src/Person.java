import java.util.ArrayList;
import java.util.List;

public class Person {
    private List<Cat> cats = new ArrayList<>();
    private List<Dog> dogs = new ArrayList<>();

    public void AddNewPet(Object pet){
        if(pet instanceof Cat) {
            var cat = ((Cat) pet);
            int isNotANewCat = 0;
            for (var i : cats) {
                if (i == cat) {
                    isNotANewCat = 1;
                }
            }
            if (isNotANewCat == 0) {
                cats.add(cat);
            }
        }
        else if (pet instanceof Dog){
            var dog = ((Dog) pet);
            int isNotANewDog = 0;
            for (var i : dogs) {
                if (i == dog) {
                    isNotANewDog = 1;
                }
            }
            if (isNotANewDog == 0) {
                dogs.add(dog);
            }
        }
    }

    public void CallPet(Object pet){
        if (pet instanceof Cat){
            var cat = ((Cat) pet);
            if (cats.contains(cat)){
                cat.Voice();
                cat.ChangePosition(true);
            }
            else{
                Pet.NoSuchPet();
            }
        }
        else if (pet instanceof Dog){
            var dog = ((Dog) pet);
            if (dogs.contains(dog)) {
                dog.Voice();
                dog.ChangePosition(true);
            }
            else {
                Pet.NoSuchPet();
            }
        }

    }
    public void PetPet(Object pet){
        if(pet instanceof Cat) {
            var cat = ((Cat) pet);
            if (!cats.contains(cat)) {
                Pet.NoSuchPet();
            } else if (!cat.GetPosition()) {
                Pet.TooFar(cat.GetName());
            } else {
                cat.Pleasure();
                cat.ChangePosition(false);
            }
        }
        if(pet instanceof Dog) {
            var dog = ((Dog) pet);
            if (!dogs.contains(dog)) {
                Pet.NoSuchPet();
            } else if (!dog.GetPosition()) {
                Pet.TooFar(dog.GetName());
            } else {
                dog.Pleasure();
                dog.ChangePosition(false);
            }
        }

    }


}
