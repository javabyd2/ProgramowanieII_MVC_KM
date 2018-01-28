package com.sdabyd2.programowanie.model;

public enum Health {

        HEALTHY("healthy"), NOHEALTHY("nohealthy"), DEAD("dead");

        private String title;
        Health(String title){
            this.title = title;
        }

    @Override
    public String toString() {
        return "Health{" +
                "title='" + title + '\'' +
                '}';
    }
}
