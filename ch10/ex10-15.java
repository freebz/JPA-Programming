// 예제 10.15 NEW 명령어 사용 전

List<Object[]> resultList =
  em.createQuery("SELECT m.username, m.age, m.age FROM Member m")
    .getResultList();

//객체 변환 작업
List<UserDTO> userDTOs = new ArrayList<UserDTO>();
for (Object[] row : resultList) {
    UserDTO userDTO = new UserDTO((String)row[0], (Integer)row[1]);
    userDTOs.add(userDTO);
}
return userDTOs;
