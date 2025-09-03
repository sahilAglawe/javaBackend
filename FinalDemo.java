class FinalDemo {
	final int i = 10;
	
	int show(){
		return i = i+1;
	}
	
	public static void main(String[] args){
		FinalDemo obj = new FinalDemo();
		//System.out.println(obj.i);
		//obj.show();
	}
}