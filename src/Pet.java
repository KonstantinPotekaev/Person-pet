public abstract class Pet {
    String name;
    boolean _besidePerson = false;

    public Pet(String name){
        this.name = name;
    }

    public String GetName(){
        return name;
    }
    public boolean getPosition(){
        return _besidePerson;
    }

    public void changePosition(boolean besidePerson){
        _besidePerson = besidePerson;
    }
    public static void noSuchPet(){
        System.out.println("У человека нет такого животного");
    }
    public void tooFar(){
        System.out.println(name + " слишком далеко");
    }
    public void voice(){
        System.out.println("*Животное издает звук*");
    }

    public void pleasure(){
        System.out.println("*Животному приятно*");
    }
}
