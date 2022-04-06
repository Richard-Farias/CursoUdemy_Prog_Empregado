package br.com.Curso_Udemy_Empregados;

public class EmpregadoTerceirizado extends Empregado {
	
	private double adicionalExtra;
	
	public EmpregadoTerceirizado() {
		super();
	}

	public EmpregadoTerceirizado(String nome, int horas, double valorHora, double adicionalExtra) {
		super(nome, horas, valorHora);
		this.adicionalExtra = adicionalExtra;
	}

	@Override
	public double pagamento() {
	// chama o método pagamento da classe Empregado somado com 110% do pagamento adicional
			return  super.pagamento() + adicionalExtra * 1.1;
	}

	public double getAdicionalExtra() {
		return adicionalExtra;
	}

	public void setAdicionalExtra(double adicionalExtra) {
		this.adicionalExtra = adicionalExtra;
	}
	

	

}
