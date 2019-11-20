// 예제 14.13 컨버터 글로벌 설정

@Converter(autoApply = true)
public class BooleanToYNConverter implements
    AttributeConverter<Boolean, String> {

    @Override
    public String convertToDatabaseColumn(Boolean attribute) {
	return (attribute != null && attribute) ? "Y" : "N";
    }

    @Override
    public Boolean convertToEntityAttribute(String dbData) {
	return "Y".equals(dbData);
    }
}
