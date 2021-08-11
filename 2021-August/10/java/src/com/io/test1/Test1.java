package com.io.test1;

import java.io.*;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Test1 test = new Test1();
		test.fileSave();
		test.fileRead();

	}

	public void fileSave() {
		BufferedReader br = null;
		BufferedWriter bw = null;
		String filename = null;
		String line = null;

		try {
			br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("파일 이름을 입력하세요: ");
			filename = br.readLine();
			bw = new BufferedWriter(new FileWriter(filename));

			System.out.println("파일에 저장할 내용을 이름을 입력하세요: ");
			while ((line = br.readLine()) != null) {
				if ("exit".equals(line))
					break;
				bw.write(line + '\n');
			}
			System.out.println("파일에 성공적으로 저장되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				br.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
			try {
				bw.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}

	public void fileRead() {

		Scanner sc = new Scanner(System.in);
		String filename;
		String line;
		StringBuilder data = new StringBuilder("");

		System.out.print("파일 이름을 입력하세요: ");
		filename = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			while ((line = br.readLine()) != null) {
				data.append(line + '\n');
			}
			System.out.println(data.substring(0, data.length() - 1));

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}