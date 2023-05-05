package multimediaEntities;

public class Audio extends MultimediaEntity implements Volume, Playable{

	public Audio(String title, int duration) {
		super(title);
		this.duration = duration;
	}
	
	int duration;
	
	int volume = 5;

	public void play() {
		for (int i=0; i < duration; i++) {
			System.out.println(this.title);
			for(int j=0; j <= volume; j++) {
				System.out.println("!");
			}
		}
	}
	
	@Override
	public int volumeUp() {
		return this.volume++;
	}

	@Override
	public int volumeDown() {
		return this.volume--;
	}
}
