Livro base: Arquitetura de Código - Engenharia de Software Moderna / Capitulo 5.
https://engsoftmoderna.info/cap5.html

1. A Finalidade do Desenvolvimento de Software
A atividade de desenvolver um software tem como objetivo fundamental apresentar uma solução para um problema determinado. A computação aborda essa tarefa por meio de abstrações, que funcionam como modelos simplificados para representar as diversas partes envolvidas no problema.

2. Abstração
Abstração pode ser definida como o processo de criar uma representação simplificada de algo real. Na prática, trata-se de traduzir conceitos, objetos e papéis do mundo real para uma estrutura lógica que o sistema computacional possa processar, sempre de acordo com as necessidades e os requisitos definidos para o software.

3. Complexidade
A complexidade é um dos principais desafios ao se trabalhar com abstrações. A programação orientada a objetos, por exemplo, é uma abordagem que busca lidar com essa questão ao dividir as funcionalidades de um sistema em componentes menores e com responsabilidades claras. Essa separação facilita a localização de trechos específicos do código e simplifica a sua manutenção ao longo do tempo.

4. Getters e setters
Basicamente: ocultaçao de dados, são muito usados em linguagens orientadas a objetos, como Java e C++. A recomendação para uso desses métodos é a seguinte: todos os dados de uma classe devem ser privados e o acesso a eles apenas por getters "acesso por leitura e setters "acesso por escrita

5. Coesão
A classe deve implementar apenas uma função, para seu bom entendimento e manutenção 'toda classe deve ter apenas uma única responsabilidade no sistema.

6. Acoplamento
Grau de inter-dependência entre módulos de software, um baixo acoplamento é desejável pois indica que os módulos são independentes e suas mudanças têm pouco impacto uns sobre os outros. Isso facilita a manutenção e a evolução do software.

Conexao entre duas classes tendo dois tipos

# Acoplamento Bom
Quando classe 'A usa apenas metodos publicos da classe 'B
Basicamente pense em um USB onde voce tira de um computador e coloca em outro, bem simples e baixo acoplamento.

# Acoplamento Ruim
Quando a classe 'A usa acesso via arquivo ou banco da classe 'B
se uma classe depende de muitas outras classes ela esta assumindo
responsabilidades demais tornando não "coesas".

7. 
