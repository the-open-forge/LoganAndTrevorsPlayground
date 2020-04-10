package monkeyingaround;

public class OurArrayList {
    //class member
    private String[] trees;
    private int count;

    //constant for readability; good programming practice
    private static final int BASE_SIZE = 10;

    //constructor that creates OurArrayList With initial size
    public OurArrayList(int initialArraySize) {
        this.trees = new String[initialArraySize];
        this.count = 0;
    }

    //constructor for size of 10
    public OurArrayList() {
        this.trees = new String[BASE_SIZE];
        this.count = 0;
    }

    /**
     * Name: get
     * Params: index
     * return string from a specific index
     */
    public String get(int index) {
        return this.trees[index];
    }

    public void add(String value) {
        //condition where array is full needs cloned
        if (this.count == this.trees.length - 1) {
            String[] newArray = new String[this.trees.length * 10];
            for (int i=0; i < this.trees.length; i++) {
                newArray[i] = this.trees[i];
            }
            this.trees = newArray;
        }
        //adds value
        this.trees[this.count] = value;
        this.count++;
    }
}
