package jicheng.meitiku;

public class Unit {
	private int id;
	private String name;
	private int hp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Unit(int id,String name,int hp)
	{
		this.id = id;
		this.name = name;
		this.hp = hp;
	}
	
	
	public void Print()
	{
		System.out.println(
				"编号:" + id +
				"名称是:" + name +
				"血量是:" + hp);
	}
	
	public String GetName()
	{
		return this.name;
	}

}
