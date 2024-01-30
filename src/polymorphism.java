
class computer
{
    public void show1()
    {
        System.out.printf("hello world");
    }
    public void demo()
    {
        System.out.println("from computer class");
    }
}
class laptop extends computer
{
    public void demo()
    {
        System.out.println("from laptop class");
    }
}
class D
{
    public void demo()
    {
        System.out.println("from D class");
    }
}

public class polymorphism {
    public static void main(String[] args) {


//    poly = many,
//    morphism = behaviour
//    the one having different behaviour in different situation
//
//    2 TYPES OF POLYMORPHSIM
//    1. compiletime polymorphism
//    2. runtime polymorphism
//

//    mtd overloading is an example of compiletime polymorphism and
//    mtd overriding, dynamic methode dispatch is an example of runtime polymorphism

//here in dynamic mtd dispatch we create an object with the reference/type of parent class and an object of child class

// generally we do this
//        computer obj = new computer();
//        obj.show1();  // will print hello world
// but in dynamic mtd dispatch we can do
//        computer obj1 = new laptop();
//        obj1.show1(); // will print hello world
    // here we basically create an object of type parent and an object in memory of type child
        // iska fayda dekhna padega mujhe bhi nhi pata

        // now heres the thing
        computer obj2 = new computer();
        obj2.demo();
        obj2 = new laptop();
        obj2.demo();
               // what will the above line print
        // it will print
//        from computer class
//        from laptop class

        // bcz first we created an object of class computer with a refrence variable of name obj2
        // then we just gave that same reference variable name to another memory location which was created of class laptop
        // and according to methode overriding first it will search for the required methode in the child class if available if
        // not then it will search for it in the parent class
        // NOTE: we can change this refrence variable thing with only that classes which are onherited from the refrence variable
        // type parent class i.e we can only create objects of child class only when we have a reference variable of parent class
        // for ex. we cannot overwrite the obj2 for an object of class D cuz it is not inherited from class computer
//        obj2 = new D(); // not possible

        // this is how runtime polymorphism works and this is also called as dynamic methode dispatch
    }

}