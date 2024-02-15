
// interface : basically we can say that interface are those classes which can have abstract methodes but we can never declare
// that abstract methode in that interface class unlike abstract

// when u extend interface class u dont write extends , instead we write implements
// interface is used to achive abstraction and multilevel inheritance

// why to use interface:
// 1. to achive abstract
// 2. to achive multilevel inheritance
// 3. can be used to achive loosing coupling

/*

in interface we can use public, private, default, static, also
whenever we implement interface the class should declare all the interface methodes 

in interface mostly we create the object of implementation class with refrence of parent class

* */

interface bank
{
    public float ROI();
}

class SBI implements bank
{
    public float ROI() {
        return 9.17f;
    }
}

class IDBI implements bank{

    public float ROI() {
        return 8.14f;
    }
}





public class interface_java
{
    public static void main(String[] args) {

        bank b = new SBI();
        System.out.println(b.ROI());
    }
}
