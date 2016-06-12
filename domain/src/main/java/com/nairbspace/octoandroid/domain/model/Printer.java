package com.nairbspace.octoandroid.domain.model;

import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Printer {
    @Nullable public abstract Long id();
    public abstract String name();
    public abstract String apiKey();
    public abstract String scheme();
    public abstract String host();
    public abstract int port();
    public abstract String websocketPath();
    public abstract String webcamPathQuery();
    public abstract String uploadLocation();
    public static Builder builder() {
        return new AutoValue_Printer.Builder();
    }

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder id(Long id);
        public abstract Builder name(String name);
        public abstract Builder apiKey(String apiKey);
        public abstract Builder scheme(String scheme);
        public abstract Builder host(String host);
        public abstract Builder port(int port);
        public abstract Builder websocketPath(String websocketPath);
        public abstract Builder webcamPathQuery(String webcamPathQuery);
        public abstract Builder uploadLocation(String uploadLocation);
        public abstract Printer build();
    }
}
