package com.np.thapanarayan.question4;

public class Square extends GeometricObject implements Colorable{
    private double length;
    private String color;

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void howToColor(String color) {
        this.color = color;
        System.out.println("Colouring square with : " + color);
    }

    @Override
    boolean max(GeometricObject geometricObject) {
        if (!(geometricObject instanceof Square)) {
            return false;
        }
        return this.getLength() > ((Square) geometricObject).getLength();
    }

    @Override
    public int compareTo(GeometricObject object) {
        if (!(object instanceof Square)) {
            throw new IllegalArgumentException("Not Circle");
        }
        return Double.compare(this.getLength(), ((Square) object).getLength());
    }
}
