package com.yokai.showdown.yokai;

import java.util.Set;
import com.google.gson.annotations.SerializedName;

public class Ability {
        private String id;
        @SerializedName("type")
        private Type validType;
        private String name;
        private Element element;
        private Set<TargetSide> validTargetSide;
        private Set<TargetCount> validTargetCount;
        private int power;

        public Ability(
                String id,
                Type validType,
                String name,
                Element element,
                Set<TargetSide> validTargetSide,
                Set<TargetCount> validTargetCount,
                int power) {
                        this.id = id;
                        this.validType = validType;
                        this.name = name;
                        this.element = element;
                        this.validTargetSide = validTargetSide;
                        this.validTargetCount = validTargetCount;
                        this.power = power;
        }

        public String getId() {
                return this.id;
        }

        public void setId(String id) {
                this.id = id;
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
        
        public Type  getValidType() {
                return this.validType;
        }

        public void setValidType(Type validType) {
                this.validType = validType;
        }

        public Set<TargetSide> getValidTargetSide() {
                return this.validTargetSide;
        }

        public void setValidTargetSide(Set<TargetSide> validTargetSide) {
                this.validTargetSide = validTargetSide;
        }

        public Set<TargetCount> getValidTargetCount() {
                return this.validTargetCount;
        }

        public void setValidTargetCount(Set<TargetCount> validTargetCount) {
                this.validTargetCount = validTargetCount;
        }

        public int getPower() {
                return this.power;
        }

        public void setPower(int power) {
                this.power = power;
        }

        @Override
        public String toString() {
                return "[id=" + id + ", validType=" + validType + ", name=" + name + ", element=" + element
                                + ", validTargetSide=" + validTargetSide + ", validTargetCount=" + validTargetCount
                                + ", power=" + power + "]";
        }

        
}

