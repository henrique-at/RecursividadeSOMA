package controller;

public class SomaController {

	public SomaController() {
		super();
	}
	
	public int soma(int num) {
		int cont = 0;
		int res = 0;
		
		while (cont <= num) {
			res = res + num;
			num--;
		}
		return res;
	}
}
