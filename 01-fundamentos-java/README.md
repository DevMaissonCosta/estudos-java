# ☕ Fundamentos do Java

Nesta pasta, vou organizar todos os meus códigos, exercícios de lógica e anotações teóricas sobre a linguagem Java.

## 📝 Conceitos Básicos anotados:
* **Estrutura de um programa:** Todo código Java começa dentro de uma `class` e precisa de um método principal (`public static void main`) para ser executado.
* **Saída de dados:** Usamos o comando `System.out.println()` para exibir mensagens na tela.
-----
## Operadores aritméticos: 

- `+` **Adição** -> 5 + 2 = 7
- `-` **Subtração** -> 5 - 2 = 3
- `*` **Multiplicação** -> 5 * 2 = 10
- `/` **Divisão** -> 5 / 2 = 2.5
- `%` **Resto** -> 5 / 2 = 1
 
-----
## Operadores Unarios:
- `++` **Incremento: "a ++" é a mesma coisa que escrever** -> a = a + 1
- `--` **Decremento: "a --" é a mesma cois que escrever** -> a = a - 1
- **ATENÇÃO: A posição dos operadores (antes ou depois da variável) influência diretamente no resultado do calculo**
- ----
- **ABAIXO, estou trabalhando com unitarios, com incremento e descremento, PRÉ E PÓS INCREMENTO.**

### Exemplo de Pós-Incremento
O valor da variável é utilizado na expressão primeiro, e só depois ocorre o incremento.

- **int numero = 5;**
- **int valor =  5 + numero--;**
- **System.out.println(valor);**
------

Código prático desenvolvido para testar e validar o comportamento dos operadores de incremento e decremento em Java, analisando o impacto da ordem de precedência (Pré vs Pós).

###  Código Analisado

- **public class Operadores{**
- **public static void main(String[] args) {**
- **Cenário 1: Pós-Decremento**
- **int numero = 5;**
- **int valor = 5 + numero--;**
- **System.out.println(valor); // Imprime 10**
----

### Cenário 2: Pré-Incremento
- **numero = 5;**
- **valor = 5 + ++numero;**
- **System.out.println(valor); // Imprime 11**
    
}

### Exemplo de um Pré-Incremento

- **int numero = 5;**
- **int valor =  5 + ++numero;** 
- **System.out.println(valor);**
- **// RESULTADO 11, PORQUE FOI REALIZADO UM PRÉ INCREMENTO.**

-----

### Operadores de Atribuição
- `+=` **Somar e Atribuir "a += b" é igual a** -> a = a + b
- `-=` **Subtrair e Atribuir "a -= b" é igual a** -> a = a - b
- `*=` **Multiplicar e Atribuir a '*=' b é igual a** -> a = a * b
- `/=` **Dividir e Atribuir "a /= b" é igual a** -> a = a / b
- `%=` **Resto e Atribuir "a %= b" é igual a** -> a = a % b
- 
### Codigo analisado

- **public class Operadores{**
- **public static void main(String[] args) {**
- **//OPERADORES DE ATRIBUIÇÃO**
- **int x = 4;**
- **x += 2;   // x = x + 2**
- **System.out.println(x);**