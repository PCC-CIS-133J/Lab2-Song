/**
 * A song, such as one in a music store which can be rated
 *
 * Modifications:
 * CT: Created class with properties, constructor, and getters
 * CT: Added setter for lengthInSeconds
 * CT: Added methods to reset and increase rating
 * CT: Added method to print song properties
 * 
 * 
 * @author Cara Tang
 * @version 2020.09.05
 */
public class Song
{
    private String title;
    private String artist;
    private int lengthInSeconds;
    private int rating; // valid ratings are 1-4 or 0 meaning not rated
    
    /**
     * Create a song with the given title, artist, length, and rating
     * @param songTitle the song title
     * @param songArtist the song artist
     * @param songLength the length of the song in seconds
     * @param songRating the song's rating
     */
    public Song(String songTitle, String songArtist, int songLength, int songRating)
    {
        title = songTitle;
        artist = songArtist;
        lengthInSeconds = songLength;
        rating = songRating;
    }

    // TODO: ----------------- 1 -------------------
    // TODO: Create a second constructor that takes 3 parameters: songTitle, songArtist and songLength
    // TODO: Update the corresponding 3 fields from the parameters
    // TODO: Set the rating to 0
    // TODO: Hint: start by copying and pasting the constructor above, then update as necessary
    // TODO: Don't forget the comment header! (and don't forget to update it appropriately!)

    /**
     * @return the song title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * @return the song artist
     */
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * @return the song length (in seconds)
     */
    public int getLengthInSeconds()
    {
        return lengthInSeconds;
    }
    
    /**
     * Set the length of this song to the value given
     * @param newLength new length (in seconds) for this song
     */
    public void setLengthInSeconds(int newLength)
    {
        lengthInSeconds = newLength;
    }
    
    // TODO: ----------------- 2 -------------------
    // TODO: Create the getRating method that returns this song's rating
    // TODO: Don't forget the comment header!

    // TODO: ----------------- 3 -------------------
    // TODO: Create the setRating method that sets the rating of this song to a new value
    // TODO: Hint: This method should take the new rating as a parameter; nothing should be returned
    // TODO: Don't forget the comment header!
    
    
    /**
     * Reset the rating of this song to not rated
     */
    public void resetRating()
    {
        rating = 0;
    }
        
    /**
     * Increase the rating of this song by 1
     */
    public void increaseRating()
    {
        // TODO: ----------------- 4 -------------------
        // TODO: This method doesn't work as intended. Fix it.
        rating = 1;
    }

    // TODO: ----------------- 5 -------------------
    // TODO: Create a method called decreaseRating that decreases this song's rating by 1
    // TODO: This method should be similar to increaseRating
    // TODO: Don't forget the comment header!

    /**
     * Print information on this song
     */
    public void printSongInfo()
    {
        System.out.println("---------------------------------");
        System.out.println("Song Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Length: " + lengthInSeconds + " seconds");
        // TODO: ----------------- 6 -------------------
        // TODO: Add a line here to print this song's rating
        System.out.println("---------------------------------");
    }
}
