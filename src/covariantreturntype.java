/*
covariant return type

basically we can achive methode overriding by changing the return type aswell but not in mtd overloading
here, java dosent allows us to achive mtd overriding using diff return type but JVM allows us to do that ,
here we just change methode return type in inherited classes

 */

class A1
{
    public A1 mtd() // methode with return type as class, means whenever this methode will be called then this methode will call
            // the class again and then we can acccess the other mehtods through this methode
    {
        return this;
    }


    void print()
    {
        System.out.println("from A1");
    }
}

class A2 extends A1
{
    public A2 mtd()
    {
        return this; // in the earlier versions of java i.e before java 5 this mtd overriding using covarient return type was
        // not possble, but after java 5 it is , if this covarinet return type was not introduced then we would have needed
        // to typecast method that is to be called in overriding, which looks easy for the shorter run but in the longer codes
        // its difficult for programmers to make the typecasting correctly, else it gives the ClassCastException
    }
    void print()
    {
        System.out.println("from A2");
    }
}

class A3 extends A2
{
    public A3 mtd()   // here if i've written A2 just to show how difficult it is to typecast and to write logic correctly all
    // the time
    {
        return this;
    }

    void print()
    {
        System.out.println("from A3");
    }
}
public class covariantreturntype {
    public static void main(String[] args) {


        A1 a1 = new A1();
//        a1.mtd();   // we cannot write just a1.mtd cuz it will just return the class A1, but what will do of that ,
        //  thats why we need to call any other method form the a1.mtd

        a1.mtd().print();

        A2 a2 = new A2();
        a2.mtd().print();

        A3 a3 = new A3();
        a3.mtd().print();

    }
}