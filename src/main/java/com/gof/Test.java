package com.gof;

import com.gof.facade.Facade;
import com.gof.singleton.SingletonLazy;
import com.gof.strategy.*;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        //singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        SingletonLazy lazy2 = SingletonLazy.getInstancia();
        System.out.println(lazy2);

        //strategy

        IComportamento normal = new ComportamentoNormal();
        IComportamento defensivo = new ComportamentoDefensivo();
        IComportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        //facade
        Facade facade = new Facade();
        facade.migrarCliente("nome teste", "0001");

    }
}
