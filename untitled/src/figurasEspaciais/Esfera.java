package figurasEspaciais;

public class Esfera {
    double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double retornarVolumeEsfera(){
        return (1.33) * Math.PI * Math.pow(this.raio, 3);
    }
    public double retornaAreaEsfera(){
        return 4 + Math.PI * Math.pow(this.raio, 2);
    }

    public String imprimirResultados(int valor){
        String resumo = String.format("A Esfera tem o volume de %.2f cm e sua aréa superficial é %.2f cm", retornarVolumeEsfera(), retornaAreaEsfera());
        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
        return resumo.toLowerCase();
    }
}
