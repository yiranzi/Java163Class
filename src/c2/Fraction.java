package c2;
//开始1-7  
//11点到11点15构思 
//11点15到1点41
//主要遇到的问题包括
//不记得了
import java.util.Scanner;
class MyMath{
	
	int[] GongYueShu(int input){
		int[] array = new int[input];
		int count = 0;
		for(int i=2;i<=input;i++)
		{
			if(input%i == 0)
			{
				array[count] = i;
				count++;
			}
		}
		//if(count != 0)array = new int[count];
		//else array =null;
		//折腾半天还是没办法有效缩减这个数组的长度.
		return array;
	}
}

class Fraction {
	private int iFenzi;
	private int iFenmu;
	MyMath fmath = new MyMath();
	int[] farray;
	String sAnswer = "";
	

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
		Fraction fFraction = new Fraction(1,1);
		fFraction.iFenmu = r.iFenmu * iFenmu;
		fFraction.iFenzi = r.iFenzi * iFenmu + r.iFenmu * iFenzi;
		return fFraction.makeSimple();//如果没有加名字的话,你看看前面两行为啥加了
				
	}
	
	Fraction multiply(Fraction r){
		Fraction fFraction = new Fraction(1,1);
		fFraction.iFenmu = r.iFenmu * iFenmu;
		fFraction.iFenzi = r.iFenzi * iFenzi;
		return fFraction.makeSimple();
	}
	
	Fraction makeSimple(){
		int lessNumber = iFenzi;
		int moreNumber = iFenmu;

		if(iFenzi > iFenmu)
		{
			lessNumber = iFenmu;
			moreNumber = iFenzi;
		}
		if(iFenzi == iFenmu)
		{
			iFenzi = iFenmu = 1;
		}
		else
		{
			farray = fmath.GongYueShu(lessNumber);
			if (farray !=null && farray.length!=0)
			{
				for(int i=farray.length-1;i>=0;i--)
				{
					if(farray[i] !=0 && moreNumber%farray[i] == 0)//这边考虑不到位
					{
						iFenzi = iFenzi / farray[i];
						iFenmu = iFenmu / farray[i];
						break;
					}
				}
			}
		}	
		return this;
	}
	void print(){
		makeSimple();
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
