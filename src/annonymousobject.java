// those objects which do not have any reference variable, instead we just create an object inside
// the heap memory

class demo
{
    int a;
    int b;

    public demo()
    {
        System.out.printf("hello");
    }
    public void printing ()
    {
        System.out.printf("printing mtd");
    }
}
public class annonymousobject
{
    public static void main(String[] args)
    {
        // we do create an object by
        /* demo obj = new demo() */
//        this is how we create an object and here the obj is the reference variable for the object,
//        but we can create an object inside the heap memory without giving it a reference variable
//        new demo()
//        this is an annonymous object which do not have any refrence variable yet, its just there
//        inside the memory

//        the only problem with this annonymous object is that we can only use that object only once bcz it does
//        not have any refrence varibale so how will u call it again
//        and it will create a new object inside memory everytime

        new demo().printing(); // here an object is created without any refrence variable
        new demo().printing();
//        if we write the same line again then it will create another object inside the memory and will execute
//        the mtd of printing and in total 2 objects will be created


    }
}
