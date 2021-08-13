package com.collection.list.music.model.compare;

import java.util.Comparator;
import com.collection.list.music.model.vo.Music;

public class MusicSingerComparator implements Comparator<Music> {

	@Override
	public int compare(Music m1, Music m2) {
		return m1.getSinger().compareTo(m2.getSinger());
	}

}