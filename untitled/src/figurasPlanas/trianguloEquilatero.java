package figurasPlanas;

public class trianguloEquilatero {
    double lado;

    public trianguloEquilatero(double lado){
        this.lado = lado;
    }

    public double retornaAreaTriangulo(){
        return this.lado * (Math.sqrt(3)/2);
    }
    public double retornaPerimetroTriangulo(){
        return (3 * this.lado);
    }

    public String imprimirResultados(int valor){
        String resumo = String.format("O Triangulo tem o perimetro de %.2f cm e sua aréa é %.2f cm", retornaPerimetroTriangulo(), retornaAreaTriangulo());
        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }

}
