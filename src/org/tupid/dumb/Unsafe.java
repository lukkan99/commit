package org.tupid.dumb;

public class Unsafe
{
    private static final Unsafe INSTANCE = new Unsafe();
    
    public Unsafe()
    {
    }
    
    public static void putAddress(int 0, int 0)
    {
    }
    
    public static Unsafe getUnsafe()
    {
        return Unsafe.INSTANCE;
    }
}
