package LinkedList;

public class nestedTest_package_access {

	public static void main(String[] args) {
		private_1 ob=new private_1();
		nested_5 ob1=new nested_5();
		ob1.kkk();
		//ob1.h=7;        since h is a local var of kkk() method of nested_5n class
		//nested_5.main(); only main method cannot be called
	}

}
