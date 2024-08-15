package facadeDesignPattern;

public class HomeTheaterFacade {
	
	RoomLight roomlight ;
	SoundSystem soundsystem ;
	Television television ;
	
	public HomeTheaterFacade(RoomLight roomlight, SoundSystem soundsystem, Television television) {
		super();
		this.roomlight = roomlight;
		this.soundsystem = soundsystem;
		this.television = television;
	}
	
	public void watchMovie() {
		roomlight.lightDim();
		television.switchOffTv();
		soundsystem.switchOnSoundSystem();
	}
	
	public void stopWatching() {
		roomlight.lightBright();;
		television.switchOffTv();;
		soundsystem.switchOffSoundSystem();
		
	}

}
