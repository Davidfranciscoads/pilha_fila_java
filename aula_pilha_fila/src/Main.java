public class Main {
    public static void main(String[] args) {
       Fila fila = new Fila(5);

        System.out.println("Adicionando: " + fila.adicionar("abelha"));
        System.out.println("Adicionando: " + fila.adicionar("Bernardo"));
        System.out.println("Adicionando: " + fila.adicionar("casa"));
        System.out.println("Adicionando: " + fila.adicionar("Dragão"));
        System.out.println("Adicionando: " + fila.adicionar("Enzo"));

        System.out.println("A fila esta vazia? " + fila.estaVazia() );

        System.out.println("primeiro elemento da fila" + fila.primeiro());
        System.out.println(" tamanho da fila" + fila.tamanho());

        while (!fila.estaVazia()){
            System.out.println("removendo da fila" + fila.remover());

        }
        System.out.println(" a fila esta vazia " + fila.estaVazia());

        // pilha

        Pilha pilha = new Pilha(5);
        System.out.println("empilhando: " + pilha.empilhar("david"));
        System.out.println("empilhando: " + pilha.empilhar("ana"));
        System.out.println("empilhando: " + pilha.empilhar("talia"));
        System.out.println("empilhando: " + pilha.empilhar("lucas"));
        System.out.println("empilhando: " + pilha.empilhar("mizael"));

        System.out.println("A pilha esta vazia? " + pilha.estaVazia() );

        System.out.println("primeiro elemento da pilha" + pilha.topo());
        System.out.println(" tamanho da pilha" + pilha.tamanho());

        while (!pilha.estaVazia()){
            System.out.println("removendo da pilha" + pilha.desenpilhar());

        }
        System.out.println(" a pilha esta vazia " + pilha.estaVazia());

        //


    }
}