package figurasEspaciais;

public class Cubo {
    double lado;

    public Cubo(double lado){
        this.lado = lado;
    }
    public double retornarVolumeCubo(){
        return Math.pow(this.lado, 3);
    }
    public double retornaAreaCubo(){
        return Math.pow(this.lado, 2) * 6;
    }

    public String imprimirResultados(int valor){
        String resumo = String.format("O Cubo tem o volume de %.2f cm e sua aréa superficial é %.2f cm", retornarVolumeCubo(), retornaAreaCubo());
        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
