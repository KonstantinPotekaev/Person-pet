public class Dog extends Pet implements Pet_Interface {

    public Dog(String name){
        super(name);
    }
    @Override
    public void voice(){
        System.out.println("Гав-гав");
    }
    @Override
    public void pleasure(){
        System.out.println("*Собака веляет хвостом*");
    }
}
