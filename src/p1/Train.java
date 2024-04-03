package p1;

public class Train implements IsVerifiable, IsMovable {
    private int id;
    private long timeRegistered;
    private int startTime;
    private Station currentLocation;
    private Route currentRoute;
    private ArrayList<String> designatedStops;

    public Train() {
        // Initialize the train with an id
    }

    public int getId() {
        // Return the id of the train
    }

    public int getStartTime() {
        // Return the start time of the train
    }

    public void setStartTime() {
        // Set the start time of the train
    }

    public void setCurrentLocation() {
        // Set the current location of the train
    }

    public Route getCurrentRoute() {
        // Return the current route of the train
    }

    public void setCurrentRoute() {
        // Set the current route of the train
    }

    public ArrayList<String> getDesignatedStops() {
        // Return the designated stops of the train
    }

    public void setDesignatedStops() {
        // Set the designated stops of the train
    }

    public boolean isRegistered() {
        // Check if the train is registered
    }

    public long whenRegistered() {
        // Return the time the train was registered
    }

    public void register() {
        // Register a train with a given start time, route, and designated stops
    }

    public void start() {
        // Start the train
    }

    public int advance() {
        // Advance the time in the train
    }

    public String currentStation() {
        // Return the current station of the train
    }

    public String nextStation() {
        // Return the next station of the train
    }

    public void changeRout() {
        // Change the route of the train
    }

    public boolean verify() {
        // Verify the train
    }
}