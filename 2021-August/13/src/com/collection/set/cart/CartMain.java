package com.collection.set.cart;

import java.util.*;

public class CartMain {

	private Set<Cart> cart;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		CartMain main = new CartMain();
		main.cart = new HashSet<Cart>();

		while (true) {

			System.out.println("===== 장바구니 =====");
			System.out.println("1. 상품 담기");
			System.out.println("2. 상품 조회");
			System.out.println("3. 전체 조회");
			System.out.println("0. 종료");
			System.out.println("===================");

			System.out.print("> 메뉴 입력: ");

			switch (sc.nextInt()) {
				case 1:
					addToCart(main.cart);
					break;
				case 2:
					searchCart(main.cart);
					break;
				case 3:
					showCart(main.cart);
					break;
				case 0:
					return;

				default:
					System.out.println("잘못 입력하셨습니다.");
					break;
			}

		}

	}

	private static void addToCart(Set<Cart> cart) {
		String itemName;
		int count;

		while (true) {

			System.out.print("> 상품 입력: ");
			itemName = sc.next();
			if ("exit".equals(itemName))
				break;

			if (cart.contains(new Cart(itemName))) {
				System.out.println("이미 등록된 상품입니다.");
				System.out.println("다시 입력하세요");
			} else {
				while (true) {
				System.out.print("> 수량 입력: ");
				count = sc.nextInt();
				if (count > 0)
					break;
				System.out.println("+++ 0 이하 입력 금지 +++ ");
			}
			cart.add(new Cart(itemName, count));

				System.out.println("+++++ 입력 완료 +++++\n");
				System.out.println("계속 입력하세요");
			}
		}
	}

	private static void searchCart(Set<Cart> cart) {
		String itemName;

		System.out.print("> 상품 입력: ");
		itemName = sc.next();

		for (Cart fruit : cart) {
			if (fruit.equals(new Cart(itemName)))
				System.out.println(fruit.getCount() + "개가 담겨있습니다.");

		}
	}

	private static void showCart(Set<Cart> cart) {
		List<Cart> cartList = new ArrayList<>(cart);
		Collections.sort(cartList);
		int total = 0;

		int i = 0;
		for (Cart item : cartList) {
			System.out.println(++i + ". " + item);
			total += item.getCount();
		}
		System.out.println("-----------------------------");
		System.out.println("총 " + total + "개의 상품이 담겨있습니다.");
	}

	private static void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
}