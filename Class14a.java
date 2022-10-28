package test04;

interface iVolume {
	public void showData(); // 顯示球體的資料

	public double vol(); // 計算球體積
}

abstract class CSphere implements iVolume {
	final double PI = 3.14;
	protected int x;
	protected int y;
}

class CCircle extends CSphere {
	protected int radius;

	public CCircle(int a, int b, int r) {
		x = a;
		y = b;
		radius = r;
	}

	public void showData() {
		System.out.println("球心:(" + x + "," + y + ")");
		System.out.println("半徑:" + radius);
		System.out.println("球體積:" + vol());
	}

	public double vol() {
		return ((4.0 / 3) * PI * radius * radius * radius);
	}
}

public class hw11_14a {
	public static void main(String args[]) {
		CCircle cir = new CCircle(8, 6, 2);
		cir.showData();
	}
}

(b) 這是因為 CCircle 類別繼承了抽象類別 CSphere,必須要改寫 CSphere 類別裡的
    method,雖然 CSphere 抽象類別並沒有實作介面 iVolume,但透過 CCircle 類別的
    改寫動作,替父類別 CSphere 完成了實作。
