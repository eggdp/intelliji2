import java.util.Scanner;
public class HelloClass {
    public static void main(String[] args) {
        String name;
        String stone;
        int num1,num2;
        int hp=100;
        System.out.println("게임시작!");
        //안녕 자바야를 내가 입력하게 바꾸자.
        //캐릭터 이름 설정
        System.out.print("캐릭터 이름 설정:");
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        System.out.println(name);
        //도라에몽 여행을 떠난다.
        //여행중 퉁퉁이를 만난다.

        System.out.println(name+"여행을 떠난다." +"여행중 퉁퉁이를 만난다. 퉁퉁이 체력:"+hp);

        //1. 싸운다 2. 도망간다.

        System.out.print("1.싸운다. , 2.도망간다. 선택하기 :");
        Scanner s1=new Scanner(System.in);
        num1=s1.nextInt();
        if(num1==1){
            System.out.println("싸운다");
            System.out.println("1.공격 1회:-5hp 2.아이템(총) -50hp 3.방어 +50hp");
            Scanner s2=new Scanner(System.in);
            num2=s2.nextInt();
            if(num2==1){
                hp-=5;
                System.out.println("퉁퉁이를 10번 공격합니다. 퉁퉁이 체력:"+hp);
            }else if(num2==2){
                System.out.println("아이템 메뉴 출력 아이템 으로 공격");
            }else if(num2==3){
                System.out.println("방어를하고 퉁퉁이가 나를 공격한다.");
            }else{
                System.out.println("맞아 죽었다.");
            }
        }else if(num1==2){
            System.out.println("도망간다.");
        }else{
            System.out.println("1,2에서 선택해주세요. 다시시작.");
        }

        //1번이면
        //1. 10번 공격 2.아이템 사용 3방어
        //만약에 1번이면 10번을 공격을한다.
        //만약에 2번이면 아이템 메뉴가 출력이 되고 선택한 아이템으로 공격
        //3번이면 방어를하고 퉁퉁이가 나를 공격한다.
        //
    }
}
