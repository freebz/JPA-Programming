// 예제 10.117 순서 기반 파라미터 호출

StoredProcedureQuery spq =
    em.createStoredProcedureQuery("proc_multiply");
spq.registerStoredProcedureParameter(1, Integer.class,
    ParameterMode.IN);
spq.registerStoredProcedureParameter(2, Integer.class,
    ParameterMode.OUT);

spq.setParameter(1,100);
spq.execute();

Integer out = (Integer)spq.getOutputParameterValue(2);
System.out.println("out = " + out); //결과 = 200
