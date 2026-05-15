package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// TODO:ここに実装
		int amountBooks = 0;
		int sellFlag = 0;
		int bookPrice = 200;

		System.out.println("本を売却します");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		do {
			amountBooks++;
			System.out.print("売却する本の冊数を1つ増やしますか？");
			System.out.print("はい：0、いいえ：1＞");

			String sellFlagInput = reader.readLine();
			sellFlag = Integer.parseInt(sellFlagInput);

		} while (sellFlag == 0);

		System.out.println("売却する本の冊数は" + (amountBooks * bookPrice) + "円です");

	}

}
