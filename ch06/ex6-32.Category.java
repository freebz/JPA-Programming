// 예제 6.32 카테고리(Category)

package jpabook.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {

    @Id @GeneragedValue
    @Column(name = "CATEGORY_ID")
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "CATEGORY_ITEM",
         joinColumns = @JoinColumn(name = "CATEGORY_ID"),
	 inverseJoinColumns = @JoinColumn(name = "ITEM_ID"))
    private List<Item> items = new ArrayList<Item>();

    //카테고리의 계층 구조를 위한 필드들
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Category parent;

    @OneToMany(mapped = "parent")
    private List<Category> child = new ArrayList<Category>();

    //==연관관계 메소드==//
    public void addChildCategory(Category child) {
	this.child.add(child);
	child.setParent(this);
    }

    public void addItem(Item item) {
	items.add(item);
    }

    //Getter, Setter
    ...
}
