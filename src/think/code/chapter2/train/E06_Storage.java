package think.code.chapter2.train;

public class E06_Storage {
	public int storage(String str) {
		return str.length() * 2;
	}

	public static void main(String[] args) {
		E06_Storage stor = new E06_Storage();
		System.out.println(stor.storage("汉字"));
	}

}
