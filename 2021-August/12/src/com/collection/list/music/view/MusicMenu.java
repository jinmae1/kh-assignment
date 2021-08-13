package com.collection.list.music.view;

import java.util.List;

import com.collection.list.music.model.vo.Music;

public class MusicMenu {
	
	public void mainMenu() {
		String menu = "----- Music Playlist Menu -----\r\n" + 
					"1.목록보기\r\n" + 
					"2.마지막에 음악추가\r\n" + 
					"3.매처음에 음악추가\r\n" + 
					"4.곡삭제\r\n" + 
					"5.곡변경\r\n" + 
					"6.곡명검색\r\n" + 
					"7.가수검색\r\n" + 
					"8.목록정렬(곡명오름차순)\r\n" + 
					"0.종료\r\n" + 
					"--------------------------------\r\n" + 
					">> 메뉴선택 : ";
		
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
			
	}
	
	public void printList(List<Music> list) {
		
	}
	
	public Music inputMusic() {
		return null;
	}
	
	public String inputTitle() {
		return null;
	}
	
	public String inputSinger() {
		return null;
	}
}
