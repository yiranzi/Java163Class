package jicheng.meitiku;

public class Enemy extends Unit{
	
	int speed;
	int attack;

	public Enemy(int id,String name, int hp, int speed, int attack) {
		super(id,name,hp);
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
		super.Print();
		System.out.println(
				"移动速度是:" + speed +
				"攻击力是:" + attack
				);
	}

	public void MakeSkill() {
		// TODO Auto-generated method stub
		
	}

}
