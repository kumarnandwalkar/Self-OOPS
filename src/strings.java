public class strings
{
    public static void main(String[] args)
    {
        // strings are always written in double inverted quotes ""
        // string is not a primitive data type its a class inside java
        // we can also create an object of string
        // String newstring = new String();
        // if we try to print this newstring then we'll be returned just a empty space ntng else because
        // being a class it has its own seperate stack memory which is currently empty thats why.
        // but if we want to store something in that newstring then we need to enter the string inside the
        // constructor.
        // String newstring = new String("kumar"); now if we try to print the newstring then it will contain kumar

        // we cannot perform any operation on string accept +
        String newname= new String("kumar");
        System.out.printf("hello" + newname); // this will give hellokumar
        // charAt :- this is an inbuilt mtd which tells us what character is at that index
        System.out.println(newname.charAt(0));
    }
}
