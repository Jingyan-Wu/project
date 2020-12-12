package xier;

import java.util.Scanner;


public class Threadtest extends Thread{
	
	 public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		 int a=sc.nextInt();
		 Threadtest thread1=new Threadtest("thread1", 1, 200000000, a);
		 Threadtest thread2=new Threadtest("Thread2", 200000000, 400000000, a);
		 Threadtest thread3=new Threadtest("Thread3", 400000000, 600000000, a);
		 Threadtest thread4=new Threadtest("Thread4", 600000000, 800000000, a);
		 Threadtest thread5=new Threadtest("Thread5", 800000000, 1000000000, a);
		 thread1.start();
		 thread2.start();
		 thread3.start();
		 thread4.start();
		 thread5.start();
		 while(true) {
             if((thread1.isAlive()||thread2.isAlive()||thread3.isAlive()||thread4.isAlive())==false) {
            	 long sum=thread1.s+thread2.s+thread3.s+thread4.s+thread5.s;
                 System.out.println(sum); 
                 break; 
             }
		 }
	 }
	 
    String name;
	long start, end;
	long s;
	static int a;
		
	public Threadtest(String name, long start, long end, int a) {
	    this.name = name;
	    this.start = start;
	    this.end = end;
	    Threadtest.a = a;
	}
		
	public void run() { 
	       for (long i = start; i < end; i++) { 
	           if (contain(i, a)) s = s + i; 
	       }
	}
		
	private boolean contain(long num, int a) { 
	    return String.valueOf(num).contains(String.valueOf(a)); 
	}
	
	
}