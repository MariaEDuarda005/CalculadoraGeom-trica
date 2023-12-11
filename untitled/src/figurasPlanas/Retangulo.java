package figurasPlanas;

public class Retangulo {
    double base;
    double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double retornaAreaRetangulo(){
        return this.base * this.altura;
    }
    public double retornaPerimetroRetangulo(){
        return (2 * this.base) + (2 * this.altura);
    }

    public String imprimirResultados(int valor){
        String resumo = String.format("O retangulo tem o perimetro de %.2f cm e sua aréa é %.2f cm", retornaPerimetroRetangulo(), retornaAreaRetangulo());
        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }

}
