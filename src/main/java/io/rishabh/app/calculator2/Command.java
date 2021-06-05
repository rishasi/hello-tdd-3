package io.rishabh.app.calculator2;

interface Command {
    abstract boolean appliesTo(String operation);
    abstract String execute(String[] values);
}
