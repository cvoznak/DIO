package dioOperadoresFluxo;

//Classe dedicada a solu��o do exerc�cio de controle de fluxo.

public class controleFluxo {

	public static void main(String[] args) {
		
		ifFlecha();//exiba o nome do m�s do ano de acordo com seu numero.
		ifSemFlecha();//exiba o nome do m�s do ano de acordo com seu numero.(Evite o efeito flecha)
		ifFerias();//verifique se o m�s � julho, dezembro ou janeiro, para assim exibir o texto "F�rias"
		ifMenor();//otimizado com variaveis intermediarias
		
		switchSemana();//se for domingo, coloque 1, .. etc
		switchNumero();//entre 1 e 3 -> certo, 4-> errado, 5 -> talvez, demais ->indefinido
		switchFerias();//comparativo com o ifFerias

	}
	
	private static void ifFlecha() {
		
		//O efeito flecha � o que podemos ver na tela com o aninhamento seguido, o texto se tabula, formando uma flecha.
		
		
		int mes = 9;
		if (mes == 1) {
			System.out.println("Janeiro");
		}
		else {
			if (mes == 2) {
				System.out.println("Fevereiro");
			}
			else {
				if (mes == 3) {
					System.out.println("Mar�o");
				}
				else {
					if (mes == 4) {
						System.out.println("Abril");
					}
					else {
						if(mes == 5) {
							System.out.println("Maio");
						}
						else {
							if (mes == 6) {
								System.out.println("Junho");
							}
							else {
								if (mes == 7) {
									System.out.println("Julho");
								}
								else {
									if (mes == 8) {
										System.out.println("Agosto");
									}
									else {
										if (mes == 9) {
											System.out.println("Setembro");
										}
										else {
											if (mes == 10) {
												System.out.println("Outubro");
											}
											else {
												if (mes == 11) {
													System.out.println("Novembro");
												}
												else {
													if (mes == 12) {
														System.out.println("Dezembro");
													}
													else {
														System.out.println("M�s indefinido");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	private static void ifSemFlecha() {
		
		int mes = 9;
		if (mes == 1) {
			System.out.println("Janeiro");
		}
		else if (mes == 2) {
			System.out.println("Fevereiro");
		}
		else if (mes == 3) {
			System.out.println("Mar�o");
		}
		else if (mes == 4) {
			System.out.println("Abril");
		}
		else if(mes == 5) {
			System.out.println("Maio");
		}
		else if (mes == 6) {
			System.out.println("Junho");
		}
		else if (mes == 7) {
			System.out.println("Julho");
		}
		else if (mes == 8) {
			System.out.println("Agosto");
		}
		else if (mes == 9) {
			System.out.println("Setembro");
		}
		else if (mes == 10) {
			System.out.println("Outubro");
		}
		else if (mes == 11) {
			System.out.println("Novembro");
		}
		else if (mes == 12) {
			System.out.println("Dezembro");
		}
		else {
			System.out.println("M�s indefinido");
		}
		
	}

	private static void ifFerias() {
		
		// nesse caso como temos um valor exato e somente uma variavel deveriamos ter um switch
		
		String mes = "julho";
		
		if (mes == "julho" || mes == "dezembro" || mes == "janeiro") {
			System.out.println("F�rias");
		}
	}
	
	private static void ifMenor() {
		
		double salarioMensal = 11893.58d;
		double mediaSalario = 10500d;
		
		int quantidadeDependentes = 4;
		int mediaDependentes = 2;
		
		if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
			System.out.println("Funcion�rio deve receber auxilio.");
		}
		
		boolean salarioBaixo = salarioMensal < mediaSalario;
		boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;
		
		if ((salarioBaixo) && (muitosDependentes)) {
			System.out.println("Funcion�rio deve receber auxilio.");
		}
		
		boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
		
		if (recebeAuxilio) {
			System.out.println("Funcion�rio deve receber auxilio.");
		}
		else {
			System.out.println("Funcion�rio n�o deve receber auxilio.");
		
		}
	}
	
	private static void switchSemana() {
		
		String dia = "Ter�a";
		
		switch (dia) {
			case "Segunda":
				System.out.println(2);
				break;
			case "Ter�a":
				System.out.println(3);
				break;
			case "Quarta":
				System.out.println(4);
				break;
			case "Quinta":
				System.out.println(5);
				break;
			case "Sexta":
				System.out.println(6);
				break;
			case "S�bado":
				System.out.println(7);
				break;
			case "Domingo":
				System.out.println(1);
				break;
			default:
				System.out.println("Dia inv�lido");
		}
	}
	
	private static void switchNumero() {
		
		int numero = 4;
		
		switch (numero) {
			case 1:
			case 2:
			case 3:
				System.out.println("Certo");
				break;
			case 4:
				System.out.println("Errado");
				break;
			case 5:
				System.out.println("Talvez");
				break;
			default:
				System.out.println("Indefinido");
				break;
		}
	}
	
	private static void switchFerias() {
		
		String mes = "dezembro";
		
		switch (mes) {
			case "dezembro":
			case "julho":
			case "janeiro":
				System.out.println("F�rias");
				break;
			default:
				System.out.println("M�s indefinido");
				break;
		}
	}
}
