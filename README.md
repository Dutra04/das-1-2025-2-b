# Livros base:

* Arquitetura de Código – Engenharia de Software Moderna – Capítulo 5
  [https://engsoftmoderna.info/cap5.html](https://engsoftmoderna.info/cap5.html)
* Código Limpo – Robert Martin
  [https://integrada.minhabiblioteca.com.br/reader/books/9788550816043/pageid/0](https://integrada.minhabiblioteca.com.br/reader/books/9788550816043/pageid/0)
* Design Patterns – Erich Gamma
  [https://integrada.minhabiblioteca.com.br/reader/books/9788577800469/pageid/0](https://integrada.minhabiblioteca.com.br/reader/books/9788577800469/pageid/0)


# 1. A Finalidade do Desenvolvimento de Software

A atividade de desenvolver um software tem como objetivo fundamental apresentar uma solução para um problema específico. A computação aborda essa tarefa por meio de abstrações, que funcionam como modelos simplificados para representar as diversas partes envolvidas no problema.



# 2. Abstração

Abstração é o processo de criar uma representação simplificada de algo real. Na prática, trata-se de traduzir conceitos, objetos e papéis do mundo real para uma estrutura lógica que o sistema computacional possa processar, sempre de acordo com os requisitos e as necessidades definidas para o software.


# 3. Complexidade

A complexidade é um dos principais desafios ao se trabalhar com abstrações. A programação orientada a objetos (POO), por exemplo, busca lidar com essa questão ao dividir o sistema em componentes menores, com responsabilidades bem definidas. Essa separação facilita a leitura, o entendimento, a manutenção e a evolução do código ao longo do tempo.


# 4. Getters e Setters

São mecanismos de ocultação de dados, muito comuns em linguagens orientadas a objetos como Java e C++. A boa prática recomenda que todos os atributos de uma classe sejam privados, e que o acesso a eles ocorra apenas por meio de getters (leitura) e setters (escrita). Isso melhora o encapsulamento e o controle sobre os dados internos da classe.


# 5. Coesão

Uma classe deve ser responsável por apenas uma função no sistema. Isso facilita seu entendimento, testes e manutenção. Em outras palavras, toda classe deve ter uma única responsabilidade, o que torna seu propósito mais claro e seu código mais limpo.


# 6. Acoplamento

É o grau de interdependência entre módulos de software. Um baixo acoplamento é desejável, pois indica que os módulos são independentes e que mudanças em um deles têm pouco impacto nos demais. Isso contribui para a escalabilidade e a flexibilidade do sistema.

# Conexão entre duas classes pode ter dois tipos de acoplamento:

# Acoplamento Bom

Quando a classe A usa apenas métodos públicos da classe B.
Exemplo: pense em um USB, que pode ser facilmente removido de um computador e conectado a outro — simples, reutilizável e com baixo acoplamento.

# Acoplamento Ruim

Quando a classe A acessa diretamente arquivos, banco de dados ou dados internos da classe B.
Se uma classe depende de muitas outras ou conhece detalhes demais sobre elas, isso indica baixa coesão e um acoplamento excessivo, tornando o sistema frágil a mudanças.


# 7. SOLID

Criado por Robert Martin (autor de Clean Code), o SOLID é um conjunto de princípios da programação orientada a objetos. São eles:

# S - Responsabilidade Única (SRP)

Cada classe deve ter apenas um motivo para mudar, ou seja, deve ser responsável por uma única tarefa ou funcionalidade.

# O - Segregação de Interfaces (ISP)

As interfaces devem ser pequenas e específicas, de forma que os clientes não sejam obrigados a depender de métodos que não utilizam.

# L - Inversão de Dependência (DIP)

Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações (interfaces).

Abstrações são mais estáveis e facilitam a reutilização e a manutenção.

# I - Prefira Composição a Herança

A herança expõe detalhes da implementação da classe-pai para as subclasses, o que pode violar o encapsulamento.

Nem sempre herança representa corretamente a realidade do modelo.
Exemplo: se temos uma classe Pessoa, e subclasses Cliente e Funcionário, estamos impedindo que um funcionário seja também um cliente, o que pode limitar a flexibilidade do sistema.

### D - Princípio de Demeter

Desenvolvido por um grupo da Northeastern University em Boston.
O princípio recomenda que os métodos de uma classe devem interagir apenas com:

* A própria classe
* Objetos recebidos como parâmetro
* Objetos criados pelo próprio método
* Atributos da própria classe

Isso reduz o acoplamento e melhora o encapsulamento.

# 8. Princípio Aberto/Fechado (Open/Closed Principle)

Uma classe deve estar fechada para modificação, mas aberta para extensão.
Isso significa que não se deve modificar diretamente o código existente ao implementar novas funcionalidades, mas sim estendê-lo por meio de herança ou composição.
Em resumo, esse princípio torna o sistema mais flexível, estável e seguro contra regressões.


# Fundamentos da Arquitetura de Software

Livro: Richards, Mark; Ford, Neal
[https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/)

# 1. Características

São critérios que indicam se um sistema é bem-sucedido, geralmente independentes das funcionalidades.
Exemplo: desempenho, segurança, escalabilidade, manutenibilidade etc.
Elas não precisam de entendimento profundo da lógica do sistema, mas são essenciais para seu bom funcionamento.

# 2. Decisões de Arquitetura

São regras técnicas que definem como o sistema será construído.
Exemplo: em uma arquitetura em camadas, somente as camadas de negócio e serviço podem acessar diretamente o banco de dados, evitando que a camada de apresentação o faça.

# 3. Princípios de Design

São orientações gerais (e não regras fixas).
Exemplo: "prefira comunicação assíncrona entre serviços", o que melhora o desempenho em arquiteturas de microsserviços.
São sugestões que guiam o desenvolvedor, mantendo flexibilidade nas decisões.


# Expectativas de um Arquiteto

# 1. Tomar decisões de arquitetura

O arquiteto deve ter experiência e visão ampla, ser acessível à equipe e saber ouvir e orientar.

# 2. Analisar continuamente a arquitetura

Com a constante evolução tecnológica, o arquiteto deve estar sempre avaliando a arquitetura do sistema e se atualizando com novas tendências e práticas.

# 3. Manter-se atualizado

O arquiteto deve estar em constante aprendizado.
Não é necessário saber tudo, mas ter conhecimento prático e sólido das principais ferramentas e tecnologias.

# 4. Garantir conformidade com as decisões

Ele atua como guia técnico da equipe, esclarecendo dúvidas e garantindo que o time siga os padrões definidos.

# 5. Domínio de negócio

O arquiteto não é apenas técnico — ele precisa entender o contexto da empresa, a equipe, o cliente e o mercado. Saber se comunicar e traduzir necessidades de negócio para soluções técnicas é essencial.

# DevOps

No início, as equipes eram divididas entre Front-end (interface e experiência do usuário) e Back-end (lógica de negócio e dados). Isso gerava conflitos e falta de integração.
O movimento DevOps surgiu como um conjunto de práticas para unir as equipes de desenvolvimento e operações.
Inclui etapas como: planejar, codar, testar, publicar, operar e manter sistemas de forma colaborativa e contínua.
Algumas empresas tratam DevOps como cultura, exigindo colaboração entre os times.
Outras tratam como um cargo específico, com uma equipe dedicada.


# Atividade 04/09

# Resuma a diferença entre Arquitetura e Design

A principal diferença é que arquitetura define o que o sistema deve fazer e como será estruturado, lidando com requisitos não funcionais (como segurança e desempenho).
Já o design orienta boas práticas para resolver problemas específicos no código, com mais flexibilidade.
Arquitetura define os limites técnicos; design propõe as melhores abordagens dentro desses limites.

# Como é a formação do conhecimento de um arquiteto modelo T?

O arquiteto modelo T tem amplo conhecimento em várias tecnologias (a parte horizontal do T), e profundo conhecimento em uma ou mais áreas específicas (a parte vertical).
Isso permite que ele entenda o panorama geral, mas também resolva problemas complexos em áreas críticas.


# Assunto de Prova – Trade-offs (Compensações)

Na arquitetura de software, não existem respostas certas ou erradas, apenas compensações (trade-offs) entre prós e contras.



# 1 para N – Tópico (Publisher/Subscriber)

Imagine enviar mensagem para todos os seus familiares sobre o almoço de domingo. Enviar uma a uma seria demorado. Criar um grupo e enviar uma única mensagem é mais eficiente.
Assim funciona o tópico com assinantes (subscribers). O problema é que se a mensagem falhar, ela pode ser perdida.


# 1 para 1 – Filas (Queues)

Já nas filas, cada mensagem é enviada individualmente.
O subscriber precisa buscar (polling) a mensagem. A vantagem é que as mensagens podem ser recuperadas mesmo se houver falhas.


# Vantagens Comparativas

* Tópico: comunicação mais rápida, apenas uma conexão com o broker.
* Fila: maior controle e confiabilidade, porém requer várias filas e conexões para múltiplos consumidores.

