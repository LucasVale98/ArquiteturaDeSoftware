package Controller;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

import Model.IModel;
import Model.ModelImpl;
import view.IView;
import view.ViewJmpl;

public class Controller {
	
	private IView view;
	private IModel model;
	
	private Map <Integer, BooleanSupplier> funcionalidades = new HashMap<>();
	
	public Controller(IView view, IModel model) {
		this.model = model;
		this.view = view;
		funcionalidades.put (1, () ->{
			view.mostrarResultado(model.incrementar());
			return true;
		});
		funcionalidades.put (2, () ->{
			view.mostrarResultado(model.decrementar());
			return true;
		});
		funcionalidades.put (1, () ->{
			view.mostrarAteLogo();
			return false;
		});
	}
	
	public void vai() {
		// TODO Auto-generated method stub
		int op;
		view.mostraMenu();
		op = view.capturarOpcao();
		
		while (funcionalidades.get(op).getAsBoolean()) {
			view.mostraMenu();
			op = view.capturarOpcao();	
		}
		
	}
	
	public static void main(String[] args) {
		new Controller(new ViewJmpl(), new ModelImpl()).vai();
	}
	
}
