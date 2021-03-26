package workshop_del2.demo.Controller;

import lombok.Data;

@Data
public class TempServiceImpl {

    public int temp;

    public TempServiceImpl() {
    }

    public String getTemperature(){
        if (temp > 37){
            return "Fever Positive";
        }

        return "Negative";
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
