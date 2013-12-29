package org.tupid.dumb;

public class Main
{
    public static void main(String[] args)
    {
        Unsafe unsafe = Unsafe.getUnsafe();
        unsafe.putAddress(0, 0);
        call();
    }
    
    public static void call()
    {
        System.out.println("Hai");
    }
}
