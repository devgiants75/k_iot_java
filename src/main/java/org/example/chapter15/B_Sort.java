package org.example.chapter15;

/*
* 1. 불변성 데이터: Stream API 정렬 사용
*   목적) 원본 리스트 변경 X, 정렬된 새로운 리스트만 필요 시
*   EX) 클라이언트 응답용 DTO 리스트 정렬
*
* */

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@AllArgsConstructor
class Product {
    private int price;
}

class ProductRepository {
    List<Product> findAll() {
        return new ArrayList<>(List.of(
                new Product(15),
                new Product(10),
                new Product(20),
                new Product(21),
                new Product(9)
        ));
    }
}

// 제품과 관련된 비즈니스 로직을 수행하는 클래스
// CRUD + 필터링/통계
// : 가격 기준으로 정렬 조회
class ProductService {
    ProductRepository productRepository = new ProductRepository();

    // 생성
    void createProduct() {}
    // 수정
    void updateProduct() {}
    // 가격 기준으로 정렬된 새로운 리스트 반환 (원본 products는 변경되지 않음)
    List<Product> getProductsSortedByPrice() {
        List<Product> products = productRepository.findAll();

        // stream().sorted()는 중간 연산
        // : 원본을 그대로 두고, 가공된 결과를 생성
        // - 불변 데이터 처리에 유리, 클린 코드 작성에도 적합
        return products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());
    }
}

public class B_Sort {
    public static void main(String[] args) {

    }
}
