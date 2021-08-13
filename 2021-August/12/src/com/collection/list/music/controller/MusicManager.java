package com.collection.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.collection.list.music.model.vo.Music;

public class MusicManager {
	
	private List<Music> musicList = new ArrayList<>();

	{
		musicList.add(new Music("Hotel California", "Eagles"));
		musicList.add(new Music("Let it be", "Beatles"));
		musicList.add(new Music("Holiday", "Bee Gees"));
		musicList.add(new Music("Bohemian Rhapsody", "Queen"));
		musicList.add(new Music("I believe I can fly", "R. Kelly"));
	}

	public List<Music> selectList() {
		return musicList;
	}

	public void addList(Music m) {
		musicList.add(m);
	}

	public void addAtZero(Music m) {
		musicList.add(0, m);
	}

	public boolean removeMusic(String title) {
		for (Music music : musicList)
			if (title.equals(music.getTitle()))
				return musicList.remove(music);

		return true;
	}

	public boolean replaceMusic(Music oldMusic, Music newMusic) {
		int index = musicList.indexOf(oldMusic);
		if (index > -1)
			musicList.add(index, newMusic);

		return index > -1;

	}

	public List<Music> searchMusicByTitle(String title) {
		List<Music> matchList = new ArrayList<>();
		for (Music music : musicList)
			if (title.equals(music.getTitle()))
				matchList.add(music);

		return matchList;
	}

	public List<Music> searchMusicBySinger(String singer) {
		List<Music> matchList = new ArrayList<>();
		for (Music music : musicList)
			if (singer.equals(music.getSinger()))
				matchList.add(music);

		return matchList;
	}

	// public List<Music> orderBy(Comparator<Music> c) {
	// return new ArrayList<Music>();
	// }

}





