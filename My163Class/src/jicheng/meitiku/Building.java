package jicheng.meitiku;

public class Building extends Unit {
	
	int defence = 100;
	public Building(int id,String name, int hp, int defence) {
		//super(id,name,hp);
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
