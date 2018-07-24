package testes2;

public class Testes2 {

    public static void main(String[] args) {
        test();
    }

    static void test() {
        String a = "1234567890";
        int b;
        
        b = Integer.parseInt(a);
        
        a = Integer.toString(b);
       
        System.out.println(a.getClass().getName());
        
    }

}
