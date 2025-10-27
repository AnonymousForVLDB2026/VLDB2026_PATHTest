package org.example.PATHTest.tuGraph.gen;

import org.example.PATHTest.cypher.gen.CypherSchemaGenerator;
import org.example.PATHTest.cypher.schema.CypherSchema;
import org.example.PATHTest.tuGraph.TuGraphGlobalState;
import org.example.PATHTest.tuGraph.TuGraphSchema;

import java.util.ArrayList;
import java.util.List;

public class TuGraphSchemaGenerator extends CypherSchemaGenerator<TuGraphSchema, TuGraphGlobalState> {
    public TuGraphSchemaGenerator(TuGraphGlobalState globalState){
        super(globalState);
    }

    @Override
    public TuGraphSchema generateSchemaObject(TuGraphGlobalState globalState, List<CypherSchema.CypherLabelInfo> labels, List<CypherSchema.CypherRelationTypeInfo> relationTypes, List<CypherSchema.CypherPatternInfo> patternInfos) {
        return new TuGraphSchema(new ArrayList<>(), labels, relationTypes, patternInfos);
    }
}
