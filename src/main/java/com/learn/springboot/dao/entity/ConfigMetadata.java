package com.learn.springboot.dao.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author linjicong
 * @date 2022-03-18 15:38
 */
@Data
public class ConfigMetadata {
    private List<Groups> groups;
    private List<Properties> properties;
    private List<Hints> hints;

    @Data
    public static class Groups {
        private String name;
        private String type;
        private String sourceType;
    }

    @Data
    @NoArgsConstructor
    public static class Properties {
        private String name;
        private String type;
        private String sourceType;
        private String description;
        private Object defaultValue;
        private Boolean deprecated;
        private Deprecation deprecation;
        @Data
        public static class Deprecation {
            private String level;
            private String replacement;
            private String reason;
        }
    }
    @Data
    public static class Hints {
        private String name;
        private List<Providers> providers;
        private List<Values> values;
        @Data
        static class Providers {
            private String name;
            private Parameters parameters;
            @Data
            static class Parameters {
                private String target;

            }
        }
        @Data
        public static class Values {
            private String value;
        }
    }

}

