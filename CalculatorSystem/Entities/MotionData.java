package Entities;

public class MotionData extends BaseData {
    private double initialVelocity;
    private double acceleration;
    private double time;
    private Float distance;


    public double getInitialVelocity() {
        return initialVelocity;
    }

    public void setInitialVelocity(double initialVelocity) {
        this.initialVelocity = initialVelocity;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }
}
