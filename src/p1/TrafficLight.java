package p1;

public class TrafficLight implements IsVerifiable {
    private int id;
    private Light colour;

    public TrafficLight() {
        // Initialize the traffic light with an id
    }

    public void change() {
        // Change the color of the traffic light
    }

    public boolean isGreen() {
        // Check if the current color of the traffic light is Green
    }

    public boolean isRed() {
        // Check if the current color of the traffic light is Red
    }

    public boolean verify() {
        // Verify the color of the traffic light
    }
}