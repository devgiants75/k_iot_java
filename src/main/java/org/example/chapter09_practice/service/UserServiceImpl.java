package org.example.chapter09_practice.service;

import org.example.chapter09_practice.exception.UserNotFoundException;
import org.example.chapter09_practice.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {

    // 사용자 배열 생성 - ArrayList
    private final List<User> userList = new ArrayList<>();

    // cf) CRUD
    // : 개발에서 데이터(model) 처리의 기본적인 4가지 기능을 나타냄
    // C(Create): 데이터 생성 (EX. 회원가입)
    // R(Read): 데이터 조회 (EX. 게시글 목록 보기)
    // U(Update): 데이터 수정 (EX. 내 정보 수정)
    // D(Delete): 데이터 삭제 (EX. 게시글 삭제)

    @Override
    public void addUser(User user) {
        userList.add(user);
    }

    @Override
    public User getUserById(int id) {
        // 사용자 리스트를 순회하여 해당 id와 일치하는 사용자가 있는 경우 반환
        // +) 해당 id의 사용자가 없는 경우 UserNotFoundException 발생

        for (User user: userList) {
            // 순회하고 있는 사용자와 메서드 매개변수의 id가 일치하면 해당 사용자를 반환
            // : for문 내에서 return 키워드를 만나지 않고 전체 순회가 끝나면 예외 발생
            if (user.getId() == id) {
                return user;
            }
        }

        throw new UserNotFoundException("사용자 ID에 " + id + "값이 없습니다.");
    }

    @Override
    public List<User> getAllUsers() {
//        return userList;
        return new ArrayList<>(userList); // 방어적 복사

        // cf) 방어적 복사
        // : 객체(배열, 클래스타입)의 내부 상태를 외부에 노출하지 않고 보호하기 위한 프로그래밍 기법
        // - 원본 ArrayList 객체의 요소를 복사하여 새로운 리스트(주소값)를 생성
    }

    @Override
    public void updateUserEmail(int id, String newEmail) {
        // 사용자 특정 id 값으로 사용자 정보 반환 || 예외 발생
        User user = getUserById(id);
        user.setEmail(newEmail);
    }
}
