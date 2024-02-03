// annonymous inner class is used when we know that, that specific class is going to be used only once and thats when the
// concept of annonymous inner class comes in and in this we do not need to create a seperate class

class car1
{
    public void show()
    {
        System.out.println("from class car1");
    }
}
// now what if we just want to use the show methode but dont want it to display "from class car1", instead we want something else
// here we need to either override the methode or we need to create another methode, but we can do it without doing any of that
// instead we will create an annonymous class
class car2
{
    public void show()
    {
        System.out.println("from class car2");
    }
}
public class annonymous_innerclass
{
    public static void main(String[] args)
    {
        car1 obj = new car1();
        obj.show();
        // this is how u create an object normally and get whats written in methode

        // this is how we create an annonymous inner class
        car1 obj1 = new car1() // while compiling this will create a file of the same name in which psvm exists
        {
            public void show()
            {
                System.out.println("from annonymous inner class");
            }
        };
        obj1.show(); // now it will print "from annonymous inner class" instead of line 8
     }
}
