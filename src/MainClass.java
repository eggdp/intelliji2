import java.util.ArrayList;

public class MainClass {
    public static void main(String [] args){
        System.out.println("헬로 월드");
        //객체생성 클래스 불러서 사용
        NameSet ns=new NameSet();
        ns.setName();
        //아이템 설정
        ns.setItem();
        ns.getName();

        String name=ns.getName(); //name을 쓰기위해 main에서 설정해준다.
        PlayClass pc=new PlayClass();
        int num=pc.play1(name);
        num =pc.play2(num);
        ArrayList<ItemClass> list=ns.getItemList();
        pc.play3(num,list);
    }
}
