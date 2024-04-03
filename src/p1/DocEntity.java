package p1;

/**
 * DocEntity is an abstract class that extends AbstractEntity.
 * It represents a docking entity that can accept and release a Train.
 */
abstract class DocEntity extends AbstractEntity {
    private Train currentTrain;

    /**
     * Constructs a new DocEntity with the given name.
     * <p>
     * This constructor initializes a new DocEntity by calling the superclass constructor with the provided name.
     * The status of the entity is not set in this constructor, it should be set separately using the setStatus method.
     *
     * @param name the name of the entity
     */
    public DocEntity(String name) {
        super(name);
    }

    /**
     * Checks if the entity currently has a Train.
     *
     * @return true if the entity has a Train, false otherwise
     */
    public boolean hasTrain() {
        return currentTrain != null;
    }

    /**
     * Accepts a Train by setting the currentTrain to the given Train.
     * If the entity already has a Train, an IllegalStateException is thrown.
     *
     * @param train the Train to be accepted
     * @throws IllegalStateException if the entity already has a Train
     */
    public void acceptTrain(Train train) {
        if (hasTrain()) {
            throw new IllegalStateException("Entity already has A Train.");
        }
        this.currentTrain = train;
    }

    /**
     * Releases the current Train.
     * If the entity does not have a Train, an IllegalStateException is thrown.
     *
     * @throws IllegalStateException if the entity does not have a Train
     */
    public void releaseTrain() {
        if (!hasTrain()) {
            throw new IllegalStateException("No train to release.");
        }
        this.currentTrain = null;
    }
}