package controller;

public class ControllerSomatoria {
	
	public double somaN(double n) {
		
		
//Se o número de entrada for 1, ele retorna 1.0				
		 if (n == 1) {
		 return 1;
		 
		 }else{
//Se o número de entrada for maior que 1, então será realizada somatória de 1 até o N		 
		 return 1 / n + somaN(n - 1);
			
		 }
	} 
}
