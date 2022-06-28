import java.util.ArrayList;
import java.util.Scanner;
//이름설정하는 클래스
public class NameSet {
    private String name; //멤버 변수 클래스내에 메소드에서도 사용가능.
    private Scanner sc; //주소값으로 null로 초기화 된다.
    private ArrayList<ItemClass> list=new ArrayList<>(); //n=3하면 아이템3개를 담는데 마지막만 출력되므로 리스트에 담아서 출력해야한다.
    public NameSet(){
        sc=new Scanner(System.in);
    }
    public void setName() {
        System.out.println("이름 설정 기능");
        System.out.print("이름 설정:");
        Scanner na=new Scanner(System.in);
        name=na.next();
        // String name=na.next();//문자열 입력받기 전역변수 이므로 setName안에서만 사용 그래서 밖으로 뺀다.
    }
    public String getName(){ //private로 name을 설정해서 main에서 쓰기위해선 밖으로 보내야한다.(참조변수를쓴다.) void ->String
        System.out.println("이름 출력 기능");
        System.out.println(name+"아 안녕.");
        return name;
    }
    //아이템 세팅 사용자가 원하는 만큼 아이템
    public void setItem(){
        System.out.println("몇개의 아이템을 사용하시겠습니까? ");
        System.out.print("갯수 입력(너무 많이하면 힘들어요):");
        int n=sc.nextInt();
        //ItemClass ic =new ItemClass(); //아이템을 담을 그릇을 만든다. for문 밖으로 뻇다. why? 영역 때문에 밑에 for문을 쓸수없다.

        for(int i=0;i<n;i++){
            ItemClass ic =new ItemClass();
            System.out.print("이름 입력:");
            String it=sc.next();
            ic.setName(it); //이름 담기
             //System.out.println(i+"아이템 :"+it);
            System.out.print("속성 입력:");
            it=sc.next();
            ic.setAtt(it); //속성 담고
            //ItemClass가 세팅된 오브젝트를 리스트에 담는다.
            list.add(ic);
            //System.out.println(i+1+"아이템:"+it);
        }
        //입력한 아이템들을 출력해보자.
//        System.out.println("입력한 아이템 출력");
//        for(ItemClass ic :list){
//            System.out.println("아이템 이름:"+ic.getName());
//            System.out.println("아이템 속성:"+ic.getAtt());
//        }
    }
    //셋팅된 아이템 리스트를 전달 해주는 기능
    public ArrayList<ItemClass> getItemList() {
        return list;
    }
}
