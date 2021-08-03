package com.oop.device;

public class Main {

	public static void main(String[] args) {

		Device[] arr = new Device[10];
		arr[0] = new TV("삼성", "평면TV", 3_000_000, 10);
		arr[1] = new TV("LG", "울트라평면TV", 2_500_000, 20);
		arr[2] = new Laptop("LG", "그램17", 2_000_000, 512);
		arr[3] = new Laptop("apple", "맥북16", 3_000_000, 1024);

		// 1. arr을 순회하면서,
		// tv객체라면 channelUp메소드 호출
		// laptop객체 용량 정보를 출력
		for (Device device : arr) {

			if (device instanceof TV)
				((TV) device).channelUp();

			else if (device instanceof Laptop)
				System.out.println(device.getName() + "'s capacity: " + ((Laptop) device).getCapacity());

		}
		System.out.println();

		// 2. arr을 순회하면서
		// toString을 통해 모든 필드정보를 조회(동적바인딩)

		for (Device device : arr) {
			if (device == null) {
				break;
			}
			System.out.println(device);
		}

	}
}