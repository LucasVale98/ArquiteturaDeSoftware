package view;

public interface IView {
	public final static String MENU = "1 - Incremento \n 2 - Decremento \n 3 - Sair";
	public final static String ATE_LOGO = "Até Logo\n";
	public final static String  MSG_ERRO = "Erro - Opção Inválida";
	public abstract void mostraMenu();
	public abstract void mostrarResultado(int resultado);
	public int capturarOpcao();
	public void mostrarAteLogo();
	public abstract void mostrarMenssagemDeErro();
	
}
