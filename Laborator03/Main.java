class Ball {}
 
class Main {
	public static void main(String args[]) {
		Ball someBall = new Ball();
		System.out.println("Some ball before creating another ball = " + someBall);
		Ball anotherBall = someBall;
		someBall = new Ball();
		System.out.println("Some ball = " + someBall);
		System.out.println("Another ball = " + anotherBall);
	}
}