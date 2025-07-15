public class Main{
// Creating object and multiple object.
    //final int x = 5;  //final keyword is useful when you want a variable to always store the same value, like PI
    int x = 10;
    String name ="hello";
    boolean myBln = true;
    String fname = "John";
    String lname = "Doe";
    int age = 24;
    public static void main(String[] args) {
        // Object-Oriented Programming
// Class should always start with Upercase first later, that name of the java file should match the class name.
        Main myObj = new Main();
        Main newObj = new Main();
        Main myObj2 = new Main();
        myObj.x = 40;
        System.out.println(myObj.x);
        System.out.println(newObj.myBln);
        System.out.println(myObj2.name);

    }
}