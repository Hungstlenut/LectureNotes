package UpAndDownCasting;

public class Cat extends Animal{

    private String catNoise;
    private String catAction;

    public String getCatNoise(){
        return catNoise;
    }
    public String getCatAction(){
        return catAction;
    }

    public void setCatNoise(String catNoise){
        this.catNoise = catNoise;
    }

    public void setCatAction(String catAction){
        this.catAction = catAction;
    }

    public void makeNoise(){
        System.out.println("Moew");
    }
    public void scratch(){
        System.out.println("Katching!");
    }
}
