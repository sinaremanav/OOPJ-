  class Parent1 {
        int value = 10;
	void display() {
	System.out.println("Parent value:"+value);
   	 }
	}
    class Child1 extends Parent1 {
        int value = 20;

        void display() {
            System.out.println("Child value: " + value);
            super.display(); 
        }
	public static void main(String[] args)
	{
	Child cl = new Child();
	cl.display();
  	}
   }