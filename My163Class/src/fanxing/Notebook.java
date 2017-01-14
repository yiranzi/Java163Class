package fanxing;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
	//接口设计
	//封装顺序为 其他的包 继承 自己的包 自己
	//这个类是一个公开的类.可以在别的包里面进行构造
	ArrayList<String> list =new ArrayList<String>();
	public Notebook()
	{
		
	}
	
	//用户输入
	public void add(String s)
	{
		list.add(s);
	}
	
	public void add(int location,String s)
	{
		list.add(location, s);
	}
	
	public int getsize()
	{
		return list.size();
	}
	
	public String get(int number)
	{
		return list.get(number);			
	}
	
	//打印
	public String[] list()
	{
		String s[] = new String[this.getsize()];
//		for(int i=0;i<s.length;i++)
//		{
//			s[i] = list.get(i);
//		}
		list.toArray(s);
		for(String st:s)
		{
			System.out.println(st);
		}
		return s;
	}
	
	//删除某一天记录
	public String delete(int number)
	{
		return list.remove(number);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Notebook note = new Notebook();
	}
	

}
