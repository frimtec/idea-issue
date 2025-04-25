package com.github.frimtec.ideaissue;

public class IdeaIssue {
    public static void main(String[] args) {
        // the jpms error is not correct on this branch, as jpms is not activated
        System.out.println(java.sql.Types.class.getCanonicalName());
    }
}
