public class Cat {

    private boolean _besidePerson = false;
    public void Answer() {
        System.out.println("Мяу");
        _besidePerson = true;
    }

    public void Pleasure(){
        System.out.println("Мур-мур-мур");
        _besidePerson = false;
    }

    public boolean isBesidePerson(){
        return _besidePerson;
    }
}
