
# Estudos: Bootcamp Santander 2024

Caderno de anotações para estudo da trilha JAVA do Bootcamp ofereciso pelo Santander.

## Príncipios de Desenvolvimento de Software Colaborativo

| ID | Desc. |
|:--:|:-----:|
| 01 | ----- |

## Dominado a Linguagem de Programação Java

### Ambiente de Desenvolvimento Java

1. Configração do VS Code sincronizando com o github e realizando um commit atraves da IDE.

### Aprendendo a Sintaxe Java

1. Introdução

    * Aprendizados:

    > * Estrutura inicial;
    > * Padrão de nomeclatutura;
    > * Declarando variáveis e métodos;
    > * Identação;
    > * Organizando arquivos;
    > * Java Beans;

2. Anatomia das Classes

    * Anatomia das Classes 1

        - Adotar algumas convenções ao criar um projeto:

            |Item|Convenção|Exemplo|
            |:---|:--------|:------|
            |Projeto|Utilizar sempre letras minusculas separando cada palavra por um ifem "-".|estudo-sintaxe|
            |arquivo.java|Nome do arquivo deve ser coerente com a classe e o nome do arquivo deve iniciar com primeira letra maiuscula e cada da palavra complementar também deva ter a primeira letra maiuscula.|EstudoSintaxe.java|
            |Classes|Nome das Classes segue o mesmo formato do arquivo; sendo que a maioria das classes serão publicas.|`public class EstudoSintaxe {}`|
            |Metodo Principal|Toda classe executavel (que tem a função de inicialização) deve conter um metodo principal `main`|`public class EstudoSintaxe { public static void main (String [] args) }`|
            |Variaveis|Toda variavel deve iniciar com litra minuscula e caso seja um nome composto a segunda palavra se inicia com a primeira letra maiuscula|`anoFabricacao` ou `anoFabricacaoCarro`|

        - Entendendo um pouco do código
        
            ~~~java
            public class EstudoSintaxe {

            public static void main (String [] args) {
                System.out.print("Olá turma, sejam bem-vindos");
            }

            }
            ~~~

            |Item|Descrição|
            |:---|:---|
            |`{}`|As chaves limitam um bloca de codigo|
            |`()`|Os parenteses são utilizados para inserir os parametros|
            |`[]`|Os cochetes são um array|
            |`String`|Neste caso `String` é o que determina o tipo de metodo|  
            |`args`|abreviação de argumentos ou parametros|
            |`System.out.print`|`System` é uma classe de sistema, contem varios tipos de operações; `out` operação de saida da classe `System`; `print` metodo impressão junto a operação `out` significa que estamos pedindo ao sistema para nos dar uma saída e esta saida será uma impressão no caso um texto definido pelo parametro `("Olá turma, ...")`|

    * Anatomia das Classes 2

        - Variaveis

            >Por padrão toda variavel é escrita com letras minusculas;
            >Exemplo: `calculadora`.
            >
            >Variaveis com nomes composto se iniciam com a primeira palavra em minusculo e todas as palavras a partir da segunda se iniciam com a primeira letra maiuscula;
            >Exemplo: `calculadoraCientifica` ou `calculadoraJurosCompostos`.

            >Algumas variaves podem receber um valor fixo o qual não dave se alterado, por exemplo se quisermos q a variavel `br` tenha sempre o valor `"Brasil"` devemos declarar com todas as letras mausculas;
            >Exemplo: `BR`
            >Podemos tambem declarar de uma forma espacial conforme tabela a baixo.

            |Exemplos|Descrição|
            |:---|:---|
            |`final String BR = "Brasil"`|`final` assim como o nome da varialvel `BR` tode em maiusculo defina uma variavel com valor que não pode ser alterado; `String` define o tipo da variavel como texto ou letras.|
            |`final double PI = 3.14`|`double` define o tipo da variavel como Numero decimal.|
            |`final int ESTADOS_BRASILEIROS = 27`|`int` define o tipo da variavel como Numero Inteiro.|
            |`final int ANO_2000 = 2000`|`int` define o tipo da variavel como Numero Inteiro.|
            |`int ano = 2024`|Aqui não temos a expressão `final` e o nome da variavel esta seguindo o padrão com letras minusculas indicando que esta é uma variavel que pode ser alterada; `int` define o tipo de variavel como um Numero Inteiro.|

        - Outras convenções a se considerar para as variaveis:
            > * Devem conter apenas letras, _(underline), $ ou numeros de 0 a 9;
            > * Devem obrigatoriamente se iniciar preferencialmente por letras, mas tambem aceita _ ou $, jamais com numeros;
            > * Deve iniciar com letra minuscula;
            > * Não pode conter espaços (no caso de palavras compostas);
            > * Não podemos usar palavras chaves da linguagem;
            > * O nome deve se unico dentro de um escopo.

    * Anatomia de classes 3

        - Declarando uma Variavel.

            Ao se declara uma variavel devemos considerar algumas convenções;

            ~~~java
            // Estrutura

            Tipo nomeBemDefinido = Atribuição (opcional em alguns casos)

            // Exemplo

            int idade = 23;
            double altura = 1.62;
            Dog spike; // aqui a variavel spike não esta sendo atribuido nenhum     valor
            ~~~

        - Metodos.

            Assim como as `Classes` podem ser interpretadas como um objeto os   `métodos` podem ser interpretados como ações a serem executadas, sendo    assim é comum (e também uma boa pratica) que coloquemos os nomes dos   métodos no infinitivo;
            Exemplo: *somar, subtrair, calcular, formatar, etc...*.

            ~~~java
            // Estrutura

            TipoRetorno NomeObjetivoNoInfinitivo Parametro(s) // Parametros em  alguns casos pode ser opcional

            // Exemplos

            int somar (int numeroUm, int numero2)

            String formatarCep (long cep)
            ~~~

    * Anatomia de Classes 4

        - Indentação;

            ...

    * Anatomia de Classes 5

        - Package (Pacotes)

            Na linguagem Java quando nosso codigo vai atingindo certo nivel de complexidade começamos a organizar nossas classes em pacotes, os quais também devemos seguir algumas convenções;

            Exemplo: `finalidade.cliente.grupo`

            > * Finalidade se refere a finalidade do projeto se é comercial, organizacional, open sourse ou educacional
            >
            >   |Finalidades    |Utilização            |
            >   |:---           |:---                  |
            >   |Comercial      |`com`                 |
            >   |Organizacional |`org`                 |
            >   |Open Sourse    |`org` ou `opensource` |
            >   |Educacional    |`edu`                 |
            >
            > * Cliente também pode ser a empresa o dono do prejeto o desenvolvedor;
            >
            >   |Cliente|Utilização|
            >   |:---|:---|
            >   |Um empresa de nome *Hyper Tech*|`hypertech`|
            >   |Um projeto desenvolvido para estudo do estudante de nome *Lucas*|`lucas`|
            >
            > * Grupo se refere ao grupo de arquivos que será criado;
            >
            >   |Grupo|Utilização|
            >   |:---|:---|
            >   |Para organizar os arquivos da 1a. semana de estudos|`primeirasemana`|
            >
            >  *Exemplo*: Desta forma, se o estudante Lucas quer agrupar suas aulas por semanas de estudo ele pode utilizar a package `edu.lucas.primeirasemana`

            > ### Atenção.
            > Para a IDE VS Code não basta criar uma pasta de nome `edu.lucas.primeirasemana`, para criar uma package devemos adicionar ao diretorio `src` uma pasta por vez:
            > ~~~
            >   srs
            >       edu
            >           lucas
            >               primeirasemana
            > ~~~
            >
            >### Outro Ponto Importante.
            >
            > Adicionar ao inicio do cadigo em cada arquivo a qual package ele faz referencia `package edu.lucas.primeirasemana;`
            >

    * Java Beans
        
        Java Beans, são as boas praticas de escrita adotadas pela comunidade para melhorar a compreenção.
        Estas convenções devem ser aplicadas da seguinte forma:

        - Variaveis

            + Nomes de variaveis devem ser bem definidos claro e objetivo, sem abreviações ou palavras sem sentido;
            + Sempre no Singular, exceto quando se refere a um array ou coleção;
            + Sempre em um unico idioma.

                ### Exemplos.

                ~~~java
                // Não Recomendado

                double salMedio = 1500.23; // variavel com abreviação
                String emails = "aluno@escola.com"; // variavel no plural, recebendo apenas um valor
                String myName = "JOSEPH"; // variavel no idioma inglês quando todas as outras estão em português

                // Recomendado

                double salarioMedio = 1500.23;
                String email = "aluno@escola.com";
                String [] emails = {"aluno@escola.com","professor@escola.com"};
                String meuNome = "JOSEPH";
                ~~~

        - Metodos

            + Nomes devem ser bem definidos de forma explicita para facilitar o entendimento do metodo;
            + Devem ser nomeados como verbos;
            + Todas as letras devem ser matidas em minusculo com exeção da primeira letra de cada palavra composta a partir da segunda;
            + Devem ter uma unica finalidade.

            ### Exemplos.

            ~~~java
            somar (int n1, int n2) {}

            abrirConexao() {}

            concluirProcessamento() {}

            findById(int id) {} // ao usar algumas bibliotecas vamos precisar chamar alguns de seus metos em inglês 

            calcularImprimir() {} // Algo de ERRADO, o nome deste metodo sugere duas funcionalidades; a forma correta seria ter um metodo para calcular e um outro para imprimir
            ~~~

3. Tipos de Variaveis

    * Tipos de Variaveis 1

        - Objetivos do curso
            
            Explorar os tipos de variaveis para a linguagem;

            + Numéricos inteiros e decimais;
            + Tipos lógicos;
            + Caracteres;
            + Objetos;
            + Diferença entre variável e constante.

    * Tipos de Variaveis 2

        Criando repositorio e ajustando VS Code;
    
    * Tipos de Variaveis 3

        Os oito tipos primitivos são:

        - int;
        - byte;
        - short;
        - long;
        - float;
        - double;
        - boolean;
        - char.

        |Tipo    |Memoria |Valor Min.                |Valor Max.   |
        |:---    |:---    |:---                      |:---         |
        |`byte`  |1 byte  |-128                      |127          |
        |`short` |2 bytes |-32.768                   |32.768       |
        |`int`   |4 bytes |-2.147.483.648            |2.147.483.648|
        |`long`  |8 bytes |-9.223.372.036.854.775.808|9.223.372.036.854.775.808|

        |Tipo     |Memoria |Valor Min.     |Valor Max.    |
        |:---     |:---    |:---           |:---          |
        |`float`  |4 byte  |-3,4028E + 38  |3,4028E + 38  |
        |`double` |8 bytes |-1,7976E + 308 |1,7976E + 308 |

        > Obs.: Tipos Numericos ignoram o 0 (zero) a esquerda;
        > 
        > `int cpf = 095999888;` sera armazenado como `95999888`
        >
        >Talvez seja interessante usar o tipo `String` nestes casos.
        >
        > `float` precisa encerrar com a letra `F`;
        > `float PI = 3.14F;`
        >
        > `long` precisa encerrar com a letra `L`;
        > `long cpf = 1234567890L;`

        Para definir uma constante utilisamos a palavra chave `final` antes e como convenção utilizamos o nome da variavel em caixa alta:

        ~~~java
        final PI = 3.14;
        ~~~

4. Operadores

    - Operadores - 1

        Objetivo:

        + Apresentar o significado dos símbolos especiais de acordo com a linguagem Java;
        + Operadores aritimeticos;
        + Operadores unários;
        + Operadores relacionais;
        + Operadores lógicos;
        + Operadores ternarios.

    - Operadores - 2

        Classificação de operadores;

        + Operador de Atribuição:

            |Operadores|Comparação    |
            |:---      |:---          |
            |=         |Igual (Recebe)|

            O operador `=` é usado para atribuir valor a uma variavel:

            ~~~java
            String nome = "Caio Tucano"; // ao definir uma varialvel como texto é preciso escrever os caracteres entre aspas
            int idade = 22;
            char sexo = 'M'; //tipo `char` só permite um caracter e precisa ser escrito entre aspas simples
            Date dataNascimento = new Date ();
            ~~~

        + Operadores Aritiméticos;

            Utilizados para realizar operações matematicas:

            |Operadores|Comparação               |
            |:---      |:---                     |
            |+         |Adição                   |
            |-         |Subtração                |
            |*         |Multiplicação            |
            |/         |Divisão                  |
            |%         |Modulo (Resto da divisão)|  

            ~~~java
            double soma = 10.5 + 15.7;
            int subtracao = 100 - 10;
            int multiplicacao = 5 * 6;
            int divisao = 15 / 3;
            int modulo = 18 % 3;
            double resultado = (10 * 7) + (20 / 4);
            ~~~   

            > Operadores de Adição `+` quando usado em `Strings` realiza a concatenação de palavras:  
            >
            > `"Caio" + "Tucano"` => `CaioTucano` ou
            >
            >`"Caio " + "Tucano"` => `Caio Tucano`

    - Operadores 3

        - Operador Unario;

            Utilizados junto a outros operadores aritimeticos, são responsaveis por incrementar, decrementar e inverter valores numericos e booleanos.

            + (+) *Operador unário de valor positivo* - números são positivossem esse operador explicitamente;

            + (-) *Operador unariuo de valor negativo* - nega um numero ou expressão aritimetica (torna um valor negativo);

            + (++) *Operador unario de incremento de valor* - incrementa o valor em 1 unidade;

            + (--) *Operador unario de decremento de valor* - decrementa o valor em 1 unidade;
            + (!) *Operador unario lógico de negação* - nega o valor de uma expressão booleana.
        
    - Operadores 4

        - Incrementação, decrementação e negação. 

    - Operadores 5

        - Operadores ternarios

            Operadores ternarios são uma forma de abreviação da estrutura `if`, utilizando os operadores `?` e `:` segindo a seginte estrutura;

            > <expressão de condições> `?` < valor verdadeiro > `:` < Valor falso >

            **Exemplo:**

            ```java
            //estrutura de condição if
            int a = 5;
            int b = 6;
            String resultado = "";

            if(a==b)
                resultado = "verdadeiro";
            else
                resultado = "falso";

            //Utilizando operador ternario
            int a = 5;
            int b = 6;
            String resultado = a==b ?"verdadeiro" :"falso";
            ```
    
    - Operadores 6

        - Operadores relacionais;
            
            Operadores relacionais tem a proposta de aviliar relaçoes ou condições entre as expressões.

            |Operadores|Comparação|
            |:---|:---|
            |==|Igual|
            |!=|Diferente|
            |>|Maior|
            |<|Menor|
            |>=|Maior ou Igual|
            |<=|Menor ou Igual|

    - Operadores 7

        - Operadores logicos;

            É o recurso que nos permite criar expressões logicas amaiores a partir da junção de duas ou mais expressões;

            - `&&` - E;
            - `||` - OU.

5. Métodos

    - Metodos 1

        Assunto;

        - Qual a proposta principal do metodo?;
        - Qual o tipo de retorno esperado após executar o metodo? ;
        - Quais os parametros serão necessarios para execução do metodo? ;
        - O metodo passui o risco de apresentar alguma exceção? ;
        - Qual a visibilidade do metodo.

    - Metodos 2

        Estrutura de metodos

    - Metodos 3
    
        Crindo projeto sistema-smart-tv

6. Escopo

    -   Escopo 1

        - Escopo de classe;
        - Escopo de Metodo;
        - Escopo de fluxo.

    - Escopo 2

        Escopo é a fronteira de visibilidade de uma variavel;
        
        **Exemplo:** Uma variavel declarada no metodo não pode ser visivel por um outro metodo.

7. Palavras reservadas

    - Palavras reservadas 1

        - Tipos primitivos;
        - Classificações;
        - Escopo de uso;
        - Palavras "opostas".

    - Palavras reservadas 2

        São Identificadores de uma linguagem que ja possuem um finalidade especifica;

        **Exempo:** `int`, `for`, `if`, ...

8. Java Doc

    - Java Doc 1
        
        - Explorar documentação oficial do Java;
        - Tipos de comentarios;
        - Tags;
        - Javadoc.

    - Java Doc 2

9. Terminal e Argumentos

    - Terminal e Argumentos 1

        - Main args;
        - Scanner;
        - Execução via IDE;
        - Execução via prompt de comando.

    - Terminal e Argumentos 2

        Executando um programa pelo terminal;

        ### 1o encontre o diretorio do projeto;
        
        Encontre nos seus arquivos a pasta onde esta salvo o projeto, no meu caso, `E:\00. C. Tucano\Bootcamp 2024\Santander Bootcamp 2024\Estudo Java\dio-java-basico\java-terminais-e-argumentos`.
        
        ### 2o No terminal entre no diretorio do arquivo;
        
        Utilize o comando `cd` seguido do diretorio do projeto:

        ```
        E:\>cd E:\00. C. Tucano\Bootcamp 2024\Santander Bootcamp 2024\Estudo Java\dio-java-basico\java-terminais-e-argumentos
        ```
        >observe que no exemplo meu projeto esta em disco diferente do disco do sistema neste caso preciso alternar primeiro o disco rigido dentro do terminas, basta digitar a letra de unidade seguido de :
        >
        >```
        >C:\Users\tucan.DESKTOP-13EGU1H>e:
        >
        >E:\>
        >```
        >.
    

        ### 3o Entre na pasta bin;

        Apos compilados as classe ficão armezenadas na pasta `bin` como `arquivos.class` digite `cd bin` para entrar na pasta:

        ```
        E:\00. C. Tucano\Bootcamp 2024\Santander Bootcamp 2024\Estudo Java\dio-java-basico\java-terminais-e-argumentos>cd bin
        ```

        ### 4o Execute o arquivo;

        Agora q esta na pasta bin basta executar o arquivo digitando `java NomeArquivo` sem o `.class`:

        ```
        E:\00. C. Tucano\Bootcamp 2024\Santander Bootcamp 2024\Estudo Java\dio-java-basico\java-terminais-e-argumentos\bin>java MinhaClasse
        
        Oi, fui executado pelo terminal!
        ```

    - Terminal e Argumentos 3

        Seguindo o mesmo processo anterior mas agura usando o array de argumentos, para isso precisamos inserir os argumentos ao chamar o Arquivo.class no terminal.

        >Os argumentos inseridos passam a ser os valores das variaveis ao executar o programa.

        ```java
        public class AboutMe {
            public static void main(String[] args) throws Exception {

                String nome = args[0];
                String sobrenome = args[1];
                int idade = Integer.valueOf(args[2]);
                double altura = Double.valueOf(args[3]);

                System.out.println("Ola, me chamo " + nome + " " + sobrenome);
                System.out.println("Tenho " + idade + " anos");
                System.out.println("Minha altura é " + altura + " m");
            }
        }
        ```
        ```
        E:\00. C. Tucano\Bootcamp 2024\Santander Bootcamp 2024\Estudo Java\dio-java-basico\java-terminais-e-argumentos\bin>java AboutMe Caio Tucano 31 1.66

        Ola, me chamo Caio Tucano
        Tenho 31 anos
        Minha altura é 1.66 m
        ```

    - Terminal e Argumentos 4

        Utilizando terminal do VS Code e configurando argumentos no arquivo `launch.json`

        `"args": ["Caio","Ribeiro Tucano","31","1.66"],`

### Introdução e Estruturas condicionais com Java

1. Intridução

    - Visão Geral

        Aprensentar os conseitos e explorar os tipos de fluxos condicional, e de repetição em uma aplicação Java.

        **Assuntos:**

        - Estruturas Condicionais: `if` - `else`, `switch` - `case`;
        - Estruturas de repetição: `for`, `while`, `do` - `while`;
        - Estruturas de exceções: `try` - `catch` - `finally`, `throw`.

2. Estruturas Condicionais

    - Condicional Simples

        Estrutura condicional possibilita a escolha de um grupo de ações e comportamentos a serem executadas quando determinadas condições são ou não satisfeitas. As estruturas podem ser simples ou composta.

        - Condicionais Simples:

            Ocorrem quando a condição for positiva;

            ```java
            public class CaixaEletronico {

                public static void main(String[] args) throws Exception {
                    double saldo = 25.0;
                    double valorSolicitado = 26.0;

                    if (valorSolicitado <= saldo) {

                        saldo = saldo - valorSolicitado;

                        System.out.println("Valor saque " + valorSolicitado + ", saldo disponivel " + saldo);

                    }System.out.println("Valor solicitado não disponivel, saldo atual, " + saldo);
                }
            }
            ```

        - Condicional Composta:

            Quando o nosso codigo segue mais de uma jornada de execução, condicionado a uma regra de negocio, este cenario é denominado ***Estrutura condicional Composta***;

            ```java
            public class ResultadoEscolar {

                public static void main(String[] args) throws Exception {
                    int nota = 8;

                    if (nota >= 7){
                        System.out.println("Aluno Aprovado");
                    }else{
                        System.out.println("Aluno Reprovado");
                    }
                }
            }
            ```

        - Condicional Encadeada:

            É um controle de fluxo condicional que não nos limitamos ao ***se*** (`if`) e ao ***senao*** (`else`), poderemos ter uma terceira ou inumeras condições;

            ```java
            public class ResultadoEscolarEncadeado {

                public static void main(String[] args) throws Exception {

                    int nota = 7;

                    if (nota >= 7) {
                      System.out.println("Aluno aprovado");
                      
                    }else if (nota >= 5 && nota < 7) {
                        System.out.println("Aluno esta de recuperação");

                    }else {
                        System.out.println("Aluno reprovado");
                    }
                }
            }
            ```

        - Condição Ternaria:

            Usa os operadores ternarios para substituir a estrutura do `if` - `else` deixano o codigo um pouco mais limpo;

            ```java
            public class ResultadoEscolarEncadeado {

                public static void main(String[] args) throws Exception {

                    int nota = 7;

                    String resultado = nota >= 7 ? "Aprovado" : nota >= 5 ? "de Recuperação" : "Reprovado";
                    System.out.println("O aluno esta " + resultado);

                    /*if (nota >= 7) {
                      System.out.println("Aluno aprovado");
                      
                    }else if (nota >= 5 && nota < 7) {
                        System.out.println("Aluno esta de recuperação");

                    }else {
                        System.out.println("Aluno reprovado");
                    }*/
                }
            }
            ```
        - Switch Case:

            A estrutura `switch` compara o valor de cada caso com o da variavel sequencialmente, e executa o codigo associado ao caso correspondente, para evitar que as comparações continuem sendo executadas apos um caso correspondente adicionamos o comando `break` no final de cada caso. Ocomando `break` encerra a execução da estrutura onde ele se encontra;

            ```java
            public class SistemaMedida {

                //switch e case

                public static void main(String[] args) {

                    String sigla = "M";

                    switch (sigla) {

                        case "P": {
                            System.out.println("Pequeno");
                             break;
                        }
                        case "M": {
                            System.out.println("Medio");
                             break;
                        }
                        case "G": {
                            System.out.println("Grande");
                             break;
                        }
                        default: {
                            System.out.println("Indefinido");
                            break;
                        }
                    }
                }
            }
            ```

### Estruturas de repetição em Java

1. Estruturas de Repetição;

    - For
        
        O comando `for` (na tradução brasileira "para") permite que uma variavel contadora seja testada e incrementada a cada interação:

        ```java
        // estrutura de controle de fluxo for

        for (bloco de inicialização; expressão booleana de validação; bloco de atualização){
            //comando que será executado até que a
            //expreção de validação torne-se falsa.
        }
        ```

        ```java
        public class ExemploFor {

            public static void main(String[] args) throws Exception {

                for( int carneirinhos = 1; carneirinhos <=20; carneirinhos ++){

                    System.out.println("Contando carneirinhos ... : " + carneirinhos);
                }

                System.out.println("Joãozinho dormiu.");
            }
        }
        ```

    - For e Arrays

        Também usamos o controle de fluxo `for` para interagir sobre arrays e coleções:

        ```java
        public class ExemploForArray {

            public static void main(String[] args) {

                String alunos[] = { "FELIPE", "JOANA", "JULIA", "MARCOS" };

                for (int x = 0; x < alunos.length; x ++){

                    System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
                }
            }
        }
        ```

        > #### For Each
        >
        >O uso do `for / each` esta fortemente relacionado com o cenário
        >onde contenha array ou coleção, e assim a interação é baseada
        >aos elementos da coleção:
        >
        >```java
        >public class ExemploForArray {
        >   public static void main(String[] args) {
        >       String alunos[] = { "FELIPE", "JOANA", "JULIA", "MARCOS" };
        >       for(String aluno : alunos){
        >           System.out.println("O nome do aluno é : " + aluno);
        >       }
        >   }
        >}
        >```
        >.

    - Break e Continue

        `break` significa quebrar, parar, frear ou interromper. E é isso que o Java faz quando encontra esse comando. `continue`, como o nome diz, ele 'continua' o laço. O comando `break` interrompe o laço e o comando `continue` interrompe somente a interação atual.

        ```java
        public class ExemploBreakContinue {
            public static void main(String[] args) {
                System.out.println("Teste break");
                for( int numero = 1; numero <= 5 ; numero ++){
                    if (numero == 3) {
                        break;
                    }
                    System.out.println(numero);
                }

                System.out.println("Teste Continue");
                for( int numero2 = 1; numero2 <=5; numero2 ++){
                    if (numero2 == 3) {
                        continue;
                    }
                    System.out.println("Numero: " + numero2);
                }
            }
        }
        ```

    - While

        O laço `while` (na tradução da lingua portuguesa 'enquanto') determina que enquanto uma condição for valida, o bloco de codigo sera executado. O laço `while` testa a condição antes de executar o codigo, logo, caso a condição seja invalida no primeiro teste o bloco nem será executado:

        ```java
        //estrutura de controle de fluxo com while

        while (expressão booleana de validação) {

            //comando que será executado até que a
            //expreção de validação torne-se falsa

        }
        ```
        ```java
        import java.util.concurrent.ThreadLocalRandom;

        public class ExemploWhile {

            public static void main(String[] args) {

                double mesada = 50.0;

                while (mesada>0) {

                    double valorDoce = valorAleatorio();

                    if (valorDoce > mesada) {
                        valorDoce = mesada;
                    }

                    System.out.println("Doce no valor: " + valorDoce + " adicionado ao carrinho");
                    mesada = mesada - valorDoce;
                }

                System.out.println("Mesada: " + mesada);
                System.out.println("Joãozinho gastou toda sua mesada em doces");
            }

            private static double valorAleatorio() {
                return ThreadLocalRandom.current().nextDouble(2, 8);
            }
        }
        ```

    - Do While

        O laço `do / while` (na tradução para lingua portuguesa 'faça enquanto'), assim como o `while`, considera que enquanto uma condição for valida o bloco de codigo será executado. Entretanto, `do / while` testa a condição após executar o código, sendo assim, mesmo que a condição seja invalida no promeiro teste o bloco será executado pelo menos uma vez.

        ```java
        // estrutura do controle de fluxo do while
        
        do {
            // comando que será executado até que a
            // expressão de validação torne-se falsa
        }while (expressão booleana de validação);
        ```

        ```java
        import java.util.Random;

        public class ExemploDoWhile {

            public static void main(String[] args) {
        
                System.out.println("Discando...");

                do{
                    //executando repetidas vezes até alguem atender
                    System.out.println("Telefone tocando");
                }while (tocando());
                
                System.out.println("Alô!");
            }

            public static boolean tocando(){
                boolean atendeu = new Random().nextInt(3) == 1;
                /*System.out.println("Atendeu? " + atendeu);*/
                return !atendeu;
            }
        }
        ```