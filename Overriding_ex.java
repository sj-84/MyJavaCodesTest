import java.nio.*;
public class Overriding_ex {

	public static void main(String[] args) {
		try {
			Child ob=new Child();
			ob.doSomething();
		}
		catch(Exception ob)
		{
			System.out.println("catched");
		}
	}

}
class Parent {

    void doSomething() throws IllegalArgumentException {

        throw new IllegalArgumentException();

    }

}

class Child extends Parent {

    void doSomething()

      throws ArithmeticException,BufferOverflowException {

        throw new ArithmeticException();

    }

}

