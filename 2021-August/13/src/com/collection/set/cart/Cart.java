package com.collection.set.cart;

import java.util.Objects;

public class Cart implements Comparable<Cart> {

	private String name;
	private int count;

	public Cart() {

	}

	public Cart(String name) {
		this.name = name;
	}

	public Cart(String name, int count) {
		this.name = name;
		this.count = count;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return this.count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return name + " - " + count + "개";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object other) {
		if (this == other)
			return true;
		if (!(other instanceof Cart))
			return false;

		Cart that = (Cart) other;
		if (!this.name.equals(that.name))
			return false;
		// if (this.count != that.count)
		// return false;

		return true;
	}

	@Override
	public int compareTo(Cart c) {
		return this.name.compareTo(c.name);
	}
}