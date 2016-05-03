package IteratorPattern;

/**
 * @author jacka
 * @version 1.0.0 on 5/3/2016.
 */
public class SongInfo {

    private String songName;
    private String bandName;
    private int yearReleased;

    public SongInfo(String newSongName, String newBandName, int newYearReleased){

        songName = newSongName;
        bandName = newBandName;
        yearReleased = newYearReleased;

    }

    public String getSongName(){ return songName; }
    public String getBandName(){ return bandName; }
    public int getYearReleased(){ return yearReleased; }

}
