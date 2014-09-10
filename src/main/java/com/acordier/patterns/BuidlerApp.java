package com.acordier.patterns;

/**
 * Hello world!
 *
 */
public class BuidlerApp 
{
    public static void main( String[] args )
    {
       	Service service = new Service.ServiceBuilder("message service").setDesc("this service is used to send message").build();
       	System.out.println(service);
    }
}
