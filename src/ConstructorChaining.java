class A {
    private int i;
    public static final double PI = 3.14;
    A(){
        this(2); // Default if not provided
        System.out.println("A constructor 1");
    }
    A(int x){
        i = x;
        System.out.println("A constructor 2");
    }

    int get(){
        return i;
    }
}
class B extends A {
    int j;
    B(){
        this("Aloha"); // Supply a default value
        System.out.println("B constructor 1");
    }
    B(String msg){
        System.out.println(msg);
    }
}

class ConstructorChaining {
    public static void main(String[] args){
        // Demo of constructor chaining
        // B b = new B();
        B b1 = new B();

    }
}
