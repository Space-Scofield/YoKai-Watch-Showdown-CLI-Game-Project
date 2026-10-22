package com.yokai.showdown.yokai;

import java.util.EnumSet;

public class Ability {
        private int id;
        private String type;
        private String name;
        private Element element;
        private EnumSet<TargetSide> validTargets;
        private TargetCount targetCount;
        private int power;

        public Ability(int id, String type, String name, Element element,
               EnumSet<TargetSide> validTargets, TargetCount targetCount,
               int power) {
                this.id = id;
                this.type = type;
                this.name = name;
                this.element = element;
                this.validTargets = validTargets;
                this.targetCount = targetCount;
                this.power = power;
        }

        public int getId() {
                return this.id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getType() {
                return this.type;
        }

        public void setType(String type) {
                this.type = type;
        }

        public String getName() {
                return this.name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Element getElement() {
                return this.element;
        }

        public void setElement(Element element) {
                this.element = element;
        }

        public EnumSet<TargetSide> getValidTargets() {
                return this.validTargets;
        }

        public void setValidTargets(EnumSet<TargetSide> validTargets) {
                this.validTargets = validTargets;
        }

        public TargetCount getTargetCount() {
                return this.targetCount;
        }

        public void setTargetCount(TargetCount targetCount) {
                this.targetCount = targetCount;
        }

        public int getPower() {
                return this.power;
        }

        public void setPower(int power) {
                this.power = power;
        }
    
}
