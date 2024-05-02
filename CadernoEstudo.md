
# Estudos: Bootcamp Santander 2024

Caderno de anotações para estudo da trilha JAVA do Bootcamp ofereciso pelo Santander.

## Príncipios de Desenvolvimento de Software Colaborativo

| ID | Desc. |
|:--:|:-----:|
| 01 | ----- |

## Dominado a Linguagem de Programação Java

### Ambiente de Desenvolvimento Java

1. Configração do VS Code sincronizando com o github e realizando um
commit atraves da IDE.

### Aprendendo a Sintaxe Java

1. Introdução
* Aprendizados:
> - Estrutura inicial;
> - Padrão de nomeclatutura;
> - Declarando variáveis e métodos;
> - Identação;
> - Organizando arquivos;
> - Java Beans;

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

;

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
|`int ano = 2024`|Aqui não temos a expreção `final` e o nome da variavel esta seguindo o padrão com letras minusculas indicando que esta é uma variavel que pode ser alterada; `int` define o tipo de variavel como um Numero Inteiro.|

- Outras convenções a se considerar para as variaveis:
> + Devem conter apenas letras, _(underline), $ ou numeros de 0 a 9;
> + Devem obrigatoriamente se iniciar preferencialmente por letras, mas tambem aceita _ ou $, jamais com numeros;
> + Deve iniciar com letra minuscula;
> + Não pode conter espaços (no caso de palavras compostas);
> + Não podemos usar palavras chaves da linguagem;
> + O nome deve se unico dentro de um escopo.

;
* Anatomia de classes 3
- Declarando uma Variavel.

Ao se declara uma variavel devemos considerar algumas convenções;

~~~java
// Estrutura

Tipo nomeBemDefinido = Atribuição (opcional em alguns casos)

// Exemplo

int idade = 23;
double altura = 1.62;
Dog spike; // aqui a variavel spike não esta sendo atribuido nenhum valor
~~~

- Metodos.

Assim como as `Classes` podem ser interpretadas como um objeto os `métodos` podem ser interpretados como ações a serem executadas, sendo assim é comum (e também uma boa pratica) que coloquemos os nomes dos métodos no infinitivo;
Exemplo: *somar, subtrair, calcular, formatar, etc...*.

~~~java
// Estrutura

TipoRetorno NomeObjetivoNoInfinitivo Parametro(s) // Parametros em alguns casos pode ser opcional

// Exemplos

int somar (int numeroUm, int numero2)

String formatarCep (long cep)
~~~

;
* Anatomia de Classes 4

- Indentação;
--

* Anatomia de Classes 5

- Package (Pacotes)
Na linguagem Java quando nosso codigo vai atingindo certo nivel de complexidade começamos a organizar nossas classes em pacotes, os quais também devemos seguir algumas convenções;

Exemplo: `finalidade.cliente.grupo`

> + Finalidade se refere a finalidade do projeto se é comercial, organizacional, open sourse ou educacional
>
> |Finalidades    |Utilização            |
> |:---           |:---                  |
> |Comercial      |`com`                 |
> |Organizacional |`org`                 |
> |Open Sourse    |`org` ou `opensource` |
> |Educacional    |`edu`                 |
>
>;
>
> + Cliente também pode ser a empresa o dono do prejeto o desenvolvedor;
>
> |Cliente|Utilização|
> |:---|:---|
> |Um empresa de nome *Hyper Tech*|`hypertech`|
> |Um projeto desenvolvido para estudo do estudante de nome *Lucas*|`lucas`|
>
>;
>
> + Grupo se refere ao grupo de arquivos que será criado;
>
> |Grupo|Utilização|
> |:---|:---|
> |Para organizar os arquivos da 1a. semana de estudos|`primeirasemana`|
>
>;
> *Exemplo*: Desta forma, se o estudante Lucas quer agrupar suas aulas por semanas de estudo ele pode utilizar a package `edu.lucas.primeirasemana`

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
