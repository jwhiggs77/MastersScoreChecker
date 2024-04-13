package org.higgs.model.service;

public class TeamService {
    public static int[] getTeamPlayerIds(String teamName) {
        switch (teamName) {
            case "jim":
                return new int[] { 46046, 36689, 45486, 47483 };
            case "josh":
                return new int[] { 46046, 35450, 36689, 45486 };
            default:
                return null;
        }
    }
}
