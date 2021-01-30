package Templates;

public class CorgiFunctionTemplateParameter {

    String parameterName;
    String dataType;

    public CorgiFunctionTemplateParameter() {

    }

    public CorgiFunctionTemplateParameter(String parameterName, String dataType) {
        this.parameterName = parameterName;
        this.dataType = dataType;
    }

    public String getParameterName() {
        return parameterName;
    }

    public CorgiFunctionTemplateParameter setParameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    public String getDataType() {
        return dataType;
    }

    public CorgiFunctionTemplateParameter setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }


    @Override
    public String toString() {
        return dataType + " " + parameterName;
    }
}
