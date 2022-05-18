public class Numbers {
    public static void main(String[] args){
        Numberlist number = new Numberlist();

        number.add(3);
        number.add(8);
        number.add(1);
        System.out.println(number.length);
        number.printList();
        number.delete(1);
        number.printList();
        number.add(4);
        number.add(9);
        number.add(5);
        number.sort();
        number.printList();


    }
}
