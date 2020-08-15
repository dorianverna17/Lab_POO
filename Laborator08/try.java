// class Egg {
// 	//Yolk y;
// 	public void Test() {
// 	class Yolk {
// 		public Yolk() {
// 			System.out.println("Egg.Yolk()");
// 		}
// 	}
// }

// 	public Egg() {
// 		System.out.println("New Egg()");
// 	//	y = new Yolk();
// 	}
// }

class BigEgg2 extends Egg {
	//Yolk2 y;
	public Yolk2 Test() {
		class Yolk2 {
			public Yolk2() {
				System.out.println("BigEgg2.Yolk()");
			}
		}

		//System.out.println("da");
		// public Yolk2 y;
		// y = new Yolk2();
		return new Yolk2();
	}

	// public BigEgg2() {
	// //	y = new Yolk2();
	// }
// 	public void da() {
// 		public interface yes {

// 		}
// }

	public static void main(String args[]) {
		//new BigEgg2();
	}
}