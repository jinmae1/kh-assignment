package com.collection.list.music.controller;

import java.util.*;
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
		int index = -1;
		for (Music music : musicList)
			if (oldMusic.equals(music)) {
				index = musicList.indexOf(music);
				musicList.set(index, newMusic);
				break;
			}

		return index > -1;
	}

	public List<Music> searchMusicByTitle(String title) {
		List<Music> matchedList = new ArrayList<>();
		for (Music music : musicList)
			if (title.equals(music.getTitle()))
				matchedList.add(music);

		return matchedList;
	}

	public List<Music> searchMusicBySinger(String singer) {
		List<Music> matchedList = new ArrayList<>();
		for (Music music : musicList)
			if (singer.equals(music.getSinger()))
				matchedList.add(music);

		return matchedList;
	}

	public List<Music> orderBy(Comparator<Music> c) {
		List<Music> sortedList = new ArrayList<>(musicList);
		sortedList.sort(c);

		return sortedList;
	}

}