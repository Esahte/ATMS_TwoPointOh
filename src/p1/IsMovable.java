package p1;

/**
 * Interface representing a movable object.
 */
public interface IsMovable {
    /**
     * Method to advance the object by a certain amount of time.
     *
     * @param time The amount of time to advance the object by.
     * @return The new position of the object after advancing.
     */
    int advance(int time);
}