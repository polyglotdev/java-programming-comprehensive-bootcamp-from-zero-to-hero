package com.domhallan;

import com.domhallan.hero.Hero;

import java.util.List;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    Hero ironMan =
        new Hero();
    ironMan.setName("Anthony Edward \"Tony\" Stark");
    ironMan.setCurrentAlias("Iron Man");
    List<String> aliases = List.of("Black King", "Mark One",
        "International Iron Man", "Superior Iron Man");
    ironMan.setAliases(aliases);
    List<String> affiliations = List.of("Avengers", "Hellfire Club"
        , "Space Friends", "Darkhold Defiled", "A.I. Army", "S.H.I.E.L.D",
        "Guardians of the Galaxy", "Mighty Avengers");
    ironMan.setAffiliations(affiliations);
    Map<String, Object> physicalCharacteristics = Map.of("Gender",
        "Male", "Height", "6'1", "Weight", 225, "Eyes", "Blue",
        "Hair", "Black");
    ironMan.setPhysicalCharacteristics(physicalCharacteristics);
    Map<String, Object> originAndLivingStatus = Map.of("Origin",
        "Human", "Living Status", "Alive", "Reality", "Earth-616",
        "Place of Birth", "Sofia, Bulgaria");
    ironMan.setOriginAndLivingStatus(originAndLivingStatus);
    Map<String, Object> personalInformation = Map.of("Identity",
        "Public", "Citizenship", "Dual American and Bulgarian",
        "Occupation", "Engineer", "Education", "MIT(Massachusetts " +
                                               "Institute of " +
                                               "Technology)");
    ironMan.setPersonalInformation(personalInformation);
    List<String> creators = List.of("Stan Lee", "Larry Lieber",
        "Don Heck", "Jack Kirby");
    ironMan.setCreators(creators);
    System.out.println(ironMan.toString());
  }
}
