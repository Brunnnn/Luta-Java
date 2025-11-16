import java.util.Random;

public class Luta {
    //atributos
    private lutador desafiado;
    private lutador desafiante;
    private int rounds;
    private boolean aprovada;
    private int DesafiadoVida;
    private int DesafianteVida;

    //construtor

    //get e set
    public lutador getDesafiado() {
        return desafiado;
    }
    public int getDesafiadoVida() {
        return DesafiadoVida;
    }
    public void setDesafiadoVida(int desafiadoVida) {
        DesafiadoVida = desafiadoVida;
    }
    public int getDesafianteVida() {
        return DesafianteVida;
    }
    public void setDesafianteVida(int desafianteVida) {
        DesafianteVida = desafianteVida;
    }
    public void setDesafiado(lutador desafiado) {
        this.desafiado = desafiado;
    }
    public lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(lutador desafiante) {
        this.desafiante = desafiante;
    }
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int r) {
        this.rounds = r;
    }
    public boolean getAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean a) {
        this.aprovada = a;
    }


    //metodos
    public void marcarluta(lutador l1, lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 !=l2 ){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }


    //Metodo da luta
    public void lutar(int rounds) throws InterruptedException {
    if (!this.getAprovada()) {
        System.out.println("Luta não aprovada");
        return;
    }

    System.out.println("------UEC 001!------");
    System.out.println(this.desafiado.getNome() + " VS " + this.desafiante.getNome());
    System.out.println();
    
    this.desafiante.apresentar();
    this.desafiado.apresentar();
    
    System.out.println("----COMEÇA A LUTA!!----");
    System.out.println(" ");

    Random aleatorio = new Random();
    
    // Controle de rounds - CADA ROUND É UMA LUTA COMPLETA
    for (int round = 1; round <= rounds; round++) {

        this.setDesafiadoVida(100);
        this.setDesafianteVida(100);

        boolean roundTerminou = false;
        System.out.println("=== Round " + round + " ===");
        
        // LUTA COMPLETA DENTRO DO ROUND
        while (this.getDesafiadoVida() > 0 && this.getDesafianteVida() > 0 && !roundTerminou) {
            Thread.sleep(2000);
            
            int atacante = aleatorio.nextInt(2);
            int defesa = aleatorio.nextInt(2);
            int golpe = aleatorio.nextInt(3);

            if (atacante == 0) {
                System.out.print(this.desafiado.getNome() + " ");
                switch (golpe) {
                    case 0:
                        System.out.print("dá um soco no " + this.desafiante.getNome());
                        if (defesa == 0) {
                            System.out.println(" que evita o soco pois defendeu!");
                        } else {
                            int vida_atual = getDesafianteVida() - 15;
                            vida_atual = (vida_atual > 0) ? vida_atual : 0;  
                        
                            this.setDesafianteVida(vida_atual);
                            System.out.println(" que leva -15 pontos de vida!");
                        }
                        break;
                    case 1:
                        System.out.print("dá um chute em " + this.desafiante.getNome());
                        if (defesa == 0) {
                            System.out.println(" que evita o chute pois defendeu!");
                        } else {
                            int vida_atual = getDesafianteVida() - 30;
                            vida_atual = (vida_atual > 0) ? vida_atual : 0; 

                            this.setDesafianteVida(vida_atual);
                            System.out.println(" que leva o chute! Perdendo -30 de vida!");
                        }
                        break;
                    case 2:
                        System.out.print("tenta derrubar " + this.desafiante.getNome());
                        if (defesa == 0) {
                            System.out.println(" que rapidamente evita a queda!");
                        } else {
                            int vida_atual = getDesafianteVida() - 50;
                            vida_atual = (vida_atual > 0) ? vida_atual : 0; 

                            this.setDesafianteVida(vida_atual);
                            System.out.println(" que vai ao chão! Perdendo 50 de vida!");
                        }
                        break;
                }
            } else {
                System.out.print(this.desafiante.getNome() + " ");
                switch (golpe) {
                    case 0:
                        System.out.print("dá um soco no " + this.desafiado.getNome());
                        if (defesa == 0) {
                            System.out.println(" que evita o soco pois defendeu!");
                        } else {
                            int vida_atual = getDesafiadoVida() - 15;
                            vida_atual = (vida_atual > 0) ? vida_atual : 0; 

                            this.setDesafiadoVida(vida_atual);
                            System.out.println(" que leva -15 pontos de vida!");
                        }
                        break;
                    case 1:
                        System.out.print("dá um chute em " + this.desafiado.getNome());
                        if (defesa == 0) {
                            System.out.println(" que evita o chute pois defendeu!");
                        } else {
                            int vida_atual = getDesafiadoVida() - 30;
                            vida_atual = (vida_atual > 0) ? vida_atual : 0;

                            this.setDesafiadoVida(vida_atual);
                            System.out.println(" que leva o chute! Perdendo -30 de vida!");
                        }
                        break;
                    case 2:
                        System.out.print("tenta derrubar " + this.desafiado.getNome());
                        if (defesa == 0) {
                            System.out.println(" que rapidamente evita a queda!");
                        } else {
                            int vida_atual = getDesafiadoVida() - 50;
                            vida_atual = (vida_atual > 0) ? vida_atual : 0;

                            this.setDesafiadoVida(vida_atual);
                            System.out.println(" que vai ao chão! Perdendo 50 de vida!");
                        }
                        break;
                }
            }
            
            // Mostrar vida atualizada
            System.out.println("Vida: " + this.desafiado.getNome() + " = " + 
                              this.getDesafiadoVida() + " | " + 
                              this.desafiante.getNome() + " = " + 
                              this.getDesafianteVida());
            System.out.println();

            // Verificar se a luta terminou
            if (this.getDesafiadoVida() == 0 || this.getDesafianteVida() == 0) {
                roundTerminou = true;
                System.out.println("=== FIM DO ROUND " + round + " (NOCAUTE!) ===");
            }
        }   

        if (this.getDesafiadoVida() > 0 && this.getDesafianteVida() > 0) {
            System.out.println("=== FIM DO ROUND " + round + " (DECISÃO DOS JUIZES) ===");
        }
        // Se chegou aqui, o round terminou sem nocaute - preparar próximo round
        if (this.getDesafiadoVida() > 0 && this.getDesafianteVida() > 0 && round < rounds) {
            System.out.println("Preparando próximo round...");
            Thread.sleep(3000);
        }
    }

    // Determinar resultado final
    System.out.println("=== RESULTADO FINAL ===");
    determinarVencedor();
}

    private void determinarVencedor() {
        int vencedor;
        if (this.getDesafiadoVida() > this.getDesafianteVida()) {
            vencedor = 1;
        } else if (this.getDesafianteVida() > this.getDesafiadoVida()) {
            vencedor = 2;
        } else {
            vencedor = 0; // Empate
        }
        
        switch (vencedor) {
            case 0: {
                System.out.println("Empate!");
                this.desafiado.empatarluta();
                this.desafiante.empatarluta();
                break;
            }
            case 1: {
                System.out.println("Mais uma vitória de " + this.desafiado.getNome() + "!!");
                this.desafiado.ganharluta();
                this.desafiante.perderluta();
                break;
            }
            case 2: {
                System.out.println("Mais uma vitória de " + this.desafiante.getNome() + "!!");
                this.desafiante.ganharluta();
                this.desafiado.perderluta();
                break;
            }
        }
    }
}
    

