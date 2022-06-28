package multiple_inheritance;

interface ParentInterface1{
	void m1();
	void play();
}
interface ParentInterface2{
	void m1();
	void m2();
}
public interface Child_Interface extends ParentInterface1, ParentInterface2 {

}
