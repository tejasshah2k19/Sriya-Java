import javax.print.Doc;

class InstanceOf{
    public static void main(String[] args) {
        Person p = new Person();
        Doctor d = new Doctor(); 
        Advocate a = new Advocate(); 
    
        //how to check an object is belongs to which class? 
        //instanceof operator 

        System.out.println(p instanceof Person); //true 
        System.out.println(d instanceof Person);//true 
        System.out.println(d instanceof Doctor);//true 
        // System.out.println(a instanceof Doctor);//error 
        System.out.println(null instanceof String);

        if ( 5 > 7 & 7 > 9 ){

        }

        if ( 5 > 7 && 7 > 9 ){
            
        }
    }

}


class Person{

}
class Doctor extends Person{

}
class Advocate extends Person{

}