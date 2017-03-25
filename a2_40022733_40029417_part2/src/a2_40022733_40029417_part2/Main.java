package a2_40022733_40029417_part2;
import AirCraftPackage.*;
import CityPackage.*;
import FerryPackage.Ferry;
import PublicTransportPackage.*;

public class Main {
    
    public static PublicTransportation[] copyCityBuss(PublicTransportation[] array){
        PublicTransportation[] copy = new PublicTransportation[array.length];
        int counter = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = counter; j < array.length; j++){
                if(array[j] instanceof CityBus){
                    copy[i] = array[j].clone();
                    counter++;
                    break;
                }
                counter++;
            }  
        }
        return copy;
    }

    public static void main(String[] args) {
        
        PublicTransportation ob1 = new PublicTransportation(10.0, 5);
        CityBus ob2 = new CityBus();
        CityBus lul = new CityBus(ob2);
        Ferry ob3 = new Ferry(25.75, 10, 1960, "Fork lifter");
        AirCraft ob4 = new AirCraft(AirCraft.Crafts.Helicopter, AirCraft.Maintenance.Weekly, 700.0, 1);
        Metro ob5 = new Metro(3.50, 14, 87, 1860, "Green Line", "John Bob", 7, "Montreal");
        Tram ob6 = new Tram(10.0, 25, 74, 1940, "Keepo", "Keiron", 150);
        
        System.out.println(ob1.equals(ob2));
        System.out.println(ob3.equals(ob4));
        System.out.println(ob4.equals(ob5));
        System.out.println(ob5.equals(ob1));
        System.out.println(lul.equals(ob2));
        System.out.println(ob6.equals(ob2));
        
        PublicTransportation[] arrayOfObj = new PublicTransportation[10];
        arrayOfObj[0] = new CityBus(100, 4, 45, 2185, "FE;feg", "nigger");
        arrayOfObj[1] = new Ferry(30.0, 5, 1970, "Fagget");
        arrayOfObj[2] = new AirCraft(AirCraft.Crafts.Balloon, AirCraft.Maintenance.Yearly, 5, 2);
        arrayOfObj[3] = new Metro(7, 4, 77, 1960, "Kappa Line", "John Cena", 1, "Montreal");
        arrayOfObj[4] = new Tram(17.50, 2, 4, 1970, "Killitote", "Kys", 999);
        arrayOfObj[5] = new Ferry(100.0, 5, 1970, "Fogewt");
        arrayOfObj[6] = new Metro(3.5, 4, 77, 1960, "Keppo Line", "John Kappa", 1, "Montreal");
        arrayOfObj[7] = new Tram((Tram)arrayOfObj[4]);
        arrayOfObj[8] = new AirCraft(AirCraft.Crafts.Helicopter, AirCraft.Maintenance.Yearly, 700, 2);
        arrayOfObj[9] = new CityBus(1.5, 2, 66, 2010, "Freelo", "Sagar");
        
        for(int i = 0; i < arrayOfObj.length-1; i++){
            System.out.println(arrayOfObj[i]);
        }
        
        System.out.println();
        
        PublicTransportation mostExp = arrayOfObj[0];
        PublicTransportation leastExp = arrayOfObj[0];
        for(int i = 0; i < arrayOfObj.length-1; i++){
            if(mostExp.getPrice() < arrayOfObj[i+1].getPrice()){
                mostExp = arrayOfObj[i+1];
            }
            if(leastExp.getPrice() > arrayOfObj[i+1].getPrice()){
                leastExp = arrayOfObj[i+1];
            }
        }
        
       System.out.println(mostExp);
       System.out.println(leastExp);
       System.out.println();
       
       PublicTransportation[] kappa = copyCityBuss(arrayOfObj);
       for(int i = 0; i < arrayOfObj.length-1; i++){
            System.out.println(kappa[i]);
        }
        
    }
}
