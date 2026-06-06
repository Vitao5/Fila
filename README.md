# Fila — Implementações de Fila em Java

Projeto Java com implementações de fila genérica usando duas abordagens diferentes: **array circular** e **lista encadeada**.

## Estrutura do Projeto

```
src/main/
├── Main.java                        # Ponto de entrada — executa os testes
├── dev/victor/queue/
│   ├── QueueTAD.java                # Interface genérica da fila
│   ├── Node.java                    # Nó genérico para lista encadeada
│   ├── ArrayQueue.java              # Fila baseada em array circular
│   └── LinkedQueue.java             # Fila baseada em lista encadeada
└── test/
    ├── ArrayQueueTest.java          # Testes da ArrayQueue
    └── LinkedQueueTest.java         # Testes da LinkedQueue
```

## Interface `QueueTAD<T>`

Contrato implementado por ambas as filas:

| Método | Descrição |
|---|---|
| `push(T element)` | Adiciona um elemento ao final da fila |
| `pop()` | Remove e retorna o elemento do início da fila |
| `peek()` | Retorna o elemento do início sem remover |
| `back()` | Retorna o elemento do final sem remover |
| `size()` | Retorna o número de elementos |
| `isEmpty()` | Verifica se a fila está vazia |
| `clear()` | Remove todos os elementos da fila |

## Implementações

### `ArrayQueue<T>` — Fila com Array Circular

Fila de capacidade fixa que usa um array circular para evitar deslocamento de elementos.

```java
ArrayQueue<Integer> queue = new ArrayQueue<>(10); // capacidade inicial: 10
queue.push(1);
queue.push(2);
int primeiro = queue.peek(); // 1
int ultimo   = queue.back(); // 2
queue.pop();                 // remove 1
```

> **Observação:** A capacidade é definida na criação e não cresce automaticamente. Tentativas de inserção com a fila cheia exibem uma mensagem de aviso.

### `LinkedQueue<T>` — Fila com Lista Encadeada

Fila de tamanho dinâmico que usa nós (`Node<T>`) encadeados. Não possui limite de capacidade.

```java
Node<Integer> inicial = new Node<>(1);
LinkedQueue<Integer> queue = new LinkedQueue<>(inicial);
queue.push(2);
queue.push(3);
int primeiro = queue.peek(); // 1
int ultimo   = queue.back(); // 3
queue.pop();                 // remove 1
```

## Como Executar

Abra o projeto no **IntelliJ IDEA** ou **NetBeans** e execute a classe `Main`. Ela roda automaticamente os testes de ambas as implementações:

```
RODANDO TESTE ARRAY QUEUE
...

RODANDO TESTE LINKED QUEUE
...
```

## Comparativo

| Característica | `ArrayQueue` | `LinkedQueue` |
|---|---|---|
| Capacidade | Fixa (definida no construtor) | Dinâmica (ilimitada) |
| Alocação de memória | Contígua (array) | Fragmentada (nós) |
| Acesso ao primeiro/último | O(1) | O(1) |
| Inserção / Remoção | O(1) | O(1) |
| Uso extra de memória | Nenhum | Ponteiro por nó |

## Tecnologias

- **Java 21+** (usa `void main()` sem classe, recurso de preview)
- **IntelliJ IDEA / NetBeans**
- Sem dependências externas
