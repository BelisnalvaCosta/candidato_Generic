package com.univesp.candidato_Generic;

import com.univesp.candidato_Generic.entities.Candidato;

import java.util.Scanner;

public class Programa extends Candidato {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("******** URNA ********");
        System.out.println("(12) Marta (Pl)");
        System.out.println("(16) José (PMDB");
        System.out.println("(18) Roberto (PT)");
        System.out.println("(20) Maria Silva (PHR)");
        System.out.println("(0) Branco");
        System.out.println("(1) Nulo");

        System.out.println("******** URNA ********");
        int votos = sc.nextInt();
        int votosMarta = 0;
        int votosJosé = 0;
        int votosRoberto = 0;
        int votosMariaSilva = 0;
        int votosEmBranco = 0;
        int votosNulo = 0;
        int votoTotal = 0;
        int votosCandidato = 0;
        int maior = 0;
        String nome = "";
        String vencedor="";
        String partido ="";


        while (votos >= 0) {
            if (votos == 12) {
                votosMarta = votosMarta + 1;
                System.out.println("O seu voto foi computado para a candidata Marta ");
            } else if (votos == 16) {
                votosJosé++;
                System.out.println("O seu voto foi computado para o candidato José");
            } else if (votos == 18) {
                votosRoberto++;
                System.out.println("O seu voto foi computado para o candidato Roberto");
            } else if (votos == 20) {
                votosMariaSilva++;
                System.out.println("O seu voto foi computado para a candidata Maria Silva ");
            }
            if (votos == 0) {
                votosEmBranco++;
                System.out.println("Você votou Branco");
            }
            if (votos == 1) {
                votosNulo++;
                System.out.println("Você votou Nulo");
            } else if(votos < 0) {
                System.out.println("Candidato não existe, vote novamente");
            }
            if (votos == 12 || votos == 16 || votos == 18 || votos == 20 || votos == 0 || votos == 1) {
                votoTotal++;
                votosCandidato++;
            }

            if(votosMarta > maior) {
                maior = votosMarta;
                vencedor = "Marta\n";
                partido = "PL";

            } if(votosJosé > maior) {
                maior = votosJosé;
                vencedor = "José";
                partido = "PMDB";

            } if(votosRoberto > maior) {
                maior = votosRoberto;
                vencedor = "Roberto";
                partido = "PT";

            } if(votosMariaSilva > maior) {
                maior = votosMariaSilva;
                vencedor = "Maria Silva";
                partido = "PR";
            }

            System.out.println("vote novamente: ");
            System.out.println("(-1) para Sair");
            votos = sc.nextInt();
        }

        System.out.println("******** Resultado ******** CORRIGIR!!!");
        System.out.println("* Total de votos dos Candidatos, dividido por porcentagem = 100% *\n");;

        System.out.println("Total de votos: " + votoTotal + " = 100%");
        double porcMarta = (100 * votosMarta) / votoTotal;
        System.out.println("Marta = " + porcMarta + "%\n");

        System.out.println("Total de votos: " + votoTotal + " = 100%");
        double porcJosé = (100 * votosJosé) / votoTotal;
        System.out.println("José = " + porcJosé + "%\n");

        System.out.println("Total de voto(s): " + votoTotal + " = 100%");
        double porcRoberto = (100 * votosRoberto) / votoTotal;
        System.out.println("Roberto = " + porcRoberto + "%\n");

        System.out.println("Total de voto(s): " + votoTotal + " = 100%");
        double porcMariaSilva = (100 * votosMariaSilva) / votoTotal;
        System.out.println("Maria Silva = " + porcMariaSilva + "%\n");

        double porcBranco = (100 * votosEmBranco) / votoTotal;
        System.out.println("Votos em branco: " + porcBranco + "%");

        double porcNulo = (100 * votosNulo) / votoTotal;
        System.out.println("Votos nulo: " + porcNulo + "%\n");

        System.out.println("Total geral de números de votos: " + votoTotal);
        System.out.println("Vencedor: " + vencedor + " - " + partido);
        sc.close();
    }
}