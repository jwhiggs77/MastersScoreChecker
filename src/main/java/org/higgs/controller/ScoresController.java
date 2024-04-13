package org.higgs.controller;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import org.higgs.MathUtility;
import org.higgs.model.GetScoreRequest;
import org.higgs.model.PlayerData;
import org.higgs.model.service.PlayerService;
import org.higgs.model.service.TeamService;

import java.io.IOException;
import java.util.List;

public class ScoresController {
    public String getScore(GetScoreRequest request, Context context) {
        int scrambleScore = 0;

        try {
            System.out.println(request.teamName);
            int[] playerIds = TeamService.getTeamPlayerIds(request.teamName);
            List<PlayerData.Hole> progress0 = PlayerService.getProgress(playerIds[0]);
            List<PlayerData.Hole> progress1 = PlayerService.getProgress(playerIds[1]);
            List<PlayerData.Hole> progress2 = PlayerService.getProgress(playerIds[2]);
            List<PlayerData.Hole> progress3 = PlayerService.getProgress(playerIds[3]);
            int len = MathUtility.getMax(progress0.size(), progress1.size(), progress2.size(), progress3.size());

            for (int i = 0; i < len; i++) {
                PlayerData.Hole holeData = progress0.get(i);
                int firstPlayerScore = progress0.get(i).getHoleScore();
                int secondPlayerScore = progress1.get(i).getHoleScore();
                int thirdPlayerScore = progress2.get(i).getHoleScore();
                int fourthPlayerScore = progress3.get(i).getHoleScore();

                int bestScore = MathUtility.getBestScore(firstPlayerScore, secondPlayerScore, thirdPlayerScore, fourthPlayerScore);
                scrambleScore += bestScore;
            }
        } catch (Exception e) {
            LambdaLogger logger = context.getLogger();
            logger.log(e.toString());
        }

        return "Current Score: " + scrambleScore;
    }

    public String GetHoleByHole(GetScoreRequest request, Context context) {
        String scrambleScore = "";

        try {
            System.out.println(request.teamName);
            int[] playerIds = TeamService.getTeamPlayerIds(request.teamName);
            List<PlayerData.Hole> progress0 = PlayerService.getProgress(playerIds[0]);
            List<PlayerData.Hole> progress1 = PlayerService.getProgress(playerIds[1]);
            List<PlayerData.Hole> progress2 = PlayerService.getProgress(playerIds[2]);
            List<PlayerData.Hole> progress3 = PlayerService.getProgress(playerIds[3]);
            int len = MathUtility.getMax(progress0.size(), progress1.size(), progress2.size(), progress3.size());

            for (int i = 0; i < len; i++) {
                PlayerData.Hole holeData = progress0.get(i);
                int firstPlayerScore = progress0.get(i).getHoleScore();
                int secondPlayerScore = progress1.get(i).getHoleScore();
                int thirdPlayerScore = progress2.get(i).getHoleScore();
                int fourthPlayerScore = progress3.get(i).getHoleScore();

                int bestScore = MathUtility.getBestScore(firstPlayerScore, secondPlayerScore, thirdPlayerScore, fourthPlayerScore);
                scrambleScore += bestScore;
            }
        } catch (Exception e) {
            LambdaLogger logger = context.getLogger();
            logger.log(e.toString());
        }

        return "Current Score: " + scrambleScore;
    }
}
