public class Cat extends Pet implements Pet_Interface {

    public Cat(String name){
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Мяу-мяу");
    }
    @Override
    public void pleasure(){
        System.out.println("Мур-мур");
    }

}
