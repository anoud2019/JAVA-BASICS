package Entities;

public class InterestData extends BaseData  {
    private double principal;
    private double rate;
    private double time;
    private PhysicsData physicsData;

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public PhysicsData getPhysicsData() {
        return physicsData;
    }

    public void setPhysicsData(PhysicsData physicsData) {
        this.physicsData = physicsData;
    }
}
