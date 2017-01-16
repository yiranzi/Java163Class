package c3;


public class DVD extends Item {
	String sEditor;//导演
	int iMovieTime;//电影时长
	

	public DVD(int iNumber, boolean favorite,String sEditor, int iMovieTime) {
		super(iNumber,favorite);
		this.sEditor = sEditor;
		this.iMovieTime = iMovieTime;
	}

	public void print()
	{
		super.print();
		System.out.println("sEditor=" + sEditor + ", iMovieTime=" + iMovieTime);
	}
	@Override
	public String toString() {
		return "DVD文件";
	}
	
}
