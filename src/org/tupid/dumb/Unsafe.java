package org.tupid.dumb;

public class Unsafe
{
    private static final Unsafe INSTANCE = new Unsafe();
    
    public Unsafe()
    {
    }
    
    public static Unsafe getUnsafe()
    {
        return Unsafe.INSTANCE;
    }
}
