public class FinalDemo {

    static final int MAX_SALARY = 100; // capital
    final int CODE;

    FinalDemo() {
        this.CODE = 123;// 10000 20000 30000
    }

    void changeA() {
        // MAX_SALARY=500; //compilation error
        final int LOCAL_MAX = 900;
    }

    public static void main(String[] args) {

    }
}

class Gems {
    final int k = 1;

    // it can not override
    final void sweet() {

    }
}

final class Panda extends Gems {
    void print() {
        System.out.println(super.k);
    }
    // void sweet(){
    // compilation error
    // }
}

// no one can inherit
// class GemsPanda extends Panda{

// }