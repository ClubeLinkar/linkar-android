package br.com.clubelinkar.android.models;

/**
 * Created by Tushar Saha on 12/11/15.
 * Audacity IT Solutions Ltd.
 */
public class Member {
    private String memberName;
    private String memberDesignation;
    private String imageId;

    public Member(String memberName, String memberDesignation, String imageId) {
        this.memberName = memberName;
        this.memberDesignation = memberDesignation;
        this.imageId = imageId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberDesignation() {
        return memberDesignation;
    }

    public void setMemberDesignation(String memberDesignation) {
        this.memberDesignation = memberDesignation;
    }

    public String getMemberImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
}
