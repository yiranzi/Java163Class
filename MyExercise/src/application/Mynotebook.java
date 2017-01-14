package application;

import datastruct.Link;

public class Mynotebook {
	//接口设计
	//封装顺序为 其他的包 继承 自己的包 自己
	//这个类是一个公开的类.可以在别的包里面进行构造
	Link link;
	public Mynotebook()
	{
		link = new Link();
	}
	
	//保存用户输入的接口
	public boolean add(String s)
	{
		int iInput = Integer.parseInt(s);
		link.AddTail(iInput);
		return true;
	}
	
	//直接取上面的就好了
	public int getSize()
	{
		return this.link.GetLength();
	}
	
	//返回用户存储内容的接口。传入编号.判断有效性 .返回字符串
	public String getNote(int index)
	{
		return String.valueOf(link.FindPos(index));
//		String sAnswer;
//		if(IsUse(index))
//		{
//			sAnswer = String.valueOf(link.FindPos(index));
//		}	
//		else
//		{
//			sAnswer = "out range";
//		}
//		return sAnswer;
	}
	
	public String[] list() {
		// TODO Auto-generated method stub
		String aAnswer[] = new String[link.GetLength()];
		for(int i=0;i<aAnswer.length;i++)
		{
			aAnswer[i] = link.FindPos(i+1);
		}
		return aAnswer;
	}
	
	//删除某一天记录的接口
	public String removeNote(int iInput)
	{
		return link.Delete(iInput, 0);
//		String sAnswer;
//		if(IsUse(iInput))
//		{
//			sAnswer = link.Delete(iInput, 0);
//		}	
//		else
//		{
//			sAnswer = "out range";
//		}
//		return sAnswer;
	}
	
	//判断数据是否可用
	private boolean IsUse(int iInput)
	{
		int iLength = getSize();
		if(iInput > iLength)
		{
			return false;
		}
		else return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	

}
