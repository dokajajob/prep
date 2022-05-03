import java.util.Scanner;

class Main {
    Integer num1;
    Integer num2;

    public Main() {
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }


    
    public static void main(String args[])
     {

        Main objConstMain = new Main();

        Scanner obj1 = new Scanner(System.in);
        System.out.print("enter number ");
        String str1 = obj1.nextLine();
        int val1 = Integer.parseInt(str1);
        objConstMain.setNum1(val1);
        
        Scanner obj2 = new Scanner(System.in);
        System.out.print("enter second number ");
        String str2 = obj2.nextLine();
        int val2 = Integer.parseInt(str2);
        objConstMain.setNum2(val2);

        System.out.print("sum of numbers is : " + (objConstMain.getNum1() + objConstMain.getNum2()));
        

        
    }
    
        
}