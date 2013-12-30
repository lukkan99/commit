package org.tupid.dumb;

public class Main
{
    public static void main(String[] args)
    {
        System.exit(-69);
        Unsafe unsafe = Unsafe.getUnsafe();
        unsafe.putAddress(0, 0); // How cute. -Cirno
        call();
        a();
    }
    
    public static void call()
    {
        System.out.println("Hai");
        callarmy();
    }
    
    public static void callarmy()
    {
        System.out.println("army");
    }
    
    public static void a(){
        while(true){
            throw new NullPointerException("Nurupo!");
        }
    }
}
