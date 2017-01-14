package jicheng.meitiku;

public class Building {
	int id;
	String name;
	int hp;
	int defence;
	int number;//编号
	public Building(int id,String name, int hp, int defence) {
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.defence = defence;
	}
	
	public void Print() {
		// TODO Auto-generated method stub
		System.out.println(
				"编号:" + id +
				"建筑名称是:" + name +
				"血量是:" + hp +
				"防御力是:" + defence
				);
	}
}
