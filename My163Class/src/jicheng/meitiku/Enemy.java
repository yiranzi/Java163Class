package jicheng.meitiku;

public class Enemy extends Unit{
	
	int speed;
	int attack;

	public Enemy(int id,String name, int hp, int speed, int attack) {
		this.id = id;
		this.name = name;
		this.hp = hp;
		this.speed = speed;
		this.attack = attack;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public void Print() {
		// TODO Auto-generated method stub
		System.out.println(
				"编号:" + id +
				"兵种名称是:" + name +
				"血量是:" + hp +
				"移动速度是:" + speed +
				"攻击力是:" + attack
				);
	}

}
