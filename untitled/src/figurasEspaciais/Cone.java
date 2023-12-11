package figurasEspaciais;

public class Cone {
    double raio;
    double altura;

    public Cone (double raio, double altura){
        this.raio = raio;
        this.altura = altura;
    }

    public double retornarVolumeCone(){
        return (Math.PI * this.altura * Math.pow(this.raio, 2))/3;
    }
    public double retornaAreaCone(){
        return Math.PI * this.raio * Math.sqrt((Math.pow(this.altura,2) + Math.pow(this.raio, 2)));
    }
    public String imprimirResultados(int valor){
        String resumo = String.format("O Cone tem o volume de %.2f cm e sua aréa superficial é " +
                "%.2f cm", this.retornarVolumeCone(), this.retornaAreaCone());
        if (valor % 2 == 0){
            return resumo.toUpperCase();
        }
            return resumo.toLowerCase();
    }
}
