package c3;

public class MP3 extends Item {
	String album;//专辑
	int year;//年份
	public MP3(int iNumber,boolean bFavourite,String album,int year) {
		super(iNumber,bFavourite);
		this.album = album;
		this.year = year;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	@Override
	public String toString() {
		return "MP3";
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("album=" + album + ", year=" + year);
	}
}
