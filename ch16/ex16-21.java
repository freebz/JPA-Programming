// 예제 16.21 쿼리 캐시 적용

em.createQuery("select i from Item i", Item.class)
    .setHint("org.hibernate.cacheable", true)
    .getResultList();
