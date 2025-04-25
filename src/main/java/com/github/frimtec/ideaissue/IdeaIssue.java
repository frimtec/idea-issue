package com.github.frimtec.ideaissue;

public class IdeaIssue {
    public static void main(String[] args) {
        // the jpms error is correct on this branch
        System.out.println(java.sql.Types.class.getCanonicalName());
    }
}
