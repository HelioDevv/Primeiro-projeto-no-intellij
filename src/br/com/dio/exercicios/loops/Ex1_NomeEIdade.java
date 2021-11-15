package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Diga o Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;
            System.out.println("Diga a Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Continua aqui...");

    }
    public class Informe{
        private String nome;
        private int idade;

        public Informe(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
    }
}
