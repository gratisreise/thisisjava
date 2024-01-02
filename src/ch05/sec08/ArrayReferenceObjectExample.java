package ch05.sec08;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java"; // 메모리 위에 올려진 "Java"를 참조
        strArray[2] = new String("Java"); //새로생성 불변객체의 특성

        System.out.println( strArray[0] == strArray[1] );		//true: 같은 객체 참조
        System.out.println( strArray[0] == strArray[2] );    	//false: 다른 객체를 참조
        System.out.println( strArray[0].equals(strArray[2]) );	//true: 문자열이 동일
    }
}
