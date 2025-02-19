# Desafio: Modelo de Domínio e ORM - DevSuperior

Este repositório contém a implementação do desafio **Modelo de Domínio e ORM**, parte do módulo **Back-end** do curso **Formação Desenvolvedor Moderno** da [DevSuperior](https://devsuperior.com.br).

## Objetivo

Criar um sistema para gerenciar informações dos **participantes** e **atividades** de um evento acadêmico, utilizando **Spring Boot**, **Java** e **banco de dados H2**.

## Requisitos do Desafio

### Modelo Conceitual
O sistema deve armazenar:
- **Atividades**: Nome, descrição, preço e blocos de horários.
- **Blocos de horários**: Dia, horário de início e horário de fim.
- **Participantes**: Nome e e-mail.

Cada **atividade** pode ter vários **blocos de horários**.
Cada **participante** pode se inscrever em múltiplas **atividades**.

### Banco de Dados e Seeding
- Utilizar **H2 Database** para armazenar os dados.
- Criar as tabelas com os relacionamentos corretos.
- Implementar **seeding** (popular o banco de dados com dados iniciais).

## Como o Trabalho Será Corrigido

1) **Execução Local**
   - O professor clonará o repositório e executará o projeto.
   - O projeto deve rodar sem erros.
   
2) **Verificação do Banco de Dados**
   - O **H2 Console** será acessado no navegador.
   - Todas as tabelas e seus relacionamentos devem estar corretos.
   - Os dados iniciais do **seeding** devem estar preenchidos corretamente.

## Como Rodar o Projeto

1. **Clone o repositório**:
   ```sh
   git clone https://github.com/JaymeFortes/Desafio2-DevSuperior-ModeloDeDominioORM-SpringBoot.git
   ```
2. **Importe o projeto na IDE** (IntelliJ, Eclipse, VS Code, etc.).
3. **Execute o projeto** normalmente.
4. **Acesse o H2 Console** para verificar os dados.

## Entrega

1. **Crie um repositório no GitHub**.
2. **Implemente o modelo conceitual e o banco de dados H2**.
3. **Suba o código para o repositório**.
4. **Envie o link do repositório**.



