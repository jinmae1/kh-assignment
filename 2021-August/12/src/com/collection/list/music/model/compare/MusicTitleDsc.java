package com.collection.list.music.model.compare;

import java.util.Comparator;
import com.collection.list.music.model.vo.Music;

public class MusicTitleDsc implements Comparator<Music> {

	@Override
	public int compare(Music m1, Music m2) {
		return m2.getTitle().compareTo(m1.getTitle());
	}

}
