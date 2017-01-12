package application;

import java.util.Scanner;

import datastruct.Link;

public class Mynotebook {
	//接口设计
	//封装顺序为 其他的包 继承 自己的包 自己
	//这个类是一个公开的类.可以在别的包里面进行构造
	Link link;
	String sAnswer;
	private int iNow;//储存当前的位置(最大条目数)
	public Mynotebook()
	{
		link = new Link();
		sAnswer = "";
		iNow = 0;
	}
	
	//返回当前编号的接口
	public int GetNowNumber()
	{
		return iNow;
	}
	
	//保存用户输入的接口
	public boolean EnterData(String sInput)
	{
		int iInput = Integer.parseInt(sInput);
		link.AddTail(iInput);
		iNow++;
		return true;
	}
	
	public boolean IsUse(int iInput)
	{
		int iLength = GetLength();
		if(iInput > iLength)
		{
			return false;
		}
		else return true;
	}
	
	
	//返回用户存储内容的接口。传入编号.判断有效性 .返回字符串
	public String Output(int iInput)
	{
		if(IsUse(iInput))
		{
			sAnswer = String.valueOf(link.FindPos(iInput));
		}	
		else
		{
			sAnswer = "out range";
		}
		return sAnswer;
	}
	
	//删除某一天记录的接口
	public String Delete(int iInput)
	{
		if(IsUse(iInput))
		{
			link.Delete(iInput, 0);
		}	
		else
		{
			sAnswer = "out range";
		}
		return sAnswer;
	}
	
	//是否有必要呢？如果自己管理这个inow的画
	public int GetLength()
	{
		return this.link.GetLength();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
