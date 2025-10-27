package org.example.PATHTest.cypher.gen;

import org.example.PATHTest.cypher.ast.ILabel;
import org.example.PATHTest.cypher.schema.ILabelInfo;
import org.example.PATHTest.cypher.standard_ast.Label;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AbstractNode {
    private List<ILabelInfo> labelInfos = new ArrayList<>();
    private int id;
    private Map<ILabelInfo, Map<String, Object>> labelProperties = new HashMap<>();
    private Map<String, Object> properties = new HashMap<>();

    private List<AbstractRelationship> relationships = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }

    public List<ILabelInfo> getLabelInfos() {
        return labelInfos;
    }

    public List<ILabel> getLabels(){
        return new ArrayList<>(labelInfos.stream().map(l->new Label(l.getName())).collect(Collectors.toList()));
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public void setLabelInfos(List<ILabelInfo> labelInfos) {
        this.labelInfos = labelInfos;
    }

    public void addRelationship(AbstractRelationship relationship){
        this.relationships.add(relationship);
    }

    public List<AbstractRelationship> getRelationships(){
        return relationships;
    }

    public void setLabelProperties(ILabelInfo labelInfo, Map<String, Object> properties){
        this.labelProperties.put(labelInfo, properties);
    }

    public Map<String, Object> getLabelProperties(ILabelInfo labelInfo){
        return labelProperties.get(labelInfo);
    }
}
