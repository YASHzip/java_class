class CmdArray {
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("No arguments given.");
            return;
        }

        System.out.println("Array elements are:");

        for(String val : args){
            System.out.println(val);
        }
    }
}
