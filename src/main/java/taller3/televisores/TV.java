package taller3.televisores;

public class TV {
   public Marca marca; 
   public int canal = 1;
   public int precio = 500; 
   public boolean estado; 
   public int volumen = 1; 
   public Control control; 
   public static int numTV;

    public TV(Marca marca, boolean estado) {
        this.marca = marca; 
        this.estado = estado;
        TV.numTV++;
    }

    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    public Control getControl(){
        return control; 
    }
    public void setControl(Control control){
        this.control = control;
    }
    public int getPrecio(){
        return precio;
    }
    public void setPrecio (int precio){
        this.precio = precio;
    }
    public int getVolumen(){
        return volumen; 
    }
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        if(this.estado){
            if(1 <= canal && canal <= 120){
                this.canal = canal;
            }
        }
        }
    public static int getNumTV(){
        return numTV;
    }
    public void turnOn (){
        this.estado = true;
    }
    public void turnOff(){
        this.estado = false;
    }
    public boolean getEstado(){
        return this.estado;
    }
    public void canalUp(){
        if(this.estado){
            if(this.canal >= 1 && this.canal < 120 ){
                this.canal++;
            }
        }

    }
    public void canalDown(){
        if(this.estado){
            if(this.canal <= 120 && this.canal > 1){
                this.canal--;
            }
        }
    }
     public static void setNumTV(int numTV){
        TV.numTV = numTV;
    }
    public void volumenUp(){
        if(this.estado = true) {
            if(this.volumen < 7 && this.volumen >= 0){
                this.volumen++;
            }
        }

    }

    public void volumenDown(){
        if(this.estado = true) {
            if(this.volumen <= 7 && this.volumen > 0){
                this.volumen--;
            }
}
}
}
