class Numberformat_Exception212
{
public static void main(String[] args){
try
{
int num = Integer.parseInt ("akki");
System.out.println(num);
}
catch(NumberFormatException e){
System.out.println("NumberFormatException..");
}
}
}