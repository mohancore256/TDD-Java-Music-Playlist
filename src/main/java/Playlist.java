package main.java;

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


}
