package dio.junior.primeiropacote;

public class MinhaClasse{
    //classe MinhaClasse
    
    public static void main (String [] args){
        //metodo
    
    
        //void vai execultar uma tarefa mas não vai me retornar nada
        //main é o nome do metodo
        //String tipo que arquivo que eu estou esperando
        //args = array 


        //System.out.print ("Hello word");

        //int ano = 2021;
        //ano = 2022;
        // Variavél pode mudar o valor


        //final String BR = "Brasil";
        // quando a variavel é com todas letras maisculas, ela é final, ou seja, não pode ser alterado o valor

        String primeiroNome = "Junior";
        String segundoNome = "Cintra";
            
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        //String variavel = chamou o metodo nomeCompleto(resultado);

        System.out.println(nomeCompleto);
        //Imprima na tela o valor da minha variavél nomeCompleto

        
    }


    public static String nomeCompleto (String primeiroNome, String segundoNome){
        //segundo metodo
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
        //retorne a concatenação do primeiro nome com o segundo usando metodo concat para o metodo void main
    }
}