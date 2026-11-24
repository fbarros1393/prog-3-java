# Programação III — Aula 05

## Tratamento de Exceções em Java

Este diretório contém a resolução da Lista de Atividades da Aula 05 da disciplina de **Programação III**, ministrada pela professora Tainá Isabela.

O objetivo das atividades é praticar os mecanismos de tratamento de exceções em Java, utilizando `try`, `catch`, `finally`, `throw` e `throws`.

## Conteúdos abordados

- Tratamento de exceções com `try-catch`.
- Exceções aritméticas.
- Conversão de Strings para números.
- Validação de argumentos.
- Exceções relacionadas a índices de vetores.
- Propagação de exceções entre métodos.
- Utilização do bloco `finally`.
- Validação de dados informados pelo usuário.

## Exercícios desenvolvidos

| Exercício | Descrição | Conceitos |
|---|---|---|
| 01 | Divisão Segura | ArithmeticException e try-catch |
| 02 | Conversão de Texto para Número | NumberFormatException e finally |
| 03 | Validação de Raiz Quadrada | IllegalArgumentException, throw e throws |
| 04 | Acesso a Posições de Vetor | ArrayIndexOutOfBoundsException |
| 05 | Método com Exceção Propagada | Propagação de exceções |
| 06 | Registro de Produto | Validação e tratamento de entradas inválidas |
| 07 | Cadastro de Alunos | Integração de try-catch, throw, throws e finally |

## Organização do projeto

```text
aula05/
├── Exercicio01/
│   └── Exercicio01.java
├── Exercicio02/
│   └── Exercicio02.java
├── Exercicio03/
│   └── Exercicio03.java
├── Exercicio04/
│   └── Exercicio04.java
├── Exercicio05/
│   └── Exercicio05.java
├── Exercicio06/
│   └── Exercicio06.java
├── Exercicio07/
│   └── Exercicio07.java
└── README.md
```

## Tecnologias utilizadas

- Java
- Visual Studio Code
- JDK
- Git e GitHub

## Como executar

Abra o terminal na pasta do exercício desejado.

Exemplo para o exercício 1:

```bash
javac Exercicio01.java
java Exercicio01
```

Para os demais exercícios, utilize o nome do respectivo arquivo e da classe principal.

## Testes realizados

Os exercícios foram preparados para demonstrar situações de execução normal e tratamento de entradas inválidas.

Entre os casos previstos estão divisão por zero, entradas não numéricas, índices inválidos, idades negativas e notas fora do intervalo permitido.

## Considerações finais

As atividades permitiram estudar como o tratamento de exceções ajuda a desenvolver programas mais seguros e capazes de responder adequadamente a entradas inválidas.

O exercício 7 integra os principais conteúdos da aula por meio de um sistema de cadastro de alunos com validações, contadores e tratamento de erros.

---

**Disciplina:** Programação III  
**Professora:** Tainá Isabela  
**Atividade:** Lista de Exercícios — Aula 05  
**Linguagem:** Java
