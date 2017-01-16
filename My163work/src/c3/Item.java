package c3;

public class Item {
	private int iNumber;//标号
	private boolean favorite;//最喜欢的
	static int iCount=0;
	int iCountNumber;
	
	public void print()
	{
		System.out.println(this.toString() + "输入顺序是"+ iCountNumber + "文件编号是"+iNumber);
	}
	
	public Item(int iNumber,boolean bFavorite)
	{
		iCount ++;
		iCountNumber = iCount;
		favorite = bFavorite ;
		this.iNumber = iNumber;
	}
	
//	public Item()
//	{
//		
//	}
}
