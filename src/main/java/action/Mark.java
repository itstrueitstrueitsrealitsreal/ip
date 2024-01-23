package action;

import util.PrintUtil;
import util.Store;

public class Mark implements Action {
    private Store store;
    private int i;

    public Mark(Store store, int i) {
        this.store = store;
        this.i = i;
    }

    @Override
    public void execute() {
        PrintUtil.print("Great job! You marked that task off your list! That's the way to go! " +
                "\nKeep pushing yourself, and remember, every completed task brings you " +
                "\none step closer to your goals. Believe it! ᕕ( ᐛ )ᕗ");
        PrintUtil.print(this.store.mark(i));
    }
}
