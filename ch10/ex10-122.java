// 예제 10.122 Named 스토어드 프로시저 사용

StoredProcedureQuery spq =
    em.createNamedStoredProcedureQuery("multiply");

spq.setParameter("inParam", 100);
spq.execute();

Integer out = (Integer) spq.getOutputParameterValue("outParam");
System.out.println("out = " + out);
