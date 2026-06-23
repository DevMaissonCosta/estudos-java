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
------


### Classe Math -> classe matemática

- **Math é uma classe que entrega algo pronto, sem eu precisar criar ou contruir**
- **Math.abs(-10)        // valor absoluto → 10**
- **Math.pow(2, 8)       // potência → 256.0**
- **Math.sqrt(25)        // raiz quadrada → 5.0** 
- **Math.cbrt(27)        // raiz cúbica → 3.0**
- **Math.max(10, 20)     // maior valor → 20**
- **Math.min(10, 20)     // menor valor → 10** 
- **Math.round(4.7)      // arredonda → 5** 
- **Math.floor(4.9)      // arredonda pra baixo → 4.0** 
- **Math.ceil(4.1)       // arredonda pra cima → 5.0**
- **Math.random()        // número aleatório entre 0.0 e 1.0** 
- **Math.log(Math.E)     // logaritmo natural → 1.0**
- **Math.PI              // constante π → 3.14159...**
- **Math.E               // constante de Euler → 2.71828...**

-----

### Arredondamentos
- **Math.round(4.5)   // → 5  (arredonda pro mais próximo)**
- **Math.floor(4.5)   // → 4.0 (sempre pra baixo)**
- **Math.ceil(4.5)    // → 5.0 (sempre pra cima)**
- **Math.random // cria um valor aleatorio entre 0 e 1**

-----
### Estrutura Condiçionais
- É uma condição que eu passo para o meu bloco.
- -----
### simples 
apenas uma condição -> if (m>9){
system.out.println("Parabens"); // executa verdadeiro
} 
-----
### Composta
duas condições -> if (i>=18) {
  System.out.println("Maior");
  }else {
  System.out.println("De menor");
  }

-----

### Composta Encadeadas
uma dentro da outra ->   int idade = ano - nascimento; if (idade<16) {
System.out.println("não pode votar " + idade + " anos");
}else {
if ((idade >= 16 && idade < 18) || (idade > 70)){
System.out.println("A votacao é opcional  " + idade + " anos");
} else
System.out.println("É de total obrigação votar " + idade + " anos");
}
}
}

-----
### Condição de Múltipla Escolha