package org.example.PATHTest.cypher.schema;

import org.example.PATHTest.cypher.ast.IExpression;
import org.example.PATHTest.cypher.ast.analyzer.ICypherTypeDescriptor;
import org.example.PATHTest.cypher.standard_ast.CypherType;

import java.util.List;

public interface IFunctionInfo {
    String getName();
    String getSignature();
    List<IParamInfo> getParams();
    CypherType getExpectedReturnType();
    ICypherTypeDescriptor calculateReturnType(List<IExpression> params);
}
