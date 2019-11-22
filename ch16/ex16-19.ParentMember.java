// 예제 16.19 캐시 적용 코드

import javax.persistence.Cacheable;
import org.hibernate.annotations.Cache;

@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Entity
public class ParentMember {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @OneToMany(mappedBy = "parentMember", cascade = CascadeType.ALL)
    private List<ChildMember> childMembers =
	new ArrayList<ChildMember>();
    ...
}
