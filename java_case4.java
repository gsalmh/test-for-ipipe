public class TestJavaStyle{
	private String Str;
	//常量定义 
	private static final String name = "hello";
	
	private static int test(int arg1, int arg2){
		int calcresult=arg1+ arg2;//test a+b
		return calcresult;
	}
	public static void main(String [] args) {
		System.out.println(test(111,222));
	}
}
