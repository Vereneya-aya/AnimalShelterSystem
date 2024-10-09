package Service;

public class Counter implements AutoCloseable {
    private int count = 0;

    public void add() {
        count++;
    }

    @Override
    public void close() throws Exception {
        if (count == 0) {
            throw new Exception("Resource was not properly used!");
        }
        System.out.println("Counter closed successfully.");
    }

    public int getCount() {
        return count;
    }
}
