package exceptions;

public class HandleCheckedExceptions {

	public static void main(String[] args) {
		System.out.println("this is start point");
		System.out.println("this is mid point");
		try {
			Thread.sleep(2000); /// InterruptedException
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("this is end point");
		System.out.println("this is dead point");
	}

}
