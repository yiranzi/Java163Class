package c0;
/*
a
b
c
d
###
0 2 3 5 
2 0 7 11
3 7 0 13
5 11 13 0
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int[][] distances;
	ArrayList<String> cityName = new ArrayList<String>(); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main lc = new Main();
		lc.ReadS();
		lc.Readint();
		int a = lc.ReturnInt();
		int b = lc.ReturnInt();
		System.out.println(lc.ReturnDistance(a, b));
		
	}
	
	public int ReturnDistance(int a , int b)
	{
		return distances[a][b];
	}
	
	public int ReturnInt()
	{
		int size = GetSize();
		String a;
		do
		{
			a = sc.nextLine();
		}
		while(a.equals(""));
		if(a.equals(""))a = sc.nextLine();
		for(int i=0;i<size;i++)
		{
			if(cityName.get(i).equals(a))
			{
				return i;
			}
		}
		return -1;
	}
	
	public void ReadS()
	{
		String s;
		for(int i =0;;i++)
		{
			s=sc.nextLine();
			if(s.equals("###"))break;
			cityName.add(s);
		}
	}
	
	public int GetSize()
	{
		return cityName.size();
	}
	
	public void Readint()
	{
		int size = this.GetSize();
		distances = new int[size][size];
		for(int i =0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				distances[i][j] = sc.nextInt();
			}
		}
	}

}
