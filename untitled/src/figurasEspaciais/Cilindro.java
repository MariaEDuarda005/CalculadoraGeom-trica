package figurasEspaciais;

public class Cilindro {
    double raio;
    double altura;

    public Cilindro (double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }

    public double retornarVolumeCilindro(){
        return Math.PI * altura * Math.pow(raio, 2);
    }
    public double retornaAreaCilindro(){
        return (2 * Math.PI * raio * altura) + (2 * Math.PI * Math.pow(raio,2));
    }

    public String imprimirResultados(int valor){
        String resumo = String.format("O Cilindro tem o volume de %.2f cm e sua aréa superficial é %.2f cm", retornarVolumeCilindro(), retornaAreaCilindro());
        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
