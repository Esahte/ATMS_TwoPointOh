package p1;

public class Route extends AbstractEntity implements IsVerifiable {
    private boolean isRoundTrip;
    private ArrayList<Station> stations;
    private ArrayList<Segment> segments;

    public Route() {
        // Initialize the route with a name, round trip status, and stations
    }

    public boolean isRoundTrip() {
        // Check if the route is a round trip
    }

    public Station getStart() {
        // Return the starting station of the route
    }

    public Station getEnd() {
        // Return the ending station of the route
    }

    public ArrayList<Station> getStationList() {
        // Return the list of stations in the route
    }

    public Station getNextStation() {
        // Return the next station after the given station in the route
    }

    public Station getPreviousStation() {
        // Return the previous station before the given station in the route
    }

    public boolean canGetTo() {
        // Check if it is possible to get to the given station in the route
    }

    public void addSegment() {
        // Add a segment to the route
    }

    public void addSegments() {
        // Add a list of segments to the route
    }

    public void removeSegment() {
        // Remove a segment from the route
    }

    public boolean containsSegment() {
        // Check if the route contains a given segment
    }

    public void changeLight() {
        // Change the light of a given segment in the route
    }

    public boolean verify() {
        // Verify the route
    }
}