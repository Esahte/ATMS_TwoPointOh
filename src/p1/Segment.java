package p1;

public class Segment extends DocEntity {
    private TrafficLight trafficLight;
    private Station startStation;
    private Station endStation;

    public Segment() {
        // Initialize the segment with a name, start station, and end station
    }

    public void changeLight() {
        // Change the color of the traffic light associated with this segment
    }

    public boolean lightColour() {
        // Retrieve the current color of the traffic light associated with this segment
    }

    public boolean verify() {
        // Verify the status of the segment and its associated entities
    }
}