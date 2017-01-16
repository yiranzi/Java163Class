package c3;

import java.util.ArrayList;

public class Database {
	ArrayList<Item> listItem = new ArrayList<Item>();
	//添加
	public void add(Item i)
	{
		listItem.add(i);
	}
	
	public void print()
	{
		for(Item items:listItem)
		{
			items.print();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database();
		CD c1 = new CD(11,true,"sun",10);
		CD c2 = new CD(22,false,"sun",10);
		DVD d1 = new DVD(33,false,"yuchen",60);
		db.add(c1);
		db.add(c2);
		db.add(d1);
		MP3 m1 =new MP3(717,true,"s&y",2016);
		db.add(m1);
		db.print();
	}

}
