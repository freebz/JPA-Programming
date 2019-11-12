// 예제 10.17 NEW 명령어 사용 후

TypedQuery<UserDTO> query =
    em.createQuery("SELECT new jpabook.jpql.UserDTO(m.username, m.age) FROM Member m", UserDTO.class);

List<UserDTO> resultList = query.getResultList();
