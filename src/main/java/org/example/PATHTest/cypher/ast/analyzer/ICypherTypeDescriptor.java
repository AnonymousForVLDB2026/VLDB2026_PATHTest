package org.example.PATHTest.cypher.ast.analyzer;

import org.example.PATHTest.cypher.ast.ICypherType;

public interface ICypherTypeDescriptor {
    ICypherType getType();
    boolean isBasicType();
    boolean isNodeOrRelation();
    boolean isNode();
    boolean isRelation();
    boolean isList();
    boolean isMap();
    IListDescriptor getListDescriptor();
    IMapDescriptor getMapDescriptor();
    INodeAnalyzer getNodeAnalyzer();
    IRelationAnalyzer getRelationAnalyzer();
}
