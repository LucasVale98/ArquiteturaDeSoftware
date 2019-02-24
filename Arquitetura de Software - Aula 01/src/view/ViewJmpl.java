package view;

import java.util.Scanner;

public class ViewJmpl implements IView{
	
	private Scanner leitor = new Scanner(System.in);

	@Override
	public void mostraMenu() {
		// TODO Auto-generated method stub
		System.out.println(MENU);
	}

	@Override
	public void mostrarResultado(int resultado) {
		// TODO Auto-generated method stub
		System.out.println(resultado);
	}

	@Override
	public int capturarOpcao() {
		// TODO Auto-generated method stub
		return leitor.nextInt();
	}

	@Override
	public void mostrarAteLogo() {
		// TODO Auto-generated method stub
		System.out.println(ATE_LOGO);
	}

	@Override
	public void mostrarMenssagemDeErro() {
		// TODO Auto-generated method stub
		System.out.println(MSG_ERRO);
	}
	
	
	
}
