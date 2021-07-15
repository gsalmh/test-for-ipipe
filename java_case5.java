public class CatchAndThrowMustCompatibleDemo {
    public void goodCase1() {
        try {
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }
    }
    public void goodCase2() {
        try {
        } catch (IndexOutOfBoundsException e) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    public void badCase1() {
        try {
        } catch (IndexOutOfBoundsException e) {
            throw new NullPointerException();
        }
    }
    public void badCase2() {
        try {
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }
    }
}
