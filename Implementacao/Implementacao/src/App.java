public class App {
    public static void main(String[] args) throws Exception {

        ListaDuplamenteEncadeada list = new ListaDuplamenteEncadeada();
        list.inserirFim(4);
        list.inserirFim(2);
        list.inserirFim(1);
        list.inserirFim(3);
        list.inserirFim(6);
        list.inserirFim(7);
        list.inserirFim(5);

        list.BogoSort();
        list.print();

        ListaDuplamenteEncadeada list2 = new ListaDuplamenteEncadeada();
        list2.inserirFim(4);
        list2.inserirFim(2);
        list2.inserirFim(1);
        list2.inserirFim(3);
        list2.inserirFim(6);
        list2.inserirFim(7);
        list2.inserirFim(5);
        list2.inserirFim(9);
        list2.inserirFim(10);
        list2.inserirFim(11);

        list2.SelectionSort();
        list2.print();
        
        ListaDuplamenteEncadeada list3 = new ListaDuplamenteEncadeada();
        list3.inserirFim(4);
        list3.inserirFim(2);
        list3.inserirFim(1);
        list3.inserirFim(3);
        list3.inserirFim(6);
        list3.inserirFim(7);
        list3.inserirFim(5);
        list3.inserirFim(8);
        list3.inserirFim(9);
        list3.inserirFim(10);
        list3.inserirFim(11);
        list3.inserirFim(12);
        list3.inserirFim(13);
        list3.inserirFim(14);

        list3.BubbleSort();
        list3.print();

    }
}
