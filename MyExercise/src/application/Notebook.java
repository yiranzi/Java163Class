package application;
	
public class Notebook {
	//接口设计
	//封装顺序为 其他的包 继承 自己的包 自己
	//这个类是一个公开的类.可以在别的包里面进行构造
	public Notebook()
	{
		
	}
	
	//用户输入
	public boolean EnterData(String sInput)
	{
		return false;
	}
	
	//打印
	public String Output(int iFrom,int iTo)
	{
		return "123";
	}
	
	//删除某一天记录
	public boolean Delete(int number)
	{
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
