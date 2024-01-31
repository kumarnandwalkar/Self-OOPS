// wrapper class are those data-type classes which are other than our primitive data structures example String, Integer, ArrayList,
// these are object classes, i.e wrapper classes are advanced format of primitive data structures but are a seperate class and
// as every other java class they also extends Object class
public class wrapper
{
    public static void main(String[] args) {
        int num1 = 10; // this is a primitive data type integer
        Integer num2 = 20; // here num2 is a refrence variable of type Integer containing value 20
        // we can also declare this num2 as a normal object but its not generally done in the latest veersion of JDK else it will
        // give warning but the code will still run
        Integer num3 = new Integer(20);
        System.out.println(num3);
        // diff in primitive variable and Integer varibale is that primitive will store int number in normal memory whereas
        // Integer will store the same number in a heap memory
        // now here the Integer class is a wrapper class, and as every other class this also creates an object in heap memory

        // we can also convert the primitive data type into the object and it is called as autoboxing
        Integer num4 = num1; // autoboxing
// autoboxing means storing primitive variable in an object

        // now what if we want to get our primitive data back from the object
        // this is called as auto-unboxing

        int num5 = num4; // auto-unboxing
        int num6 = num4.intValue(); // another way of auto-unboxing

        // as Integer is a class it also has some of its methodes

        // what if we want to operate a string and an int, this is how we can do that
        String number = "12";
        int num = 2;
//        System.out.println(int*number); // we cannot do it directly for that we use
        int num7 = Integer.parseInt(number); // this will convert the String into int, used from Integer class
        // to use this parseInt, the parameter should always be String
        System.out.println(num*num7);





    }
}
