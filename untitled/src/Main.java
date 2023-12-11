import figurasPlanas.*;
import figurasEspaciais.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int escolha, escolhaPlana, escolhaEspacial, valor=0;
        double lado, raio, base, altura, largura, comprimento, arestaBase, apotema;
        String nome;

        System.out.print("Informe seu nome: ");
        nome = leia.nextLine();

        while (true) {

            try {
                System.out.printf("%s digite um número, se o número inserido for par os caracteres serão maiúsculos e " +
                        "se for ímpar os caracteres serão minúsculos: ", nome);
                valor = Integer.parseInt(leia.nextLine());
                if (valor <= 0) {
                    System.out.println("Digite números maiores de 0\n");
                    continue;
                }
            }catch (NumberFormatException e){
                System.out.println("Digite apenas números");
                continue;
            }

            try {
                System.out.printf("\n%s voce deseja escolher: \n1 - figuras planas \n2 - figuras espaciais \n3 - Sair\n", nome);
                escolha = Integer.parseInt(leia.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Digite apenas números");
                continue;
            }


            if (escolha == 1) {

                System.out.printf("""
                        \n%s escolha qual forma geometrica plana voce gostario de saber o perimetro e a area
                        1 - Quadrado\s
                        2 - Retangulo\s
                        3 - Triangulo\s
                        4 - Circulo\s
                        5 - Hexagono\s
                        6 - Sair\n""", nome);
                escolhaPlana = Integer.parseInt(leia.nextLine());

                
                switch (escolhaPlana) {
                    case 1 -> {
                        while (true) {
                            try {
                                System.out.println("Informe a lado do quadrado em cm: ");
                                lado = Double.parseDouble(leia.nextLine());
                                if (lado <= 0) {
                                    System.out.println("Digite números maiores de 0\n");
                                    continue;
                                } else {
                                    Quadrado quadrado = new Quadrado(lado);
                                    System.out.println(quadrado.imprimirResultados(valor));
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Digite apenas números");
                            }
                        }
                    }
                    case 2 -> {
                        while (true) {
                            try {
                                System.out.println("Informe a base do retangulo em cm: ");
                                base = Double.parseDouble(leia.nextLine());
                                System.out.println("Informe a altura do retangulo em cm: ");
                                altura = Double.parseDouble(leia.nextLine());
                                if (base <= 0 || altura <= 0) {
                                    System.out.println("Digite números maiores de 0\n");
                                    continue;
                                } else {
                                    Retangulo retangulo = new Retangulo(base, altura);
                                    System.out.println(retangulo.imprimirResultados(valor));
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Digite apenas números");
                            }
                        }
                    }
                    case 3 -> {
                        while (true) {
                            try {
                                System.out.println("Informe o lado do triangulo em cm: ");
                                lado = Double.parseDouble(leia.nextLine());
                                if (lado <= 0) {
                                    System.out.println("Digite números maiores de 0\n");
                                    continue;
                                } else {
                                    trianguloEquilatero trianguloEquilatero = new trianguloEquilatero(lado);
                                    System.out.println(trianguloEquilatero.imprimirResultados(valor));
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Digite apenas números");
                            }
                        }
                    }
                    case 4 -> {
                        while (true) {
                            try {
                                System.out.println("Informe o raio do circulo em cm: ");
                                raio = Double.parseDouble(leia.nextLine());
                                if (raio <= 0) {
                                    System.out.println("Digite números maiores de 0\n");
                                    continue;
                                } else {
                                    Circulo circulo = new Circulo(raio);
                                    System.out.println(circulo.imprimirResultados(valor));
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Digite apenas números");
                            }
                        }
                    }
                    case 5 -> {
                        while (true) {
                            try {
                                System.out.println("Informe o lado do hexagono em cm: ");
                                lado = Double.parseDouble(leia.nextLine());
                                if (lado <= 0) {
                                    System.out.println("Digite números maiores de 0\n");
                                    continue;
                                } else {
                                    Hexagono hexagono = new Hexagono(lado);
                                    System.out.println(hexagono.imprimirResultados(valor));
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Digite apenas números");
                            }
                        }
                    }
                    case 6 -> {
                        leia.close();
                        System.exit(0);
                    }
                    default -> System.out.println("Opção Invalida!");
                }
            }
            else if (escolha == 2){

                System.out.printf("""
                        \n%s escolha qual forma geometrica plana voce gostario de saber o volume e a area
                        1 - Cubo\s
                        2 - Paralelepípedo\s
                        3 - Cilindro\s
                        4 - Cone\s
                        5 - Pirâmide de base quadrada\s
                        6 - Esfera\s
                        7 - Sair\n""", nome);
                escolhaEspacial = Integer.parseInt(leia.nextLine());

                switch (escolhaEspacial){
                    case 1 -> {
                        while (true) {
                            try {
                                System.out.println("Informe o lado do Cubo em cm: ");
                                lado = Double.parseDouble(leia.nextLine());
                                if (lado <= 0) {
                                    System.out.println("Digite números maiores de 0\n");
                                    continue;
                                } else {
                                    Cubo cubo = new Cubo(lado);
                                    System.out.println(cubo.imprimirResultados(valor));
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Digite apenas números");
                            }
                        }
                    }
                    case 2 -> {
                        while (true) {
                            try {
                                System.out.println("Informe o comprimento do Paralelepípedo em cm: ");
                                comprimento = Double.parseDouble(leia.nextLine());
                                System.out.println("Informe a largura do Paralelepípedo em cm: ");
                                largura = Double.parseDouble(leia.nextLine());
                                System.out.println("Informe altura do Paralelepípedo em cm: ");
                                altura = Double.parseDouble(leia.nextLine());
                                if (comprimento <= 0 || largura <= 0 || altura <= 0) {
                                    System.out.println("Digite números maiores de 0\n");
                                    continue;
                                } else {
                                    Paralelepipedo paralelepipedo = new Paralelepipedo(comprimento, altura, largura);
                                    System.out.println(paralelepipedo.imprimirResultados(valor));
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Digite apenas números");
                            }
                        }
                    }
                    case 3 -> {
                        while (true) {
                            try {
                                System.out.println("Informe a altura do Cilindro em cm: ");
                                altura = Double.parseDouble(leia.nextLine());
                                System.out.println("Informe o raio do Cilindro em cm: ");
                                raio = Double.parseDouble(leia.nextLine());
                                if (altura <= 0 || raio <= 0) {
                                    System.out.println("Digite números maiores de 0\n");
                                    continue;
                                } else {
                                    Cilindro cilindro = new Cilindro(raio, altura);
                                    System.out.println(cilindro.imprimirResultados(valor));
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Digite apenas números");
                            }
                        }
                    }
                    case 4 -> {
                        while (true) {
                            try {
                                System.out.println("Informe a altura do Cone em cm: ");
                                altura = Double.parseDouble(leia.nextLine());
                                System.out.println("Informe o raio do Cone em cm: ");
                                raio = Double.parseDouble(leia.nextLine());
                                if (altura <= 0 || raio <= 0) {
                                    System.out.println("Digite números maiores de 0\n");
                                    continue;
                                } else {
                                    Cone cone = new Cone(raio, altura);
                                    System.out.println(cone.imprimirResultados(valor));
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Digite apenas números");
                            }
                        }
                    }
                    case 5 -> {
                        while (true) {
                            try {
                                System.out.println("Informe o valor da apotema da Piramide em cm: ");
                                apotema = Double.parseDouble(leia.nextLine());
                                System.out.println("Informe o valor da aresta da base da Piramide em cm: ");
                                arestaBase = Double.parseDouble(leia.nextLine());
                                System.out.println("Informe o valor da altura da Piramide em cm: ");
                                altura = Double.parseDouble(leia.nextLine());

                                if (apotema <= 0 || arestaBase <= 0 || altura <= 0) {
                                    System.out.println("Digite números maiores de 0\n");
                                    continue;
                                } else {
                                    PiramideBaseQuadrada piramideBaseQuadrada = new PiramideBaseQuadrada(arestaBase, apotema, altura);
                                    System.out.println(piramideBaseQuadrada.imprimirResultados(valor));
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Digite apenas números");
                            }
                        }
                    }
                    case 6 -> {
                        while (true) {
                            try {
                                System.out.println("Informe o raio da esfera em cm: ");
                                raio = Double.parseDouble(leia.nextLine());
                                if (raio <= 0) {
                                    System.out.println("Digite números maiores de 0\n");
                                    continue;
                                } else {
                                    Esfera esfera = new Esfera(raio);
                                    System.out.println(esfera.imprimirResultados(valor));
                                }
                                break;
                            } catch (NumberFormatException e) {
                                System.out.println("Digite apenas números");
                            }
                        }
                    }
                    case 7 -> {
                        leia.close();
                        System.exit(0);
                    }
                    default -> System.out.println("Opção Invalida!");
                }
            }

            else if (escolha == 3) {
                System.out.println("Saindo da Calculadora Geométrica");
                System.exit(0);
            }

            else {
                System.out.println("Opção Invalida!");
            }
        }
    }
}