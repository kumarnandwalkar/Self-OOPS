
// just like mtd overloading we can use the same name for 2 mtds in same class with just the difference of number of parameters
// and the datatype of parameters, similarly in mtd overriding we can use mtds of same name dossent matter how many parameters
// we have there or whats the datatype or whats the return type, in two different classes (those classes should be inherited)
// then the compiler will first look for the required mtd in the class whose object is being created if it exists then it will use
// the mtd from that class else it will search for the required mtd in the parent class

class A
{
    public void show()
    {
        System.out.println("from A");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("from B");
    }
}
public class mtdOverriding
{
    public static void main(String[] args)
    {
        B obj = new B();
        obj.show();  // here the mtd from class B will be printed due to mtd overridding
//        if we comment out the show mtd in class B then it will print show mtd from class A
    }
}
