package c2;

import java.util.Scanner;
//这是一个时钟类.我希望这个工程的人都可以使用它(用来珍惜时间 22333)
//所以他是public类 意味着 别的包可以new出来
public class Clock {
	WorkDisplay second;
	WorkDisplay minute;
	WorkDisplay hour;
	
	//当然也需要访问构造函数了
	 Clock(int hour, int minute, int second)
	{
		this.second = new WorkDisplay(0,59,second);
		this.minute = new WorkDisplay(0,59,minute);
		this.hour = new WorkDisplay(0,23,hour);
	}
	 //我为了让其他的包可以使用 可以定义不同封装程度的构造函数哎
	 public Clock()
	{
			this.second = new WorkDisplay(0,59,11);
			this.minute = new WorkDisplay(0,59,11);
			this.hour = new WorkDisplay(0,23,11);
		 
	}
	//其他地方也需要让始终走起来.
	public void tick()
	{
		AskIncrease();
	}
	//但是没有必要直接让时钟运动吧,这个我类里面自己用就好 不要暴露
	private void AskIncrease()
	{
		if(second.increase())
		{			
			if(minute.increase())
			{			
				hour.increase();
			}
		}
	}
	//这个是显示时钟时间的.还是得暴露.而且toString好像是限定词?不需要用public
	public String toString()
	{
		String sAnswer = "";
		int iHour = hour.getTime();
		int iMintute = minute.getTime();
		int iSecond = second.getTime();
		sAnswer = String.format("%02d:%02d:%02d",iHour,iMintute,iSecond);
		
		return sAnswer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Clock clock = new Clock(in.nextInt(), in.nextInt(), in.nextInt());
		clock.tick();
		System.out.println(clock);
		in.close();

	}

}
//这个时钟的分针呢,只是用来给我们的clock做构造的.虽然clock有人用.但是那些地方可定不要用时针干坏事.
//所以这个WorkDisplay作为Clock自己用的小弟就好.(不过无法private 这就说.这个包里面的其他人还是可以用)
class WorkDisplay {
	private int min;
	private int max;
	private int now;
	public boolean bFinish = false;
	//因为为了让clock中可以构造.
	//不过这种类没有必要是public是肯定的.因为就是包里面用.
	WorkDisplay(int min, int max,int now)
	{
		this.min = min;
		this.max = max;
		this.now = now;
	}
	//这个指令..需要让clock调用.所以
	 boolean increase()
	{
		now+=1;
		if(now>max)
		{
			now = min;
			return true;
		}
		else return false;
	}
	 //一样的原因
	int getTime()
	{
		return this.now;
	}
	

}

