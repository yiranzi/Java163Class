package application;

import java.util.Scanner;

public class NoteBookUser {
	static Scanner sIn = new Scanner(System.in);
	static String sGetString;
	static Mynotebook mNote = new Mynotebook();
	//欢迎文字
	public static void Welcome()
	{
		System.out.println("welcome my notebook");
	}
	//返回当前条目编号
	public static int GetNumber()
	{
		return mNote.GetNowNumber();
	}
	
	//输入
	public static void WantEnter()
	{
			System.out.println("条目为" + GetNumber() + "请输入");
			sGetString = sIn.nextLine();
			mNote.add(sGetString);
	}
	
	//查找
	public static void WantSearch()
	{
		System.out.println("从编号及开始 到编号几结束");
		int iFrom = sIn.nextInt();
		int iTo = sIn.nextInt();
		for(int i = iFrom;i<=iTo;i++)
		{
			String sReturn = mNote.Output(i);
			System.out.println("第" + i +"条记录是" + sReturn);
			
		}
		sGetString = sIn.nextLine();
	}
	
	//删除
	public static void WantDelete()
	{
		System.out.println("请输入要删除的内容");
		int iInput = sIn.nextInt();
		sGetString = sIn.nextLine();	
		System.out.println("你要删除条目" + iInput +"他的内容是" + mNote.Output(iInput));

		System.out.println("确认按y");
		
		sGetString = sIn.nextLine();
		if(sGetString.equals("y"))
		{
		
			System.out.println("已经删除" + iInput +"他的内容是" + mNote.Output(iInput));
			mNote.Delete(iInput);
		}
		else
		{
			System.out.println("没有删除");
		}
	}
	public static void Command()
	{
		String sSave = "";
		Welcome();
		OUT:
		while(true)
		{
			System.out.println("输入指令:e s d q");
			sGetString = sIn.nextLine();
			if(sGetString.equals(""))
			{
				sGetString = sSave;
			}			
	
			switch(sGetString) 
			{
				case "e":
					WantEnter();
					sSave = "e";
					break;
				case "s":
					WantSearch();
					sSave = "s";
					break;
				case "d":
					WantDelete();
					sSave = "d";
					break;
				case "q":
					System.out.println("Good Bye");
					break OUT;
				default:
					System.out.println("No such command");
					
					
			}
			
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//用户看到的应用程序
		//NoteBookUser sun = new NoteBookUser();
		Command();
	}
	
	

}
