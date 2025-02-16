public class MyClass {
    private int x = 10;

    public void myMethod() {
        int x = 5; // Declare a local variable with the same name
        System.out.println(x); // Prints 5 (local variable)
        System.out.println(this.x); //Prints 10 (instance variable)
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod();
    }
}