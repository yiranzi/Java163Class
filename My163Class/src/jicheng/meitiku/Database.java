package jicheng.meitiku;

import java.util.ArrayList;

public class Database {
	//声明的一个容器 装普通敌人
	ArrayList<Enemy> a_enemy= new ArrayList<Enemy>();
	ArrayList<Building>list_building = new ArrayList<Building>();
	static String sStringToNumber[];
	
	//添加一个敌人单位 返回添加的位置
	public void Add(Enemy enemy)
	{
		a_enemy.add(enemy);
		GetArray();
	}
	
	//添加一个敌人单位 返回添加的位置
	public void Add(Building building)
	{
		list_building.add(building);
		GetArray();
	}
	
	//返回容器长度
	public int GetSize()
	{
		return a_enemy.size();
	}
	
	//打印敌人属性
	public Enemy Get(String name)
	{
		return a_enemy.get(Name(name));
	}
	
	//删除一个敌人
	public Enemy Delete(String name)
	{	
		Enemy e = a_enemy.remove(Name(name));
		GetArray();
		return e;
	}
	
	//替换一个敌人
	public void Replace(String name,Enemy enemy2)
	{
		int index = Name(name);
		a_enemy.remove(index);
		a_enemy.add(index, enemy2);
		GetArray();
		
	}
	//打印所有的单位
	public void Print(Enemy enemy)
	{
		int id = Name(enemy.name);
		String enemyname = enemy.name;
		int hp =enemy.hp;
		int speed =enemy.speed;
		int attack = enemy.attack;
		System.out.println(
				"编号:" + id +
				"兵种名称是:" + enemyname +
				"血量是:" + hp +
				"移动速度是:" + speed +
				"攻击力是:" + attack
				);
	}
	
	//列出所有的单位
	public void List()
	{
		System.out.println("____________");
		Enemy enemy[] = new Enemy[this.GetSize()];
		a_enemy.toArray(enemy);
		for(Enemy e:enemy)
		{
			Print(e);

		}

	}
	
	//列出所有的单位
	public void List2()
	{
		System.out.println("____________");
		for(Enemy e:a_enemy)
		{
			e.Print();
		}
		
		for(Building b:list_building)
		{
			b.Print();
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
		sStringToNumber = new String[a_enemy.size()];
		for (int i=0;i<sStringToNumber.length;i++)
		{
			sStringToNumber[i] = a_enemy.get(i).name;
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
		Enemy enemy_0;
		//
		//初始化 数值+new+add
		name = "marine";
		id =1;
		hp =50;
		speed =10;
		attack = 5;
		enemy_0 = new Enemy(id,name,hp,speed,attack);
		db.Add(enemy_0);
		//
		name = "marine_super";
		id = 2;
		hp =500;
		speed =15;
		attack = 50;
		enemy_0 = new Enemy(id,name,hp,speed,attack);
		db.Add(enemy_0);
		//
		
		//
		name = "bing3";
		id =3;
		hp =3;
		speed =3;
		attack = 3;
		enemy_0 = new Enemy(id,name,hp,speed,attack);
		db.Add(enemy_0);
		//
		
		//
		name = "bing4";
		id =4;
		hp =3;
		speed =3;
		attack = 3;
		enemy_0 = new Enemy(id,name,hp,speed,attack);
		db.Add(enemy_0);
		//
		//
		name = "bing5";
		id =5;
		hp =3;
		speed =3;
		attack = 3;
		enemy_0 = new Enemy(id,name,hp,speed,attack);
		//
		Building building_0;
		int defence;
		name = "bingying";
		id =1;
		hp =3;
		defence = 3;
		building_0 = new Building(id,name,hp,defence);
		db.Add(building_0);
		//
		name = "bingying2";
		id =10;
		hp =3;
		defence = 3;
		building_0 = new Building(id,name,hp,defence);
		db.Add(building_0);
		//
		db.List();
		db.Delete("bing3");
		db.Replace("bing4", enemy_0);
		db.List2();
	}
}


