interface A {
    void show();  // abstract method

    default void display() {   // default method with body
        System.out.println("This is a default method");
    }

    static void info() {       // static method with body
        System.out.println("This is a static method");
    }
}

class B implements A {
    public void show() {
        System.out.println("In show");
    }
}

class Test {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();       // calls class method
        obj.display();    // calls default method
        A.info();         // calls static method
    }
}