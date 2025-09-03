abstract class teamindia{
public abstract void fitness();
}
class player extends teamindia{
public void fitness(){
    System.out.println("in fitness of plyer ");
}
}
public class Cricket{
public static void main(String[] args) {
    player p1=new player();
    p1.fitness();
}
}