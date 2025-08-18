class Animal
{
void voice()
{
System.out.println("In voice() of Animal");
}
}
public class Dog extends Animal
{
void bark()
{
System.out.println("In bark() of Dog");
}
public static void main(String args[])
{
Animal d = new Dog();

d.voice();
}
}