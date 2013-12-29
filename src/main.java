public class main
{
    public static void main(String[] args)
    {
        Unsafe.getUnsafe().putAddress(0, 0);
        call();
    }
    
    public static void call()
    {
        System.out.println("Hai");
    }
}
