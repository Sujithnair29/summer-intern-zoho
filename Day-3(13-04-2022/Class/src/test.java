/*class calculator{
	int x;
	int y;
}


class sumDiff extends proDiv{
	
	
	 void add() {
		int z=x+y;
		System.out.println(z);
		
		
	}void diff(){
		int z=x-y;
		System.out.println(z);
		
	}
}

class proDiv extends calculator{
	int x;
	int y;
	
	void pro() {
		int z=x*y;
		System.out.println(z);
		
	}void Div(){
		double z=(double) x/(double)y;
		System.out.println(z);
		
	}
	
	
}*/





public class test {

	public static void main(String[] args) {
		sumDiff cal=new sumDiff();
		cal.y=45;
		cal.x=25;
		cal.add();
		cal.diff();
		cal.Div();
		cal.pro();
		
		
		

	}

}
