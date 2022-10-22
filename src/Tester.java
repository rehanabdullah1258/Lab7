public class Tester {
    public static void main(String[] args) {
        Ex1_Ex2_BasicAccount bank=new Ex1_Ex2_BasicAccount();
        bank.deposits(2000);
        System.out.println(bank.getBalance());
        bank.withdraws(100);
        System.out.println("first withdraws: "+bank.getBalance());
        bank.withdraws(3000);
        System.out.println("second withdraws: "+bank.getBalance());
        //...................................................

        Questions q=new Questions();
        q.setText("what is your name?");
        q.setAnswer("rehan");
        q.display();
        System.out.println(q.check_answer("rehan "));
        //...................................................
        Ex4_FillInQuestion f=new Ex4_FillInQuestion();
        f.setText("my name is rehan");
        f.display();
        System.out.println(f.getTextWithAnswer());
       //...............................
        Student s=new Student("rehan","2003","nothing");
        System.out.println(s.toString());
        Instructor i=new Instructor("bushra","1995",10000);
        System.out.println(i.toString());
        //..............................................
        BetterRectangle b=new BetterRectangle(0,0,1,2);
        System.out.println(b.getPerimeter());
        System.out.println(b.getArea());

    }
}
