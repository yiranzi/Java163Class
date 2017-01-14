package datastruct;

class Node{
	int iData = 0;
	Node nNext;
	
	Node(int iNumber)
	{
		iData = iNumber;
		nNext = null;
	}
	
	Node()
	{

	}
	
}

//链表
public class Link {
	Node nHead;
	Node nTail;
	int iLength;
	boolean bInit;
	
	//链表构造
	public Link()
	{
		nTail = new Node();
		nHead = new Node();
		iLength = 0;
		bInit = false;
	}
	
	//尾部添加
	public void AddTail(int iData)
	{
		if (!bInit)
		{
			nTail.nNext = new Node(iData);//将链表尾巴元素指向新的节点.
			nHead.nNext = nTail.nNext;
			bInit = true;
		}
		else
		{
			nTail.nNext.nNext = new Node(iData);
			nTail.nNext = nTail.nNext.nNext;
		}
		iLength++;
	}
	
	//头部添加
	public void AddHead(int iData)
	{
		if (!bInit)
		{
			AddTail(iData);
		}
		Node nNew = new Node(iData);
		nNew.nNext = nHead.nNext;
		nHead.nNext = nNew;
		iLength++;
	}
	
	//数值查找.返回前置元素
	public Node FindValue(int iNumber)
	{
		Node nNow = nHead;
		for(int i=1;i<iLength+1;i++)
		{
			if(iNumber == nNow.nNext.iData)
			{	
				break;
			}
			nNow = nNow.nNext;
		}
		return nNow;
	}
	//位置查找.返回前置元素
	public String FindPos( int iPos )
	{
		String sAnswer = null;
		if(iPos<=iLength && iPos>0)
		{
			Node nNow = nHead;
			for(int i=1;i<=iPos;i++)
			{
				if(i==iPos)
				{
					sAnswer = String.valueOf(nNow.nNext.iData);
					break;
				}
				nNow = nNow.nNext;
			}
		}		
		return sAnswer;
		
	}
	

	//打印
	public void LinkPrint()
	{
		Node nNow = nHead.nNext;
		while(nNow!=null)
		{
			System.out.println(nNow.iData);
			nNow = nNow.nNext;
		}
		
	}
	
	//删除 传入（字符串位置 和 所需要的内容都可以）
	public String Delete(int iCount,int iNumber)
	{
		String sAnswer = null;
		if(iCount >= 1)
		{
			{
				if(iCount<=iLength)
				{
					sAnswer = "";
				}
				Node nNow = nHead;
				if(sAnswer!=null)
				{
					for(int i=1;i<=iCount;i++)
					{
						if(i==iCount)
						{
							sAnswer = String.valueOf(nNow.nNext.iData);
							nNow.nNext = nNow.nNext.nNext;
							iLength--;
							break;
						}
						nNow = nNow.nNext;
					}
				}
				return sAnswer;
			}
		}
		//如果没有sCount 自动查找number
		Node nNow = nHead;
		for(int i=1;i<iLength+1;i++)
		{
			if(iNumber == nNow.nNext.iData)
			{
				nNow.nNext = nNow.nNext.nNext;
				iLength--;
				break;			
			}
			nNow = nNow.nNext;
		}
		return "";
	}
		
	public void clear()
	{
		this.nHead =null;
		this.nTail =null;
	}
	
	public int GetLength()
	{
		return iLength;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link link1 = new Link();
		link1.AddTail(20);
		link1.AddTail(30);
		link1.AddTail(40);
		link1.AddTail(50);
		link1.AddTail(60);	
		link1.LinkPrint();
	}
}


