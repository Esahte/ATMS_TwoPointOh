package p1;

/**
 * AbstractEntity is an abstract class that implements the IsVerifiable interface.
 * It represents an entity that can be verified and can accept and release a Train.
 * The entity has a name and a status.
 */
abstract class AbstractEntity implements IsVerifiable {
    // The name of the entity
    private final String name;
    // The status of the entity
    private RSStatus status;

    /**
     * Constructs a new AbstractEntity with the given name.
     * <p>
     * This constructor initializes a new AbstractEntity with the provided name. The status of the entity is set to Open by default.
     *
     * @param name the name of the entity
     */
    public AbstractEntity(String name) {
        this.name = name;
        this.status = RSStatus.Open;
    }

    /**
     * Checks if the entity is open.
     *
     * @return true if the entity is open, false otherwise
     */
    public boolean isOpen() {
        return this.getStatus() == RSStatus.Open;
    }

    /**
     * Verifies the entity by checking if its name is not null and not an empty string.
     * This method is required by the IsVerifiable interface.
     *
     * @return true if the name is not null and not an empty string, false otherwise
     */
    @Override
    public boolean verify() {
        return this.name != null && !this.name.isEmpty();
    }

    /**
     * Closes the entity by setting its status to ClosedForMaintenance.
     * This method can be used when the entity needs to be temporarily unavailable for operations.
     */
    public void close() {
        this.status = RSStatus.ClosedForMaintenance;
    }

    /**
     * Opens the entity by setting its status to Open.
     * This method can be used when the entity is ready to be available for operations.
     */
    public void open() {
        this.status = RSStatus.Open;
    }

    /**
     * Retrieves the name of the entity.
     * <p>
     * This method returns the name of the entity as a string. The name is a unique identifier for the entity.
     *
     * @return the name of the entity
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the status of the entity.
     * <p>
     * This method returns the current status of the entity. The status indicates whether the entity is open, closed, or in a different state.
     *
     * @return the status of the entity
     */
    public RSStatus getStatus() {
        return status;
    }
}