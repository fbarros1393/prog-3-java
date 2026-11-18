# Lista de Exercícios — Aula 03 | Programação III

## Sobre a atividade

Este repositório contém a resolução dos exercícios da Aula 03 da disciplina de **Programação III**, utilizando a linguagem Java.

O objetivo da atividade é colocar em prática os conceitos de Programação Orientada a Objetos (POO), trabalhando com classes, objetos, construtores, herança, encapsulamento, polimorfismo, sobrescrita e sobrecarga de métodos.

As implementações foram organizadas em pastas separadas para facilitar a execução, os testes e a compreensão dos códigos.

## Conteúdos abordados

- **Herança:** utilização de `extends` para criar subclasses.
- **Polimorfismo:** utilização de objetos de diferentes subclasses através de uma referência da superclasse.
- **Sobrescrita:** utilização de `@Override` para redefinir métodos.
- **Sobrecarga:** criação de métodos com o mesmo nome e parâmetros diferentes.
- **Encapsulamento:** utilização de atributos privados e métodos de acesso.
- **Construtores:** inicialização de objetos e utilização de `super()`.
- **Classe Object:** sobrescrita de `toString()` e `equals()`.
- **Interfaces:** implementação de `Comparable`.
- **Ordenação:** utilização de `Arrays.sort()`.

## Descrição dos exercícios

### Exercício 04 — Herança e Polimorfismo

Implementação de uma classe `Animal` e duas subclasses, `Cachorro` e `Gato`.

Cada subclasse sobrescreve o método `emitirSom()`, apresentando um comportamento diferente.

No método principal, um vetor do tipo `Animal` é utilizado para armazenar os objetos e demonstrar o funcionamento do polimorfismo.

### Exercício 05 — Sobrecarga de Métodos

Implementação de uma classe `Calculadora` com três versões do método `somar()`:

- Soma de dois números inteiros.
- Soma de dois números do tipo `double`.
- Soma de três números inteiros.

O exercício demonstra como o Java identifica o método correto de acordo com os parâmetros recebidos.

### Exercício 06 — Métodos toString() e equals()

Implementação de uma classe `ContaBancaria`, contendo o atributo `numero`.

Foram sobrescritos os métodos `toString()` e `equals()` para permitir a impressão dos dados e a comparação de contas bancárias pelo número.

### Exercício 07 — Herança e Reutilização de Código

O exercício foi dividido em duas partes.

**Parte 1 — Contas Bancárias**

Implementação de uma hierarquia de contas:

- `Conta`: classe principal.
- `ContaEspecial`: permite saques utilizando um limite adicional.
- `ContaPoupanca`: permite aplicar reajustes ao saldo.

**Parte 2 — Loja de Produtos**

Criação de uma hierarquia de produtos utilizando as classes `Produto`, `Livro`, `CD` e `DVD`.

Cada subclasse possui atributos específicos e sobrescreve o método `toString()` para apresentar suas informações.

### Exercício 08 — Comparação e Busca

Continuação do sistema de loja desenvolvido no exercício anterior.

Foi adicionado um código de barras aos produtos e implementado o método `equals()` para realizar a comparação utilizando esse atributo.

Também foi implementada uma busca sequencial para localizar produtos em um vetor.

### Exercício 09 — Interface Comparable e Ordenação

Continuação do sistema de loja, com a implementação da interface `Comparable`.

O método `compareTo()` foi utilizado para definir os critérios de ordenação dos produtos.

Foram realizados testes de ordenação por nome e por preço utilizando `Arrays.sort()`.

## Organização do projeto

A estrutura utilizada é:

```text
Lista_Aula_03/
|
|-- Exercicio04/
|   |-- Exercicio04.java
|
|-- Exercicio05/
|   |-- Exercicio05.java
|
|-- Exercicio06/
|   |-- Exercicio06.java
|
|-- Exercicio07/
|   |-- Contas/
|   |   |-- Conta.java
|   |   |-- ContaEspecial.java
|   |   |-- ContaPoupanca.java
|   |   |-- TesteContas.java
|   |
|   |-- Loja/
|       |-- Produto.java
|       |-- Livro.java
|       |-- CD.java
|       |-- DVD.java
|       |-- Loja.java
|
|-- Exercicio08/
|   |-- Produto.java
|   |-- Livro.java
|   |-- CD.java
|   |-- DVD.java
|   |-- Loja.java
|
|-- Exercicio09/
|   |-- Produto.java
|   |-- Livro.java
|   |-- CD.java
|   |-- DVD.java
|   |-- Loja.java
|
|-- README.md
```

## Tecnologias utilizadas

- Linguagem Java
- Visual Studio Code
- JDK (Java Development Kit)
- Git e GitHub

## Como executar

Para executar os exercícios, é necessário ter o Java JDK instalado.

Abra o terminal na pasta do exercício desejado.

**Exemplo — Exercício 04:**

```bash
javac Exercicio04.java
java Exercicio04
```

**Exemplo — Exercício 08:**

```bash
javac Produto.java Livro.java CD.java DVD.java Loja.java
java Loja
```

Os exercícios também podem ser executados diretamente pelo Visual Studio Code com as extensões de Java instaladas.

## Considerações finais

A realização das atividades permitiu praticar os principais conceitos de Programação Orientada a Objetos em Java.

Os exercícios 7, 8 e 9 foram desenvolvidos de forma progressiva, aproveitando o código anterior e acrescentando novas funcionalidades.

Essa abordagem ajudou a compreender a reutilização de código, a organização de classes e a aplicação de herança, polimorfismo e interfaces.

---

**Disciplina:** Programação III  
**Professora:** Tainá Isabela  
**Atividade:** Lista de Exercícios — Aula 03  
**Linguagem:** Java
