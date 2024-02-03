
class AAA
{
    int a;
    public void print()
    {
        System.out.println("from outer class");
    }
    class BBB // here class BBB is an inner class
    {
        public void show()
        {
            System.out.println("from inner class");
        }
    }
}

class AB
{
    public void shwoif()
    {
        System.out.println("ab outer");
    }
    static class ABAB
    {
        public void showw()
        {
            System.out.println("abab inner");
        }
    }
}
public class innerclass
{
    public static void main(String[] args)
    {
        // we can create object of outer class just as normal.
        AAA obj = new AAA();
        obj.print();
        // but for creating we cannot create object of inner class as normal
        // for that we do

//        BBB obj1 = new BBB // we cannot create obj in this way
        // to create an object of inner class we need to access it through the object of outer class and for type we need to reffer
        // it through the outer class
        AAA.BBB obj1 = obj.new BBB();
        obj1.show();
        // also we can create an object of innerclass directly if the the inner class is static,
        // if innerclass is static then we can create object of innerclass without using
        // note: outeclass can never be static

        AB obj2 = new AB();

        AB.ABAB obj3 = new AB.ABAB(); // this is how u create an object of static innerclass
        obj3.showw();
    }
}
