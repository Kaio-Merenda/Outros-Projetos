🎮 GameTracker (Backend)

> Um sistema de gerenciamento de biblioteca de jogos focado em organização, controle de status e análise de horas jogadas. 

Este projeto está sendo desenvolvido como parte do meu portfólio de Engenharia Backend. O foco principal nesta primeira fase é a aplicação de **Boas Práticas de Programação Orientada a Objetos (POO)**, **Clean Code** e **Arquitetura Limpa** (separação de responsabilidades).

## 🚀 Status do Projeto
Em desenvolvimento (Fase 1 - Core Logic e CLI)

## 🎯 Funcionalidades Atuais (CRUD em Memória)
- **Criação de Jogos:** Cadastro detalhado utilizando tipagem forte para garantir a integridade dos dados (`LocalDate` para datas de lançamento e `float` para horas jogadas).
- **Controle de Status e Prioridade:** Uso de `Enums` restritos (ex: *JOGANDO, BACKLOG, ZERADO, ABANDONADO*) para evitar inconsistências e dados inválidos.
- **Listagem e Busca:** Mecanismos de busca otimizados por nome, ignorando diferenças de letras maiúsculas/minúsculas.
- **Isolamento de Regras de Negócio:** A lógica de gerenciamento da lista (biblioteca) é 100% isolada na classe `GameService`, mantendo a classe `App` (entrada de dados) limpa e independente.

## 🛠️ Tecnologias e Conceitos Utilizados
- **Java** (Linguagem Principal)
- **Orientação a Objetos (POO):** Encapsulamento, Construtores, Getters e Setters.
- **Arquitetura em Camadas:** 
  - `Model` (Classe `Games` e `Enums`) - Representação dos dados.
  - `Service` (Classe `GameService`) - Regras de negócio e manipulação do banco em memória (`ArrayList`).
  - `Main` (Classe `App`) - Interface de comunicação.

## 🗺️ Roadmap (Próximos Passos)
A arquitetura atual foi desenhada com baixo acoplamento para facilitar a evolução do sistema. As próximas etapas incluem:
- [ ] Implementação de um Menu Interativo no console (Scanner).
- [ ] Migração do projeto para **Spring Boot**.
- [ ] Transformação do sistema em uma **API RESTful**.
- [ ] Conexão com banco de dados real (PostgreSQL/MySQL).
- [ ] **Integração Externa:** Consumo da API pública da Steam para sincronização automática de horas jogadas (via JSON).

## 💻 Como rodar o projeto localmente

1. Clone este repositório:
   ```bash
   git clone [https://github.com/SEU-USUARIO/GameTracker.git](https://github.com/SEU-USUARIO/GameTracker.git)
