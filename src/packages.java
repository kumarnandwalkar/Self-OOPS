// packages are basically a folder and in that folder we can add multiple files and folders
// we can access the files inside our package in another package just by importing the package
// import package1.filename; this will import filename.java file from the package1
// to import all the files from any package use *
// import package1.*; this will import all files inside the package1
// packages2 inside package1
// we can also put one package inside another package , and when we'll use package1.* it will just import all files not the folders
// and the another package is a folder so we will not be having files from packages2. for that we will write
// import package1.packages2.*;

public class packages
{
    public static void main(String[] args)
    {
        demo newd = new demo();     // here this demo class object is created bcz this class exists inside the same package and is
        // a public class
        newd.printing();
    }
}
