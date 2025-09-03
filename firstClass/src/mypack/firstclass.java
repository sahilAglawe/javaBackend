package mypack;

public class firstclass {
  protected int i =10, j = 20;

  public firstclass() {
	super();
  }

  public firstclass(int i, int j) {
	super();
	this.i = i;
	this.j = j;
  }
  
  protected void show() {
	  System.out.println("first class show");
	  
	 
  }

  public static void main(String[] args) {
	  
	  firstclass obj = new firstclass(12,11);
	  firstclass obj1 = new firstclass();
	  obj1.show();
	  
	  System.out.println(obj.i);
	  System.out.println(obj.j);
  }
  
}
