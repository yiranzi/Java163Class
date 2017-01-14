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
		int id = Name(unit.name);
		String name = unit.name;
		int hp =unit.hp;
		System.out.println(
				"编号:" + id +
				"名称是:" + name +
				"血量是:" + hp
				);
	}
	
	//列出所有的单位
	public void List()
	{
		System.out.println("____________");
		Unit unit[] = new Unit[this.GetSize()];
		listUnit.toArray(unit);
		for(Unit e:unit)
		{
			Print(e);
		}
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
			sStringToNumber[i] = listUnit.get(i).name;
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
		//
		//初始化 数值+new+add
		name = "marine";
		id =11;
		hp =50;
		speed =10;
		attack = 5;
		unit_0 = new Enemy(id,name,hp,speed,attack);
		db.Add(unit_0);
		//
		name = "marine_super";
		id = 22;
		hp =500;
		speed =15;
		attack = 50;
		unit_0 = new Enemy(id,name,hp,speed,attack);
		db.Add(unit_0);
		//
		
		//
		name = "bing3";
		id =33;
		hp =3;
		speed =3;
		attack = 3;
		unit_0 = new Enemy(id,name,hp,speed,attack);
		db.Add(unit_0);
		//
		
		//
		name = "bing4";
		id =44;
		hp =3;
		speed =3;
		attack = 3;
		unit_0 = new Enemy(id,name,hp,speed,attack);
		db.Add(unit_0);
		//
		//
		name = "bing5";
		id =55;
		hp =3;
		speed =3;
		attack = 3;
		unit_0 = new Enemy(id,name,hp,speed,attack);
		db.Add(unit_0);
		//
		int defence;
		name = "bingying";
		id =101;
		hp =3;
		defence = 3;
		unit_0 = new Building(id,name,hp,defence);
		db.Add(unit_0);
		//
		name = "bingying2";
		id =102;
		hp =3;
		defence = 3;
		unit_0 = new Building(id,name,hp,defence);
		db.Add(unit_0);
		//
		db.List();
		db.Delete("bing3");
		db.Replace("bing4", unit_0);
		db.List2();
	}
}


