# TDD-Java-Music-Playlist

We will begin our TDD practice by completing the following user stories that will complete the Playlist class for a Music Playlist app.  One pair should be the driver and Write the JUnit test first, run it, and watch it fail (Red). Switch drivers and let the other pair write just enough code to make the test pass (Green).  Then refactor the code if possible (Refactor).

## User Story:

- As a music lover
- I want to have a music playlist
- So that I can choose what songs to hear and in what order.

## Acceptance Criteria:

1. Given that I start a new playlist, then I expect the playlist to be empty.
2. Given that I have a blank playlist, when I add songs with the execution of `addSong(Song song)`, then I expect the Playlist.songlist size to reflect the total number of songs I have added.
3. Given that I remove a song from the playlist with execution of `removeSong(Song song)` then I expect the songlist to have been updated with the removal of that song.
4. Given that I  move a song in my playlist to a new location utlizing `moveSong(Song song, int newIndex)` ,  then I expect the playlist order to have been rearranged accordingly.
5. Given I have a playlist with songs, when I check the total playlist length with `getPlaylistDuration()` , I expect the duration to reflect the sum of the durations of all the songs on the playlist.
1. Given I have a playlist with songs, when I want to see the playlist with `getPrettyPlaylist()`, I expect to see the playlist in the format `Title - Artist mm:ss`.  For example:
`2 Heads - Coleman Hell 3:32
 Lightning Crashes - Live 5:25
 Stars - Hum 5:09`

## Additional Resources
- [Duration in Java](https://www.mkyong.com/java8/java-8-period-and-duration-examples/)
- [String.format](https://dzone.com/articles/java-string-format-examples)
 

