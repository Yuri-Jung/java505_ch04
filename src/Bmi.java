public class Bmi {
    public String name;
    public double height;

    public int weight;
    private double bmi;

    public double getBmi(){
        return bmi;
    }

    public void setMyInfo(double height, int weight){
        this.height = height/100.0;
        this.weight = weight;
        calcBmi(this.height, this.weight);
    }

    private void calcBmi(double height, int weight){
//        몸무게/키*키
        this.bmi =  (double) weight / (height * height);
    }
}


