import java.awt.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * 
 * @author Felipe Dias Amorim Pessoa
 * @author Marcus Vinicius de Souza Oliveira
 *
 */
public class CentroGravidade {
	/*
	 * método para gerar Lista com todas as linhas do arquivo, especificando o
	 * diretório como parâmetro
	 */
	public static ArrayList<String> getArquivo(String diretorio) throws IOException {
		// lendo arquivo externo
		FileReader arquivo = new FileReader(diretorio);

		BufferedReader leitor = new BufferedReader(arquivo);

		// arraylist para armazenar todas as linhas
		ArrayList<String> conteudo = new ArrayList<>();

		// variavel auxiliar para guardar a linha verificada
		String linhas = null;

		// armazenando todos os valores da matriz em um arraylist
		try {
			while ((linhas = leitor.readLine()) != null) {
				conteudo.add(linhas);
			}
		} catch (Exception e) {
		}

		// fechando arquivo e leitor
		leitor.close();
		arquivo.close();

		// retorna uma lista com todas as linhas do arquivo
		return conteudo;
	}

	// método para gerar uma matriz adicionando a lista como parâmetro
	public static float[][] geraMatriz(ArrayList<String> conteudo) {
		// capturando a primeira linha referente a quantidade de linhas e colunas
		String[] linha1 = conteudo.get(0).split(" ");
		int linha = Integer.parseInt(linha1[0]);
		int coluna = Integer.parseInt(linha1[1]);

		// só cria a matriz com este critério
		if (linha >= 3 && coluna >= 3) {
			// criando matriz de string para armazenar os valores das linhas
			String[][] matriz = new String[linha][coluna];

			// variavel auxiliar para pular a primeira linha
			int aux = 1;

			// preenchendo a matriz
			for (int i = 0; i < linha; i++) { // percorre todas as linhas da matriz
				for (int j = 0; j < coluna; j++) { // percorre todas as colunas da matriz
					matriz[i][j] = ""; // para nao adicionar nulos na matriz
					String linhaAtual = conteudo.get(aux);
					aux++;
					for (int k = 0; k < linhaAtual.length(); k++) { // percorre a linha da lista
						Character caracter = linhaAtual.charAt(k); // armazena o caractere encontrado
						if (!caracter.equals(' ')) { // se o conteudo nao for um espaco vazio armazene na matriz
							matriz[i][j] += caracter.toString();
						} else if (k != 0 && j < coluna - 1) { // senao vai para proxima coluna
							j++;
							matriz[i][j] = ""; // para nao adicionar nulos na matriz
						}
					}
				}
			}

			// transferindo para uma matriz do tipo float
			float[][] matrizFormatada = new float[linha][coluna];
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[0].length; j++) {
					matrizFormatada[i][j] = Float.parseFloat(matriz[i][j]);
				}
			}
			return matrizFormatada;
		}
		// retorna uma matriz inválida
		float[][] matrizFormatada = new float[1][1];

		// retorna a matriz
		return matrizFormatada;
	}

	// método para imprimir matriz
	public static void imprimeMatriz(float[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " | ");
			}
			System.out.println();
		}
	}

	// método para encontrar a linha do centro de gravidade
	public static int encontrarLinha(float[][] m) {
		// vetor para armazenar a soma das linhas
		float[] linhas = new float[m.length];

		// formatador para o float ficar com apenas uma casa decimal
		DecimalFormat formatar = new DecimalFormat("#.#");

		// somando cada linha e armazenando no vetor
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				linhas[i] += m[i][j];
			}
		}

		// formatando vetor
		for (int i = 0; i < m.length; i++) {
			linhas[i] = Float.parseFloat(formatar.format(linhas[i]).replace(",", "."));
		}

		// encontrando a linha com a menor diferença
		int linhaMenorDif = 0;
		int linhaVerificavel = 1;
		float aux = 0;
		float menorDif = 0;
		while (linhaVerificavel < linhas.length - 1) { // linhas verificaveis ignorando a primeira e ultima
			float anterior = 0;
			float posterior = 0;
			for (int j = 0; j < linhas.length; j++) {// percorrendo o vetor
				if (j < linhaVerificavel) { // soma das linhas anterioroes
					anterior += linhas[j];
				} else if (j > linhaVerificavel) {// soma das linhas posteriores
					posterior += linhas[j];
				}
				if (j == (linhas.length - 1)) {// ultima repeticao do laço
					// armazeno a diferença na variavel auxiliar
					// para nao ocorrer valores negativos existe essa condição
					if (anterior > posterior) {
						aux = anterior - posterior;
					} else {
						aux = posterior - anterior;
					}
				}
			}
			// se a diferenca da linha verificada for menor armazene a linha e o valor
			// se for a primeira vez do laço armazene
			if (aux < menorDif || linhaVerificavel == 1) {
				menorDif = aux;
				linhaMenorDif = linhaVerificavel;
			}
			linhaVerificavel++;
		}

		// retorna a linha do centro, considerando a posição 0 como posição 1
		return linhaMenorDif + 1;
	}

	public static int encontrarColuna(float[][] m) {
		// vetor para armazenar a soma das colunas
		float[] colunas = new float[m[0].length];

		// formatador para o float ficar com apenas uma casa decimal
		DecimalFormat formatar = new DecimalFormat("#.#");

		// somando cada coluna e armazenando no vetor
		for (int i = 0; i < m[0].length; i++) {
			for (int j = 0; j < m.length; j++) {
				colunas[i] += m[j][i];
			}
		}

		// formatando vetor
		for (int i = 0; i < m.length; i++) {
			colunas[i] = Float.parseFloat(formatar.format(colunas[i]).replace(",", "."));
		}

		// encontrando a coluna com a menor diferença
		// o processo é o mesmo utilizado para encontrar a linha
		int colunaMenorDif = 0;
		int i = 1;
		float aux = 0;
		float menorDif = 0;
		while (i < colunas.length - 1) {
			float anterior = 0;
			float posterior = 0;
			for (int j = 0; j < colunas.length; j++) {
				if (j < i) {
					anterior += colunas[j];
				} else if (j > i) {
					posterior += colunas[j];
				}
				if (j == colunas.length - 1) {
					if (anterior > posterior) {
						aux = anterior - posterior;
					} else {
						aux = posterior - anterior;
					}
				}
			}
			if (aux < menorDif || i == 1) {
				menorDif = aux;
				colunaMenorDif = i;
			}
			i++;
		}
		// retorna a coluna do centro, considerando a posição 0 como posição 1
		return colunaMenorDif + 1;
	}

	// verificar se a matriz possui pelo menos 3 linhas e 3 colunas
	public static boolean verificaMatriz(float[][] m) {
		int linhas = 0;
		int colunas = 0;
		boolean retorno = false;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				colunas++;
			}
			linhas++;
		}
		if (linhas >= 3 && colunas >= 3) {
			retorno = true;
		} else {
			retorno = false;
		}
		return retorno;
	}

	public static void main(String[] args) throws IOException {
		String dir = "arquivos/arquivo.txt";
		float[][] m = geraMatriz(getArquivo(dir));
		boolean verifica = verificaMatriz(m);
		if (verifica == true) {
			int linhaGravidade = encontrarLinha(m);
			int colunaGravidade = encontrarColuna(m);
			imprimeMatriz(m);
			System.out.println();
			System.out.println("Centro: (" + linhaGravidade + "," + colunaGravidade + ")");
		} else {
			System.out.println("Matriz inválida! a matriz no arquivo precisa ter pelo menos 3 linhas e 3 colunas.");
		}

	}
}
