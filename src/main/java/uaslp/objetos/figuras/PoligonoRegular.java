package uaslp.objetos.figuras;

public class PoligonoRegular implements Figura{

    private int numeroDeLados;
    private double lado;
    private double area;
    public PoligonoRegular(int numeroDeLados){
        if(numeroDeLados<5){
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }

        this.numeroDeLados=numeroDeLados;
    }
    public PoligonoRegular(int numeroDeLados, double lado){
        if(numeroDeLados<5){
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }

        this.numeroDeLados=numeroDeLados;
        this.lado=lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if(numeroDeLados<5){
            throw new NumeroInvalidoDeLados("Número de lados válido a partir de 5");
        }

        this.lado = lado;
    }

    public double getArea() {
        double perimetro;
        double apotema;
        double anguloCentral;
        perimetro=numeroDeLados*lado;
        anguloCentral=360/numeroDeLados;
        apotema=lado/(2*Math.tan(Math.toRadians(anguloCentral/2)));
        area=(perimetro*apotema)/2;
        return area;
    }

    @Override
    public String getName() {
        return "Poligono Regular";
    }
}
