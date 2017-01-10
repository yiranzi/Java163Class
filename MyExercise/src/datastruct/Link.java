package datastruct;

//一个类似结构体保存返回值的东西 设计的不太好
class Answer
{
	int iData =0;
	boolean bAnswer = false;
	Node nSave;
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
				aAnswer.nSave = nNow;
				aAnswer.bAnswer = true;				
			}
			nNow = nNow.nNext;
		}
		return aAnswer;
	}
	//位置查找.返回前置元素
	public Answer FindPos( String sPos )
	{
		aAnswer.bAnswer =true;
		int iPos = Integer.parseInt(sPos);
		if(iPos>iLength || iPos<=0)
		{
			aAnswer.bAnswer = false;
		}
		Node nNow = nHead;
		if(aAnswer.bAnswer)
		{
			for(int i=1;i<=iPos;i++)
			{
				if(i==iPos)
				{
					aAnswer.nSave = nNow;
					aAnswer.iData = i;
				}
				nNow = nNow.nNext;
			}
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
	public boolean Delete(String sCount,int iNumber)
	{
		if(sCount != "")
		{
			int iPos = Integer.parseInt(sCount);
			{
				aAnswer.bAnswer =true;
				if(iPos>iLength || iPos<=0)
				{
					aAnswer.bAnswer = false;
				}
				Node nNow = nHead;
				if(aAnswer.bAnswer)
				{
					for(int i=1;i<=iPos;i++)
					{
						if(i==iPos)
						{
							nNow.nNext = nNow.nNext.nNext;
							iLength--;
							break;
						}
						nNow = nNow.nNext;
					}
				}
				return aAnswer.bAnswer;
			}
		}
		//如果没有sCount 自动查找number
		aAnswer.bAnswer =false;
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
		return aAnswer.bAnswer;
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
	
	public static void PrintAnswer(String sPos,int iNumber)
	{
		System.out.println("您需要位置" + sPos + "的.数值" + iNumber + 
				"的.数值的查找结果为" + aAnswer.bAnswer + "他的位置是" + aAnswer.iData
				+ "他的数值是" + aAnswer.nSave.nNext.iData);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Link link1 = new Link();
		//link1.AddHead(10);//我想添加一个节点
		int iNumber = 30;
		String sPos = "2";
		link1.AddTail(20);
		link1.AddTail(30);
		link1.AddTail(40);
		link1.AddTail(50);
		link1.AddTail(60);

		link1.FindPos(sPos);
		PrintAnswer(sPos,iNumber);
		link1.Delete(sPos,iNumber);
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
