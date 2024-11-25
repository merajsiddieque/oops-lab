package FigPackage;

public class sphere extends Figure {

    
    public sphere(double r) {
        this.r = r;
    }

    
    @Override
    public void calcArea() {
        a = 4 * pi * r * r; 
    }

    @Override
    public void calcVolume() {
        v = (4 * pi * r * r * r) / 3; 
    }

    @Override
    public void dispArea() {
        System.out.println("Sphere Area: "+ a);
    }

    @Override
    public void dispVolume() {
        System.out.println("Sphere Volume: "+ v);
    }
}
