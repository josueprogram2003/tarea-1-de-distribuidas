package Tarea;

public class Cubos extends Thread{
	int[] num = new int[]{ 2,7,5,4,9,3,6,8,1 }; 
	int sum = 0;
	
	@Override
	public void run() {
	for (int i = 0; i < num.length; i++) {
		sum = sum + (int)Math.pow(num[i], 3);
		System.out.println((int)Math.pow(num[i], 3));
	}
	System.out.println("La suma total de cubos es : " + sum);
	}
	
	
}
