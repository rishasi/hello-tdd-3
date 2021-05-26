package io.rishabh.app.calculator2;

public abstract class Command {
    abstract boolean appliesTo(String operation);
    abstract String execute(String[] values);
}
