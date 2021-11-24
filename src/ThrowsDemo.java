public class ThrowsDemo {
    static void throwone() throws IllegalAccessError{
        System.out.println("Inside throwOne.");
        throw new IllegalAccessError("demo");
    }

    public static void main(String[] args) {
        try{
            throwone();
        }catch(IllegalAccessError obj){
            System.out.println("Cught"+obj);
        }
    }
}
