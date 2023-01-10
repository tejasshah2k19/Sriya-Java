package stringd;

public class StringDemo {
    
    public static void main(String[] args) {
        String s1 = "royal";
        String s2 = "royal";
        String s3 = new String("royal");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
