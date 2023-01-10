public class EnumDemo {

    public static void main(String[] args) {
        System.out.println(Drink.SMALL.value);
        Drink.SMALL.value = 12;
        System.out.println(Drink.SMALL.value);
        Drink s;
        s = Drink.SMALL;
        System.out.println(s);
    }
}

enum Drink {
    SMALL(1), LARGE(2), XLARGE(4);

    int value;

    Drink() {
        this.value = 0;
    }

    Drink(int v) {
        this.value = v;
    }
}
