public class Cat extends Pet implements Pet_Interface {

    public Cat(String name){
        super(name);
    }

    public void Voice(){
        System.out.println("Мяу-мяу");
    }
    public void Pleasure(){
        System.out.println("Мур-мур");
    }
}
