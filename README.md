# Exercícios - Classe e Objeto 

## Livro Batista & Moraes, páginas 78 a 81
### Questão 1: Escreva um modelo para representar uma lâmpada que está à venda em um supermercado. Que dados devem ser representados por esse modelo?
Modelo da Lâmpada:
- Marca
- Modelo
- Preço
- Quantidade em Estoque


### Questão 7: Identificando e explicando os erros na classe abaixo: 
<p>
1 class Registro De Eleitor <br>
2 { <br>
3 /** <br>
4 * Declaração dos campos desta classe <br>
5 */ <br>
6 int tituloDeEleitor; // número do título do eleitor <br>
7 String nome; // nome do eleitor <br>
8 short zonaEleitoral; // número da zona eleitoral <br>
9 } // fim da classe <br>
</p>

#### Erros:
<p>Na linha 1 o nome da classe está separado por espaços, os nomes não podem conter espaços, devem ser únicos.</p>
<p>Nas linhas 6, 7 e 8 não tem os modificadores de acesso especificos, geralmente nos campos é especificados se são públicos, privados ou protegidos  </p>

### Questão 8: Identificando e explicando os erros na classe abaixo: 

1 class Teste2 <br>
2 { <br>
3 /** <br>
4 * Declaração dos campos desta classe <br>
5 */ <br>
6 int num1,num2; <br>
7 /** <br>
8 * Declaração dos métodos desta classe <br>
9 */ <br>
10 int maior() <br>
11 { <br>
12 if (num1 > num2) <br>
13 return true; <br>
14 else return false; <br>
15 } <br>
16 void menor() <br>
17 { <br>
18 if (num1 < num2) <br>
19 return num1; <br>
20 else return num2; <br>
21 } <br>
22 } // fim da classe <br>

#### Erros:
<p> No método 'maior()' a tipagem está incorreta, o 'int' não esta retornando o valor correto. O tipo correto desse método deve ser trocado por 'boolean' </p>
<p> No método 'menor()' a tipagem também está incorreta, o 'void' não retorna nada e deve ser trocada por 'int' </p>

### Questão 14: Qual a importância de usar o encapsulamento na definição de classes? Exemplifique.

<p>É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras em que mantem os objetos em um estado consistente. <br>
Podemos fazer uma analogia com uma caixa de som, por dentro dele existem varios circuitos fazendo diversas operações, enquanto que, na parte de fora tem alguns comandos simples para o usuario poder interagir de forma segura que não vão corromper a integridade do aparelho. </p>


