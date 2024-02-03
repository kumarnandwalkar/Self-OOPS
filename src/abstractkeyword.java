// if i create an mtd and dont write anything inside that methode then it does not affect the code,
// i.e we are just declaring a mtd but not defining,

// abstract mtd is used when u know that there will be a mtd but dk its implementation that time we use abstract keyword
// and we need to define that mtd in the child class manditorily
// and when we extend the abstract class and define the abstract mtd that time both the names of the methodes should be same
// basically its mtd overriding

// we cannot create an object of abstract class, whereas we can only get the refrence of abstract class

// abstract class can have abstract methodes aswell as normal methodes

// and the all abstract methodes should be compulsorily declared in the child class else it will throw error
// and if our child class also does not have all the abstract methodes then that child class should also be declared as an
// abstract class and should again create another class that extends the child class and
// the class which extends the abstract class
// and also has its object is called as concrete class


abstract class car // if we remove this abstract keyword and the abstract keyword of the methode then it will throw error
{
    public abstract void drive(); // this is an abstract mtd
    public void show()
    {
        System.out.println("showing");
    }
}
class wagonR extends car
{
    public void drive() // if we remove this mtd then this class wagonR will also be a abstract class
    {
        System.out.println("drive");
    }
}
public class abstractkeyword
{
//    car obj = new car(); // we cannot create an object of abstract class type but we can use it as a reference type


}
