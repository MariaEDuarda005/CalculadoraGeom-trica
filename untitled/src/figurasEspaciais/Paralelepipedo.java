package figurasEspaciais;

public class Paralelepipedo {
    double comprimento;
    double altura;
    double largura;

    public Paralelepipedo (double comprimento, double altura, double largura){
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }
    public double retornarVolumeParalelepipedo(){
        return this.comprimento * this.altura * this.largura;
    }
    public double retornaAreaParalelepipedo(){
        return 2 * ((this.comprimento * this.altura) + (this.altura * this.largura) + (this.comprimento * this.largura));
    }
    public String imprimirResultados(int valor){
        String resumo = String.format("O Paralelepipedo tem o volume de %.2f cm e sua aréa superficial " +
                "é %.2f cm", retornarVolumeParalelepipedo(), retornaAreaParalelepipedo());
        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
