package path;

public class Waypoint {
    private double dt;
    private double x;
    private double y;
    private double velocity;
    private double heading;
    private double angular_velocity;

    public Waypoint(double dt, double x, double y, double velocity, double heading) {
        this.dt = dt;
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        this.heading = heading;
        angular_velocity = 0;
    }

    public void setAngularVelocity(double headingI, double headingF, double timeI, double timeF) {
        double calc = (headingF - headingI) / (timeF - timeI);
        this.angular_velocity = calc;
    }

    public double getTime() {
        return dt;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getVelocity() {
        return velocity;
    }

    public double getHeading() {
        return heading;
    }

    public double getAngularVelocity() {
        return angular_velocity;
    }
}
