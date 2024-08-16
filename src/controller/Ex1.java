package controller;

public class Ex1 {
    public Ex1(){
        super();
    }
    public int freccontadigito(int n, int qtd){
        //O método de parada foi pensado que se o dígito for menor que 0, eu já dividi todos os números por 10.
        if(n < 1){
            return qtd;
        }else{
            //Criei a variável qtd para contar quantas vezes o número digitado foi dividido por 10.
            qtd++;
            //A chamada da função recursiva fica dividindo o valor inserido pelo usuário por 10 até cair no ponto de parada.
            return freccontadigito(n / 10, qtd);
        }
    }

}
