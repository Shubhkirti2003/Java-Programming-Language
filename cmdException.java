class cmdException {

    static void CheckArgumentException() throws Exception{
        throw new Exception();
    }
    public static void main(String[] args){ 
        int arr[]=new int[5];
        int sum=0;
        try{
            for(int i=0;i<5;i++){
                arr[i]=Integer.parseInt(args[i]);
                if (args.length<5){
                    CheckArgumentException();
                }
                else if(args.length>5){
                    CheckArgumentException();
                }
            }
            for (int i=0;i<5;i++){
                sum=sum+arr[i];
            }
        }
        catch(Exception c){
            System.out.println("Error: Enter 5 values !!!");
        }
        if (args.length==5){
            System.out.println("Sum is "+sum);
        }
    }
}
