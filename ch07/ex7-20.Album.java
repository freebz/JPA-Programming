// 예제 7.20 자식 엔티티 매핑

//Album.java
package jpabook.model.entity.item;

import javax.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("A")
public class Album extends Item {

    private String artist;
    private String etc;
    ...
}

//Book.java
package jpabook.model.entity.item;

@Entity
@DiscriminatorValue("B")
public class Book extends Item {

    private String author;
    private String isbn;
    ...
}

//Movie.java
package jpabook.model.entity.item;

@Entity
@DiscriminatorValue("M")
public class Movie extends Item {

    private String director;
    private String actor;
    ...
}
