# Busca em Largura para o Problema de Arad a Bucareste

## Descrição

Este projeto implementa a solução do problema de busca de caminho mais curto entre duas cidades, Arad e Bucareste, usando o Algoritmo de Busca em Largura. 
O algoritmo busca encontrar o caminho mais eficiente entre as duas cidades com base em uma heurística que estima a distância restante até o objetivo.

## Objetivos

O objetivo do algoritmo de busca em largura (Breadth-First Search, BFS) no problema de Arad a Bucareste é encontrar o caminho com o menor número de arestas (ou seja, o menor número de cidades intermediárias) entre as cidades de Arad e Bucareste.

A busca em largura explora todos os caminhos de comprimento igual (em termos de número de arestas) antes de passar para caminhos mais longos. Assim, ela garante que, ao encontrar o destino (Bucareste), o caminho encontrado terá o menor número possível de transições entre cidades. Contudo, o algoritmo não leva em conta a distância real ou o custo do caminho, apenas o número de passos (arestas).

Como Funciona:
Expansão em Camadas: BFS começa na cidade de Arad e explora todos os vizinhos diretos primeiro. Em seguida, ela expande para os vizinhos desses vizinhos, e assim por diante.
Fila: Utiliza uma fila (FIFO) para gerenciar a ordem de exploração das cidades, garantindo que todos os caminhos de uma certa profundidade (número de arestas) sejam explorados antes de aumentar a profundidade.

## Exemplo de Aplicação:

Se há vários caminhos para chegar de Arad a Bucareste, BFS garantirá que o caminho com o menor número de cidades intermediárias seja encontrado primeiro.
Embora o BFS seja útil para encontrar o menor número de passos, ele não considera a distância total percorrida. Por isso, o caminho encontrado pelo BFS pode não ser o mais curto em termos de distância real ou tempo de viagem.

## Algoritmo

Componentes de um problema 

► 1. Estado inicial; 

► 2. Estado final (objetivo); 

► 3. Espaço de estados; 

► 4. Ações para passar de um estado para outro; 

► 5. Solução (caminho que leva do estado inicial ao estado final).

## Estrutura do Projeto

- **`src/`**: Código-fonte do projeto.
	- **`Principal.java`**: Implementação principal do algoritmo de busca gulosa.
	- **`Busca Gulosa.java`**: Implementação principal do algoritmo de busca gulosa.
	- **`Grafos.java`**: Implementação principal do algoritmo de busca gulosa.
	- **`Vertice.java`**: Implementação principal do algoritmo de busca gulosa.
	- **`VetorOrdenado.java`**: Implementação principal do algoritmo de busca gulosa.
	- **`Adjacente.java`**: Implementação principal do algoritmo de busca gulosa.

## Como Executar

1. **Clonar o Repositório**:
   ```bash
   git clone https://github.com/samerzito/Algoritmo-Busca-Largura.git
