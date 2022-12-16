public class findValue {
    public static void main(String[] args) {

        //diziler
        // dizininTipi[] dizininAdı = {el1, el2, el3, el4};

        int[] list = {755, 757, 756, 72, 75};
        int min = list[0];
        int max = list[0];

        for (int i : list){
            if (min > i){
                min = i;
            }
            if (max < i){
                max = i;
            }
        }

        System.out.println("Dizideki en büyük eleman: " + max);
        System.out.println("Dizideki en küçük eleman: " + min);
    }
}