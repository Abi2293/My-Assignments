package week3.day2;

public class Samsung extends AndroidTv {

	public void playVideo() {
		System.out.println("Playing Video");
	}
	public static void main(String[] args) {
		Samsung s=new Samsung();
		s.openApp();
		s.playVideo();
	}
	
}

