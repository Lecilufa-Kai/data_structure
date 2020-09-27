package stringTest;

public class StringFeature {

    public static void main(String[] args) throws InterruptedException {

        String a= "b"+"c";

        String c = "bc";

        String d = String.valueOf("bc");

        String f  = new String("bc");

        Thread.sleep(2000000L);

        System.out.println(a == c); //true
        System.out.println(a == d); //true
        System.out.println(c == d); //true
        System.out.println(a == f); //false
    }

}
