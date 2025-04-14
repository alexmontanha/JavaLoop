# JavaLoop

## Visão Geral

JavaLoop é um projeto educacional para estudantes de ciência da computação aprenderem sobre estruturas de repetição em Java.

## Pré-requisitos

* Java Development Kit (JDK) 8+
* IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)
* Conhecimentos básicos de Java

## Estruturas de Repetição em Java

### Loop For

```java
// Sintaxe básica
for (inicialização; condição; incremento) {
    // bloco de código
}

// Exemplo
for (int i = 0; i < 5; i++) {
    System.out.println("Iteração: " + i);
}
```

### Loop While

```java
// Sintaxe básica
while (condição) {
    // bloco de código
}

// Exemplo
int contador = 0;
while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

### Loop Do-While

```java
// Sintaxe básica
do {
    // bloco de código
} while (condição);

// Exemplo
int num = 0;
do {
    System.out.println("Número: " + num);
    num++;
} while (num < 5);
```

## Exercícios Propostos

1. Crie um programa que imprima os números pares de 2 a 20
2. Desenvolva um algoritmo que calcule o fatorial de um número
3. Implemente a sequência de Fibonacci até o décimo termo
4. Crie um programa que verifique se um número é primo

## Problemas Comuns

* **Loop infinito**: Certifique-se de que a condição de parada seja alcançável
* **Off-by-one errors**: Verifique os limites dos seus loops (<=, <, >=, >)
* **Atualização da variável**: Lembre-se de incrementar/decrementar a variável de controle

## Recursos Adicionais

* [Documentação oficial do Java](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
* [W3Schools Java Loops](https://www.w3schools.com/java/java_for_loop.asp)
* [Baeldung - Guide to Java Loops](https://www.baeldung.com/java-loops)

## Como Executar

1. Clone este repositório
2. Abra o projeto na sua IDE
3. Execute os exemplos nas respectivas classes
4. Complete os exercícios propostos nas classes designadas

## Avaliação

Os exercícios serão avaliados com base em:

* Funcionalidade correta
* Boas práticas de codificação
* Comentários explicativos
* Tratamento adequado de casos especiais

## Autor

Professor Alexandre Montanha
