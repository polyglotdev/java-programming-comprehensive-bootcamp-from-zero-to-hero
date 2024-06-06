package com.domhallan.hero;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hero {
  protected String name;
  protected String currentAlias;
  protected List<String> aliases;
  protected List<String> affiliations;
  protected Map<String, Object> physicalCharacteristics;
  protected Map<String, Object> originAndLivingStatus;
  protected Map<String, Object> personalInformation;
  protected List<String> creators;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCurrentAlias() {
    return currentAlias;
  }

  public void setCurrentAlias(String currentAlias) {
    this.currentAlias = currentAlias;
  }

  public List<String> getAffiliations() {
    return affiliations;
  }

  public void setAffiliations(List<String> affiliations) {
    this.affiliations = affiliations;
  }

  public Map<String, Object> getPhysicalCharacteristics() {
    return physicalCharacteristics;
  }

  public void setPhysicalCharacteristics(Map<String, Object> physicalCharacteristics) {
    this.physicalCharacteristics = physicalCharacteristics;
  }

  public Map<String, Object> getOriginAndLivingStatus() {
    return originAndLivingStatus;
  }

  public void setOriginAndLivingStatus(Map<String, Object> originAndLivingStatus) {
    this.originAndLivingStatus = originAndLivingStatus;
  }

  public Map<String, Object> getPersonalInformation() {
    return personalInformation;
  }

  public void setPersonalInformation(Map<String, Object> personalInformation) {
    this.personalInformation = personalInformation;
  }

  public List<String> getCreators() {
    return creators;
  }

  public void setCreators(List<String> creators) {
    this.creators = creators;
  }

  public List<String> getAliases() {
    return aliases;
  }

  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }


  public Hero() {

  }

  @Override
  public String toString() {
    String affString = String.join(", ", affiliations);
    String aliString = String.join(", ", aliases);
    String creString = String.join(", ", creators);
    String phyString = physicalCharacteristics.entrySet()
        .stream()
        .map(e -> e.getKey() + ": " + e.getValue().toString())
        .collect(Collectors.joining(", "));
    // Similarly for the other Map fields.

    return """
           Name: %s
           Current Alias: %s
           Affiliations: %s
           Aliases: %s
           Physical Characteristics: %s
           Origin and Living Status: %s
           Personal Information: %s
           Creators: %s
           """.formatted(name, currentAlias, affString, aliString,
        phyString, originAndLivingStatus,
        personalInformation, creString);
  }
}
