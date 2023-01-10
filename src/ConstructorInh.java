public class ConstructorInh {
    public static void main(String[] args) {
        // Parent p = new Parent(12);
        Child c = new Child();// Child()
        // Parent PARA
        // Parent DEF
        // Child DEF
        // Child PARA

        // Parent DEF
        // Parent PARA
        // Child DEF
        // Child PARA

    }
}

class Parent {
    Parent() {
        this(10);
        System.out.println("Parent()");
    }

    Parent(int a) {
        System.out.println("Parent(int)");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child()");
    }

    Child(int a) {
        System.out.println("Child(int)");
    }
}
