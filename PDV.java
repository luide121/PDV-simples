  package mercado;
  
  import java.util.Scanner;
  
  public class PDV {
    public static void main(String[] args) {
	
    	Scanner input = new Scanner(System.in);
    	double total = 0;
    	boolean continuar = true;
    	
    	while (continuar) {
    		System.out.println("Digite o nome do produto:");
    		String nomeProduto = input.nextLine();
    		
    		System.out.println("Digite o preço do produto:");
    		double precoProduto = input.nextDouble();
    		
    		System.out.println("Digite a quantidade:");
    		int quantidade = input.nextInt();
    		input.nextLine();
    		 
    		double precoTotal = precoProduto * quantidade;
    		System.out.println(nomeProduto +" - R$ " + precoTotal);
    		
    		total += precoTotal;
    		
    		System.out.println("Deseja adicionar mais algum produto? (S/N)");
    		String opcao = input.nextLine();
    		
    		if (opcao.equalsIgnoreCase("N")) {
    			continuar = false;
    		}
    		
    		
    	}
    	
	    System.out.println("Total: R$ " + total);
	       
    }
}
