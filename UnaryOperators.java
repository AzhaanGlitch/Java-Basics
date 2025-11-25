class UnaryOperators {
    public static void main(String[] args) {
        
        int a = 10;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        int b = 10;
        int c = 10;
        System.out.println(b++ + ++b);
        System.out.println(c++ + c++);
        
        boolean d = true;
        boolean e = false;

        System.out.println(!d);
        System.out.println(!e);
    }
}