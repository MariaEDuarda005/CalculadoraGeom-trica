package figurasPlanas;

public class Hexagono {
    double lado;

    public Hexagono (double lado){
        this.lado = lado;
    }

    public double retornaAreaHexagono(){
        return 6 * (this.lado * (Math.sqrt(3)/2));
    }
    public double retornaPerimetroHexagono(){
        return this.lado * 6;
    }

    public String imprimirResultados(int valor){
        String  resumo = String.format("O Hexagono tem o perimetro de %.2f cm e sua aréa é %.2f cm", retornaPerimetroHexagono(), retornaAreaHexagono());
        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
