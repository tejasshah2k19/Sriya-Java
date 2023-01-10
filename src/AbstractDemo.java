public class AbstractDemo {
    
    public static void main(String[] args) {
        
    }
}

abstract class Shape{ //you can not creat instance of it 
    int area; 
    Shape(){    
        this.area = 0;
    }
    abstract void findArea(); //method having no defination - no body - only declaration 
    abstract public void dummy();
    //non abstract method 
    void print(){

    }
    static void abc(){

    }
}

abstract class AA{

}


class Circle extends Shape{ 
    //print()
    int area ;
    void findArea(){
        System.out.println("Circle::findArea()");
        super.area = 9;
    } 
    public void dummy(){

    }
    
}
class Square extends Shape{
    void findArea(){
        this.area = 10;
    }
    
    public void dummy() {
        
    }
}


//A : add()
//B : A , sub()
//C : B , mul ()
//D : C [ add sub mul ]





