package Templates;

import java.util.ArrayList;

public class CorgiFunctionTemplate {

    String methodName;
    String returnType;
    boolean isPublic;
    ArrayList<CorgiFunctionTemplateParameter> parameters;

    public CorgiFunctionTemplate() {
        this.parameters = new ArrayList<>();
    }

    private String getMethodName() {
        return this.methodName;
    }

    public CorgiFunctionTemplate setMethodName(String methodName) {
        this.methodName = methodName;
        return this;
    }

    public CorgiFunctionTemplate setReturnType(String returnType) {
        this.returnType = returnType;
        return this;
    }

    public CorgiFunctionTemplate setIsPublic(boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    public CorgiFunctionTemplate addParameter(CorgiFunctionTemplateParameter parameter) {
        this.parameters.add(parameter);
        return this;
    }

    public boolean hasParameter(CorgiFunctionTemplateParameter parameter) {
        for (CorgiFunctionTemplateParameter param : parameters) {
            if (param.getParameterName().equals(parameter.getParameterName())) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        String method = "\t" + (isPublic ? "public " : "private ") + returnType + " " + methodName + "(";

        for (int i = 0; i < parameters.size() - 1; i++) {
            method += parameters.get(i).toString() + ", ";
        }

        if (parameters.size() > 0) {
            method += parameters.get(parameters.size() - 1).toString();
        }

        method += "):\n\t\t" +
                "// Code goes here";

        method += "\n\tend";


        return method;
    }
}