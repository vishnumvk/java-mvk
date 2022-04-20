package oops_examples.inheritance;

class Engine{
	int cc;
	int hp;
	public Engine(int cc,int hp) {
		this.cc=cc;
		this.hp=hp;
	}
}
class MusicPlayer{
	public void playMusic() {
		System.out.println("Playing Music....");
	}
}
class Car{
	private Engine e;
	 MusicPlayer m;
	public void setMusicPlayer(MusicPlayer m) {
		this.m=m;
	}
	public Car(Engine e) {
		this.e=e;
	}
	public String getEngineDetails() {
		return "\n HP is "+this.e.hp+" CC is "+this.e.cc;
	}
}


public class AggergationAndComposition {

	public static void main(String[] args) {
		  
		 MusicPlayer m1 = new MusicPlayer();
		 Car car1 = new Car(new Engine(550,1000));
		 car1.setMusicPlayer(m1);
		 Car car2 = new Car(new Engine(550,1200));
		 System.out.println(" car1 Engine detailes :"+car1.getEngineDetails());
		 car1.m.playMusic();// possible as car1 has music player. 
		 System.out.println("car2 Engine detailes :"+car2.getEngineDetails());
		 try {
			car2.m.playMusic();
		} catch (Exception e) {
			
			e.printStackTrace();
		}// gives NullPointerException as car2 does not have a music player.
	}

}
