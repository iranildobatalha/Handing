package com.example.iranildoefamilia.handing;

public class Entrega {
    private String nome;
    private String local;
    private boolean entregue = false;
    private String horaEntrega;

    public Entrega(String nome,String local){
        this.nome = nome;
        this.local = local;
    }

    public boolean isEntregue(){
        return this.entregue;
    }

    public void entregar(){
        if(!isEntregue()){
            this.entregue = true;
        }
    }
}
