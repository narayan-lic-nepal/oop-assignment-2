package com.np.thapanarayan.question4;

public class Cylinder extends GeometricObject {
    private double radius;
    private double height;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume(){
        return 22.0d/7.0d * Math.pow(radius, 2) * height;
    }
    @Override
    boolean max(GeometricObject geometricObject) {

        if (!(geometricObject instanceof Cylinder)) {
           return false;
        }
        return this.volume() > ((Cylinder) geometricObject).volume();
    }

    @Override
    public int compareTo(GeometricObject object) {
        if (!(object instanceof Cylinder)) {
           throw new IllegalArgumentException("Not Cylinder");
        }
        return Double.compare(this.volume(), ((Cylinder) object).volume());
    }
}
