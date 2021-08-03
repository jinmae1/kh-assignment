package com.oop.device;

public class TV extends Device {

	private int channel;

	public TV() {
		super();
	}

	public TV(String brand, String name, int price, int channel) {
		super(brand, name, price);
		this.channel = channel;
	}

	public int getChannel() {
		return this.channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int channelUp() {
		return this.channel++;

	}

	public int channelDown() {
		return this.channel--;
	}

	@Override
	public String toString() {
		return super.toString() + ", channel=" + channel;
	}

}