package figurasPlanas;

public class Circulo {
    double raio;


    public Circulo (double raio){
        this.raio = raio;
    }

    public double retornaAreaCirculo(){
        return Math.PI * (this.raio * this.raio);
    }
    public double retornaPerimetroCirculo(){
        return Math.PI * 2 * this.raio;
    }
    public String imprimirResultados(int valor){
       String resumo = String.format("O Circulo tem o perimetro de %.2f cm e sua aréa é %.2f cm", retornaPerimetroCirculo(), retornaAreaCirculo());
        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }

}
