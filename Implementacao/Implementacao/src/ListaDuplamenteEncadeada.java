public class ListaDuplamenteEncadeada {
    
    Node head; // Referência ao 1° nó da lista
    Node tail; // Referência ao 2° nó da lista
    int size; // Tamanho da lista

    public ListaDuplamenteEncadeada() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void inserirComeço(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
            tail = temp;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        this.size++;
    }

    public void inserirFim(int data){
        Node temp = new Node(data);
        if(tail == null){
            tail = temp;
            head = temp;
        } 
        else{
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
        }
        this.size++;
    }

    public void percorrerInicio(){
        Node atual = head;
        while(atual != null){
            System.out.println(atual.data + "");
            atual = atual.next;
        }
        System.out.println();
    }

    public void percorrerFinal(){
        Node atual = tail;
        while (atual != null){
            System.out.println(atual.data + "");
            atual = atual.prev;
        }
        System.out.println();
    }

    public void deletarInicio(){
        if(head == null){
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        this.size--;
    }
    public void deletarFinal(){
        if(tail == null){
            return;
        }

        if (head == tail){
            head = null;
            tail = null;
            return;
        }

        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        this.size--;
    }

    public void BogoSort(){

        while(isSorted() == false){
            shuffle();

        }

    }

    public void shuffle() {
        Node current = head;
        for (int i = 0; i < size; i++) {
            int randomIndex = (int) (Math.random() * size);

           
            Node temp = head;
            for (int j = 0; j < randomIndex; j++) {
                temp = temp.next;
            }

            int tempData = current.data;
            current.data = temp.data;
            temp.data = tempData;

            current = current.next;
        }
    }


    public boolean isSorted() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data > current.next.data) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    public void print(){
        Node current = head;
        for (int i=0; i< size; i++){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void SelectionSort() {
        Node current = head;
    
        while (current != null) {
            Node min = current;
            Node temp = current.next;
    
            while (temp != null) {
                if (temp.data < min.data) {
                    min = temp;
                }
                temp = temp.next;
            }
    
            int tempData = current.data;
            current.data = min.data;
            min.data = tempData;
    
            current = current.next;
        }
    }
    
    public void BubbleSort() {
        if (head == null || head.next == null)
            return;
    
        boolean swapped;
        Node lastSorted = null;
    
        while (true) {
            swapped = false;
            Node current = head;
    
            while (current.next != lastSorted) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
    
            if (!swapped)
                break;
    
            lastSorted = current;
        }
    }
}
