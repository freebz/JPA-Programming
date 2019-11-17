// 예제 11.19 상품 - 음반 엔티티

package jpabook.jpashop.domain.item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Album extends Item {

    private String artist;
    private String etc;

    //Getter, Setter
    ...
}
