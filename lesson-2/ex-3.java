/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex.java;

final class Studio {
    String name;
    private String country;
    
    Studio(String name, String country) {
        this.name = name;
        this.country = country;
    }
    
    String localisation() {return country;}
    
}

final class Type {
    private String name;
    private int minimumAge;
    
    Type(String name, int minimumAge) {
        this.name = name;
        this.minimumAge = minimumAge;
    }
    
    String genreName() {return name;}
    int requiredAge() {return minimumAge;}
}

final class Title {
    private String series;
    private int part;
    
    String fullTitle() {
        return series+" "+part;
    }
    
    Title(String series, int part) {
        this.series = series;
        this.part = part;
    }
    
}

final class Game {
    private Title title;
    private Type type;
    private Studio studio;
    private int releaseYear;
    
    Game(Title title, Type type, Studio studio, int releaseYear) {
        this.title = title;
        this.type = type;
        this.studio = studio;
        this.releaseYear = releaseYear;       
    }
    
    Game(Title title, Type type, Studio studio, String releaseYear) {
        this(title, type, studio, Integer.parseInt(releaseYear));      
    }
    
    void printShopInformation() {
        System.out.println("Title:"+title.fullTitle()+"\nType: "+type.genreName()+"\nPEGI: "+type.requiredAge());
    }
    
}

public class Ex3Java {

    public static void main(String[] args) {
        Studio firstStudio = new Studio("CD Project", "Poland");
        Type firstType = new Type("RPG", 18);
        Title firstTitle = new Title("Wiedzmin", 3);
        Game firstGame = new Game(firstTitle, firstType, firstStudio, "2015");
        
        System.out.println(firstGame.title.fullTitle());
        firstGame.printShopInformation();
    }
}
