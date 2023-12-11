package figurasEspaciais;

public class PiramideBaseQuadrada {
    double arestaBase;
    double apotema;
    double altura;

    public PiramideBaseQuadrada(double arestaBase, double apotema, double altura) {
        this.arestaBase = arestaBase;
        this.apotema = apotema;
        this.altura = altura;
    }

    public double retornarVolumePiramideBaseQuadrada(){
        return (retornaAreaPiramideBaseQuadrada() * this.altura)/3;
    }
    public double retornaAreaPiramideBaseQuadrada(){
        return (2 * this.arestaBase * this.apotema) + Math.pow(this.arestaBase, 2);
    }
    public String imprimirResultados(int valor){
        String resumo = String.format("A Piramide de Base Quadrada tem o volume de %.2f cm e sua aréa superficial é %.2f cm", retornarVolumePiramideBaseQuadrada(), retornaAreaPiramideBaseQuadrada());
        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
