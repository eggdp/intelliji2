import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PlayClass {
    //멤버 변수
    private Scanner sc;
    public PlayClass(){
        sc=new Scanner(System.in);
    } //파라미터가 없는 생성자
    //public PlayClass (String name){} // 파라미터가 있는 생성자

    public int play1(String name){ // < 입력받는것처럼 받아올수있다. 매개변수
        System.out.println(name + "으로 이름이 설정되었습니다.");
        System.out.println("1.싸운다 2.도망간다");
        System.out.print("입력:");
        return sc.nextInt();
    }
    public int play2(int num){
        int ret=0;
        if(num==1){
            System.out.println("싸우자");
            System.out.println("1.공격  2.아이템 사용 3. 방어");
            System.out.print("입력 :");
            ret =sc.nextInt();
        }else if(num==2){
            //2번 도망간다
            System.out.println();

        }else{
            System.out.println();
        }
        return ret;
    }

    public void play3(int num , ArrayList<ItemClass> list){
        if(num ==1){
            System.out.println("그냥 공격");
        }else if(num==2){
            System.out.println("아이템 사용");
            //랜덤으로 아이템 사용하기. 내가설정한 아이템
            Random rnd=new Random();
            int rnum=rnd.nextInt(list.size());
            System.out.println("아이템의 속성은:"+list.get(rnum).getAtt());
            System.out.println(list.get(rnum).getName()+"아이템을 사용했습니다."); //list.get 리스트를 가져온고 list.get(rnum)은 주소값이므로 .getName()붙이면 아이템 이름 가벼옴.
        }
    }
}
