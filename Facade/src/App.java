public class App {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto(0, "Pneu Michelan");
        PedidoFacade pedidoFacade = new PedidoFacade(new ServicoEstoque(), new ServicoPagamento(), new ServicoRemessa());
        pedidoFacade.processOrder(produto);
    }
}
