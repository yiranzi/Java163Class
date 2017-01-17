package jicheng.meitiku;

import java.util.ArrayList;

public class Database {
	//声明的一个容器 装普通敌人
	//ArrayList<Enemy> a_enemy= new ArrayList<Enemy>();
	//ArrayList<Building>list_building = new ArrayList<Building>();
	ArrayList<Unit> listUnit = new ArrayList<Unit>();
	static String sStringToNumber[];
	
	//添加一个敌人单位 返回添加的位置
	public void Add(Unit unit)
	{
		listUnit.add(unit);
		GetArray();
	}
	
	
	//返回容器长度
	public int GetSize()
	{
		return listUnit.size();
	}
	
	//打印敌人属性
	public Unit Get(String name)
	{
		return listUnit.get(Name(name));
	}
	
	//删除一个敌人
	public Unit Delete(String name)
	{	
		Unit e = listUnit.remove(Name(name));
		GetArray();
		return e;
	}
	
	//替换一个敌人
	public void Replace(String name,Unit unit2)
	{
		int index = Name(name);
		listUnit.remove(index);
		listUnit.add(index, unit2);
		GetArray();
		
	}
	//打印所有的单位
	public void Print(Unit unit)
	{
//		int id = Name(unit.name);
//		String name = unit.name;
//		int hp =unit.hp;
//		System.out.println(
//				"编号:" + id +
//				"名称是:" + name +
//				"血量是:" + hp
//				);
	}
	
	//列出所有的单位
	public void List()
	{
//		System.out.println("____________");
//		Unit unit[] = new Unit[this.GetSize()];
//		listUnit.toArray(unit);
//		for(Unit e:unit)
//		{
//			Print(e);
//		}
	}
	
	//列出所有的单位
	public void List2()
	{
		System.out.println("____________");
		for(Unit e:listUnit)
		{
			e.Print();
		}
	}
		
	//添加新元素
	public int Name(String name)
	{
		for(int i=0;i<sStringToNumber.length;i++)
		{
			if(sStringToNumber[i].equals(name))
			{
				return i;
			}
		}
		System.out.println("not found error");
		return -1;
	}
	
	//返回一个键(存储序号)值(名称)对数组
	public void GetArray()
	{
		sStringToNumber = new String[listUnit.size()];
		for (int i=0;i<sStringToNumber.length;i++)
		{
			sStringToNumber[i] = listUnit.get(i).GetName();
		}
	}
	
	
	public static void main(String[] args){
		Database db = new Database();
		//
		String name;
		int id;
		int hp;
		int speed;
		int attack;	
		Unit unit_0;

		db.Add(new Enemy(11,"marine1",50,10,5));
		db.Add(new Enemy(12,"marine2",50,10,5));
		db.Add(new Enemy(13,"marine3",50,10,5));
		db.Add(new Building(100,"MyBase1",10,10));
		db.Add(new Building(200,"MyBase2",20,20));
		db.Add(new Building(300,"MyBase3",30,30));
		Enemy be = new BossEnemy(101,"marineBoss",50,10,5,10);
		
		db.Add(be);
		be.MakeSkill();

		db.Delete("marine2");
		db.Replace("MyBase2",new Building(300,"MyBase3",30,30));
		db.List2();
	}
}


