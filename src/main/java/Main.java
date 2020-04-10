import monkeyingaround.OurArrayList;


public class Main {
    public static void main(String[] args) {

        OurArrayList ourArrayList = new OurArrayList();
        for (int index = 0; index < 1000; index++) {
            ourArrayList.add("Meh" + index);
            System.out.println(ourArrayList.get(index));
        }
    }
}
