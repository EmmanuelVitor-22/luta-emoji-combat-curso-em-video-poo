package negocio;

import java.util.Random;

public class Luta {
    private  Lutador desafiado;
    private  Lutador desafiante;
    private int round;
    private boolean aprovada;

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador desafiante, Lutador desafiado, boolean aprovada){
        if ((this.getDesafiante().getCategoria() == this.getDesafiado().getCategoria()) &&
        this.getDesafiado()!= this.getDesafiante()){
            this.aprovada = true;
            this.desafiante = desafiante;
            this.desafiado = desafiado;
        }else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void lutar() {
        if (aprovada){
            desafiado.apresentarLutador();
            desafiante.apresentarLutador();
            int resultado =  new Random().nextInt(0,2);
            switch (resultado){
                case 0:
                    System.out.println("empate");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    //desafiante ganha çuta
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
                case 2:
                    //desafiado ganha çuta
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
            }
        }else {
            System.out.println("Luta não pode acontecer");
        }

    }
}
