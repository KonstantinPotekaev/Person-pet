public class Dog extends Pet implements Pet_Interface {

    public Dog(String name){
        super(name);
    }

    public void Voice(){
        System.out.println("Гав-гав");
    }

    public void Pleasure(){
        System.out.println("*Собака веляет хвостом*");
    }
}
