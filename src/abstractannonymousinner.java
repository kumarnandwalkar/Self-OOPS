// basically we can use an annoymous inner class for implementing abstract class object without creating any other seperate class
// extended with abstract class


abstract class NewA
{
    public abstract void show();
}

// in normal abstract class we extend the NewA and then implement the show methode in that child class but here we will do the impl
// ementation of abstract methode using anonymous class

public class abstractannonymousinner
{
    public static void main(String[] args) {

        NewA obj = new NewA() {
            public void show()
            {
                System.out.println("form anonymous class");
            }

        };
        obj.show();


    }
}
