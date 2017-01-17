package jicheng.meitiku;

public class BossEnemy extends Enemy {
	private double skillDamage;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public BossEnemy(int id, String name, int hp, int speed, int attack, double skillDamage) {
		super(id, name, hp, speed, attack);
		this.skillDamage = skillDamage;
	}
	
	public void MakeSkill()
	{
		System.out.println("造成" + skillDamage);
	}
	

}
