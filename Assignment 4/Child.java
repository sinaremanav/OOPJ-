  class Parent {
        int value = 10;
    }

    class Child extends Parent {
        int value = 20;

        void display() {
            System.out.println("Child value: " + value);
            System.out.println("Parent value: " + super.value); 
        }
	public static void main(String[] args)
	{
	Child cl = new Child();
	cl.display();
  	}
   }