package sample;

import java.lang.reflect.Array;

public class Team {
    public String name;
    public String type;
    public Trainer trainer;
    public Array members;

    public void addTrainer(){
        Trainer trainer = new Trainer();
        trainer.name = "Демидов";
        trainer.age = 48;
        trainer.qualification = "1";
        this.trainer = trainer;
    }
//    public void addPlayer(){
//        this.members[0] = 1;
//    }
}


