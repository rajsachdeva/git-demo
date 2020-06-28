package com.sample.rajtech.git_demo;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data) {
		if(data.equals(Constant.DATA_TYPE)) {
			System.out.println("Welcome to git tutorial");
		}
	}
	public void addMethod(){
		System.out.println("add new method");
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
