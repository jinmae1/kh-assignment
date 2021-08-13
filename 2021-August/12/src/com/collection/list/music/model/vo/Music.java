package com.collection.list.music.model.vo;

public class Music implements Comparable<Music> {
	private String title;
	private String singer;

	public Music() {

	}

	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return this.singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return title + " - " + singer;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		Music another = (Music) obj;
		if (!this.title.equals(another.title))
			return false;

		if (!this.singer.equals(another.singer))
			return false;

		return true;
	}

	@Override
	public int compareTo(Music other) {
		return this.title.compareTo(other.title);
	}

}
