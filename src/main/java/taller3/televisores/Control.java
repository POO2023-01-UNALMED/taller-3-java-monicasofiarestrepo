package taller3.televisores;

public class Control {
    private TV tv;
    
    public void enlazar(TV tv){
        this.tv = tv;
        tv.setControl(this);
    }
    public void TurnOn(){
        tv.turnOn();
    }
    public void TurnOff(){
        tv.turnOff();
    }
    public void CanalUp(){
        tv.canalUp();
    }
    public void CanalDown (){
        tv.canalDown();
    }
    public void VolumenUp (){
        tv.volumenUp();
    }
    public void volumenDown(){
        tv.volumenDown();
    }
    public void setCanal(int canal){
        tv.setCanal(canal);
    }
    public void setTv(TV tv){
        this.tv = tv;
    }
    public TV getTv(){
        return this.tv;
    }
}
