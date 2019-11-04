// 예제 7.21 기본 부모 엔티티(BaseEntity)

package jpabook.model.entity;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {

    private Date createdDate;       //등록일
    private Date lastModifiedDate;  //수정일

    //Getter, Setter
    ...
}
