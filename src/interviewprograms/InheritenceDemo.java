package interviewprograms;
class Bike{
  int speedlimit=90;
public void speed()
{
System.out.println("super");}
}
 class InheritenceDemo extends Bike{
  int speedlimit=150;
 public void speed()
{
System.out.println("sub");
}

  public static void main(String args[]){
   Bike obj=new InheritenceDemo();
obj.speed();
   System.out.println(obj.speedlimit);//90
 }
}
