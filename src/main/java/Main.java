import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("11111");
        list.add("22222222");
        list.add("33333333");
        list.add("444");
        list.add("11");
        list.add("222");
        list.add("3333");
        list.add("4444444");
        list.add("11111111");
        list.add("222222");
        list.add("33333333");
        list.add("4");
        list.add("1");
        list.add("2222222222");
        list.add("3");
        list.add("44444444444444");
        List<String> listNum1 = check(list, 1);
        List<String> listNum2 = check(list, 2);
        List<String> listNum3 = check(list, 3);
        List<String> listNum4 = check(list, 4);
        int i1 = maxLength(listNum1);
        int i2 = maxLength(listNum2);
        int i3 = maxLength(listNum3);
        int i4 = maxLength(listNum4);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.setLength(i1 + i2 + i3 + i4+12);


        for (int i = 0; i < 4; i++) {
            int i10 = 0;
            stringBuilder.insert(0, listNum1.get(i));
            i10 = i1 + 3;
            stringBuilder.insert(i10, listNum2.get(i));
            i10 = i10 + i2 + 3;
            stringBuilder.insert(i10, listNum3.get(i));
            i10 = i10 + i3 + 3;
            stringBuilder.insert(i10, listNum4.get(i));
            System.out.println(stringBuilder.toString());
            stringBuilder = new StringBuilder();
            stringBuilder.setLength(i1 + i2 + i3 + i4+12);
                    i10 = 0;

        }


    }

    public static void print(){
        
    }

    public static List<String> check(List<String> list, int number) {
        List<String> listWithString = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int firstNum = Character.getNumericValue(list.get(i).charAt(0));
            if (firstNum == number) {
                listWithString.add(list.get(i));
            }

        }
        return listWithString;
    }

    public static int maxLength(List<String> list) {
        int numOfList = 0;
        for (String str : list) {
            if (str.length() > numOfList) {
                numOfList = str.length();
            }
        }
        return numOfList;
    }
}
