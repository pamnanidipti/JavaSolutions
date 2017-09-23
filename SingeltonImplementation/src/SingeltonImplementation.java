
public class SingeltonImplementation {
	enum Fruit {
		APPLE(1), MANGO(2), BANANA(3), CHERRY(4);

		private int fruitCode;

		private Fruit(int fruitCode) {
			this.fruitCode = fruitCode;
		}

		@Override
		public String toString() {
			return String.valueOf(this.fruitCode);
		}
	}

	public SingeltonImplementation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit apple = Fruit.APPLE;
		Fruit banana = Fruit.BANANA;
		Fruit apple2 = Fruit.APPLE;
		System.out.println("If Equal (apple and banana)? " + (apple == banana));
		System.out.println("If Equal (apple and apple2)? " + (apple == apple2));
	}

}
