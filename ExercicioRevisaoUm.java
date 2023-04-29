import java.util.Scanner; // ALUNO: LUCAS FERREIRA ANDRADE 

public class ExercicioRevisaoUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo = ("Questionário de Pessoas Sintomáticas");
        System.out.println(titulo);
        System.out.println("\nInforme o seu nome completo: ");
        String nomeDaPessoa = sc.nextLine();
        System.out.println("\nInforme a sua idade: ");
        int idadeDaPessoa = sc.nextInt();
        String tituloDois = ("\nInforme as respostas com SIM ou NAO:");
        System.out.println(tituloDois);
        String cartaoVacinal = "", sintomasRecente = "", pessoasSintomas = "", retornoViagem = "";
        int contadorSimUm = 0, contadorSimDois = 0, contadorSimTres = 0, contadorSimQuatro = 0, contadorNaoUm = 0, contadorNaoDois = 0, contadorNaoTres = 0, contadorNaoQuatro = 0; // FORAM INSERIDOS 4 CONTADORES DE SIM E NÃO PARA CALCULAR A PORCENTAGEM FINAL DE INFECÇÃO.    
            for (int contador = 0; contador <= 2; contador ++) {
                System.out.println("\nCartão de Vácina em dia?");
                cartaoVacinal = sc.next();
                    if (cartaoVacinal.equalsIgnoreCase("SIM")) { // CASO O USUÁRIO RESPONDA CORRETAMENTE, O PROGRAMA REALIZA A CONTAGEM DO SIM OU NÃO PARA GERAR A PORCENTAGEM FINAL DE INFECÇÃO E SEGUE PARA O PRÓXIMO LAÇO FOR.
                        contadorSimUm = 0;
                        break;
                    } else if (cartaoVacinal.equalsIgnoreCase("NAO")) {
                        contadorNaoUm++;
                        break;
                    }
                    if (!cartaoVacinal.equalsIgnoreCase("SIM") || (!cartaoVacinal.equalsIgnoreCase("NAO"))) { // CASO AS RESPOSTAS SEJAM DIFERENTES DE SIM E NÃO, O PROGRAMA AVISA O USUÁRIO E REPETE A PERGUNTA NOVAMENTE, SE ELE ERRAR MAIS DUAS VEZES O PROGRAMA É ENCERRADO, CONFORME AS INSTRUÇÕES DO EXERCÍCIO.
                        System.out.println("\nAs respostas devem ser informadas com SIM ou NAO!");
                    }
                    if (contador >= 2) {
                        System.out.println("\nNão foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma."); // CASO O USUÁRIO ERRE POR MAIS DUAS VEZES O PROGRAMA É ENCERRADO COM ESSA MENSAGEM FINAL.
                        System.exit(0);
                    }               
            }              
            for (int contador = 0; contador <= 2; contador ++) {
                System.out.println("\nTeve algum dos sintomas recentemente? (dor de cabeça, febre, náusea, dor articular, gripe)");
                sintomasRecente = sc.next();
                    if (sintomasRecente.equalsIgnoreCase("SIM")) {
                        contadorSimDois++;
                        break;
                    } else if (sintomasRecente.equalsIgnoreCase("NAO")) {
                        contadorNaoDois = 0;
                        break;
                    }  
                    if (!cartaoVacinal.equalsIgnoreCase("SIM") || (!cartaoVacinal.equalsIgnoreCase("NAO"))) {
                        System.out.println("\nAs respostas devem ser informadas com SIM ou NAO!");
                    }
                    if (contador >= 2) {
                        System.out.println("\nNão foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                        System.exit(0);
                    }               
            }              
            for (int contador = 0; contador <= 2; contador ++) {
                System.out.println("\nTeve contato com pessoas com sintomas gripais nos últimos dias?");
                pessoasSintomas = sc.next();
                    if (pessoasSintomas.equalsIgnoreCase("SIM")) {
                        contadorSimTres++;
                        break;
                    } else if (pessoasSintomas.equalsIgnoreCase("NAO")) {
                        contadorNaoTres = 0;                  
                        break;                   
                    }
                    if (!cartaoVacinal.equalsIgnoreCase("SIM") || (!cartaoVacinal.equalsIgnoreCase("NAO"))) {
                        System.out.println("\nAs respostas devem ser informadas com SIM ou NAO!");
                    }
                    if (contador >= 2) {
                        System.out.println("\nNão foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                        System.exit(0);
                    }               
            }
            for (int contador = 0; contador <= 2; contador ++) {
                System.out.println("\nEstá retornando de viagem realizada no exterior?");
                retornoViagem = sc.next();
                    if (retornoViagem.equalsIgnoreCase("SIM")) {
                        contadorSimQuatro++;
                        break;                       
                    } else if (retornoViagem.equalsIgnoreCase("NAO")) { 
                        contadorNaoQuatro = 0;                       
                        break;                
                    } 
                    if (!cartaoVacinal.equalsIgnoreCase("SIM") || (!cartaoVacinal.equalsIgnoreCase("NAO"))) {
                        System.out.println("\nAs respostas devem ser informadas com SIM ou NAO!");
                    }
                    if (contador >= 2) {
                        System.out.println("\nNão foi possível realizar o diagnóstico. Gentileza procurar ajuda médica caso apareça algum sintoma.");
                        System.exit(0);
                    }               
            }              
            System.out.println("\nNome: " + nomeDaPessoa); // IMPRESSÃO FINAL NA TELA DO USUÁRIO, CASO ELE RESPONDA O QUESTIONÁRIO CORRETAMENTE. 
            System.out.println("Idade: " + idadeDaPessoa + " anos");
            System.out.println("Cartão de Vácina em dia? " + cartaoVacinal);
            System.out.println("Teve sintomas recentemente? " + sintomasRecente);
            System.out.println("Teve contato com pessoas infectadas? " + pessoasSintomas);
            System.out.println("Retornando de viagem? " + retornoViagem);
            int probabilidade = ((contadorSimUm + contadorSimDois + contadorSimTres + contadorSimQuatro) * 30) + ((contadorNaoUm + contadorNaoDois + contadorNaoTres + contadorNaoQuatro) * 10);  
            int porcentagemFinal = probabilidade;
            System.out.println("Probabilidade de estar infectada: " + probabilidade +"%.");
                if (retornoViagem.equalsIgnoreCase("SIM")) {
                System.out.println("Você ficará sob observação por 05 dias."); // INDIFERENTE DA PORCENTAGEM, CASO ELE ESTEJA RETORNANDO DE VIAGEM O PROGRAMA IMPRIME A MENSAGEM PRO USUÁRIO. 
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
  
 

    

