package com.gof.strategy;

public class Robo {
    private IComportamento comportamento;

    public void setComportamento(IComportamento strategy) {
        this.comportamento = strategy;
    }

    public void mover(){
        comportamento.mover();
    }
}
