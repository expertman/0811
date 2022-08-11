/**
 * <h1>Final 용법 3가지</h1>
 * <ul>
 * 		<li><b>Final Variable</b> : 자바의 상수</li>
 * 		<li><b>Final Method</b> : Override의 금지</li>
 * 		<li><b>Final Class</b> : 상속의 금지</li>
 * </ul>
 * 
 * @author Henry
 * @version 1.1
 * @since 2022-08-11
 *
 */
public class FinalDemo extends Parent{
	private final double PI = Math.PI;   //Member Constant
	private static final boolean FLAG = true;   //Static Constant 
	
	public static void main(String[] args) {
		final String NAME = "한지민";   //Local Constant
		
	}

	public final void display() {  
		System.out.println("나는 자식의 메소드");
	}
//	@Override
//	public void print() {
//		System.out.println("나는 자식의 메소드");
//	}
}

final class Parent{
	public void display() {  System.out.println("나는 부모의 메소드");}
}
//abstract class Super{
//	public final void display() {  System.out.println("나는 부모의 메소드");}
//	public abstract void print();
//}
