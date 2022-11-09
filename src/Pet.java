public abstract class Pet {
    String name;
    boolean _besidePerson = false;

    public Pet(String name){
        this.name = name;
    }

    public String GetName(){
        return name;
    }
    public boolean GetPosition(){
        return _besidePerson;
    }

    public void ChangePosition(boolean besidePerson){
        _besidePerson = besidePerson;
    }
    public static void NoSuchPet(){
        System.out.println("У человека нет такого животного");
    }
    public static void TooFar(String name){
        System.out.println(name + "слишком далеко");
    }
}
