public class Main {
    public static void main(String[] args) {
        NewLinkedList<String> Writers = new NewLinkedList<>();

        Writers.insert("Ahmet Hamdi Tanpınar");
        Writers.insert("Edip Cansever");
        Writers.insert("Faruk Nafiz Çamlıbel");
        Writers.insert("Can Yücel");
        Writers.printList();
        System.out.println();
        System.out.println();


        Writers.insert("Nazım Hikmet", 2);
        Writers.printList();
        System.out.println();
        System.out.println();

        Writers.delete();
        Writers.printList();
        System.out.println();
        System.out.println();


        Writers.delete(2);
        Writers.printList();

    }
}
