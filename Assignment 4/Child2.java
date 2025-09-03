 class Parent2 {
	public Parent2(int a){
	System.out.println("Parent constructor value : "+a);
	}
}
    class Child2 extends Parent2 {
        public Child2(int a){
	super(a);
	System.out.println("Child constructor value : "+a);
	}


   
	public static void main(String[] args)
	{
	Child2 cl = new Child2(45);
	
	
  	}
   }