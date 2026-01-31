class SumArrayCmd {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No elements provided.");
            return;
        }

        int[] arr = new int[args.length];

        int sum = 0;

        for (int i = 0; i < args.length; i++) {

            arr[i] = Integer.parseInt(args[i]);
            sum += arr[i];
        }

        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Sum of array elements = " + sum);
    }
}
