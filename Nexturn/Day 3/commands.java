public class commands {
    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("Enter the datas");
            return;
        }
        String name =args[0];
        int age =Integer.parseInt(args[1]);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);

    }
}
