import java.lang.StringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Store {
    private ArrayList<Task> tasks = new ArrayList<>();
    Store() {}
    public void add(Task t) {
        this.tasks.add(t);
    }

    public void delete(int i) {
        this.tasks.remove(i);
    }

    public int getSize() {
        return this.tasks.size();
    }

    public Task mark(int i) {
        return this.tasks.get(i - 1).mark();
    }

    public Task unmark(int i) {
        return this.tasks.get(i - 1).unmark();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.tasks.size(); i++) {
            sb.append(i + 1).append(".").append(this.tasks.get(i).toString());
            if (i != this.tasks.size() - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
