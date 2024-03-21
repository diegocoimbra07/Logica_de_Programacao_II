/*3 - Criar um método que receba um número que corresponda a um mês 
do 1º trimestre e escreva o mês correspondente; caso o usuário 
digite o número fora do intervalo deverá aparecer inválido. */

package Aula8_15_3;

 class Trimestre { //criando a classe
    public String MesTrimestre(int mes){ // metodo público que recebe inteiro mes
        switch (mes){ // valor da variável
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            default:
                return "Inválido";
        }
}
 

public static void Questao3(String[] args) {
    Trimestre trimestre = new Trimestre(); //criando uma instância da classe
    for (int i = 0; i < 5; i++){ // interar de 0 a 4
        System.out.println(i + ": " + trimestre.MesTrimestre(i));
    }
}
}