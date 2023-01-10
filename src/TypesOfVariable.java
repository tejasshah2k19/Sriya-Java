public class TypesOfVariable {
    public static void main(String[] args) {
        StudentA s1 = new StudentA();
        StudentA s2 = new StudentA();
        StudentA s3 = new StudentA();
        s1.name = "ram";
        s2.name = "royal";
        s3.name = "java";

        System.out.println(s1.name);// ram
        System.out.println(s2.name);// royal
        System.out.println(s3.name);// java

        System.out.println(s1.schoolCode);
        System.out.println(s2.schoolCode);
        System.out.println(s3.schoolCode);
        s1.schoolCode = 20;
        System.out.println(s1.schoolCode);
        System.out.println(s2.schoolCode);
        System.out.println(s3.schoolCode);//using object 

        System.out.println(StudentA.schoolCode);//using class name 
        
    }
}

class StudentA {
    String name;// per instance // instance variable -heap // must via instance-object
    
    //static - class variable
    //objects are shared this 
    static int schoolCode = 12;//1 copy //u can chage value 
    //one and only one copy inside the memory 
    

    //non static - instance method 
    void print() {
        int age; // local variable - stack -block
        for (int i = 1; i <= 5; i++)
            ;
        System.out.println(name);//
    }

    static void myStatic(){
        System.out.println(schoolCode);
        // System.out.println(name);//error 
    }
}
