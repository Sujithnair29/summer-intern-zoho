package protect;

class test1{
	protected String word() {//used protected access modifier
		String comment="Hello Java";
		return comment;
	}
}

class test2 extends test1{
	void alpha() {
		test1 wr = new test1();//protected method called in subclass
		System.out.println(wr.word());
	}
}

public class sample {

	public static void main(String[] args) {
		test2 rd = new test2();
		rd.alpha();
		
	}

}
