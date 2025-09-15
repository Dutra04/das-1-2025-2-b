Livro base: Arquitetura de Código - Engenharia de Software Moderna / Capitulo 5.
https://engsoftmoderna.info/cap5.html
Código limpo de Robert Martin
https://integrada.minhabiblioteca.com.br/reader/books/9788550816043/pageid/0
Design Patterns de Erich Gamma
https://integrada.minhabiblioteca.com.br/reader/books/9788577800469/pageid/0

1. A Finalidade do Desenvolvimento de Software
A atividade de desenvolver um software tem como objetivo fundamental apresentar uma solução para um problema 
determinado. A computação aborda essa tarefa por meio de abstrações, que funcionam como modelos simplificados para 
representar as diversas partes envolvidas no problema.

2. Abstração
Abstração pode ser definida como o processo de criar uma representação simplificada de algo real. Na prática, 
trata-se de traduzir conceitos, objetos e papéis do mundo real para uma estrutura lógica que o sistema 
computacional possa processar, sempre de acordo com as necessidades e os requisitos definidos para o software.

3. Complexidade
A complexidade é um dos principais desafios ao se trabalhar com abstrações. A programação orientada a objetos, por 
exemplo, é uma abordagem que busca lidar com essa questão ao dividir as funcionalidades de um sistema em 
componentes menores e com responsabilidades claras. Essa separação facilita a localização de trechos específicos do 
código e simplifica a sua manutenção ao longo do tempo.

4. Getters e setters
Basicamente: ocultaçao de dados, são muito usados em linguagens orientadas a objetos, como Java e C++. A 
recomendação para uso desses métodos é a seguinte: todos os dados de uma classe devem ser privados e o acesso a 
eles apenas por getters "acesso por leitura e setters "acesso por escrita

5. Coesão
A classe deve implementar apenas uma função, para seu bom entendimento e manutenção 'toda classe deve ter apenas 
uma única responsabilidade no sistema.

6. Acoplamento
Grau de inter-dependência entre módulos de software, um baixo acoplamento é desejável pois indica que os módulos 
são independentes e suas mudanças têm pouco impacto uns sobre os outros. Isso facilita a manutenção e a evolução do 
software.

Conexao entre duas classes tendo dois tipos

- Acoplamento Bom
Quando classe 'A usa apenas metodos publicos da classe 'B
Basicamente pense em um USB onde voce tira de um computador e coloca em outro, bem simples e baixo acoplamento.

- Acoplamento Ruim
Quando a classe 'A usa acesso via arquivo ou banco da classe 'B
se uma classe depende de muitas outras classes ela esta assumindo
responsabilidades demais tornando não "coesas".

7. Solid
Desenvolvido por Robert Martin mesmo autor de clean code. O SOLID é um conjunto de principios da programação 
orientada a objetos(POO) 
  - 5 principios:
    - S Responsabilidade única
  Uma aplicação direta da ideia de coesão.
  Propoe que toda classe deve ter apenas um motivo para mudar, ou seja, deve ser responsável por uma única tarefa 
  ou funcionalidade dentro do sistema para que tenha um bom desempenho.

    - O Segregação de Interfaces
  Caso particular de Responsabilidade Única com foco em interfaces.
  O princípio define que interfaces têm que ser pequenas, coesas e  específicas para cada tipo de cliente issso 
  para evitar que clientes dependam de interfaces com métodos que eles não vão usar, em outras palavras, interfaces 
  grandes e abrangentes devem ser divididas em interfaces menores e mais específicas, focadas em funcionalidades 
  relacionadas.

    - L Inversão de Dependências
  Modulos de alto nivel nao devem depender da modulos de nivel baixo, ambos devem depender de abstraçoes/(interface)
  O principio recomenda que uma classe deve estabelecer dependencias prioritariamente com abstraçoes e nao com 
  implementaçoes concretas pois abstraçoes(Interfaces) sao mais estaveis do que implementaçoes concretas(Classe)

    - I Prefira composiçao a herança
  Herança expoe para subclasses detalhes de implemntaçao das classes Pai, logo frequentemente diz que herança viola 
  o encapsulamento das classes pai.
  - - - As subclasse tende a ser uma divisao exata para virar uma herança
  Imagine uma modelagem pessoa tendo como sub-divisao, cliente e funcionario em herança a pessoa

  Cliente <--| *Pessoa* |--> Funcionario

Isso nao nos da uma divisao exata, e torna que o Funcionario nao pode ser Cliente, portanto esta impedindo que o 
funcionario compre na empresa em questao

- D Demeter
Um grupo chamado DEMETER desenvolvia pesquisas na area de modularizaçao de software na Norteastern University 
Boston, em uma de suas pesquisas, o grupo enunciou um conjunto de regras para evitar problemas de encapsulamento em 
projeto de sistemas orientados a objetos.
Em outras palavras o principio Demeter recomenda que os metodos de uma classe devem falar apenas com os metodos da 
propria classe,
Todo metodo no objeto deve invocar apenas:

- Sua propria classe
- Objetos passados como parametros
- Objetos criados pelo proprio Metodo
- Atributos da classe do metodo

8. Principio Aberto/Fechado.
Uma classe deve estar fechada para modificaçao mas aberta para extençoes.
Pois uma classe nao deve permitir alteraçao sem controle de um codigo, mas deve ser permitido trabalhar em novas r
ealizaçoes dentro dele.


 Em resumo, o Princípio Aberto/Fechado tem como objetivo a construção de classes flexíveis e extensíveis, capazes 
 de se adaptarem a diversos cenários de uso, sem modificações no seu código fonte.



# Fundamentos da arquitetura de software: uma abordagem de engenharia
  - Richards, Mark, Ford, Neal
  
  Link do livro com biblioteca universidade
https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/2[%3Bvnd.vst.idref%3Dcover]!/4/2/
2%4051:1

Definições da estrutura de software:

- Caracteristicas
- Decisoes de arquitetura
- Principios de design

1. Caracteristicas.
As características definem os critérios que indicam se um sistema é bem-sucedido, e geralmente são independentes 
das funções que ele realiza. É importante destacar que essas características não exigem entendimento das 
funcionalidades do sistema, embora sejam essenciais para seu funcionamento adequado. Elas têm tanta importância que 
dedicamos vários capítulos deste livro para explorá-las e explicá-las detalhadamente.

2. Decisões de arquitetura.
As decisões arquiteturais estabelecem as regras para construir um sistema. Por exemplo, um arquiteto pode decidir 
que, em uma arquitetura em camadas, somente as camadas de negócios e serviços tenham acesso ao banco de dados 
evitando que a camada de apresentação faça chamadas diretas ao banco. Essas decisões criam os limites do sistema e 
ajudam as equipes de desenvolvimento a entender o que podem ou não fazer durante o desenvolvimento.

3. Principios de design.
Diferente das decisões arquiteturais, que são regras fixas, um princípio de design funciona como uma orientação 
geral. Por exemplo, o princípio sugere que as equipes devem usar comunicação assíncrona entre serviços em uma 
arquitetura de microsserviços para melhorar o desempenho. Como uma decisão rígida não consegue cobrir todas as 
situações e formas de comunicação, esse princípio serve para indicar a abordagem preferida, mas ainda deixa espaço 
para o desenvolvedor escolher o protocolo mais adequado.

# Expectativas de um arquiteto

1. Tomadas de decisão na arquitetura.
Orientação, essa palavra resume muito bem, quando o arquiteto deve ser a pessoa com maior experiencia, sabendo 
escutar sua equipe e orientar.

2. Analisar continuamente a arquitetura.
Na tecnologia temos muita evoluções em basicamente todos os lados, o trabalho do arquiteto deve verificar o codigo 
continuamente e saber sobre as novas atualizações do mercado, isso para nao deixar seu codigo atrasado comparado 
aos demais e evitar erros com features novas em codigos.

3. Manter-se atualizado com as ultimas tendencias.
Muito ligado com a analise continua, o arquiteto nao deve parar de estudar, pois nas areas de tecnologia ha uma 
evoluçao constante em todos os aspectos, portanto o arquiteto deve nao saber 110% de tudo mas saber o basico bem 
feito da maioria.

4. Assegurar a conformidade com as decisões.
Basicamente o guia da equipe, quando a duvidas por exemplo do desenvolvedor ele devera tirar as duvidas mostrando o 
melhor caminho, por isso o arquiteto deve ter uma noção sendo um gestor.

5. Dominio de negocio.
Um arquiteto nao é um profissional somente tecnico, tambem tem que ter um bom conhecimento em humanas, ele deve 
saber se comunicar com a equipe, saber como a empresa funciona como sua equipe trabalha e saber entender a 
nescessidade do cliente.

# DevOps
Desde os primordios do desenvolvimento havia duas equipes Front e Back-end, elas cuidavam da parte 'Bonita' do
software (Front) com a integraçao de codigos as paginas misturado com design atrativo e funcional e a parte Back 
end que cuida da parte de tras de um software fazendo toda a logica do sistemas, havia muitas discussoes e 
discordancias dessas equipes, Isso se extende ate hoje porem surgiu um cargo novo, DevOps é um conjunto de praticas 
que unem as duas equipes, Planejar, Codar, Publicar, implementar, operar e manter a evoluçao/atualização continua, 
essas sao as funçoes da equipe DevOps.
Algumas empresas tratam isso como uma cultura, exigindo que os desenvolvedores saibam 
trabalhar em conjunto para a vida do sistemas, enquanto outras empresas tratam isso como um cargo tem apenas uma 
equipe especialista DevOps nao como uma politica/Filosofia.

# Atividade 04/09

- Resuma a diferençca entre: Arquitetura e Design

A principal diferença entre Arquitetura e design é que a arquitetura esta mais relacionada no que o sistema deve fazer e como deve ser construido, um pouco mais parecido como Requisitos não funcionais. Elas tambem criam limites tecnicos que garantem, organização, segurança e coerencia no desnvolvimento. Ja o design são mais sobre orientações gerais, que idicam boas praticas a serem seguidas,porem com flexibilidade. Não regras rigidas e sim sugestões que auxiliam o desenvolvedor nas tomadas de decisão

- Como é a formação do conhecimento de um arquiteto modelo T?

O conhecimento de um arquiteto modelo T é formado por uma mistura de amplitude e profundidade técnica. Isso quer dizer que ele tem uma visão ampla sobre várias tecnologias, ferramentas, padrões e soluções, mesmo que não seja especialista em todas elas. Essa variedade de conhecimentos ajuda o arquiteto a entender diferentes caminhos possíveis e a escolher a melhor solução para cada problema, levando em conta os prós e contras e o contexto específico do negócio.
# Assunto de Prova
Trade-offs(Compensação)
Nao existe resposta certa nem errada na arquitetura apenas trade-off

De forma extremamente resumida
Topico 1paraN
Imagine enviar mensagem para todos seus familiares para o almoço de domingo o quao demorado seria enviar mensagem para uma pessoa de cada vez, agora imagine um grupo de familia onde você apenas repassa a mensagem por la na vez de enviar individualmente para cada pessoa, assm funciona o broker onde uma pessoa se inscreve para receber notificaçoes  (Subscribers)
porem se o topico nao conseguir entregar a mensagem ela nao sera mais entregue.


Falando agora sobre Filas 1para1
O metodo é um pouco parecido mas nao muito, na vez de voce enviar a mensagem para todos ao mesmo tempo voce previsa enviar individualmente sendp o publisher.
Já os subscribers viram pooling e na vez de se inscrever eles precisam buscar as mensagens, o lado bom é que diferente do topico voce pode recuperar mensagens.


Vantagens
o serviço que envia mensagens nescessita apenas de uma conexao com o topico ja filas ha nescessidade de varias filas, no caso 1para cada isso para novos subs.
Maior acoplamento, na fila ha como enviar diferentes informações, para cada receivers diferente do topico onde o publischer envia a mesma mensagem para os seus inscritos.
