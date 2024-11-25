package FigPackage;

public class cone extends Figure {
    private double s, h; 

    
    public cone(double r, double s, double h) {
        this.r = r;
        this.s = s;
        this.h = h;
    }

    
    @Override
    public void calcArea() {
        a = (pi * r * s) + (pi * r * r); 
    }

    @Override
    public void calcVolume() {
        v = (pi * r * r * h) / 3; 
    }

    @Override
    public void dispArea() {
        System.out.println("Cone Area: "+ a);
    }

    @Override
    public void dispVolume() {
        System.out.println("Cone Volume: "+ v);
    }
}
