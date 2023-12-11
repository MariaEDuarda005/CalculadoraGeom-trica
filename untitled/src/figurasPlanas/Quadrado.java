package figurasPlanas;

public class Quadrado {
    double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }
    public double retornaAreaQuadrado(){
        return this.lado * this.lado;
    }
    public double retornaPerimetroQuadrado(){
        return this.lado * 4;
    }

    public String imprimirResultados(int valor){
        // Formatação com printf(%.2f%n) no final da linha
        String resumo = String.format("O quadrado tem o perimetro de %.2f cm e sua aréa é %.2f cm", retornaPerimetroQuadrado(), retornaAreaQuadrado());
        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }

}
