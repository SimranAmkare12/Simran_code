package facadeDesignPattern;

public class User {

	public static void main(String[] args) {
		
		RoomLight rt = new RoomLight();
		Television   tt = new Television ();
		SoundSystem ss = new SoundSystem();
		
		 HomeTheaterFacade facade= new  HomeTheaterFacade ( rt, ss, tt) ;
		 facade.watchMovie();
		 facade.stopWatching();
		
		
		 
	}

}
