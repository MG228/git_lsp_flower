package org.howard.edu.oopfinal.question1;

import static org.junit.Assert.*;
import java.util.Set;
import org.junit.Test;

public class SongDataBase_Test {

	@Test
	public void testAddSong() {
	    SongsDatabase db = new SongsDatabase();
	    db.addSong("R & B", "BILL$");
	    assertTrue(db.getSongs("R & B").contains("BILL$"));
	}


	@Test
	public void testGetGenreOfSong() {
	    SongsDatabase db = new SongsDatabase();
	    db.addSong("R & B", "Loveee Song");
	    assertEquals("R & B", db.getGenreOfSong("Loveee Song"));
	}

	@Test
	public void testGetSongs() {
	    SongsDatabase db = new SongsDatabase();
	    db.addSong("R & B", "BILL$");
	    db.addSong("R & B", "Loveee Song");
	    db.addSong("R & B", "Trust");
	    Set<String> songs = db.getSongs("R & B");
	    assertTrue(songs.contains("BILL$"));
	    assertTrue(songs.contains("Loveee Song"));
	    assertTrue(songs.contains("Trust"));
	}
	
	 public static void main(String[] args) {
	        org.junit.runner.JUnitCore.main("SongsDatabaseTest");
	    }
}
