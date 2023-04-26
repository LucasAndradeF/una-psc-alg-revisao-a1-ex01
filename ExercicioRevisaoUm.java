import java.util.Scanner; // ALUNO: LUCAS FERREIRA ANDRADE

public class ExercicioRevisaoUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        String titulo = "Questionário de Pessoas Sintomáticas\n";
        System.out.print(titulo);
        System.out.println("Informe o seu nome completo: ");
        String nomeDaPessoa = sc.nextLine();
        System.out.println("\nInforme a sua idade: " );
        int idadeDaPessoa = sc.nextInt();
        String tituloDois = "\nInforme as respostas com SIM ou NÃO:";
        System.out.println(tituloDois);
        int contadorSim = 0;
        int contadorNao = 0;    
        String cartaoVacinal = "";
        String sintomasRecente = "";
        String pessoasSintomas = "";
        String retornoViagem = "";        
            for (int contador = 0; contador <= 2; contador ++) {
                System.out.println("Cartão de Vácina em dia?");
                cartaoVacinal = sc.next();
                if (cartaoVacinal.equalsIgnoreCase("SIM")) {
                    contadorSim = 0;
                    break;
                } else if (cartaoVacinal.equalsIgnoreCase("NAO")) {
                    contadorNao++;
                    break;
                } 
                    if (contador >= 2) {
                    System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                    System.exit(0);
                }               
            }                           
            for (int contador = 0; contador <= 2; contador ++) {
                System.out.println("\nTeve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)");
                sintomasRecente = sc.next();
                    if (sintomasRecente.equalsIgnoreCase("SIM")) {
                        contadorSim++;
                        break;
                    } else if (sintomasRecente.equalsIgnoreCase("NAO")) {
                        break; // BREAK FOI UTILIZADO PARA ENCERRAR O CONTADOR POIS A VARIÁVEL "contadorNao" TEM VALOR DE 10% SOMENTE NA PRIMEIRA PERGUNTA.
                    } else {
                    } if (contador >= 2) {
                        System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                        System.exit(0);
                    }            
            }            
            for (int contador = 0; contador <= 2; contador ++) {
                System.out.println("\nTeve contato com pessoas com sintomas gripais nos últimos dias?");
                pessoasSintomas = sc.next();
                    if (pessoasSintomas.equalsIgnoreCase("SIM")) {
                        contadorSim++;
                        break;
                    } else if (pessoasSintomas.equalsIgnoreCase("NAO")) {                        
                        break; // BREAK FOI UTILIZADO PARA ENCERRAR O CONTADOR POIS A VARIÁVEL "contadorNao" TEM VALOR DE 10% SOMENTE NA PRIMEIRA PERGUNTA.                   
                    } else {
                    } if (contador >= 2) {
                        System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                        System.exit(0);
                    }
            }            
            for (int contador = 0; contador <= 2; contador ++) {
                System.out.println("\nEstá retornando de viagem realizada no exterior?");
                retornoViagem = sc.next();
                    if (retornoViagem.equalsIgnoreCase("SIM")) {
                        contadorSim++;
                        break;                       
                    } else if (retornoViagem.equalsIgnoreCase("NAO")) {                        
                        break;  // BREAK FOI UTILIZADO PARA ENCERRAR O CONTADOR POIS A VARIÁVEL "contadorNao" TEM VALOR DE 10% SOMENTE NA PRIMEIRA PERGUNTA.                  
                    } else {
                    } if (contador >= 2) {
                        System.out.println("Não foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.\n");
                        System.exit(0);
                    }
            }
            System.out.println("\nNome: " + nomeDaPessoa);
            System.out.println("Idade: " + idadeDaPessoa + " anos");
            System.out.println("Cartão de Vácina em dia? " + cartaoVacinal);
            System.out.println("Teve sintomas recentemente? " + sintomasRecente);
            System.out.println("Teve contato com pessoas infectadas? " + pessoasSintomas);
            System.out.println("Retornando de viagem? " + retornoViagem);
            int probabilidade = (contadorSim * 30) + (contadorNao * 10);  
            int porcentagemFinal = probabilidade;
            System.out.println("Probabilidade de estar infectada: " + probabilidade +"%.");
                if (retornoViagem.equalsIgnoreCase("SIM")) {
                System.out.println("Você ficará sob observação por 05 dias.");
                }  
                    if (porcentagemFinal <= 30) {
                        System.out.println("Orientação Final: Paciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.");
                        } else if (porcentagemFinal <=60) {
                        System.out.println("Orientação Final: Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.");
                        } else if (porcentagemFinal <= 89) {
                        System.out.println("Orientação Final: Paciente com risco de estar infectado. Gentileza aguardar em lockdown por 07 dias para ser acompanhado."); // FOI INSERIDA ESSA PROBABILIDADE PARA FECHAR CORRETAMENTE O EXERCÍCIO, CONFORME CONVERSADO EM AULA COM O PROFESSOR. 
                        } else {
                        System.out.println("Orientação Final: Paciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado");
                        } 
             sc.close();                        
    }
}    
  
 

    

