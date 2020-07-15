package Exer001;

public class fornecedor  extends Pessoa {
	
	private double valorCredito;
	private double valorDivida;
	private double obterSalario;
	
	public fornecedor( double valorCredito,double valorDivida,double obterSalario) 
	{
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}
	
	public fornecedor() 
	{
		super();
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double getObterSalario() {
		return obterSalario;
	}

	public void setObterSalario(double obterSalario) {
		this.obterSalario = obterSalario;
	}
	
	public double obterSaldo() 
	{
		double obterSaldo = valorCredito - valorDivida;
		return obterSaldo;
		
	} 
}
