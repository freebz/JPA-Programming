// 예제 10.120 Named 스토어드 프로시저 어노테이션 정의하기

@NamedStoredProcedureQuery(
    name = "multiply",
    procedureName = "proc_multiply",
    parameters = {
	@StoredProcedureParameter(name = "inParam", mode =
	    ParameterMode.IN, type = Integer.class),
	@StoredProcedureParameter(name = "outParam", mode =
	ParameterMode.OUT, type = Integer.class)
    }
)
@Entity
public class Member { ... }
