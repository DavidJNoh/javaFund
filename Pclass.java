public class Pclass{
   private String name;
   private String description;
   public String elevatorPitch(){
       String gibThis = name + ": " + description;
       return (gibThis);
   }
   public Pclass(){
       
   }
   public Pclass(String name){
       this.name = name;
   }
   public Pclass(String name, String description){
       this.name = name;
       this.description = description;
   }
   //getter
   public String getName(){
       return this.name;
   }
   //setter
   public void setName(String name){
       this.name = name; 
   }
   //getter
   public String getDesc(){
       return this.description;
   }
   //setter
   public void setDesc(String description){
       this.description = description ; 
   }

}