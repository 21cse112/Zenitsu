package out;

public class outside extends procpack.inside{
    public static void main(String[] args) {
        outside obj=new outside();
        obj.disp1();
        try{
            obj.display();
        }
        catch(Exception e){
            System.out.println("default access specifier cannot be used");
        }
    }

}