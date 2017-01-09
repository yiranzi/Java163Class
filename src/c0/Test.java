package c0;

import c2.Clock;
import c2.Fraction;
import c2.Main;

class Myclass{
	int FriendInt = 111;
	private int privateInt = 222; 
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myclass test = new Myclass();
		Clock testWai = new Clock();
		Fraction testWai1 = new Fraction(1,1); 
		Main testWai3 =new Main();
		testWai.tick();
		System.out.println(testWai);
	}

}
