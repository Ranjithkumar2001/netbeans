
public class threedarray {
    
    public static void main(String[] args)
    {
        int arr[][][]={{{10,20,30},{50,60,70}},{{90,71,98},{98,89,72}},{{88,99,77},{67,89,60}}};
        for(int dept=0;dept<3;dept++)
        {
            System.out.println("Dep:"+dept+1);
            for(int std=0;std<2;std++)
            {
                System.out.println("stu:"+std+1);
                for(int mark=0;mark<3;mark++)
                {
                    System.out.println(" "+arr[dept][std][mark]+" ");
                }
                 
            }
            
        }
    }
}
