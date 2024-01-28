package action;

import java.io.IOException;

/**
 * The Action interface represents an action that can be executed.
 * Implementing classes should provide an implementation for the execute method.
 */
public interface Action {
    /**
     * Executes the action.
     *
     * @throws IOException if an I/O error occurs during the execution of the action.
     */
    public void execute() throws IOException;
}
