package jicheng.meitiku;

public class Building extends Unit {
	
	int defence = 100;
	public Building(int id,String name, int hp, int defence) {
		super(id,name,hp);
		this.defence = defence;
	}
	
	public void Print() {
		// TODO Auto-generated method stub
		super.Print();
		System.out.println(
				"防御力是:" + defence
				);
	}
}
