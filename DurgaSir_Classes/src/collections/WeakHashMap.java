package collections;

class Temp1{

	@Override
	public String toString() {
		return "Temp";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalize method called");
	}
	
}
public class WeakHashMap {

	public static void main(String[] args) throws InterruptedException {

		WeakHashMap m = new WeakHashMap();
		Temp1 t = new Temp1();
		//xm.put(t, "durga");
		t = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}

}
