package ru.asqw.gb.lesson7;

public class Bowl {
    private int volume;

    public  Bowl(){
        System.out.printf("Bowl is created!! Volumes of bowl is %s units of food.\n", this.volume);
    }

    public Bowl(int volume) {
        if( volume >= 0 ){
            this.volume  = volume;
        } else {
            this.volume = 0;
        }
        System.out.printf("Bowl is created!! Volumes of bowl is %s units of food.\n", this.volume);
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void getMeal(int volume){
        if( volume > 0) { // если взять еды больше, чем есть в миске, то количество еды обнуляется
            if (volume >= this.volume) {
                this.volume = 0;
            } else { // если взять еды меньше, чем есть в миске, то просто минусуется еда из миски
                this.volume -= volume;
            }
        }
    }

    public void addMeal(int volume) {
        if (volume > 0){
            this.volume += volume;
        }
    }
}
