package br.com.Curso_Udemy_Empregados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEmpregados {

	public static void main(String[] args) {
		Scanner enter = new Scanner(System.in);
		List<Empregado>	listaEmpregado = new ArrayList<>();
		Empregado empregado = new Empregado();
		EmpregadoTerceirizado empregadosTerc = new EmpregadoTerceirizado();
		
		
		System.out.println("<<===== Cadastro De Pagamento De funcionários =====>> \n");
		System.out.print("Entre com o número de funcionários: ");
		int quantidadeFuncionario = enter.nextInt();
		
		for(int i = 0; i < quantidadeFuncionario; i ++) {
			boolean validar = false;
			int tipoFuncionario = 0;
			System.out.println(" ");
			System.out.println("Dados do Funcionario #" + i + "\n");
			//System.out.print("Funcionário é terceirizado?  (S -> sim / N -> Não");
			//char tipoFuncionario = enter.next().charAt(0);
			
			do {
				System.out.println(" ");
				System.out.print("Funcionário é terceirizado?  (1 -> sim / 2 -> Não)" +"\n");
				 tipoFuncionario = enter.nextInt();
				//char tipoFuncionario = enter.next().charAt(0);
				//if(Character.toLowerCase(tipoFuncionario) != 'S'|| Character.toLowerCase(tipoFuncionario) != 'N') {
				if(tipoFuncionario != 1 && tipoFuncionario != 2) {
					
				validar = false;
				System.out.println("ERROR:Opção incorreta!");
				System.out.println(">> Digite Novamente << \n");
				
				}else {
					validar = true;
				}
				
			}while(validar != true);
			
			if(tipoFuncionario == 1) {
				System.out.print("Nome Funcionário: ");
				enter.next();
				empregado.setNome(enter.nextLine());
				System.out.println("");
				System.out.print("Horas Trabalhadas: ");
				empregado.setHoras(enter.nextInt());
				System.out.println(" ");
				System.out.print("Valor Hora:");
				empregado.setValorHora(enter.nextDouble());
				System.out.println(" ");
				System.out.print("Valor Adicional: ");
				empregadosTerc.setAdicionalExtra(enter.nextDouble());
				
				EmpregadoTerceirizado empregado_terceirizado = new EmpregadoTerceirizado(empregado.getNome(),empregado.getHoras(),
				empregado.getValorHora(),empregadosTerc.getAdicionalExtra());
				
				listaEmpregado.add(empregado_terceirizado);
				
			}else {
				
				System.out.println(" ");
				System.out.print("Nome Funcionário: ");
				enter.next();
				empregado.setNome(enter.nextLine());
				System.out.println(" ");
				System.out.print("Horas Trabalhadas: ");
				empregado.setHoras(enter.nextInt());
				System.out.println(" ");
				System.out.print("Valor Hora:");
				empregado.setValorHora(enter.nextDouble());
				System.out.println(" ");
				
				 listaEmpregado.add(new Empregado(empregado.getNome(),empregado.getHoras(),empregado.getValorHora()));
			}
			
	
		}
	
		System.out.println(" ");
		System.out.println("##### PAGAMENTOS ####");
		System.out.println(" ");
		for(Empregado empregados : listaEmpregado) {
			System.out.println(">> Funcionário: " + empregados.getNome()  + "- Salário Bruto:R$ " + String.format("%.2f", empregados.pagamento()) +"\n");
			
		}

		enter.close();
	}	
}
