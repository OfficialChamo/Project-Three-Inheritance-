public class Dog {
    public void run (){
        System.out.println("Can Run");
    }
}
class Monkey extends Dog{
    public void jump (){
        System.out.println("Can Jump");
    }
    public void climb (){
        System.out.println("Can Climb");
    }

    public static void main(String[] args) {
        Monkey m = new Monkey();
        m.run();
        m.jump();
        m.climb();
    }
}