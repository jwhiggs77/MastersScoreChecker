package org.higgs.model;

import java.util.ArrayList;
import java.util.List;

public class PlayerData {
    private String playerid;
    private List<Object> round = new ArrayList<>();
    private List<Hole> progress = new ArrayList<>();

    public String getPlayerid() {
        return playerid;
    }

    public List<Object> getRound() {
        return round;
    }

    public List<Hole> getProgress() {
        return progress;
    }

    public class Hole {
        private String round;
        private int hole;
        private int score;
        private String today;
        private String thru;
        private String total;
        private String shotsOffLead;
        private String startEpoch;
        private String epoch;
        private int par;
        private float leader_id;
        private String leader_score;
        private String position;
        private String positionAfter;


        // Getter Methods

        public String getRound() {
            return round;
        }

        public int getHole() {
            return hole;
        }

        public int getScore() {
            return score;
        }

        public String getToday() {
            return today;
        }

        public String getThru() {
            return thru;
        }

        public String getTotal() {
            return total;
        }

        public String getShotsOffLead() {
            return shotsOffLead;
        }

        public String getStartEpoch() {
            return startEpoch;
        }

        public String getEpoch() {
            return epoch;
        }

        public int getPar() {
            return par;
        }

        public float getLeader_id() {
            return leader_id;
        }

        public String getLeader_score() {
            return leader_score;
        }

        public String getPosition() {
            return position;
        }

        public String getPositionAfter() {
            return positionAfter;
        }

        // Setter Methods

        public void setRound(String round) {
            this.round = round;
        }

        public void setHole(int hole) {
            this.hole = hole;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public void setToday(String today) {
            this.today = today;
        }

        public void setThru(String thru) {
            this.thru = thru;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public void setShotsOffLead(String shotsOffLead) {
            this.shotsOffLead = shotsOffLead;
        }

        public void setStartEpoch(String startEpoch) {
            this.startEpoch = startEpoch;
        }

        public void setEpoch(String epoch) {
            this.epoch = epoch;
        }

        public void setPar(int par) {
            this.par = par;
        }

        public void setLeader_id(float leader_id) {
            this.leader_id = leader_id;
        }

        public void setLeader_score(String leader_score) {
            this.leader_score = leader_score;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public void setPositionAfter(String positionAfter) {
            this.positionAfter = positionAfter;
        }

        public int getHoleScore() {
            return score - par;
        }
    }
}