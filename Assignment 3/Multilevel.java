//parent 
class Student{
  void displaystudent(String name,int rollNo){
         System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
}
}

//child 1
class Sem1 extends Student{
      int sub1,sub2,sub3;

           void Sem1Marks(int s1, int s2, int s3) {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
        System.out.println("Total of sem 1 Marks : "+ (sub1+sub2+sub3));
        System.out.println("Average of sem 1 Marks : "+ (sub1+sub2+sub3)/3);
    }

}
class Sem2 extends Sem1 
{
    int sub1 , sub2 , sub3;
    void Sem2Marks(int s1,int s2,int s3){
        sub1=s1;
        sub2=s2;
        sub3=s3;
        System.out.println("Total of sem 2 Marks : "+ (sub1+sub2+sub3));
         System.out.println("Average of sem 2 Marks : "+ (sub1+sub2+sub3)/3);
    }
}
class Multilevel {
    public static void main(String args[]){
        Sem2 s = new Sem2();
        s.displaystudent("Viresh",76);
        s.Sem1Marks(34,56,67);
        s.Sem2Marks(36,67,89);
    }
}
