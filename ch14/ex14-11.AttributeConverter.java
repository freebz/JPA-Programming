// 예제 14.11 AttributeConverter

public interface AttributeConverter<X,Y> {

    public Y convertToDatabaseColumn (X attribute);
    public X convertToEntityAttribute (Y dbData);
}
