package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// 登録済み商品（値は変更可）
		String[] itemNames = { "ノート", "ボールペン", "消しゴム", "はさみ", "のり" };
		// 単価（値は変更可）
		int[] prices = { 100, 200, 300, 400, 500 };
		// 購入数（変更不可）
		int[] amounts = new int[5];

		// TODO: 実装ここから
		int[] stocks = new int[5];

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 5; i++) {
			System.out.print(itemNames + "の在庫数:＞");
			String stocksInput = reader.readLine();
			stocks[i] = Integer.parseInt(stocksInput);
		}
		for (int i = 0; i < 5; i++) {
			int amount = 0;
			boolean isvalid = false;
			while (!isvalid) {

				System.out.println(itemNames + "の購入数:＞");
				String amountsInput = reader.readLine();
				amount = Integer.parseInt(amountsInput);

				if (amount >= stocks[i]) {
					System.out.println("在庫を超えています。もう1度入力してください。");
				} else {
					amounts[i] = amount;
					isvalid = true;
				}
			}
			
				
			}

		}

	}

}
