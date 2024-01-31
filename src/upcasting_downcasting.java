
class newA
{
    public void mtd1()
    {
        System.out.println("mtd 1");
    }
}
class newB extends newA
{
    public void mtd2()
    {
        System.out.println("mtd 2");
    }
}

public class upcasting_downcasting
{
    public static void main(String[] args) {
        newA obj = new newB();
//        obj.mtd2(); // so basically we cannot call child class mtds from parent class type object
//        to do that we need typecasting , when we make an object of child class and then convert it to the parent class object
//        it is called as upcasting,
        newA objj = (newA) new newB();
        // here we made an object of class newA after typecasting which was earlier an object of class newB
        // with a refrence variable objj, this is upcasting

        newA obj2 = (newB) new newA();
//        this is downcasting when we create an object of parent class and then typecast it to the child class
//        its called downcasting

    }
}
