/*
final k

 */


class AA
{
   public void print ()
   {
       int A = 10;
       A = 30;  // here it was possible for me to change the value of A
       // but using a final keyword wont allow us to change the value of variable
      final int B = 50;
//       B = 60;
   }
}
//final class BB
//{
//
//}
//class CC extends BB // it dosent allows to extend class BB
//{

//}
class EE
{
    final public void printingg()
    {
        System.out.println("from EE");
    }
}
class DD extends EE
{
//    public void printingg()
    {
        System.out.println("from DD");
        // if i make the printingg mtd in class EE as  a final mtd then it will say cannot override the final methode
    }
}

public class final_keyword
{
//    final keyword is used for variable, methode, and class
//    if we make any variable final then we cannot change the value of that final keyword
//    if we make any class final then we cannot apply or use inheritance on that class i.e cannot make child class of that parent
//    class
//    if we make any methode as a final methode then we prohibit the methode overriding for the child classes

    public static void main(String[] args) {

    }
}
