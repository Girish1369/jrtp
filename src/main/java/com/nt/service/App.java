package com.nt.service;

/**
 * Hello world!
 *
 */
public class App 
{
	public int add(int a,int b) {
		return a+b;
	}
    public static void main( String[] args )
    {
        App app=new App();
        app.add(20, 30);
        System.out.println("Sum is::"+app.add(20, 30));
    }
}
