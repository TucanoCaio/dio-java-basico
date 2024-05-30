
# Estudos: Bootcamp Santander 2024

Caderno de anotações para estudo da trilha JAVA do Bootcamp ofereciso pelo Santander.

## Príncipios de Desenvolvimento de Software Colaborativo

| ID | Desc. |
|:--:|:-----:|
| 01 | ----- |

---

## Dominado a Linguagem de Programação Java

### Ambiente de Desenvolvimento Java

1. Configração do VS Code sincronizando com o github e realizando um commit atraves da IDE.

---

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

### Java e Tratamento de Exceções

1. Estruturas Excepcionais;

    - Try/Catch

        Ao executar o código Java, diferentes erros podem acontecer: erros de codificação feitos pelo programador, erros devido a entrada errada ou outros imprevistos.

        Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: Java lançará ema exceção (jogará um erro).

        De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drasticamente. Já exceções e um fluxo inasperado da nossa aplicação, querer dividir um valor por zero, querer abrir um arquivo que não existe, abrir uma conexão em banco com usuário ou senha inválida. Todos esses cenarias e os demais não são erros mais sim fluxos não previsto pela aplicação.

        É ai que entra mais uma responsabilidade do desenvolvedor, prever situações iguais a esta e realizar o que denominamos ***Tratamento de Exceções***.

        #### Conhecendo as exções já mapeadas.

        A linguagem Java dispõe de uma vasta lista de classes que representam exceções abaixo iremos apresentar as mais comuns:

        |Nome|Causa|
        |:---|:---|
        |`java.lang.NullPointerException`|Quando tentamos obter informações de uma variavel nula|
        |`java.lang.ArithmeticException`|Quando tentamos dividir um valor por zero|
        |`java.sql.SQLException`|Quando existe algum erro relacionado a interação com banco de dados|
        |`java.io.FileNotFoundException`|Quando tentamos ler ou escrever em um arquivo que não existe|

        ```java
        import java.util.InputMismatchException;
        import java.util.Locale;
        import java.util.Scanner;

        public class AboutMe {
            public static void main(String[] args) throws Exception {

                try {
                Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

                System.out.println("Digite seu nome: ");
                String nome = scanner.next();

                System.out.println("Digite seu sobrenome: ");
                String sobrenome = scanner.next();

                System.out.println("Digite sua idade: ");
                int idade = scanner.nextInt();

                System.out.println("Digite sua altura: ");
                double altura = scanner.nextDouble();

                System.out.println("Ola, me chamo " + nome + " " + sobrenome);
                System.out.println("Tenho " + idade + " anos");
                System.out.println("Minha altura é " + altura + " m");
                }
                catch (InputMismatchException e) {
                    System.out.println("Os campos idade e altura precisam ser numericos.");
                }
            }
        }
        ```

    - Exeções checadas e não checadas ....

        .....

### Debugging Java

1. Apresentação e visão geral

    - Apresentação e visão geral

## Programação Orientada a Objetos com Java

### Fundamentos da Programação Orientada a Objetos com Java

1. Fundamentos da Programação Orientada a Objetos com Java

    - Introdução

        Assuntos abordados

        - Conceito de POO;
        - Pacotes de Visibilidade de recursos;
        - Classes e Construtores;
        - Java Beans e UML;
        - Pilares do POO;
        - Enums e Interfaces;

    - Conceitos POO

        - Linguagem de **Baixo Nível**: São linguagens que estão mais procimas da interpretação da maquina. ***Linguagem Assembly e C***;

        - Linguagem de **Alto Nível**: São linguagens que disponibilizam uma proposta de sintaxe (forma de escrever processos para serem executados pelo computador) mais próxima de interpretação humana. ***Java, JavaScript, Python e C++***.

        **Programação estruturada**

        **A programação estruturada** é um *paradigma de programação que* visa melhorar a clareza, a qualidade e o tempo de denvolvimento de um *programa de computador*, fazendo uso estensivo das construções de fluxo de controle estruturado de seleção (`if / then / else`) e repetições (`while` e `for`), *estruturas de bloco* e *sub - ratinas*.

        O que devemos ter em mente, é que na programação estruturada implementamos algoritimos com estruturas sequenciais denominados de procedimentos lineares, podendo afetar o valor das variáveis de escopo local ou global em uma aplicação.

        **Programação orientada a objetos**

        POO é um *paradigma de programação* baseado no conceito de "*objetos*", que podem conter *dados* na forma de *campos*, também conhecidos como atributos, e códigos, na forma de *procedimentos*, também conhecidos como *métodos*.

        O que precisamos entender, é que cada vez mais as linguagens se adequam ao cenário real, proporcionando assim que o programador desenvolva algoritimos mais próximo de fluxos comportamentais, logo tudo ao nosso redor é representado como Objeto.

        >Enquanto a programação é voltada a procedimentos e funções definidas pelo 
        >usuário, a programação orientada a objetos é voltada a conceitos como o de 
        >classes e objetos.
    
    - Classes

        Toda a estruturação de código na linguagem Java é distribuído em arquivos com estensão `.java` denominados de **classe**.

        As classes existentes em nosso projeto são composta por:

        **Identificador**, **Características** e **Comportamentos**.

        - **Classe** (class): A estrutura e/ou representação que direciona a criação dos objetos de mesmo tipo.

        - **Identificador** (identity): Propósito existencial aos objetos que serão criados.

        - **Características** (states): Também conhecidos como **atributos** os **propriedades**, é toda informação que representa o estado do objeto.

        - **Comportamentos** (behavior): Também conhecido como **ações** ou **métodos**, é toda parte comportamental que um ojeto dispõe.

        - **Instanciar** (new): É o ato de criar um objeto a partir de estrutura definida em uma classe.

        ***Exemplo:***

        Seguindo algumas convenções, as nossa classes são classificadas como:

        - **Classe de modelo (model)**: classes que representem estrutura de domínio da aplicação, exemplo: Cliente, Pedido, Nota Fiscal e etc.

        - **Classe de serviço (service)**: classes que contém regras de negócio validação de nosso sistema.

        - **Classe de repositório (repository)**: classe que contém uma integração com banco de dados.

        - **Classe de controle (controller)**: classes que possuem a finalidade de disponibilizar alguma comunicação externa à nossa aplicação, tipo http web ou webservices.

        - **Classe utilitária (util)**: classe que contém recursos comuns à toda nossa aplicação.

    - Pacotes

        **Nomeclatura**

        Vamos imaginar que sua empresa se chama **Power Soft** e ela está desenvolvendo softwares comercial, governamental e um software livre ou de código aberto. Abaixo teríamos os pacotes sugeridos conforme tabela:

        - **Comercial**: com.powersoft
        - **Governamental**: gov.powersoft
        - **Código aberto**: org.powersoft

        Bem, acima já podemos perceber que existe uma definição para o uso do nome dos pacotes, porém podemos organizar ainda mais um pouco as nossas classes mediante a proposta de sua existência:

        - **Model**: Classe que representam a camada de modelo da aplicação: Cliente, Pedido, NotaFiscal, Usuario.

        - **repository**: Classe ou interfaces que possuem a finalidade de interagir com tabelas na banco de dados: ClienteRepository.

        - **service**: Classe que contém regras de negócio do sistema: ClienteService possui o método validar o CPF do cliente cadastrado.

        - **controller**: Classe que possuem a finalidade de disponibilizar os nossos recursos da aplicação para outras aplicações via padrão HTTP.

        - **view**: Classes que possuem alguma interação com a interface gráfica acessada pelo usuário.

        - **util**: Pacote que contém classes utilitárias do sistema: FormatodorNumeroUtil, ValidadorUtil.

        **Identificação**

        Uma das características de uma classe é a identificação, Cliente, NataFiscal, TituloPagar, porém quando esta classe é organizada por pacotes, ela passa a ter duas identificações. O nome simples (**próprio nome**) e agora o nome qualificado (**endereçamento do pacote + nome**), exemplo: Considere a classe Usuario que está endereçada no pacote com.controle.acesso.model, o nome qualificado desta classe é **com.controle.acesso.model.Usuario**

        **Package versus Import**

        A localização de uma classe é definida pela palavra reservada package, logo, uma classe só contém uma definição de package no arquivo, sempre na primeira linha do código. Para a utilização de uma classe existentes em outros pacotes, necessitamos realizar a importação das mesmas, seguindo a recomendação abaixo:

        ```java
        package /* Nome da package correspondente */;

        import /* caso minha classe utilize outras classes precisa ser importado*/;

        public class MinhaClasse {
            // Começa a classe
        }
        ```

        **Por que é tão importante compreender de pacotes?**

        A linguagem Java é composta por milhares de classes internas, classes desenvolvidas em projetos disponíveis através de bibliotecas e as classes do nosso projeto. Logo, existe uma enorme possibilibade da existência de classes de mesmo nome.

        É nesta hora, que nós desenvolvedores precisamos detectar qual classe iremos importar em nosso projeto.

        Um exemplo clássico é a existencia das classes **java.sql.Date** e **java.util.Date** da própria linguagem. (Pesquisar sobre a diferença das duas classes)

    - Visibilidade de recurso

        **Modificadores**

        Em Java, utilizamos tês palavras reservadas e um conceito default (sem nenhuma palavra reservada) para definir os quatro tipos de visibilidade de atributos, métodos e até mesmo classes no que se refere ao acesso por outras classes. Iremos ilustrar do mais visível ao mais restrito de visibilidade nos arquivos em nosso projeto.

        Para uma melhor ilustração, iremos representar os conceitos de visibilidades de recursos através do contexto em uma lanchonete que vende lanche natural e suco.

        **Modificador public** 

        Como o próprio nome representa, quando nossa classe, método e atributo é definido como public, qualquer outra classe em qualquer outro pacote pode visualizar tais recursos.

        **Modificador default**

        O modificador **default** está fortemente associado a organização das classes por pacotes, algumas implementações não precisam estar deisponíveis por todos o projeto, e este modificador de acesso restringe a visibilidade por pacotes.

        Dentro do pacote **lanchonete**, iremos criar dois sub-pacotes para representar a divisão do estabelecimento.

        - **lanchonete.atendimento.cozinha**: Pacote que contém classes da cozinha da lanchonete e atendimentos.

        - **lanchonete.area.cliente**: Pacote que contém classes relacionadas ao espaço do cliente.

        **Modificador private**: Depois de reestruturar nosso estabelecimento (projeto), onde, temos as divisões (pacotes) espaço do do cliente e atendimento, chegou a hora de uma reflexão sobre visibilidade ou modificadores de acesso.

        Conhecemos as ações disponíveis nas classes Cozinheiro, Almoxarife, Atendente e Cliente ,mesmo com a organização da visibilidade por pacote, será que realmente estas classes precisam ser tão explicitas?

        - Será que o Cozinheiro precisa saber que/como o almoxarife controle as entradas e saídas?

        - Que o Cliente precisa saber como o Atendente recebe o pedido para servir sua mesa?

        - Que o Atendente precisa saber que antes de pagar o Cliente consulta o saldo no App?

        Diante destes questionamentos é que nossas classes precisam continuar mantendo suas ações (métodos) mas nem todas precisam ser vistas por ninguém.

    - Getter e Setters

        Seguindo a convenção Java Beans, uma classe que contém esta estrutura de estados deverá seguir as regras a baixo:

        - Os atributos precisam ter o modificador de acesso private. Ex.: `private String nome`;

        - Como agora os atributos estarão somente a nível de classe, precisaremos dos métodos **get**X e **set**X, Ex.: `getNome()` e `setNome(String novoNome)`;

        - O método `get` é responsável por obter o valor atual do atributo, logo ele precisa ser `public` retornar um tipo correspondente ao valor, Ex.: `public String getNome() {}`;

        - O método `set` é responsável por definir ou modificar o valor de um atributo em um objeto, logo ele também precisa ser public, receber um parâmetro do mesmo tipo da variável mas não retorna nenhum valor void. Ex.: `public void setNome(String newNome)`;

    - Construtores

        Sabemos que para criar um objeto na linguagem Java utilizamos a seguinte estrutura de código:

        ```java
        Classe novoObjeto = new Classe();
        ```

        Desta forma será criado um novo objeto na memória, este recurso também é conhecido como instanciar um novo objeto.

        Muitas das vezes já queremos que na criação (instanciação) de um objeto, a linguagem já solicite para quem for criar este novo objeto que defina algumas propriedades essenciais. Abaixo iremos ilstrar uma classe Pessoa onde a mesma terá os atributos: Nome, CPF, Endereço.

        ```java
        package pessoa;

        public class Pessoa {
            private String nome;
            private String cpf;
            private String endereco;

            public String getNome() {
                return nome;
            }

            public String getCpf() {
                return cpf;
            }

            public String getEndereco() {
                return endereco;
            }

            public void setEndereco(String endereco) {
                this.endereco = endereco;
            }
        }
        ```

        Criaremos uma `Pessoa` mas como não temos o setter para o nome e CPF, este objeto não tem como receber estes valores.

        ```java
        package pessoa;

        public class SistemaCadastro {

            public static void main(String[] args) {
                Pessoa marcos = new Pessoa();

                marcos.setEndereco("Rua das Marias");

                System.out.println(marcos.getNome()+"-"+marcos.getCpf());
                //Retorno: Null-Null
            }
        }
        ```

        Entrando em cena o construtor para criarmos nossos objetos já com valores requeridos no momento da criação/unstanciação (`new`)

        ```java Pessoa.java
        //Classe Pessoa.java
        package pessoa;

        public class Pessoa {

            private String nome;
            private String cpf;
            private String endereco;

            // método construtor
            // o nome devera ser igual ao nome da classe
            public Pessoa (String cpf, String nome) {
                this.cpf = cpf;
                this.nome = nome;
            }

            public String getNome() {
                return nome;
            }

            public String getCpf() {
                return cpf;
            }

            public String getEndereco() {
                return endereco;
            }

            public void setEndereco(String endereco) {
                this.endereco = endereco;
            }
        }
        ```
        ```java SistemaCadastro.java
        //Classe SistemaCadastro.java
        package pessoa;

        public class SistemaCadastro {

            public static void main(String[] args) {
                // Adicionando parametros do metodo construtor direto na declaração do Objeto
                Pessoa marcos = new Pessoa("123", "Marcos");

                marcos.setEndereco("Rua das Marias");

                System.out.println(marcos.getNome()+"-"+marcos.getCpf());
            }
        }
        ```

    - Enums

        Enum é um tipo especial de classe onde os objetos são previamente criados, imutáveis e disponível por tada aplicação.

        Usamos Enum quando o nosso modelo de negócio contém objetos de mesmo contexto que já existem de forma pré-estabelecida com a certeza de não haver tanta alteração de valores.

        **Exemplos:**

        **Grau de Escolaridade:** Analfabeto, Fundamental, Médio, Superior.

        **Estado Civil:** Solteiro, Casado, Divorciado, Viúvo

        **Estados Brasileiros:** São Paulo, Rio de Janeiro, Piauí, Maranhão, etc...

        > Não confunda uma lista de constantes com enum.

        Enquanto que uma constante é uma variável de tipo com valor imutável, um enum é um conjunto de objetos já pre-definidos na aplicação.

        Como um enum é um conjunto de objetos, logo, estes objetos podem conter atributos e metodos. Veja o exemplo de um enum para disponibilizar os quatro estados brasileiros citados acima, contendo informações de Nome, Sigla, e um metodo que pega o nome de cada estado e já retorna para tudo maiusculo.

        ```java ENUM EstadoBrasileiro.java
        // Classe (enum) EstadoBrasileiro.java
        package exemploenum;

        public enum EstadoBrasileiro {

            SAO_PAULO ("SP","São Paulo"),
            RIO_Janeiro ("RJ","Rio de Janeiro"),
            PIAUI ("PI", "Piauí"),
            MARANHAO ("MA","Maranhão");

            private String nome;
            private String sigla;

            private EstadoBrasileiro (String sigla, String nome){
                this.sigla = sigla;
                this.nome = nome;
            }

            public String getNome() {
                return nome;
            }

            public String getSigla() {
                return sigla;
            }

            public String getNomeMaiusculo () {
                return nome.toUpperCase();
            }
        }
        ```
        ```java SistemaIbge.java
        // Classe SistemaIbge.java
        package exemploenum;

        public class SistemaIbge {
            public static void main(String[] args) {
                /*for (EstadoBrasileiro e : EstadoBrasileiro.values()){
                    System.out.println(e.getSigla() + " - " + e.getNome());
                }*/

                EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;

                System.out.println(eb.getSigla());
                System.out.println(eb.getNome());
                System.out.println(eb.getNomeMaiusculo());

            }
        }
        ```

    - UML

        Linguagem de Modelagem Unificada ou UML é uma notação que possibilita a representação gráfica do projeto.

        Na UML temas três conceitos necessários para compreendermos inicialmente:
        **diagramas**, **elementos** e **relacionamentos**.

        As notações UML são distribuidas em duas categorias de diagramas, a estrutural e comportamental conforme listagem abaixo:

        **Diagramas estruturais**

        - **Diagrama de classe**: O Diagrama de Classe é utilizado para fazer a representação de estruturas de classes de negocio, interfaces e outros componentes do sistema, Por esta caracteristica, este diagrama é considerado a mais importante para a UML, pois auxilia a maioria dos demais diagramas.

        - **Diagramas de objetos**: Este diagrama representa os objetos existentes em um determinado instante ou fato na aplicação. assim conseguimos ter uma perspectiva do estado de nossos objetos mediamente a interação dos usuarios na sistema.

        >Existem outras categorias de diagramas 
        >estruturais e comportamentais, porém 
        >iremos focar nos citados acima.

        **Diagrama de classe**

        O diagrama de classe ilustra **graficamente** como classes serão estruturadas e interligadas entre si diante da proposta do nosso software.

        em diagrama e estrutura das classes é contituida por:

        **Identificação**: Nome e/ou finalidade da classe

        **Atributos**: Propriedades e/ou características

        **Operações**: Ações e/ou metodos

        **Relacionamentos**

        Em um diagrama as classes podem existir de forma independente, mas obviamente haverá em alguma etapa a aplicação e necessidade de algumas se relacionarem, o que devemos compreender é o nivel de dependencia entre elas:

        Associação

        Uma assiciação define em relacionamento entre duas classes, permitindo que um objeto tenha acesso a estrutura de um outro objeto.

        - **Agregação**: Em uma agregação a classe principal contém uma relação com outra classe ela pode existir sem a classe agregadoara. Imagina em um cadastro de Candidatos, podemos encontrar candidatos que ainda não possuam uma profissão.

        - **Composição**: A composição já caracteriza uma dependência existencial entre a classe principal e a classe associada. Imaginamos que uma admissão só poderá existir contendo suas informações básicas e a composição do candidato selecionado.

        **Multiplicidade**

        Nem sempre o relacionamento entre as classes será de **um para um**, um determinado cenário poderá exigir multiplicidades específicas conforme opções abaixo:

        - 1.-> Representa uma assiciação **contendo um elemento**.
        - *. -> Representa uma associação **contendo uma lista de elementos**.
        - 0..1 -> Representa uma associação **contendo zero ou um elemento**.
        - 0..* -> Representa uma associação **contendo zero ou uma lista de elementos**.
        - 1..* -> Representa uma associação **contendo um ou uma lista de alementos**.

        **Visibilidade**

        Os atributos e metodos de uma classe podem recebem niveis de visibilidade, e na UML existem símbolos que representam cada um deles.

        - (+) Visibilidade publica
        - (#) Visibilidade protegida (muita associada com herança)
        - (-) Visibilidade privado

### Pilares da Programação Orientada a Objetos em Java

1. Pilares da Programação Orientada a Objetos em Java

    - Pilares do POO

        **Programação orientada a objetos** (**POO**, ou **OOP** segundo as suas siglas em inglês) é um *paradigma de programação* baseado no conceito de "*objetos*", que podem conter *dados* na forma de *campos*, também conhecidos como ***atributos***, e códigos, na forma de *procedimentos*, também conhecidos como *métodos*.

        Como se trata de um contexto análogo ao mundo real, tudo no qual nos referimos são objetos, exemplo: Conta bancária, Aluno, Veículo, Transferência etc.

        A programação orientada a objetos é bem requisitada no contexto das aplicações mais atuais no mercado devido a possibilidade de reutilização de código e a capacidade de representação do sistema ser muito mais próximo do mundo real.

        Para uma linguagem ser considerada orientada a objetos, esta deve seguir o que denominamos como **Os quatro pilares da orientação a objetos**:

        - **Encapsulamento**: Nem tudo precisa estar visível, grande parte do nosso algoritmo pode ser distribuído em métodos com finalidades específicas que complementa uma ação em nossa aplicação.
        *Exemplo*: Ligar um veículo exige muitas etapas para a engenharia, mas o condutor só visualiza a ignição, dar a partida e a "*magia*" acontece.

        -**Herença**: Características e comportamentos comuns podem ser elevados e compartilhados através de uma hierarquia de objetos.
        *Exemplo*: Um Carro e uma Motocicleta possuem propriedades como placa, chassi, eno de fabricação e métodos como acelerar e frear. Logo para não ser um processo de codificação redundante, podemos desfrutar da herança criando uma classe **Veiculo** para que seja herdada por Carro e Motocicleta.

        - **Abstração**: É a indisponibilidade para determinar a lógica de um ou vários comportamentos em um objeto.
        *Exemplo*: **Veículo** determina duas ações como acelerar e frear, logo estes comportamentos deverão ser abstratos pois existem mais de uma maneira de se realizar a mesma operação. ver *Polimorvismo*.

        - **Polimorfismo**: São as inúmeras maneiras de se realizar uma mesma ação.
        *Exemplo*: Veículo determina duas ações como acelerar e frear, primeiramente precisamos identificar se estaremos nos referindo a **Carro** ou **Motocicleta** para determinar a lógica de aceleração e frenagem dos respectivos veículos.

        Em prática

        Para ilustrar a proposta dos Princípios de POO no nosso quotidiana, vamos simular algumas funcionalidades dos aplicativos de mensagens instantâneas pela internet.

        **MSN Messenger** foi um programa de mensagens instantâneas criado pela Microsoft Corporation. O serviço nasceu a 22 de julho de 1999, anunciando-se como um serviço que permitia falar com uma pessoa através de conversas instantâneas pela internet. Ao longo dos anos surgiram novos serviços de mensagens pela internet como **Facebook Messengerr** e o **VKontakte Telegram**.

    - Encapsulamento

        ***Nem tudo precisa ser disponível para todos***

        Já imaginou você instalar o MSN Messenger e ao querer enviar uma mensagem, te fosse solicitado verificar se o computador está conectado a internet e depois, pedir para você salvar a mensagem no histórico? Ou, ao tentar enviar em SMS pelo celular primeiro você precisasse consultar manualmente o seu saldo ?

        Acreto que não seria uma experiência tão agradável de ser ecevutada recorrentemente por nós usuários.

        Mesmo ainda sendo necessária alguma etapas nos processos citados, não é um requisito uma visibilidade pública, isso quer dizer que, além da própria classe que possui a responsabilidade de uma determinada ação.

        Quanto ao MSN Messenger, para nós, só é relevante saber que podemos e como devemos enviar e receber a mensagem, logo, as demais funcionalidades poderão ser consideradas privadas (private). E é ai que se caracteriza a necessidade do pilar de Encapsulamento, o que esconder?

        Vejamos a refatoração abaixo da nossa clasa MSN Messenger:

        ```java MSN
        // Classe Msn.java
        package msn_messenger;

        public class Msn {

            public void enviarMensagem() {
                System.out.println("Enviando mensagem...");
            }

            public void receberMensagem () {
                System.out.println("Mensagem recebida");
            }

            public void salvarHistorico () {
                System.out.println("Salvando historico...");
            }

            public void validarConexao () {
                System.out.println("Conectado a Internet");
            }
        }
        ```
        ```java Usuario
        // Classe Usuario.java
        package msn_messenger;

        public class Usuario {

            public static void main(String[] args) {

                Msn msn = new Msn();
        
                msn.validarConexao();
                msn.enviarMensagem ();
                msn.receberMensagem();
                msn.salvarHistorico();
        
            }
        }
        // O usuario precisa manualmente validar a conexão antes de enviar e receber a mensagem e dpois precisa salvar o histórico.
        ```

        **Veja o Codigo com ENCAPSULAMENTO**

        ```java MSN
        // Classe Msn.java
        package msn_messenger;

        public class Msn {

            public void enviarMensagem() {
                // Agora atribuimos o metodo validarConexao() 
                //-agora alterado para private- ao metodo 
                //enviarMensagem(), isso faz com que o sistema 
                //verifique a conexao de forma automatica.
                validarConexao();
                System.out.println("Enviando mensagem...");

                // Metodo salvarHistorico()-também alterado 
                //para private- também foi atribuido ao metodo 
                //enviarMensagem(), também criando uma 
                //automação no processo.
                salvarHistorico();
            }

            public void receberMensagem () {
                System.out.println("Mensagem recebida");

                // Agora fica mais facil criar uma automação 
                //para salvar o historico, já que não é mais 
                //um processo realizado pelo usuario.
                salvarHistorico();
            }

            // Metodo salvarHistorico() agora é privado 
            //(private) isso significa que agora ele é uma 
            //responsabilidade somente da classe Msn.java
            private void salvarHistorico () {
                System.out.println("Salvando historico...");
            }

            // Metodo validarConexao() agora é privado 
            //(private) isso significa que agora ele é uma 
            //responsabilidade somente da classe Msn.java
            private void validarConexao () {
                System.out.println("Conectado a Internet");
            }
        }
        ```
        ```java Usuario
        // Classe Usuario.java
        package msn_messenger;

        public class Usuario {
            public static void main(String[] args) {

                Msn msn = new Msn();
        
                // Agora que os metodos de validarConexao() e 
                //salvarHistorico() são privados não podem 
                //mais ser acessiveis pelo usuario passando a 
                //ser responsabilidade da classe Msn.java.

                // O usuario deve se preocupar somente em 
                //enviar e receber a mensagem deixando que os 
                //outros processos sejam executados de forma 
                //automatica.
                msn.enviarMensagem ();
                msn.receberMensagem(); 
            }
        }
        ```

    - Herança

        ***Nem tudo se copia, as vezes se herda***

        Já imaginou você ter sido classificado para a vaga de emprego de seus sonhos e como desafio, justamente fosse você criar um diagrama de classes e em seguida os respectivos arquivos .java que apresentasse os fundamentos de POO com base no contexto de vários aplicativos de mensagens instantâneas?

        > [!TIP]
        > Com base na classe **MsnMessenger**, já
        > poderia dar os primeiros passo para se
        > dar bem no processo seletivo,
        > simplesmente, copiando e colando a
        > estrutura para as nos classes,
        > **FacebookMessenger** e **Telegram**.

        > [!CAUTION]
        > Mas esta não seria a melhor alternativa
        > para a proposta citada acima.

        Vamos conferir utilizando a principio de herança.

        ```java Serviço Mensagem Instantanea
        // ServicoMensagemInstantanea.java
        package msn_messenger;

        public class ServicoMensagemInstantanea {

            public void enviarMensagem() {
                validarConexao();
                System.out.println("Enviando mensagem...");
                salvarHistorico();
            }
            public void receberMensagem () {
                System.out.println("Mensagem recebida");
                salvarHistorico();
            }
            private void salvarHistorico () {
                System.out.println("Salvando historico...");
            }
            private void validarConexao () {
                System.out.println("Conectado a Internet");
            }
        }
        ```
        ```java Facebook
        //FacebookMessenger.java
        package msn_messenger;
        public class FacebookMessenger extends ServicoMensagemInstantanea {}
        ```
        ```java Telegram
        //Telegram.java
        package msn_messenger;
        public class Telegram extends ServicoMensagemInstantanea {}
        ```
        ```java MSN
        //MsnMessenger.java
        package msn_messenger;
        public class MsnMessenger extends ServicoMensagemInstantanea {}
        ```
        ```java Usuario
        //Usuario.java
        package msn_messenger;
        public class Usuario {
            public static void main(String[] args) {
                //System.out.println("");
                //System.out.println("MSN");

                MsnMessenger msn = new MsnMessenger();
                msn.enviarMensagem ();
                msn.receberMensagem();

                //System.out.println("");
                //System.out.println("Facebook");

                FacebookMessenger fbm = new FacebookMessenger();
                fbm.enviarMensagem();
                fbm.receberMensagem();

                //System.out.println("");
                //System.out.println("Facebook");

                Telegram tlg = new Telegram();
                tlg.enviarMensagem();
                tlg.receberMensagem();
            }
        }
        ```

    - Abstração

        ***Para você ser é preciso você fazer***

        Sabemos que qualquer sistema de mensagens instantâneas se realiza as mesmas operações de Enviar e Reveber Mensagem, dentre outras operações comuns ou exclusivas de cada aplicação disponível no mercado.

        Mas será que as ações realizadas contém o mesmo comportamento? Acreditamos que não.

        > [!NOTE]
        > Já imaginou a **Microsoft** falar para o
        > **Facebook**:**"Ei, toma meu código do MSN**.

        Oque vale destacar para compreender aqui é que todo e qualquer sistema de mensagem precisa sim no mínimo Envir e Receber Mensagem, logo, consideramos se firmar um "contrato" para qualquer um que queira se apresentar assim para o mercado.

        Observem a nova estruturação dos códigos com base na implementação apresentada no pilar **Herança**.

        ```java Serviço Mensagem Instantanea
        //ServicoMensagemInstantanea.java
        package msn_messenger;

        public abstract class ServicoMensagemInstantanea {

            public abstract void enviarMensagem();
            public abstract void receberMensagem ();
        }
        ```
        ```java Facebook
        //FacebookMessenger.java
        package msn_messenger;

        public class FacebookMessenger extends ServicoMensagemInstantanea {
            public void enviarMensagem() {
                validarConexao();
                System.out.println("Enviando mensagem pelo Facebook...");
                salvarHistorico();
            }
            public void receberMensagem () {
                System.out.println("Mensagem recebida pelo Facebook");
                salvarHistorico();
            }
            private void salvarHistorico () {
                System.out.println("Salvando historico pelo Facebook...");
            }
            private void validarConexao () {
                System.out.println("Facebook Conectado a Internet");
            }
        }
        ```
        ```java Telegram
        //Telegram.java
        package msn_messenger;
        public class Telegram extends ServicoMensagemInstantanea {
            public void enviarMensagem() {
                validarConexao();
                System.out.println("Enviando mensagem pelo Telegram...");
                salvarHistorico();
            }
            public void receberMensagem () {
                System.out.println("Mensagem recebida pelo Telegram");
                salvarHistorico();
            }
            private void salvarHistorico () {
                System.out.println("Salvando historico pelo Telegram...");
            }
            private void validarConexao () {
                System.out.println("Telegram Conectado a Internet");
            }
        }
        ```
        ```java MSN
        //MsnMessenger.java
        package msn_messenger;
        public class MsnMessenger extends ServicoMensagemInstantanea {
            public void enviarMensagem() {
                validarConexao();
                System.out.println("Enviando mensagem pelo MSN...");
                salvarHistorico();
            }
            public void receberMensagem () {
                System.out.println("Mensagem recebida pelo MSN");
                salvarHistorico();
            }
            private void salvarHistorico () {
                System.out.println("Salvando historico pelo MSN...");
            }
            private void validarConexao () {
                System.out.println("MSN Conectado a Internet");
            }
        }
        ```
        ```java Usuario
        //Usuario.java
        package msn_messenger;
        public class Usuario {
            public static void main(String[] args) {
                //System.out.println("");
                //System.out.println("MSN");
                MsnMessenger msn = new MsnMessenger();
                msn.enviarMensagem ();
                msn.receberMensagem();

                //System.out.println("");
                //System.out.println("Facebook");
                FacebookMessenger fbm = new FacebookMessenger();
                fbm.enviarMensagem();
                fbm.receberMensagem();

                //System.out.println("");
                //System.out.println("Facebook");
                Telegram tlg = new Telegram();
                tlg.enviarMensagem();
                tlg.receberMensagem();
            }
        }
        ```

    - Polimorfismo

        ***Um mesmo comportamento de várias maneiras***

        Podemos observar no contexto de **Abstração** e **Herança** que canseguimos criar uma singularidade estrutural de nossos elementos. isso quer dizer que qualquer classe que deseja representar um serviço de mensagens, basta estender a classe **ServicoMensagemInstantanea** e implementar os respectivos métodos abstratos. O que vale reforçar aqui é, cada classe terá a mesma ação executando procedimentos de maneira especializada.

        >[!NOTE]
        >
        > Para concluirmos a compreensão,
        > Polimorfismo permite que as classes mais
        > abstratas determinem ações uniformes para
        > que cada classe filha concreta
        > implementem os comportamentos de forma
        > específica.

        Modificador protected

        Vamos para uma retrospectiva quanto ao requisito do nosso sistema de mensagens instantâneas desde a etapa de encapsulamento.

        O nosso requisito solicita que além de Enviar e Recer Mensagens precisamos validar se o aplicativo está conectado a internet (**validarConexao**) e salvar o historico de cada mensagem (**salvarHistorico**).

        Sabemos que cada aplicativo costuma salvar as mensagens em seus respectivos servidores cloud, mas e quanto a validar se está conectado a internet? Não poderia ser um mecanismo comum à todos ? Logo qualquer classe filha de **SercoMensagemInstantanea** poderia desfrutar através de herança desta funcionalidade.

        >[!NOTE]
        >
        > Mas ficaa reflexão de que já aprendemos
        > sobre visibilidade de recursos: Com o
        > modificador **private** somente a classe
        > conhece a implementação quanto que o
        > modificador **public** todos passarão a
        > conhecer. Mas gostaríamos que somente as
        > classes filha soubessem. Bem, é ai que
        > entra o modificador **protected**

        ```java Serviço Mensagem Instantanea
        //Classa ServicoMensagemInstantanea.java
        package msn_messenger.service;
        public abstract class ServicoMensagemInstantanea {

            public abstract void enviarMensagem();
            public abstract void receberMensagem ();
            protected abstract void salvarHistorico ();

            protected void validarConexao () {
                System.out.println("Conectado a Internet");
            }
        }
        ```
        ```java Facebook
        //Classe FacebookMessenger.java
        package msn_messenger.apps;
        import msn_messenger.service.ServicoMensagemInstantanea;

        public class FacebookMessenger extends ServicoMensagemInstantanea {

            public void enviarMensagem() {
                validarConexao();
                System.out.println("Enviando mensagem pelo Facebook...");
                salvarHistorico();
            }
            public void receberMensagem () {
                System.out.println("Mensagem recebida pelo Facebook");
                salvarHistorico();
            }
            protected void salvarHistorico () {
                System.out.println("Salvando historico pelo Facebook...");
            }
        }
        ```
        ```java MSN
        //Classe MsnMessenger.java
        package msn_messenger.apps;
        import msn_messenger.service.ServicoMensagemInstantanea;

        public class MsnMessenger extends ServicoMensagemInstantanea {

            public void enviarMensagem() {
                validarConexao();
                System.out.println("Enviando mensagem pelo MSN...");
                salvarHistorico();
            }
            public void receberMensagem () {
                System.out.println("Mensagem recebida pelo MSN");
                salvarHistorico();
            }
            protected void salvarHistorico () {
                System.out.println("Salvando historico pelo MSN...");
            }  
        }
        ```
        ```java Telegram
        //Classe Telegram.java
        package msn_messenger.apps;
        import msn_messenger.service.ServicoMensagemInstantanea;

        public class Telegram extends ServicoMensagemInstantanea {

            public void enviarMensagem() {
                validarConexao();
                System.out.println("Enviando mensagem pelo Telegram...");
                salvarHistorico();
            }
            public void receberMensagem () {
                System.out.println("Mensagem recebida pelo Telegram");
                salvarHistorico();
            }
            protected void salvarHistorico () {
                System.out.println("Salvando historico pelo Telegram...");
            }   
        }
        ```
        ```java Usuario
        //Clase Usuario.java
        package msn_messenger.client;
        import msn_messenger.apps.FacebookMessenger;
        import msn_messenger.apps.MsnMessenger;
        import msn_messenger.apps.Telegram;
        import msn_messenger.service.ServicoMensagemInstantanea;

        public class Usuario { 
            public static void main(String[] args) {

                ServicoMensagemInstantanea smi = null;

                String appUtilizado = "FBM";

                if (appUtilizado == "MSN"){
                    smi = new MsnMessenger();
                }else if (appUtilizado == "FBM"){
                    smi = new FacebookMessenger();
                }else if (appUtilizado == "TLG") {
                    smi = new Telegram();
                }

                smi.enviarMensagem();
                smi.receberMensagem();
            }
        }
        ```

    - Interface

        >[!WARNING]
        >
        > Antes de tudo, **NÃO** estamos referindo
        > a interface gráfica.

        Como vimos anteriormente, **Herença** é um dos pilares de POO, mas uma curiosidade que se deve ser esclarecida na linguagem Java é que a mesma não permite o que conhecemos como **Herença Multipla**.

        À medida que vão surgindo novas necessidades, novos equipamentos (objetos) nascem para atender as expectativas de oferecer ferramentas com finalidades bem especificas como por exemplo: Impressoras, Digitalizadoras, Copiadoras e etc.

        Pbservem que não há uma especificação de marca, modelo e ou capacidade de execução das classes citadas acima, isto é o que consideramos o nível mais abstrato da orientação a objetos que denominamos como **interfaces**.

        > Então o que você está dizendo é que **interfaces** é o mesmo que **classe*?
        >Um molde para representação dos objetos
        >reais?

        Este é um dos maiores questionamentos dos desenvolvedores no que se refere a modelo de classes da aplicação.

        Como citado acima Java não permite herança múltipla, logo, vamos imaginar que recebemos o desafio de projetar uma nova classe para criar objetos que representem as três caracteristicas citadas acima e que iremos denominar **EquipamentoMultifuncional**.

        Antes de iniciarmos a representação cia código, devemos compreender que, assim como em classes e métodos abstratos, quando herdamos de uma interface, precisamos implementar todos os seus métodos, pois os metodos são implicitamente **public abstract**.

        ```java Copiadora
        //Classe Copiadora.java
        package interfaces.plataforma;
        public interface Copiadora {
            public void copiar ();
        }
        ```
        ```java Digitalizadora
        //Classe Digitalizadora.java
        package interfaces.plataforma;
        public interface Digitalizadora {
            public void digitalizar ();
        }
        ```
        ```java Impressora
        //Classe Impressora.java
        package interfaces.plataforma;
        public interface Impressora {
            public void imprimir ();
        }
        ```
        ```java Multifuncional
        //Classe Multifuncional.java
        package interfaces.equipamentos;

        import interfaces.plataforma.Copiadora;
        import interfaces.plataforma.Digitalizadora;
        import interfaces.plataforma.Impressora;

        public class Multifuncional implements Copiadora , Digitalizadora , Impressora{

            public void imprimir() {
                System.out.println("Imprimindo Multifuncional");
            }
            public void digitalizar() {
                System.out.println("Digitalizando Multifuncional");
            }
            public void copiar() {
                System.out.println("Copiando Multifuncional");
            }
        }
        ```
        ```java Fabrica
        //Classe Fabrica.java
        package interfaces.estabelecimento;

        import interfaces.equipamentos.Multifuncional;
        import interfaces.plataforma.Copiadora;
        import interfaces.plataforma.Digitalizadora;
        import interfaces.plataforma.Impressora;

        public class Fabrica {
            public static void main(String[] args) {

                Multifuncional eM = new Multifuncional();

                Copiadora copiadora = eM;
                Digitalizadora digitalizadora = eM;
                Impressora impressora = eM;

                copiadora.copiar();
                digitalizadora.digitalizar();
                impressora.imprimir();

            } 
        }
        ```

### Conhecendo Collections Java

1. Introdução

    - Introdução e Pre-requisitos

    - Conhecendo a Hierarquia do Collection Framework API Java

        #### Collection Framework API

        - Uma coleção (collection) é uma estrutura de dados que serve oara agrupar muitos elementos em uma única unidade, estes elementos precisão ser Objetos.

        - Uma Colection pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções homegêneas de um tipoespecifico.

        - O núcleo principal das coleções é formado pelas interfaces da figura a abaixo, essas interfaces permitem manipular a coleção endependente do nível de detalhe que elas representam.

        - Temos quatro grandes tipos de coleções: `List` (lista), `set`(conjunto), `Queue`(fila) e `map`(mapa), a partir dessas interfaces, temos muitas subclasses concretas que implementam varias formas diferentes de se trabalhar com cada coleção.

        <p aling="center">
        <img src="./assets/image/collection/hierarchy-collection-framework.png">
        <br>
        <a href="https://data-flair.training/blogs/collection-framework-in-java/">Hierarchy of Collection Framework in Java </a>
        </p>

        - Todas as interfaces e classes são encontradas dentro do pacote (package) `java.util`.

        - Embora a interface `map` não ser filha direta da interface `collections` ela também pe considerada uma coleção devido a sua função.

        <p aling = "center">
        <img src="./assets/image/collection/collection-framework-methods.png" alt="List interface hierarchy Java">
        <br>
        <a href="https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html">Method Sumary Collection Interface</a>

        ---

        #### Referências:
        [1] "Java Collections - Universidade Java." Universidade Java. Disponível em: http://www.universidadejava.com.br/java/java-collection/.

        [2] "Java™ Platform, Standard Edition 17 API Specification - Interface Collection." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collection.html.

        [3] "Java Comparator and Comparable - Baeldung." Baeldung. Disponível em: https://www.baeldung.com/java-comparator-comparable.

        [4] "Java™ Platform, Standard Edition 17 API Specification - Class Collections." Oracle. Disponível em: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html.

        ---

    - Entendendo o Generics Type

        #### Generics Type

        - Um tipo genético é uma classe genérica ou uma interface que é parametrizada em relação a tipos.
        
        - A classe Box a seguir será modificada para demonstrar o conceito:

        ```java
        publica class Box {
            private Object object;

            public void set(Object object){
                this.object = object; 
            }
            public Object get(){
                return object;
            }
        }
        ```

        - O símbolo `<>` é chamado de "diamond" ou "diamond operator" foi um recurso introduzido no java 7 e é usado no contexto de tipos genéricos em Java para inferir automaticamente o tipo com base no contexto.

        - Para atualizar a classe Box para usar generics, você cria uma declaração de tipo genérica alterando o código `public class Box` para `public class Box<T>`.

        - Isso introduz a variável de tipo, T, que pode ser usada em qualquer lugar dentro da classe:

        ```java
        /*
        Versão genérica da classe Box.
        @param <T> o tipo do valor sendo armazenado
        */
        publica class Box<T> {
            //T tepresenta "Type" (tipo)
            private T t;

            public void set(T t){
                this.t = t; 
            }
            public T get(){
                return t;
            }
        }
        ```

        - Como você pode ver, todas as ocorrências de Object são substituidas por T.

        - Uma varíavel de tipo pode ser qualquer tipo não primitivo que você especificar: qualquer tipo de classe, qualquer tipo de interface, qualquer tipo de array ou até mesmo outra variável de tipo.

        - Essa mesma técnica pode ser aplicada para criar interfaces genéricas.

        - Os nomes de parâmetros de tipo mais comumente usados são:

            - E - Elemento (usado extensivamente pelo Java Collections Framework)
            - K - Chave
            - N - Número
            - T - Tipo
            - V - Valor
            - S,U,V, etc. - 2º,3º,4º tipos

        ##### Vantagens simples de usar generics nas interfaces Collection em Java:

        [1.] Segurança do tipo de dados: O uso de generics garante que apeas objetos de um tipo específico passam ser adicionados à coleção, evitando erros de tipo e garantindo que você seteja lidando com os dados corretos.

        [2.] Código mais legível: Ao usar generics, você pode especificar o tipo de dados esperado ou retornado pela coleção, o que torna o código mais fácil de entender e ler.

        [3.] Detecta erros mais cedo: O compilador verifica se você está usando os tipos corretos durante a compilação, ajudando a indentificar erros de tipo antes mesmo de executar o programa.

        [4.] Reutilização de código: Com generics, você pode criar classes e métodos genéricos que funcionam com diferentes tipos de coleções, evitando a necessidade de duplicar código para cada tipo específico.

        [5.] Melhor desempenho: O uso de generics pode melhorar o desempenho, pois evita a necessidade de conversões de tipo desnecessárias e permite que i compilador otimize o código com base no tipo especificado.

    - Conhecendo as interfaces Comparable e Comparator

        #### Comparable x Comparator

        ##### Comparable

        - `Comparable` fornece uma única sequencia de ordenação. Em outras palavras, podemos ordenar a coleção com base em um único elemento, como id, nome e preço.

        - `Comparable` afeta a classe original ou seja, a classe atual é modificada.

        - `Comparable` fornece o método `comparateTo()` pra ordenar elementos.

        - `Comparable` está presente no pacote `java.lang`.

        - Podemos ordenar os elementos da lista do tipo `Comparable` usando o métodp `Collections.sort(list)`.

        ##### Comparator

        - O `Comparator` fornece o método `compare()` para ordenar elementos.

        - O `Comparator` fornece múltiplas sequências de ordenação. Em outras palavras, podemos ordenar a coleção com base em múltiplos elementos, como id, nome, preço, etc.

        - O `Comparator` não afeta a classe original, ou seja, a classe atual não é modificada.

        - Um `Comparator` está presente no pacote `java.util`.

        - Podemos ordenar os elementos da lista do tipo `Comparator` usando o método `Collections.sort(list, comparator)`.

        ##### Collections

        - A classee `Collections` é uma classe utilitária do Java para operações comuns em coleções.

        - Ela fornece métodas para ordenação, busca, manipulação e sincronização de coleções.

        - O método `sort()` é usado para ordenar uma lista em ordem as cendente.

        - O método `sort()` em conjunto com `Collections.reverseOrder()` permite ordnar em ordem descendente.

        ```java
        package main.java.comparableXcomparator;
        import java.util.Comparator;

        // Uma classe 'Livro' que implementa Comparable
        class Livro implements Comparable<Livro> {
	        private String titulo;
	        private String autor;
	        private int ano;

	        // Construtor
	        public Livro(String ti, String au, int an) {
		        this.titulo = ti;
		        this.autor = au;
		        this.ano = an;
	        }

	        // Usado para ordenar livros por ano
	        public int compareTo(Livro l) {
		        return titulo.compareTo(l.titulo);
	        }

	        // Métodos getters para acessar os dados privados
	        public String getTitulo() {
		        return titulo;
	        }

	        public String getAutor() {
		        return autor;
	        }

	        public int getAno() {
		        return ano;
	        }
        }

        // Classe para comparar Livro por autor
        class CompararAutor implements Comparator<Livro> {
            @Override
            public int compare(Livro l1, Livro l2) {
		        return l1.getAutor().compareTo(l2.getAutor());
	        }
        }

        // Classe para comparar Livro por ano
        class CompararAno implements Comparator<Livro> {
            @Override
            public int compare(Livro l1, Livro l2) {
		        if (l1.getAno() < l2.getAno())
			        return -1;
		        if (l1.getAno() > l2.getAno())
			        return 1;
		        else
			        return 0;
	        }
        }

        class CompararAnoAutorTitulo implements Comparator<Livro> {
	        @Override
	        public int compare(Livro l1, Livro l2) {
		        int ano = Integer.compare(l1.getAno(), l2.getAno());
		        if (ano != 0)
			        return ano;
		        int autor = l1.getAutor().compareTo(l2.getAutor());
		        if (autor != 0)
			        return autor;
		        return l1.getTitulo().compareTo(l2.getTitulo());
	        }
        }
        ```

2. List

    - List Interface

        - A interface `List` é uma coleção ordenada que permite a inclusão de elementos duplicados.

        - É um dos tipos de coleção mais utilizados em Java, e as classes de implementação comuns são `arrayList` e `LinkedList`.

        - A `List` se assemelha a uma matriz com comprimento dinâmico, permitindo adicionar ou remover elementos.

        - A interface `List` fornece métodos úteis para adicionar elementos em posições específicas, remover ou substituir elementos com base no índice e obter sublistas usando índeces.

        - A classe `Collections` fornece algoritmos úteis para manipulação de `List`, como ordenação (sort), embaralhamento (shuffle), reversão (reverse) e busca binária (binarySearch).

        >[!NOTE]
        >
        > ***ArrayList***: O ArrayList é uma implementação da interface List que armazena os elementos em uma estrutura de array redimensionável. Isso significa que ele pode crescer automaticamente à medida que novos elementos são adicionados. A principal vantagem do ArrayList é o acesso rápido aos elementas por meio de índices, o que permite recuperar um elemento específico de forma eficiente. No entanto, adicionar ou remover elementos no meio da lista pode ser mais lento, pois requer a realocaçãode elementos.

        >[!NOTE]
        >
        > ***LinkedList***: O LinkedList é uma implementação da interface List que armazena os elementos em uma lista duplamente vinculada. Cada elemento contém referências para o elemento anterior e proximo na lista. A principal vantagem do LinkedList é a eficiência na adição ou remoção de elementos no início ou no final da lista, pois não é necessário realocar elementos. No entanto, o acesso aos elementos por meio de índices é mais lento, pois requer percorrer a lista até o elemento desejado.

        >[!NOTE]
        >
        > ***Vector***: O Vector é uma implementação antiga da interface List que é semelhante ao ArrayLit, mas é sincronizada, ou seja, é thread-safe. Isso significa que várias threads podem manipular um objeto Vector ao mesmo tempo sem causar problemas de concorrência. No entanto, essa sincronização adiciona uma sobrecarga de desempenho, tornando o Vector menos eficiente do que o ArrayList em cenários em que a concorrência não é um problema. Por esse motivo, o uso do Vector é menos comum em aplicações modernas.

    - Hands On: Iniciando o projeto e enviando para o GitHub

        Os exercicios estão em um novo projeto: java-collections-api no diretorio de estudos dio-java-basico.

        #### Fixando os Conhecimentos

        *Exercicios*:

        1. Operações basicas com List;
        2. Pesquisa em List;
        3. Ordenação na List.

    - Operações Basicas List

        #### 1. Lista de Tarefas
        
        Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. Implemente os seguintes métodos:

        - `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa à lista com a descrição fornecida.

        - `removerTarefa(String descricao)`: Remove uma tarefa da lista com base em sua descrição.

        - `obterNumeroTotalTarefas()`: Retorna o número total de tarefas na lista.

        - `obterDescricoesTarefas()`: Retorna uma lista contendo a descrição de todas as tarefas na lista.

        #### 2. Carrinho de Compras:
        (*Atividade **DESAFIO-DIY** proposto pelo instrutor da aula. Séra realizado em repositorio proprio **carrinho-compras-collection-api** como um desafio*)

        