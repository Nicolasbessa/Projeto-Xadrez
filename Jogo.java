
/**
 * Armazena o tabuleiro e responsavel por posicionar as pecas.
 * 
 * @author Alan Moraes &lt;alan@ci.ufpb.br&gt;
 * @author Leonardo Villeth &lt;lvilleth@cc.ci.ufpb.br&gt;
 */
public class Jogo {

    private Tabuleiro tabuleiro;

    public Jogo() {
        tabuleiro = new Tabuleiro();
        criarPecas();
    }
    
    /**
     * Posiciona pe�as no tabuleiro.
     * Utilizado na inicializa�ao do jogo.
     */
    private void criarPecas() {
        // PEÇAS BRANCAS
        Casa casa1 = tabuleiro.getCasa(0, 0);
        Peca peca1 = new Peca(casa1, Peca.TORRE_BRANCA);

        Casa casa2 = tabuleiro.getCasa(1, 0);
        Peca peca2 = new Peca(casa2, Peca.CAVALO_BRANCO);
        
        Casa casa3 = tabuleiro.getCasa(2, 0);
        Peca peca3 = new Peca(casa3, Peca.BISPO_BRANCO);
        
        Casa casa4 = tabuleiro.getCasa(3, 0);
        Peca peca4 = new Peca(casa4, Peca.RAINHA_BRANCA);
        
        Casa casa5 = tabuleiro.getCasa(4, 0);
        Peca peca5 = new Peca(casa5, Peca.REI_BRANCO);
        
        Casa casa6 = tabuleiro.getCasa(5, 0);
        Peca peca6 = new Peca(casa6, Peca.BISPO_BRANCO);
        
        Casa casa7 = tabuleiro.getCasa(6, 0);
        Peca peca7 = new Peca(casa7, Peca.CAVALO_BRANCO);
        
        Casa casa8 = tabuleiro.getCasa(7, 0);
        Peca peca8 = new Peca(casa8, Peca.TORRE_BRANCA);
        
        Casa casa9 = tabuleiro.getCasa(0, 1);
        Peca peca9 = new Peca(casa9, Peca.PEAO_BRANCO);
        
        Casa casa10 = tabuleiro.getCasa(1, 1);
        Peca peca10 = new Peca(casa10, Peca.PEAO_BRANCO);
        
        Casa casa11 = tabuleiro.getCasa(2, 1);
        Peca peca11 = new Peca(casa11, Peca.PEAO_BRANCO);
        
        Casa casa12 = tabuleiro.getCasa(3, 1);
        Peca peca12 = new Peca(casa12, Peca.PEAO_BRANCO);
        
        Casa casa13 = tabuleiro.getCasa(4, 1);
        Peca peca13 = new Peca(casa13, Peca.PEAO_BRANCO);
        
        Casa casa14 = tabuleiro.getCasa(5, 1);
        Peca peca14 = new Peca(casa14, Peca.PEAO_BRANCO);
        
        Casa casa15 = tabuleiro.getCasa(6, 1);
        Peca peca15 = new Peca(casa15, Peca.PEAO_BRANCO);
        
        Casa casa16 = tabuleiro.getCasa(7, 1);
        Peca peca16 = new Peca(casa16, Peca.PEAO_BRANCO);
        
        // PEÇAS PRETAS
        Casa casa17 = tabuleiro.getCasa(0, 7);
        Peca peca17 = new Peca(casa17, Peca.TORRE_PRETA);

        Casa casa18 = tabuleiro.getCasa(1, 7);
        Peca peca18 = new Peca(casa18, Peca.CAVALO_PRETO);
        
        Casa casa19 = tabuleiro.getCasa(2, 7);
        Peca peca19 = new Peca(casa19, Peca.BISPO_PRETO);
        
        Casa casa20 = tabuleiro.getCasa(3, 7);
        Peca peca20 = new Peca(casa20, Peca.RAINHA_PRETA);
        
        Casa casa21 = tabuleiro.getCasa(4, 7);
        Peca peca21 = new Peca(casa21, Peca.REI_PRETO);
        
        Casa casa22 = tabuleiro.getCasa(5, 7);
        Peca peca22 = new Peca(casa22, Peca.BISPO_PRETO);
        
        Casa casa23 = tabuleiro.getCasa(6, 7);
        Peca peca23 = new Peca(casa23, Peca.CAVALO_PRETO);
        
        Casa casa24 = tabuleiro.getCasa(7, 7);
        Peca peca24 = new Peca(casa24, Peca.TORRE_PRETA);
        
        Casa casa25 = tabuleiro.getCasa(0, 6);
        Peca peca25 = new Peca(casa25, Peca.PEAO_PRETO);
        
        Casa casa26 = tabuleiro.getCasa(1, 6);
        Peca peca26 = new Peca(casa26, Peca.PEAO_PRETO);
        
        Casa casa27 = tabuleiro.getCasa(2, 6);
        Peca peca27 = new Peca(casa27, Peca.PEAO_PRETO);
        
        Casa casa28 = tabuleiro.getCasa(3, 6);
        Peca peca28 = new Peca(casa28, Peca.PEAO_PRETO);
        
        Casa casa29 = tabuleiro.getCasa(4, 6);
        Peca peca29 = new Peca(casa29, Peca.PEAO_PRETO);
        
        Casa casa30 = tabuleiro.getCasa(5, 6);
        Peca peca30 = new Peca(casa30, Peca.PEAO_PRETO);
        
        Casa casa31 = tabuleiro.getCasa(6, 6);
        Peca peca31 = new Peca(casa31, Peca.PEAO_PRETO);
        
        Casa casa32 = tabuleiro.getCasa(7, 6);
        Peca peca32 = new Peca(casa32, Peca.PEAO_PRETO);
     
    }
    
    /**
     * Comanda uma Pe�a na posicao (origemX, origemY) fazer um movimento 
     * para (destinoX, destinoY).
     * 
     * @param origemX linha da Casa de origem.
     * @param origemY coluna da Casa de origem.
     * @param destinoX linha da Casa de destino.
     * @param destinoY coluna da Casa de destino.
     */
    public void moverPeca(int origemX, int origemY, int destinoX, int destinoY) {
        Casa origem = tabuleiro.getCasa(origemX, origemY);
        Casa destino = tabuleiro.getCasa(destinoX, destinoY);
        Peca peca = origem.getPeca();
        peca.mover(destino);
    }
    
    /**
     * @return o Tabuleiro em jogo.
     */
    public Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
}
