
public class Exec {
    public static void main(String[] args) {
        Cell<Integer> cell = new Cell<>(10);
        System.out.println(cell.getValue());
        
        Cell<Float> cell2 = new Cell<>(10.5f);
        System.out.println(cell2.getValue());
        
        Cell<Long> cell3 = new Cell<>(1000000000000000000L);
        System.out.println(cell3.getValue());


        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        stack.show();
        
        System.out.println("Size: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());
        
        stack.pop();
        stack.pop();
        
        stack.show();
        
        System.out.println("Size: " + stack.size());
        System.out.println("Is empty: " + stack.isEmpty());
    }
}


class Cell<T> {
    private T value;
    
    public Cell(T value) {
        this.value = value;
    }
    
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Cell<T> getNext() {
        return next;
    }

    public void setNext(Cell<T> next) {
        this.next = next;
    }

    private Cell<T> next;
}

// Crie uma pilha flexível com tipo genérico como descrito na questão anterior com os
// métodos: inserir, remover, tamanho da pilha, booleano que verifica se a pilha está vazia,
// mostre todos elementos da lista. Não esqueça de fazer o uso da célula implementada na
// questão anterior. 

// Path: Stack.java

class Stack<T> {
    private Cell<T> top;
    private int size;
    
    public void push(T value) {
        Cell<T> newCell = new Cell<>(value);
        newCell.setNext(top);
        top = newCell;
        size++;
    }
    
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public void show() {
        Cell<T> current = top;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
