class address
{
    String state;
    String city;
    String country;
    public address(String state,String city,String country)
    {
        this.state = state;
        this.city = city;
        this.country = country;
    }
}

class employee
{
    int id;
    String name;
    address addressemp; // here object of another class is taken a sinput for another class
    public employee(int id, String name, address addressemp)
    {
        this.id = id;
        this.name = name;
        this.addressemp = addressemp;
    }
}


public class inheritancejava
{
    /*
    in java we can do inheritance using single level and multilevel inheritance
    but we cannot do multiple inheritance
    that is
    class c extends b,
    class b extends a,
    here class c will have all the properties of class a and b
    but we cannot do
    class c extends a and b
    this is not possible, it will cause ambiguity
    two or more classes cannot be inherited in one class but one class can be inherited in multiple classes

    there are two types of inheritance
    1. inheritacne   // normal inheritance
    2. aggregate inheritance

    aggregate inheritance means we call an object of another class inside another class therefore we get values inside values
    this inheritance is used for code reuseability


     */

    public static void main(String[] args) {

        address newadd = new address("mh", "pune", "india");
        employee newemp = new employee(199,"kumar", newadd);

        System.out.println(newemp.addressemp.country);

    }
}
