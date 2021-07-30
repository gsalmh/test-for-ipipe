public class F {
   
    public void badCase2() {
       int a = 1/0;
       int a2 = 1/0;
        try {
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }
    }
}
