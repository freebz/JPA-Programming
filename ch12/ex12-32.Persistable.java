// 예제 12.32 Persistable

package org.springframework.data.domain;

public interface Persistable<ID extends Serializable> extneds Serializable {
    ID getId();
    boolean isNew();
}
