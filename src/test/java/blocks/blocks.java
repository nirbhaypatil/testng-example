package blocks;

public class blocks extends Parent{

    {
        System.out.println("inside instance block");
        {
            System.out.println("inside instance local block");
        }
    }
    static
    {
        System.out.println("inside static block");
        {
            System.out.println("inside static local block");
        }
    }
    blocks(){
        //super();
        System.out.println("inside constructor");
    }
    public static void main(String [] args ){
        blocks b = new blocks();
    }
}
