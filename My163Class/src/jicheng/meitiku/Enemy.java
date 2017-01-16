package jicheng.meitiku;

public class Enemy extends Unit{
	
	int speed;
	int attack;

	public Enemy(int id,String name, int hp, int speed, int attack) {
		//super(name);
		//super(id,name,hp);
		//this.id = id;
		//this.name = name;
		//this.hp = hp;
		//super(id,name,hp);
		this.speed = speed;
		this.attack = attack;
	}
//	
//	public Enemy(int attack)
//	{
//		this.attack = attack;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Enemy e = new Enemy(666,"sun",10,5,3);
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
