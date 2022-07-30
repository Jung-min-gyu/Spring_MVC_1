package hello.springmvc.basic;

import lombok.Data;

@Data //@Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredArgsConstructor를 합친 에너테이션
public class HelloData {
    private String username;
    private int age;
}
