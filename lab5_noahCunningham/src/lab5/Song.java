package lab5;

public class Song {
	private String songName;
	private String songArtist;
	
	public Song(String sN, String sA) {
		songName = sN;
		songArtist = sA;
	}

		public String toString(){
			return songName + "(" + songArtist + ")";
		}
}
