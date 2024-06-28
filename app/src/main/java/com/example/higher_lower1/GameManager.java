package com.example.higher_lower1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class GameManager {
    static public int quizType;//0,1,2,3

    static public int currentQuiz;


    static public Info[] vehicle = new Info[]
            {
                    new Info("Vehiculos","BMW X1", 155000, R.drawable.bmw_x1),
                    new Info("Vehiculos","Citroen C15", 2600, R.drawable.citroen_c15),
                    new Info("Vehiculos","Ferrari F40",245000, R.drawable.ferrari_f40),
                    new Info("Vehiculos","Ford Focus", 10500, R.drawable.ford_focus),
                    new Info("Vehiculos","Ford Raptor",8800, R.drawable.ford_raptor),
                    new Info("Vehiculos","Honda Civic", 505000, R.drawable.honda_civic_type_r),
                    new Info("Vehiculos","Lamborghini huracan",1295000, R.drawable.lambo_huracan),
                    new Info("Vehiculos","Lexus RX",30500, R.drawable.lexus_rx),
                    new Info("Vehiculos", "Opel Zafira", 1020, R.drawable.opel_zafira),
                    new Info("Vehiculos", "peugeot 308",200500, R.drawable.peugeot308),
                    new Info("Vehiculos","Porsche Cayenne", 398000, R.drawable.porsche_cayenne),
                    new Info("Vehiculos", "Ranger Rover Evoque",452000, R.drawable.range_rover_evoque),
                    new Info("Vehiculos", "Toyota Rav 4",502500, R.drawable.rav_4),
                    new Info("Vehiculos","Renault megane",100500, R.drawable.renault_megane),
                    new Info("Vehiculos","Skoda Octavia", 283550, R.drawable.skoda_octavia),
                    new Info("Vehiculos","Toyota C-HR", 429800, R.drawable.toyota_chr),
                    new Info("Vehiculos","Toyota Proace City",65150, R.drawable.toyota_proace_city),
                    new Info("Vehiculos","Peugeot 106",20000,R.drawable.peugeot106)
            };



    static public Info[] sports = new Info[]
            {
                    new Info("Deportes","Atletismo",402500, R.drawable.atletismo),
                    new Info("Deportes","Badmiton",91000, R.drawable.badmiton),
                    new Info("Deportes","Basket",1510500, R.drawable.basket),
                    new Info("Deportes","Baseball",30500, R.drawable.beisbol),
                    new Info("Deportes","Bolos",20150, R.drawable.bolos),
                    new Info("Deportes","Ciclismo",705500, R.drawable.ciclismo),
                    new Info("Deportes","Esgrima",12150, R.drawable.esgrima),
                    new Info("Deportes","Futbol",5302500, R.drawable.futbol),
                    new Info("Deportes", "Golf",503500, R.drawable.golf),
                    new Info("Deportes","Hockey",89250, R.drawable.hockey),
                    new Info("Deportes","Kayak",75500, R.drawable.kayak),
                    new Info("Deportes","Natacion",303500, R.drawable.natacion),
                    new Info("Deportes", "Padel", 121250, R.drawable.padel),
                    new Info("Deportes","Ping pong", 50550, R.drawable.ping_pong),
                    new Info("Deportes","Rugby",202000, R.drawable.rugby),
                    new Info("Deportes","Surf",13150, R.drawable.surf),
                    new Info("Deportes","Tenis",702500, R.drawable.tenis),
                    new Info("Deportes","Voleibol",131500, R.drawable.voleibol)
            };

    static public Info[] animals = new Info[]
            {
                    new Info("Animales","Agapornis",50250, R.drawable.agapornis),
                    new Info("Animales","Caballo",421500, R.drawable.caballo),
                    new Info("Animales","Cappibara",111500, R.drawable.cappibara),
                    new Info("Animales","Cochino",161500, R.drawable.cochino),
                    new Info("Animales","Cocodrilo",90500, R.drawable.cocodrilo),
                    new Info("Animales","Conejo",151500, R.drawable.conejo),
                    new Info("Animales", "Gato",501500, R.drawable.gato),
                    new Info("Animales","gorrion",101500, R.drawable.gorrion),
                    new Info("Animales","Hamster",80500, R.drawable.hamster),
                    new Info("Animales", "Leon", 14150, R.drawable.leon),
                    new Info("Animales", "Macaco de Java", 50550, R.drawable.macaco_de_java),
                    new Info("Animales", "Mapache", 14150, R.drawable.mapache),
                    new Info("Animales", "Oso", 342000,R.drawable.oso_pardo),
                    new Info("Animales", "Palomas",60500, R.drawable.palomas),
                    new Info("Animales","Perro", 1005005,R.drawable.perro),
                    new Info("Animales","Rana",25250,R.drawable.rana),
                    new Info("Animales","Toro",322000, R.drawable.toro),
                    new Info("Animales","Tortuga",191500, R.drawable.tortuga)
            };

    static public Info[] GetNewInfo(int id){
        currentQuiz=0;

        ArrayList<Info> newList = new ArrayList<>();
        switch(id)
        {
            case 0:
                newList = new ArrayList<>(Arrays.asList(vehicle));
                Collections.shuffle(newList);
                return newList.toArray(new Info[0]);
            case 1:
                newList = new ArrayList<>(Arrays.asList(animals));
                Collections.shuffle(newList);
                return newList.toArray(new Info[1]);
            case 2:
                newList = new ArrayList<>(Arrays.asList(sports));
                Collections.shuffle(newList);
                return newList.toArray(new Info[2]);
            case 3:
                int totalPerArray = 6;
                ArrayList<Info> randomList = new ArrayList<>();
                for (int i = 0; i<totalPerArray;i++)
                {
                    Random random = new Random();
                    int randomValue = random.nextInt(vehicle.length);
                    while(randomList.contains(vehicle[randomValue])==true)
                    {
                        randomValue = random.nextInt(vehicle.length);
                    }
                    randomList.add(vehicle[randomValue]);
                }
                for (int i = 0; i<totalPerArray;i++)
                {
                    Random random = new Random();
                    int randomValue = random.nextInt(animals.length);
                    while(randomList.contains(animals[randomValue])==true)
                    {
                        randomValue = random.nextInt(animals.length);
                    }
                    randomList.add(animals[randomValue]);
                }
                for (int i = 0; i<totalPerArray;i++)
                {
                    Random random = new Random();
                    int randomValue = random.nextInt(sports.length);
                    while(randomList.contains(sports[randomValue])==true)
                    {
                        randomValue = random.nextInt(sports.length);
                    }
                    randomList.add(sports[randomValue]);
                }
                Collections.shuffle(randomList);
                return randomList.toArray(new Info[0]);

        }
        return null;
    }
}
