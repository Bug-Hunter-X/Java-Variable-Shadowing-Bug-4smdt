public class MyClass {
    private int x = 10;

    public void myMethod() {
        int y = 5; // Changed local variable name
        System.out.println(y); // Prints 5
        System.out.println(this.x); //Prints 10 (instance variable)
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.myMethod();
    }
}