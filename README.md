# Projeto POO em Java – Sistema Bancário

Projeto desenvolvido como parte do bootcamp **Java & QA – Bradesco**, com o objetivo de praticar e demonstrar os pilares da Programação Orientada a Objetos (POO) em Java.

## 📌 Conceitos Aplicados

- **Abstração**: Classe abstrata `Conta` representa o conceito genérico de uma conta bancária.
- **Encapsulamento**: Atributos protegidos e privados, com acesso controlado por métodos.
- **Herança**: As classes `ContaCorrente`, `ContaPoupanca` e `ContaEspecial` herdam de `Conta`.
- **Polimorfismo**: O método `sacar()` possui comportamentos diferentes conforme o tipo da conta.

## 🏗️ Estrutura do Projeto

```
poo-java-banco/
├── src/
│   ├── model/
│   │   ├── Conta.java           # Classe abstrata base
│   │   ├── ContaCorrente.java   # Conta com taxa de saque
│   │   ├── ContaPoupanca.java   # Conta sem taxas
│   │   └── ContaEspecial.java   # Conta com limite adicional
│   └── app/
│       └── Main.java             # Classe principal
├── bin/                          # Arquivos compilados
└── README.md
```

## ⚙️ Regras de Negócio

| Tipo de Conta | Características |
|---------------|-----------------|
| **Conta Corrente** | Taxa de R$ 1,50 por saque |
| **Conta Poupança** | Sem taxas |
| **Conta Especial** | Permite saque com limite adicional |

**Funcionalidades:**
- ✅ Depósito
- ✅ Saque (com validação de saldo)
- ✅ Transferência entre contas
- ✅ Extrato detalhado

## ▶️ Como Executar

1. **Clone o repositório**
   ```bash
   git clone <url-do-repositorio>
   cd poo-java-banco
   ```

2. **Compile os arquivos Java**
   ```bash
   javac -d bin src/model/*.java src/app/*.java
   ```

3. **Execute a classe Main**
   ```bash
   java -cp bin app.Main
   ```

## 📋 Exemplo de Saída

```
Transferência realizada com sucesso!

=== Extrato Conta Corrente ===
Titular: Ana
Conta: 001
Saldo: 697.0

=== Extrato Conta Poupança ===
Titular: Carlos
Conta: 002
Saldo: 1100.0

=== Extrato Conta Especial ===
Titular: Marcos
Conta: 003
Saldo: -400.0
Limite: 500.0
```

## 🧪 Tecnologias

- Java
- Programação Orientada a Objetos

## 📚 Observações

Projeto criado com implementação própria, inspirado no desafio proposto pelo bootcamp, visando consolidar conceitos fundamentais de POO.

---

**Desenvolvido por:** [Seu Nome]  
**Bootcamp:** Java & QA – Bradesco
