package playlistTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import playlist.Playlist;
import playlist.Song;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class PlaylistTest {



    @Test
    public void emptyPlayList(){
     //arrange
        Playlist myNewPlayList = new Playlist();
        Integer expectedNoOfSongs = 0;

     //act
       Integer prettyResult = myNewPlayList.getSonglist().size();

     //assert
        assertEquals("getDurationPretty returns a songs length(duration) into   ", expectedNoOfSongs,prettyResult);
    }

    @Test
    public void addingSongTest(){
        //arrange
        Song mySong = new Song ("Title", "rock", Duration.ofSeconds(244));
        Song mySong1 = new Song ("Title1", "rock1", Duration.ofSeconds(300));
        Playlist myNewPlayList = new Playlist();
        myNewPlayList.addSong(mySong);
        myNewPlayList.addSong(mySong1);
        int expected = 2;

        //act
        int actual  =  myNewPlayList.getSonglist().size();

        //assert
        assertEquals("No of songs added ", expected,actual);

    }

    @Test
    public void removingSongTest(){
        //arrange
        Song mySong = new Song ("Title", "rock", Duration.ofSeconds(244));
        Song mySong1 = new Song ("Title1", "rock1", Duration.ofSeconds(300));
        Playlist myNewPlayList = new Playlist();
        myNewPlayList.addSong(mySong);
        myNewPlayList.addSong(mySong1);
        myNewPlayList.removeSong(mySong);
        int expected = 1;

        //act
        int actual = myNewPlayList.getSonglist().size();

        //assert
        assertEquals("No of songs", expected,actual);
    }

    @Test
    public void movingSong(){
        //arrange
        Song mySong = new Song ("Title", "rock", Duration.ofSeconds(244));
        Song mySong1 = new Song ("Title1", "rock1", Duration.ofSeconds(300));
        Song mySong2 = new Song ("Title2", "rock2", Duration.ofSeconds(400));
        Playlist myNewPlayList = new Playlist();
        myNewPlayList.addSong(mySong);
        myNewPlayList.addSong(mySong1);
        myNewPlayList.addSong(mySong2);

       Integer expected = 2;

        //act
        myNewPlayList.moveSong(mySong2, 1);
       Integer actual = myNewPlayList.getSonglist().indexOf(mySong1);

        //assert
        assertEquals("position od]f song", expected,actual);

    }

    @Test
    public void getPlaylistDurationTest(){
        //arrange
        Song mySong = new Song ("Title", "rock", Duration.ofSeconds(244));
        Song mySong1 = new Song ("Title1", "rock1", Duration.ofSeconds(300));
        Song mySong2 = new Song ("Title2", "rock2", Duration.ofSeconds(400));
        Playlist myNewPlayList = new Playlist();
        myNewPlayList.addSong(mySong);
        myNewPlayList.addSong(mySong1);
        myNewPlayList.addSong(mySong2);
        Duration expected = Duration.ofSeconds(944);

        //act
        Duration actual = myNewPlayList.getPlaylistDuration();

        //assert
        assertEquals("duration of all songs", expected,actual);
    }

	
}
