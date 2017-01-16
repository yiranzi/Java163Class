package c3;


public class CD extends Item {

	String sArtist;//艺术家
	int iSoundTime;//时间
	
	public CD(int iNumber,boolean favorite,String sAritist,int iSoundTime)
	{
		super(iNumber,favorite);
		this.sArtist = sAritist;
		this.iSoundTime = iSoundTime;

	}
	
	public void print()
	{
		super.print();
		System.out.println("sArtist=" + sArtist + ", iSoundTime=" + iSoundTime);
	}


	@Override
	public String toString() {
		return "CD文件";
	}
	

	
}
