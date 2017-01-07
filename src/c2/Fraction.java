package c2;
//开始1-7  
//11点到11点15构思 
//11点15
import java.util.Scanner;
class MyMath{
	
	int[] GongYueShu(int input){
		int[] array = new int[input];
		int count = 0;
		for(int i=2;i<input;i++)
		{
			if(input%i == 0)
			{
				array[count] = i;
				count++;
			}
		}
		array = new int[count];
		return array;
	}
}

class Fraction {
	private int iFenzi;
	private int iFenmu;
	MyMath fmath;
	int[] farray;
	String sAnswer = "";
	private Fraction fFraction = new Fraction();
	Fraction(){
		iFenzi = 1;
		iFenmu = 1;
	}
	Fraction(int a,int b){
		iFenzi = a;
		iFenmu = b;
	}
	
	double toDouble(){
		Double dAnswer = 1.0;
		dAnswer = dAnswer * iFenzi/iFenmu;
		return dAnswer;
	}
	
	Fraction plus(Fraction r){
		fFraction.iFenmu = r.iFenmu * iFenmu;
		fFraction.iFenzi = r.iFenzi * iFenmu + r.iFenmu * iFenzi;
		return makeSimple();
				
	}
	
	Fraction multiply(Fraction r){
		fFraction.iFenmu = r.iFenmu * iFenmu;
		fFraction.iFenzi = r.iFenzi * iFenzi;
		return makeSimple();
	}
	
	Fraction makeSimple(){
		int lessNumber = iFenzi;
		int moreNumber = iFenmu;
		if(iFenzi == iFenmu)
		{
			iFenzi = iFenmu = 1;
		}
		else if(iFenzi > iFenmu)
		{
			lessNumber = iFenmu;
			moreNumber = iFenzi;
		}
		farray = fmath.GongYueShu(lessNumber);
		if (farray.length!=0)
		{
			for(int i=farray.length-1;i>=0;i--)
			{
				if(moreNumber%farray[i] == 0)
				{
					iFenzi = iFenzi / farray[i];
					iFenmu = iFenmu / farray[i];
					break;
				}
			}
		}
		return this;
	}
	void print(){
		if(iFenzi == iFenmu)sAnswer = "1";
		else sAnswer = iFenzi + "/" + iFenmu;
		System.out.println(sAnswer);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Fraction test = new Fraction(1, 3);
		Fraction a = new Fraction(in.nextInt(), in.nextInt());
		Fraction b = new Fraction(in.nextInt(),in.nextInt());
		a.print();
		b.print();
		a.plus(b).print();
		a.multiply(b).plus(new Fraction(5,6)).print();
		a.print();
		b.print();
		in.close();
	}

}
