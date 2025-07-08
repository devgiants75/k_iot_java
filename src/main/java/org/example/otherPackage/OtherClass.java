package org.example.otherPackage;

// 부모 클래스
public class OtherClass {
    protected String otherField = "다른 패키지의 필드(protected)";

    protected void otherMethod() {
        System.out.println("다른 패키지의 메서드(protected)");
    }

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        System.out.println(publicClass.publicField);
        publicClass.publicMethod();
        // 어디서든지 접근 가능한 필드
        // 어디서든지 접근 가능한 메서드
    }
}
