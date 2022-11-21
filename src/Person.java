import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

    private List<Pet> pets = new ArrayList<>();

    public void addNewPet(Pet pet){
        if (!pets.contains(pet)) {
            pets.add((Pet) pet);
        }
    }

    public void callPet(Pet pet){
        if (!pets.contains(pet)){
            Pet.noSuchPet();
        }
        else{
            pet.voice();
            pet.changePosition(true);
        }
    }
    public void petTheAnimal(Pet pet){
        if (!pets.contains(pet)){
            Pet.noSuchPet();
        }
        else if (!pet.getPosition()){
            pet.tooFar();
        }
        else{
            pet.pleasure();
            pet.changePosition(false);
        }
    }
}
