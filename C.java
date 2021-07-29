public class C {
   
    public void badCase2() {
        try {
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }
    }
}
