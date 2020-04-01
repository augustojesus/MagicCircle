
class Circulo{
	

	public static void main (String []args){
		long total = 0, tamanho = 2000000000;
		total = ((1+tamanho)*tamanho)/2;
		tamanho*=tamanho;
		for(long i = 1; (tamanho > (total+i*i)); i++){
				long raiz = (long) Math.sqrt(total+i*i);
				if((raiz*raiz)==(total+i*i)){
					double soma = (total - (i+raiz) / 2);
					System.out.println("*** "+i+" e "+raiz+" = "+(long)soma);
				}
		}	
	}
	
}
