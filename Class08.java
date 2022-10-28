package test;

interface iAaa {
	public void show();
}

class Cbbb {
	public int num = 10;

	public void set(int n) {
		num = n;
	}
}

class Cccc extends Cbbb implements iAaa

{
	public void show() {
		System.out.println("num=" + num);
	}
}

public class hw11_8 {
	public static void main(String args[]) {
		Cccc cc = new Cccc();
		cc.set(5);
		cc.show(); // 印出 num=5
	}
}
