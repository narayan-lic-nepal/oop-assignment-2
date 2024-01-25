package com.np.thapanarayan.question4;

public class Circle extends GeometricObject{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    boolean max(GeometricObject geometricObject) {
        if (null == geometricObject ) {
            return false;
        }
        if (!(geometricObject instanceof Circle)) {
            return false;
        }
        return this.getRadius() > ((Circle) geometricObject).getRadius();
    }

    @Override
    public int compareTo(GeometricObject object) {
        if (!(object instanceof Circle)) {
            throw new IllegalArgumentException("Not Circle");
        }
        return Double.compare(this.getRadius(), ((Circle) object).getRadius());
    }
}
