package datastruct;

public class Link {
	Node nHead;
	Node nTail;
	int iLength;
	boolean bInit;
	//链表类是给人随便用的
	public Link()
	{
		nTail = new Node();
		nHead = new Node();
		iLength = 0;
		bInit = false;
	}
	
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
	
	//这个链表
	public void AddHead(int iData)
	{
		//nHead = 
	}
	
	public int Find(int iNumber)
	{
		return 0;
		//nHead.
	}
	
	public void LinkPrint()
	{
		Node nNow = nHead.nNext;
		while(nNow!=null)
		{
			System.out.println(nNow.iData);
			nNow = nNow.nNext;
		}
		
	}
	
	public boolean Delete(int iCount)
	{
		int iType = 1;
		if(iCount>iLength)
		{
			return false;
		}
		else if(iCount == iLength)
		{
			iType = 2;
		}
		else if(iCount == 1)
		{
			iType = 0;
		}
		switch(iType)
		{
			case 0:
				//nHead.nNext = 
				
			case 1:
				
		}

	}
	
	public Node FindPos( int iPos)
	{
		if(iPos>iLength)
		{
			return null;
		}
		Node nNow = nHead.nNext;
		int iCount = 1;
		while(true)
		{
			System.out.println(nNow.iData);
			if(nNow.nNext==null)return nNow;
			nNow = nNow.nNext;
			iCount ++;
		}
		

	}
	
	public void clear()
	{
		
	}
	
	public int GetLength()
	{
		return iLength;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link link1 = new Link();
		//link1.AddHead(10);//我想添加一个节点
		link1.AddTail(20);
		link1.AddTail(30);
		link1.AddTail(40);
		//link1.Find(10);
		//link1.Delete(10);
		link1.LinkPrint();
		System.out.println(link1.GetLength());
		Link link2 = new Link();
		//link1.AddHead(10);//我想添加一个节点
		link2.AddTail(-20);
		link2.AddTail(-30);
		link2.AddTail(-40);
		//link1.Find(10);
		//link1.Delete(10);
		link2.LinkPrint();
		System.out.println(link2.GetLength());
	}
}

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
