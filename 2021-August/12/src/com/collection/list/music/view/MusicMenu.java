package com.collection.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.collection.list.music.controller.MusicManager;
import com.collection.list.music.model.vo.Music;

public class MusicMenu {

	private Scanner sc = new Scanner(System.in);
	private MusicManager manager = new MusicManager();

	public void mainMenu() {
		String menu = "----- Music Playlist Menu -----\r\n" + 
					"1.목록보기\r\n" + 
					"2.마지막에 음악추가\r\n" + 
				"3.맨처음에 음악추가\r\n"
				+ 
					"4.곡삭제\r\n" + 
					"5.곡변경\r\n" + 
					"6.곡명검색\r\n" + 
					"7.가수검색\r\n" + 
					"8.목록정렬(곡명오름차순)\r\n" + 
					"0.종료\r\n" + 
					"--------------------------------\r\n" + 
					">> 메뉴선택 : ";

		while (true) {
			System.out.print(menu);
			int choice = sc.nextInt();

			switch (choice) {
				case 1:
					printList(manager.selectList());
					break;
				case 2:
					sc.nextLine();
					manager.addList(inputMusic());
					break;
				case 3:
					sc.nextLine();
					manager.addAtZero(inputMusic());
					break;
				case 4:
					sc.nextLine();
					if (manager.removeMusic(inputTitle()))
						System.out.println("## 삭제 성공 ##");
					else
						System.out.println("## 삭제 실패 ##");
					break;
				case 5:

					sc.nextLine();
					if (manager.replaceMusic(inputMusic(), inputMusic()))
						System.out.println("## 수정 성공 ##");
					else
						System.out.println("## 수정 실패 ##");
					break;
				case 6:
					sc.nextLine();
					manager.searchMusicByTitle(inputTitle());
					break;
				case 7:
					sc.nextLine();
					manager.searchMusicBySinger(inputSinger());
					break;
				case 8:
					orderMenu();
					break;
				case 0:
					return;

				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
			}
		}

	}

	public void orderMenu() {
		String orderMenu = "================== 정렬 메뉴 ===================\r\n" + 
										"1. 가수명 오름차순\r\n" + 
										"2. 가수명 내림차순\r\n" + 
										"3. 곡명 오름차순\r\n" + 
										"4. 곡명 내림차순\r\n" + 
										"5. 메인메뉴 돌아가기\r\n" + 
										"================================================\r\n" + 
										" >> 메뉴 선택 : ";

		while (true) {
			System.out.println(orderMenu);
			int choice = sc.nextInt();

			switch (choice) {
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;

				default:
					break;
			}
		}

	}

	public void printList(List<Music> list) {
		System.out.println();
		System.out.println("---------- 음악 리스트 ----------");
		for (Music music : list)
			System.out.println(music);
		System.out.println("-------------------------------");
		System.out.println();
	}
	
	public Music inputMusic() {
		return new Music(inputTitle(), inputSinger());
	}
	
	public String inputTitle() {
		System.out.print("> 제목을 입력하세요: ");
		return sc.nextLine();
	}
	
	public String inputSinger() {
		System.out.print("> 가수를 입력하세요: ");
		return sc.nextLine();
	}
}
