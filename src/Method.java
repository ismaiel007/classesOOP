public class Method {
    /* static void myStaticMethod(){
        System.out.println("this is static method");
    }
    public void myPublicMethod(){
         System.out.println("this is my public method");


    }
    public static void main(String[] args){
        myStaticMethod();

        Method pub = new Method();
        pub.myPublicMethod();
    }*/


   /* public void fullThrottle(){
        System.out.println("This car can go as fast a it can");
    }
    public void speed(int maxSpeed){
        System.out.println("Max speed is :" + maxSpeed);
    }
    public static void main(String[] args){
        Method myCar = new Method();
        myCar.fullThrottle();
        myCar.speed(200);// (.) is used to access the object attributes and methods.
 //To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).


    }*/
/*int modelYear;
String modelName;
public Method(int year, String name){
    modelYear = year;
    modelName = name;

}
public static void main(String[] args){
    Method myCar1 = new Method(1969, "Mustang"); // Create an object of class Main (This will call the constructor)
    System.out.println("car name is :" + myCar1.modelName);
    System.out.println("My car Model is :" + myCar1.modelYear);
}*/

    int x;
    public Method(int x){
        this.x = x;

    }
    public static void main(String[] args){
        Method myObj = new Method(5);
        System.out.println("Value of x = " + myObj.x);
        System.out.println("Commit atma");
    }


    

}
