package br.eu.banco;

import br.eu.banco.newpackage.ContaBanco;


public class Main {

    public static void main(String[] args) {
        ContaBanco p1 =  new ContaBanco ();
        p1.setNmrConta( 12344);
        p1.setDono("Xandão o  grande");
        p1.abrirConta("CP");
        p1.estadoAtual();
     
        ContaBanco p2 = new ContaBanco();
        p2.setNmrConta(  312435);
        p2.setDono("Julia");
        p2.abrirConta("CC");
        p2.estadoAtual();
    }
}
