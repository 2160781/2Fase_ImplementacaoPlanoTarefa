# 2FaseResolucaoTarefas

Durante a implementação da base de dados, por base de um ficheiro JSON, será necessário a
colocação desses dados num vetor dentro da app. Esta informação consiste num conjunto de planos,
cada um com o seu respetivo nome e tarefas a efetuar, assim como o estado de cada tarefa
 (“Feito” ou “Por fazer”). De forma a possibilitar esta funcionalidade foram criados dois
  vetores, o vetor “listaPassos” e o vetor “listaPlanos”.
O primeiro vetor, permite a colocar o conjunto de todas as tarefas de cada plano, assim como o seu
respetivo estado.
O segundo vetor, permite a obtenção do nome do plano assim como as respetivas tarefas deste.
Com base nestas características implementou-se uma Spike que demonstra através de um listView dois
 planos cada um com quatro tarefas, á frente de cada plano encontra-se o número de tarefas efetuadas,
 assim como o total de tarefas de cada plano, em ambos os casos quatro. Para obter as tarefas de cada
 plano o utilizador necessita de “clicar” no respetivo plano, de seguida o utilizador obtém o display
 de cada tarefa, este apresenta a tarefa em questão assim como uma imagem que permite o controlo do
  estado dessa tarefa (“Certo”  Feito e “Errado”  Por fazer).
O utilizador consegue afetar o sistema através de cinco botões, nomeadamente cada uma das setas do
teclado (DPAD RIGTH, DPAD LEFT, DPAD UP e DPAD DOWN) e através do Enter.
	 DPAD RIGTH: Permite a passagem para a próxima tarefa, por exemplo da primeira para a segunda;
	DPAD LEFT: Permite a passagem para a tarefa anterior, por exemplo da segunda para a primeira;
	DPAD UP: Colocação do estado da tarefa como “Feito”, no display a imagem do “Errado” será
substituída por a de um “Certo”;
	 DPAD DOWN: Colocação do estado da tarefa como “Por fazer”, no display a imagem do “Certo”
será substituída por a de um “Errado”. Esta foi implementada em caso o utilizador deseje mudar
a sua escolha anterior;
	Enter: Ao premir este botão o utilizador sai da lista das tarefas e volta à lista dos planos.
