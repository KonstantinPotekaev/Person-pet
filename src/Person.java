import java.util.ArrayList;
import java.util.List;

public class Person {
    private List<Cat> cats = new ArrayList<>();

    public void AddNewCat(Cat cat){
        int isNotANewCat = 0;
        for (var i : cats){
            if (i == cat){
                isNotANewCat = 1;
            }
        }
        if (isNotANewCat == 0){
            cats.add(cat);
        }
    }

    public void CallCat(Cat cat){
        if (cats.contains(cat)){
            System.out.println("Кис-Кис");
            cat.Answer();
        }
    }
    public void PetCat(Cat cat){
        if(!cats.contains(cat)){
            System.out.println("У человека нет такого кота");
        }
        else if (!cat.isBesidePerson()){
            System.out.println("Кот далеко от человека");
        }
        else{
            cat.Pleasure();
        }

    }


}
