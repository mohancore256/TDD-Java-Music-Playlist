package playlistTest;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import playlist.Song;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class SongTest {

    @Test
    public void getPrettyDuration(){
        //arrange
        Song mySong = new Song ("Title", "rock", Duration.ofSeconds(244));
        String expectedResult = String.format("%d:%02d:%02d",0,4,4);

        //act
        String prettyResult = mySong.getDurationPretty();

        //aasert
        assertEquals("getDurationPretty returns a songs length(duration) into   ", prettyResult,expectedResult);

    }
}
