public class rightTriangle {
    private double base;
    private double height;

    public rightTriangle(double base, double height){
    this.base = base;
    this.height = height;
    }

    public double hypotenuse(){
        double hypo = Math.sqrt(Math.pow(base,2)+Math.pow(height,2));
        System.out.println(hypo);
        return hypo;
    }

}
