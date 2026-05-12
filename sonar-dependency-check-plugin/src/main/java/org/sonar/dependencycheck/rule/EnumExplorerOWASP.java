package org.sonar.dependencycheck.rule;
import org.sonar.api.server.rule.RulesDefinition.OwaspTop10;
public class EnumExplorerOWASP {
    public static void main(String[] args) {
        for (OwaspTop10 v : OwaspTop10.values()) {
            System.out.println(v.name());
        }
    }
}