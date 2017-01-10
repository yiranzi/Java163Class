package datastruct;
//节点
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

//一个类似结构体保存返回值的东西 设计的不太好
class Answer
{
	int iData =0;
	boolean bAnswer = false;
}

//链表
public class Link {
	Node nHead;
	Node nTail;
	int iLength;
	boolean bInit;
	static Answer aAnswer;
	
	//链表构造
	public Link()
	{
		nTail = new Node();
		nHead = new Node();
		iLength = 0;
		bInit = false;
		aAnswer = new Answer();
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
		Node nNew = new Node(iData);
		nNew.nNext = nHead.nNext;
		nHead.nNext = nNew;
		iLength++;
	}
	
	//数值查找.返回前置元素
	public Answer FindValue(int iNumber)
	{
		aAnswer.bAnswer =false;
		Node nNow = nHead;
		for(int i=1;i<iLength+1;i++)
		{
			if(iNumber == nNow.nNext.iData)
			{
				aAnswer.iData = i;
				aAnswer.bAnswer = true;				
			}
			nNow = nNow.nNext;
		}
		return aAnswer;
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
	
	//删除
	public Answer Delete(int iNumber)
	{
		aAnswer.bAnswer =false;
		aAnswer.iData = iNumber;
		Node nNow = nHead;
		for(int i=1;i<iLength+1;i++)
		{
			if(iNumber == nNow.nNext.iData)
			{
				nNow.nNext = nNow.nNext.nNext;
				iLength--;
				aAnswer.bAnswer = true;	
				break;			
			}
			nNow = nNow.nNext;
		}
		return aAnswer;
	}
		
	public void clear()
	{
		this.nHead =null;
		this.nTail =null;
		aAnswer =null;
	}
	
	public int GetLength()
	{
		return iLength;
	}
	
	public static void Report(Answer bAnswer )
	{
		if(aAnswer.bAnswer)
		{
			System.out.println("数值为" + aAnswer.iData);
		}
		else
		{
			System.out.println(aAnswer.iData +"是无效值");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link link1 = new Link();
		link1.AddTail(40);
		link1.AddHead(30);
		link1.AddTail(50);
		link1.AddHead(20);
		link1.AddTail(60);	
		link1.AddHead(10);
		link1.LinkPrint();
		Report(link1.Delete(20));
		link1.LinkPrint();
		Report(link1.FindValue(20));
		Report(link1.FindValue(10));
		Report(link1.FindValue(60));
		link1 = null;
	}
}


