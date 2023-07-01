import java.util.*;

public class Main {
    public static void main(String[] args, List<?> listB) {

        System.out.println("Введите пять имен: ");
        List<String> listA = getListQuery();
        System.out.println(listA);

        Collections.reverse(listB);

        List<String> listC = new ArrayList<>();
        for (int i = 0; i < listA.size(); i++) {
            listC.add(listA.get(i));
            listC.add((String) listB.get(i));
        }
        System.out.println(listC);

        listC.sort(Comparator.comparing(String::length));
        System.out.println(listC);
    }

    static List getListQuery() {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(scanner.next());
        }

        return list;
    }
}

