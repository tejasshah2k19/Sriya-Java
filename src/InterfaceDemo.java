public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println(FED.ROI);
        System.out.println(City.ROI);
    }
}

// pure abstract class
// abstract interface FED {}
// bydefault all the methods are abstract and public
interface FED {
    public static final float ROI=2.5f;

    public void dep();
    void wid();
    abstract void checkBal();

    // void add(){
    // compilation fail
    // }
}

interface GIC extends FED {
    void accidentPolicy();
}

class City implements FED {
    public void dep() {

    }

    public void wid() {

    }

    public void checkBal() {

    }
}

class Prudunt implements GIC {
    public void dep() {
    }

    public void checkBal() {
    }

    public void wid() {
    }

    public void accidentPolicy() {

    }
}
