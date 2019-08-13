package playlist;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;



public class Playlist {
	private String name;
	private List<Song> songlist;
	
	public Playlist() {

		songlist = new ArrayList<Song>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Song> getSonglist() {
		return songlist;
	}


	public void addSong(Song song) {
		songlist.add(song);
	}

	public void removeSong(Song song) {
		songlist.remove(song);
	}

	public void moveSong(Song song, int position) {
		songlist.add(position,song);
	}

	public Duration getPlaylistDuration() {
		Duration totalDuration = Duration.ofSeconds(0);
		for (Song song :songlist) {
			totalDuration = totalDuration.plus(song.getDuration());
		}
		return totalDuration;

	}
}
