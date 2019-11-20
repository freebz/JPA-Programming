// 예제 14.18 기타 어노테이션 적용 코드

@Entity
@EntityListeners(DuckListener.class)
@ExcludeDefaultListeners
@ExcludeSuperclassListeners
public class Duck extends BaseEntity {
    ...
}
