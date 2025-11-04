public class consumidor {
    public static void main(String[] args) {

        absHandler autorizador = cadeiaAutorizacao.getCadeia();


        System.out.println("--- Teste 1: Valor R$ 500 ---");
        autorizador.handleRequest(500); // Esperado: Comprador

        System.out.println("\n--- Teste 2: Valor R$ 10.000 ---");
        autorizador.handleRequest(10000); // Esperado: Gerente

        System.out.println("\n--- Teste 3: Valor R$ 100.000 ---");
        autorizador.handleRequest(100000); // Esperado: Diretor
    }
}