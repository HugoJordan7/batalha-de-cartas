# Batalha de cartas

Batalha de cartas é um jogo desenvolvido na disciplina de Paradigmas de Linguagens de Programação na UEPB, em 2024.1, por mim e mais 4 alunos.

## Objetivo do Projeto:
Implementar um jogo de batalha de cartas baseado em um tabuleiro de 3x3.
## Especificação do Jogo:
Este é um jogo de tabuleiro 3x3 jogado entre dois jogadores. Cada jogador possui um
conjunto de 5 cartas com valores nos quatro lados (topo, fundo, esquerda e direita) que vão
de 0 até 10 (o 10 é representado por ‘A’ no jogo). Os jogadores alternam turnos para colocar
uma de suas cartas em uma célula vazia do tabuleiro. O objetivo é conquistar as células do
tabuleiro com cartas mais fortes, com base nas regras de comparação de valores entre
cartas.
## Regras do Jogo:
1. O jogo possui cartas e um tabuleiro 3x3. Exemplo:

      i. A imagem à esquerda é o exemplo de uma carta (as setas são
      apenas ilustrações para entender o direcionamento, portanto não
      devem estar presentes de forma gráfica no terminal).
  
      ii. A imagem à direita é um exemplo gráfico do campo 3x3 do jogo, este
      campo deve ter uma única carta para cada posição, totalizando 9
      cartas.

<img src="https://github.com/HugoJordan7/batalha-de-cartas/assets/116570979/66503153-78ee-46d6-9547-3d100cdd6314" width="350" alt="ht_splash"> 


2. Durante a inserção de uma carta, o jogador ganha as células adjacentes ao lado da
carta colocada se a carta adversária tiver um valor menor na direção
correspondente. Exemplo: Jogador verde coloca uma carta que possui o valor 6 em seu
lado esquerdo na posição do tabuleiro imediatamente à direita de uma
carta do oponente que possui o valor 2 no seu lado direito: as duas cartas
se tornam verdes(ao se tornar verde, significa que o jogador verde tomou
posse da carta que era antes do jogador azul), pois 6 é maior que 2.
Note que nessa jogada as cartas se encontram, nesse caso ficou a
esquerda de uma carta junto com a direita de outra. Mas não se limita
apenas com a ‘esquerda’ e ‘direita’ das cartas, podendo aplicar o
mesmo padrão para a posição ‘cima’ e ‘baixo’.

<img src="https://github.com/HugoJordan7/batalha-de-cartas/assets/116570979/dddf889d-d76b-46a0-a341-bef234dd15f7" width="350" alt="ht_splash"> 


3. O jogador vence o jogo se conquistar mais células no tabuleiro ao final do jogo.

4. O jogo termina quando todas as células do tabuleiro forem preenchidas.

## Pontuação dos Jogadores:

● Cada jogador começa o jogo com 5 pontos.

● Quando um jogador captura uma carta do oponente no tabuleiro, ele ganha um
ponto.

● Quando um jogador perde uma carta para o oponente no tabuleiro, ele perde um
ponto.
