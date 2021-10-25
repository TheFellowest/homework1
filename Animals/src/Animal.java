public abstract class Animal {
    protected boolean isSleeping;
    protected boolean isEating;
    protected boolean isSpeaking;

    public Animal (boolean sleeps, boolean eats, boolean speaks, String voice){
        this.isSleeping = sleeps;
        this.isEating = eats;
        this.isSpeaking = speaks;
    }
    boolean getSleeps() {return this.isSleeping;}
    boolean getEats() {return this.isEating;}
    boolean getSpeaks() {return this.isSpeaking;}

   void setSleeps(boolean sleeps) {
       this.isSleeping = sleeps;
       if (sleeps) {
           this.isSpeaking = false;
           System.out.println("It is sleeping");
       }
   }

    void setSpeaks(boolean speaks){

        if (speaks && !getSleeps()) {
            this.isSpeaking = true;
            voice();
        } else {
            this.isSpeaking = false;
        }
    }
    void setEats (boolean eats){
        this.isEating = eats;
        if (eats){
            this.isSleeping = false;
            System.out.println("It is eating");
        }
   }
   public abstract void voice ();
}
