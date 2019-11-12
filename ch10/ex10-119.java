// 예제 10.119 파라미터에 이름 사용

StoredProcedureQuery spq =
    em.createStoredProcedureQuery("proc_multiply");
spq.registerStoredProcedureParameter("inParam", Integer.class,
    ParameterMode.IN);
spq.registerStoredProcedureParameter("outParam", Integer.class,
    ParameterMode.OUT);

spq.setParameter("inParam",100);
spq.execute();

Integer out = (Integer)spq.getOutputParameterValue("outParam");
System.out.println("out = " + out); //결과 = 200
