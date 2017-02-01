import java.util.Scanner;

public class Frame {
	
	private int pinCount;
	private int firstThrow;
	private int secondThrow;
	Scanner sc = new Scanner(System.in);
	
	public Frame()
	{
		this.pinCount = 10;
		this.firstThrow = -1;
		this.secondThrow = -1;
	}
	
	public int getFirstThrow()
	{
		return firstThrow;
	}
	
	public int getSecondThrow()
	{
		return secondThrow;
	}
	
	public int getPins() {
		return pinCount; 
	}
	
	public int setFirst(){
		firstThrow = bowl();
		pinCount -= firstThrow;
		return firstThrow;
	}
	
	public int setSecond(){
		secondThrow = bowl();
		pinCount -= secondThrow;
		return secondThrow;
	}
	
	
	public String toString()
	{
		return "" + firstThrow + secondThrow;
	}
	
	public int bowl(){  // helper method for each throw
		int t;
		do{ // get input with input validation loop
			System.out.println("How many pins this throw?");
			t = sc.nextInt();
		}while(t < 0 || t > 10);
		
		return t;
	}
	
}
