package org.example;

import org.example.arvores.ArvoreBinaria;
import org.example.arvores.model.Obj;
import org.example.equalsHashCode.Carro;
import org.example.pilha.No;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //PARA TESTAR AS FUNCIONALIDADES ABAIXO DEVE REMOVER OS COMENTÁRIOS E EFETUAR OS IMPORTES

//        No<String> no1 = new No("Conteudo no1");
//        No<String> no2 = new No("Conteudo no2");
//        no1.setProximoNo(no2);
//
//        No<String> no3 = new No("Conteudo no3");
//        no2.setProximoNo(no3);
//
//        No<String> no4 = new No("Conteudo no4");
//        no3.setProximoNo(no4);
//
//        System.out.println(no1);
//        System.out.println(no1.getProximoNo());
//        System.out.println(no2.getProximoNo());
//        System.out.println(no3.getProximoNo());
//        System.out.println(no4.getProximoNo());

//        System.out.println("");
//        System.out.println("");
//
//        System.out.println("---------- Utilizando Pilha ---------- ");
//
//        Pilha myPilha = new Pilha();
//        myPilha.push(new No(1));
//        myPilha.push(new No(2));
//        myPilha.push(new No(3));
//        myPilha.push(new No(4));
//        myPilha.push(new No(5));
//        myPilha.push(new No(6));
//
//        System.out.println(myPilha);
//        System.out.println(myPilha.pop());
//        System.out.println(myPilha);
//
//        myPilha.push(new No(99));
//        System.out.println(myPilha);
//
//        System.out.println("---------- Utilizando Fila ---------- ");
//        Fila<String> myFila = new Fila<>();
//
//        myFila.enqueue("primeiro");
//        myFila.enqueue("segundo");
//        myFila.enqueue("terceiro");
//        myFila.enqueue("quarto");
//
//        System.out.println(myFila);
//        System.out.println("");
//        System.out.println(myFila.dequeue());
//        System.out.println("");
//        System.out.println(myFila);
//
//        myFila.enqueue("Ultimo");
//        System.out.println(myFila);
//
//        System.out.println(myFila.first());


//        System.out.println("---------- Utilizando Lista Duplamente Encadeada ---------- ");
//
//        ListaDuplamenteEncadeada<String> minhaListaDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();
//        minhaListaDuplamenteEncadeada.add("c1");
//        minhaListaDuplamenteEncadeada.add("c2");
//        minhaListaDuplamenteEncadeada.add("c3");
//        minhaListaDuplamenteEncadeada.add("c4");
//        minhaListaDuplamenteEncadeada.add("c5");
//        minhaListaDuplamenteEncadeada.add("c6");
//        minhaListaDuplamenteEncadeada.add("c7");
//
//        System.out.println(minhaListaDuplamenteEncadeada);
//
//        minhaListaDuplamenteEncadeada.remove(3);
//        minhaListaDuplamenteEncadeada.add(3, "99");
//
//        System.out.println(minhaListaDuplamenteEncadeada);
//        System.out.println(minhaListaDuplamenteEncadeada.get(3));


//        System.out.println("---------- Utilizando Lista Circular ---------- ");
//
//        ListaCircular<String> minhaListaCircular = new ListaCircular<>();
//
//        minhaListaCircular.add("c0");
//        System.out.println(minhaListaCircular);
//
//        minhaListaCircular.remove(0);
//        System.out.println(minhaListaCircular);
//
//        minhaListaCircular.add("c1");
//        System.out.println(minhaListaCircular);
//
//        minhaListaCircular.add("c2");
//        minhaListaCircular.add("c3");
//        System.out.println(minhaListaCircular);
//
//        System.out.println(minhaListaCircular.get(7));
//        System.out.println(minhaListaCircular.get(323));

//        System.out.println("---------- Utilizando Arvore Birnária ---------- ");
//
//        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();
//
//        minhaArvore.inserir(new Obj(13));
//        minhaArvore.inserir(new Obj(10));
//        minhaArvore.inserir(new Obj(25));
//        minhaArvore.inserir(new Obj(2));
//        minhaArvore.inserir(new Obj(12));
//        minhaArvore.inserir(new Obj(20));
//        minhaArvore.inserir(new Obj(31));
//        minhaArvore.inserir(new Obj(29));
//        minhaArvore.inserir(new Obj(32));
//        minhaArvore.remover(new Obj(32));
//
//        minhaArvore.exibirInOrdem();
//        minhaArvore.exibirPreOrdem();
//        minhaArvore.exibirPosOrdem();


//       System.out.println("---------- Utilizando HashCode Equals ---------- ");
//
//        List<Carro> listaCarros = new ArrayList<>();
//
//        listaCarros.add(new Carro("Ford"));
//        listaCarros.add(new Carro("Chevrolet"));
//        listaCarros.add(new Carro("Volkswagen"));
//
//        System.out.println(listaCarros.contains(new Carro("Ford")));
//        System.out.println(new Carro("Ford").hashCode());
//        System.out.println(new Carro("Ford").hashCode());


//        System.out.println("---------- Utilizando Stak ---------- ");
//        Stack<Carro> stackCarros = new Stack<>();
//
//        stackCarros.push(new Carro("Ford"));
//        stackCarros.push(new Carro("Chevrolet"));
//        stackCarros.push(new Carro("Fiat"));
//
//        System.out.println(stackCarros);
//        System.out.println(stackCarros.pop());
//        System.out.println(stackCarros);
//
//        System.out.println(stackCarros.peek());
//        System.out.println(stackCarros);
//
//        System.out.println(stackCarros.empty());


//        System.out.println("---------- Utilizando Queue ---------- ");
//        Queue<Carro> queueCarros = new LinkedList<Carro>();
//
//        queueCarros.add(new Carro("Ford"));
//        queueCarros.add(new Carro("Chevrolet"));
//        queueCarros.add(new Carro("Fiat"));
//        System.out.println(queueCarros.add(new Carro("Peugeot"))); //IllegalStateException
//        System.out.println(queueCarros);
//
//        System.out.println(queueCarros.element());//Pega o elemento da cabeça da fila sem remover
//        System.out.println(queueCarros);
//
//        System.out.println(queueCarros.offer(new Carro("Renault"))); //Retorna false se não conseguir
//        System.out.println(queueCarros);
//
//        System.out.println(queueCarros.peek());//Pega o elemento da cabeça da fila e se tiver vazia null
//        System.out.println(queueCarros);
//
//        System.out.println(queueCarros.remove()); //Remove
//        System.out.println(queueCarros);
//
//        System.out.println(queueCarros.poll()); //Remove ou retorna nulo para caso de fila vazia
//        System.out.println(queueCarros);
//
//        System.out.println(queueCarros.isEmpty());


//        System.out.println("---------- Utilizando List ---------- ");
//        List<Carro> listCarros = new ArrayList<>();
//
//        listCarros.add(new Carro("Ford"));
//        listCarros.add(new Carro("Chevrolet"));
//        listCarros.add(new Carro("Fiat"));
//        listCarros.add(new Carro("Peugeot"));
//
//        System.out.println(listCarros.contains(new Carro("Ford")));
//
//        System.out.println(listCarros.get(2));
//
//        System.out.println(listCarros.indexOf(new Carro("Fiat")));
//
//        System.out.println(listCarros.remove(2));
//
//        System.out.println(listCarros);


//        System.out.println("---------- Utilizando Set---------- ");
//        Set<Carro> hashSetCarros = new HashSet<>();
//
//        hashSetCarros.add(new Carro("Ford"));
//        hashSetCarros.add(new Carro("Chevrolet"));
//        hashSetCarros.add(new Carro("Fiat"));
//        hashSetCarros.add(new Carro("Peugeot"));
//        hashSetCarros.add(new Carro("Zip"));
//        hashSetCarros.add(new Carro("Alfa Romeo"));
//
//        System.out.println(hashSetCarros);
//
//        Set<Carro> treeSetCarros = new TreeSet<>();
//
//        treeSetCarros.add(new Carro("Ford"));
//        treeSetCarros.add(new Carro("Chevrolet"));
//        treeSetCarros.add(new Carro("Fiat"));
//        treeSetCarros.add(new Carro("Peugeot"));
//        treeSetCarros.add(new Carro("Zip"));
//        treeSetCarros.add(new Carro("Alfa Romeo"));
//
//        System.out.println(treeSetCarros);

//        System.out.println("---------- Utilizando Map ---------- ");
//        Map<String, String> aluno = new HashMap<>();
//
//        aluno.put("Nome", "João");
//        aluno.put("Idade", "17");
//        aluno.put("Media", "8.5");
//        aluno.put("Turma", "3a");
//
//        System.out.println(aluno);
//
//        System.out.println(aluno.keySet());
//
//        List<Map<String, String>> listaAlunos = new ArrayList<>();
//
//        listaAlunos.add(aluno);
//
//        Map<String, String> aluno2 = new HashMap<>();
//
//        aluno2.put("Nome", "Maria");
//        aluno2.put("Idade", "18");
//        aluno2.put("Media", "8.9");
//        aluno2.put("Turma", "3b");
//
//        listaAlunos.add(aluno2);
//
//        System.out.println(listaAlunos);
//
//        System.out.println(aluno.containsKey("Nome"));

    }
}