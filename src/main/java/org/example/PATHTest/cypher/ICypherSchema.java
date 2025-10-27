package org.example.PATHTest.cypher;

import org.example.PATHTest.cypher.ast.ILabel;
import org.example.PATHTest.cypher.ast.IType;
import org.example.PATHTest.cypher.schema.IFunctionInfo;
import org.example.PATHTest.cypher.schema.ILabelInfo;
import org.example.PATHTest.cypher.schema.IRelationTypeInfo;

import java.util.List;

public interface ICypherSchema {
    boolean containsLabel(ILabel label);
    ILabelInfo getLabelInfo(ILabel label);
    boolean containsRelationType(IType relation);
    IRelationTypeInfo getRelationInfo(IType relation);
    List<IFunctionInfo> getFunctions();

    List<ILabelInfo> getLabelInfos();
    List<IRelationTypeInfo> getRelationshipTypeInfos();
}
