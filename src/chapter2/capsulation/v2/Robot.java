package chapter2.capsulation.v2;

public class Robot {
    private boolean leftLeg;
    private boolean rightLeg;

    private boolean leftArm;
    private boolean rightArm;

    // 무분별한 세터
//    public void setLeftLeg(boolean leftLeg){
//        this.leftLeg = leftLeg;
//    }
//
//    public void setRightLeg(boolean RightLeg){
//        this.rightLeg = rightLeg;
//    }
//    public void setLeftArm(boolean leftArm){
//        this.leftArm = leftArm;
//    }
//    public void setRightArmLeg(boolean rightArm){
//        this.rightArm = rightArm;
//    }

    // 의미있는 세터
    public void walk(boolean power){
        this.leftLeg = power;
        this.rightArm = power;
        this.rightLeg = power;
        this.leftArm= power;
    }
}
