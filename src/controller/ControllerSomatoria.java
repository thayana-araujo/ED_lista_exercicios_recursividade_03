package controller;

public class ControllerSomatoria {
	
	public double somaN(double n) {
		
		
//Se o n�mero de entrada for 1, ele retorna 1.0				
		 if (n == 1) {
		 return 1;
		 
		 }else{
//Se o n�mero de entrada for maior que 1, ent�o ser� realizada somat�ria de 1 at� o N		 
		 return 1 / n + somaN(n - 1);
			
		 }
	} 
}
