package com.example.roomtest;

public class Singleton {
    public static volatile Singleton instance;
    public static  Singleton getInstance()
    {
        if(instance!=null)
        {
            synchronized (Singleton.class)
            {
                if(instance!=null)
                {
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
