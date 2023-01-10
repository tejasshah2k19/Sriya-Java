class Santa{
    void add(){
        System.out.println("SantaAdd");
    }
    //method overloading 
    void add(int x){
        System.out.println("SantaAdd(int)");
    }
    void mul(){
        System.out.println("SantaMul");
    }
}

class Banta extends Santa {
    void sub(){
        System.out.println("BantaSub");
    } 
    //method overriding 
    void mul(){
        System.out.println("BantaMul");
    }
    //overloading 
    void add(float d){
        System.out.println("addBanta");
    }

}

public class Inheritance{
    public static void main(String[] args) {
        Banta b = new Banta();
        b.sub(); 
        b.add(); 
        //b Banta -> Santa 
    }
}