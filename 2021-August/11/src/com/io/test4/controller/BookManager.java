package com.io.test4.controller;

import java.io.*;
import java.util.*;

import com.io.test4.model.vo.Book;

public class BookManager {

	private Scanner sc = new Scanner(System.in);
	private static final String FILE_NAME = "books.dat";

	public BookManager() {

	}

	public void fileSave() {

		Book[] book = new Book[5];

		book[0] = new Book("The Fellowship of the Ring", "Gandalf", 98_000, new GregorianCalendar(1954, 7 - 1, 29));
		book[1] = new Book("The Two Towers", "Aragorn", 38_000, new GregorianCalendar(1954, 11 - 1, 11));
		book[2] = new Book("The Return of the King", "Legolas", 68_000, new GregorianCalendar(1955, 10 - 1, 20));
		book[3] = new Book("The Silmarillion", "Gimli", 18_000, new GregorianCalendar(1977, 9 - 1, 15));
		book[4] = new Book("The Hobbit", "Frodo", 9_000, new GregorianCalendar(1937, 9 - 1, 21));

		// for (int i = 0; i < book.length; i++) {
		// book[i] = inputBook();
		// }

		try (ObjectOutputStream oos = new ObjectOutputStream(
				(new BufferedOutputStream(new FileOutputStream(FILE_NAME))))) {
			for (Book b : book) {
				oos.writeObject(b);
				System.out.println(b);
			}
			System.out.println("저장 완료");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void fileRead() {
		Book[] book = new Book[10];

		try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(FILE_NAME)))) {

			for (int i = 0; i < book.length; i++) {
				book[i] = (Book) ois.readObject();
				System.out.println(book[i]);
			}

		} catch (EOFException e) {
			System.out.println("읽기 완료");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Book inputBook() {
		String[] key = { "Title", "Author", "Price", "Publication Date(yyyy.MM.dd)" };
		Object[] val = new Object[4];

		System.out.println("> 책 정보를 입력해주세요:");
		for (int i = 0; i < key.length; i++) {
			System.out.print(key[i] + ": ");
			val[i] = sc.nextLine();
		}
		String[] date = val[3].toString().split("\\.");

		int yyyy = Integer.parseInt(date[0]);
		int MM = Integer.parseInt(date[1]);
		int dd = Integer.parseInt(date[2]);

		return new Book(val[0].toString(), val[1].toString(), Integer.parseInt(val[2].toString()),
				new GregorianCalendar(yyyy, MM - 1, dd));
	}
}
