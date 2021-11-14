package Decorator.OwnExample;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public abstract class People {
    protected boolean death;
    protected String name;
    public void setDeath(boolean death) {
        this.death = death;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String consistOf(){
        Head.countHead=0;
        Hand.countHand=0;
        Foot.countFoot=0;
        Body.countBody=0;
        return name;
    }
    public void counting() {
        File file = new File("data.properties");
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(file));
        }
        catch (Exception e){
            System.out.println(e);
        }
        if (Hand.countHand>Integer.parseInt(properties.getProperty("countHand"))){
            Hand.countHand = Integer.parseInt(properties.getProperty("countHand"));
        }
        if (Head.countHead>Integer.parseInt(properties.getProperty("countHead"))){
            Head.countHead = Integer.parseInt(properties.getProperty("countHead"));
        }
        if (Body.countBody>Integer.parseInt(properties.getProperty("countBody"))){
            Body.countBody = Integer.parseInt(properties.getProperty("countBody"));
        }
        if (Foot.countFoot>Integer.parseInt(properties.getProperty("countFoot"))){
            Foot.countFoot = Integer.parseInt(properties.getProperty("countFoot"));
        }
    }
}
