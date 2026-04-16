package basic.question01;

/**
 * 第4章 変数
 */

public class Question01_2 {

	public static void main(String[] args) {

		// TODO:ここに実装
		int appleprice = 100;
		String stationery = "鉛筆";

		int bananaPrice = appleprice;
		String writingUtensilString = stationery;

		System.out.println("リンゴの値段は" + appleprice + "円です。");
		System.out.println("バナナの値段は" + bananaPrice + "円です。");
		System.out.println("この筆記用具は" + writingUtensilString + "です。");

	}

}
