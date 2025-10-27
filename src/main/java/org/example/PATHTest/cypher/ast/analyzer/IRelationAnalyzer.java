package org.example.PATHTest.cypher.ast.analyzer;

import org.example.PATHTest.cypher.ICypherSchema;
import org.example.PATHTest.cypher.ast.ICypherType;
import org.example.PATHTest.cypher.ast.IProperty;
import org.example.PATHTest.cypher.ast.IRelationIdentifier;
import org.example.PATHTest.cypher.ast.IType;
import org.example.PATHTest.cypher.schema.IPropertyInfo;

import java.util.List;

public interface IRelationAnalyzer extends IRelationIdentifier, IIdentifierAnalyzer {
    @Override
    IRelationIdentifier getSource();
    @Override
    IRelationAnalyzer getFormerDef();
    void setFormerDef(IRelationAnalyzer formerDef);

    /**
     * 从该处定义回溯，所有对该节点的定义中出现的RelationType
     * @return
     */
    List<IType> getAllRelationTypesInDefChain();

    /**
     * 从该处回溯，所有对该节点的定义中出现的property
     * @return
     */
    List<IProperty> getAllPropertiesInDefChain();
    List<IPropertyInfo> getAllPropertiesAvailable(ICypherSchema schema);
    List<IPropertyInfo> getAllPropertiesWithType(ICypherSchema schema, ICypherType type);

    boolean isSingleRelation();
}
