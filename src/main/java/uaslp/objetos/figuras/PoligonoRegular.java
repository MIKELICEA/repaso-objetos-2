package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura{

    private double lado;
    private int numeroDeLados;
    private double area;

    public PoligonoRegular(int numeroDeLados)
    {
        this.numeroDeLados=numeroDeLados;
    }

    public PoligonoRegular(int numeroDeLados, double lado)
    {
        this.numeroDeLados=numeroDeLados;
        this.lado=lado;
    }

    public double getLado()
    {
        return lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado;
    }

    public double getArea()
    {
        double perimetro, apotema, anguloCentral;
        perimetro=numeroDeLados*lado;
        anguloCentral=360/(double)numeroDeLados;
        apotema=lado/(2*Math.tan(Math.toRadians(anguloCentral/2)));
        area=(perimetro*apotema)/2;
        return area;
    }

    @Override
    public String getName() {
        return "Poligono Regular";
    }
}
