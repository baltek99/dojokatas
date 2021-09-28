public class DeadFish {
    public static int[] parse(String data) {
        //i increments the value (initially 0)
        //d decrements the value
        //s squares the value
        //o outputs the value into the return array
        int howManyOutputs = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == 'o')
                howManyOutputs++;
        }
        int[] outputs = new int[howManyOutputs];
        int counter = 0;
        int value = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == 'i')
                value++;
            else if (data.charAt(i) == 'd')
                value--;
            else if (data.charAt(i) == 's')
                value *= value;
            else {
                outputs[counter] = value;
                counter++;
            }
        }
        return outputs;
    }

    public static void main(String[] args) {
        int[] t1 = parse("iiisdoso");
        int[] t2 = parse("iiisdosodddddiso");
        System.out.println("iiisdoso");
        for (int i : t1) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("iiisdosodddddiso");
        for (int i : t2) {
            System.out.println(i);
        }
    }
}
