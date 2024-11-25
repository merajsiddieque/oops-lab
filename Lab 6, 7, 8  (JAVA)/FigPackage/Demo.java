package FigPackage;

public class Demo {
    public static void main(String[] args) {
        

        
        cone cone = new cone(5, 10, 12);
        cone.calcArea();
        cone.calcVolume();
        cone.dispArea();
        cone.dispVolume();

        
        sphere sphere = new sphere(7);
        sphere.calcArea();
        sphere.calcVolume();
        sphere.dispArea();
        sphere.dispVolume();

        
        cylinder cylinder = new cylinder(6, 15);
        cylinder.calcArea();
        cylinder.calcVolume();
        cylinder.dispArea();
        cylinder.dispVolume();
    }
}
