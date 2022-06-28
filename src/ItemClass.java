public class ItemClass {
    private String name; //아이템 이름
    private String att; //아이템 속성

    //변수의 값을 다루기 위한 메소드
    public void setName(String name){
        this.name=name; // 위의 name에서 내자신을 가져온다.
    }
    public void setAtt(String att){
        this.att=att;
    }
    public String getName(){
        return name;
    }
    public String getAtt(){
        return att;
    }
}
