/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrtrouter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Station {
    // EWL
    static String PASIR_RIS = "Pasir Ris";
    static String TAMPINES = "Tampines";
    static String SIMEI = "Simei";
    static String TANAH_MERAH = "Tanah Merah";
    static String BEDOK = "Bedok";
    static String KEMBANGAN = "Kembangan";
    static String EUNOS = "Eunos";
    static String PAYA_LEBAR = "Paya Lebar";
    static String ALJUNIED = "Aljunied";
    static String KALLANG = "Kallang";
    static String LAVENDER = "Lavender";
    static String BUGIS = "Bugis";
    static String CITY_HALL = "City Hall";
    static String RAFFLES_PLACE = "Raffles Place";
    static String TANJONG_PAGAR = "Tanjong Pagar";
    static String OUTRAM_PARK = "Outram Park";
    static String TIONG_BAHRU = "Tiong Bahru";
    static String REDHILL = "Redhill";
    static String QUEENSTOWN = "Queenstown";
    static String COMMONWEALTH = "Commonwealth";
    static String BUONA_VISTA = "Buona Vista";
    static String DOVER = "Dover";
    static String CLEMENTI = "Clementi";
    static String JURONG_EAST = "Jurong East";
    static String CHINESE_GARDEN = "Chinese Garden";
    static String LAKESIDE = "Lakeside";
    static String BOON_LAY = "Boon Lay";
    static String PIONEER = "Pioneer";
    static String JOO_KOON = "Joo Koon";
    static String GUL_CIRCLE = "Gul Circle";
    static String TUAS_CRESCENT = "Tuas Crescent";
    static String TUAS_WEST_ROAD = "Tuas West Road";
    static String TUAS_LINK = "Tuas Link";
    
    // NEL
    static String HARBOURFRONT = "HarbourFront";
    // static String OUTRAM_PARK = "Outram Park";
    static String CHINATOWN = "Chinatown";
    static String CLARKE_QUAY = "Clarke Quay";
    static String DHOBY_GHAUT = "Dhoby Ghaut";
    static String LITTLE_INDIA = "Little India";
    static String FARRER_PARK = "Farrer Park";
    static String BOON_KENG = "Boon Keng";
    static String POTONG_PASIR = "Potong Pasir";
    static String WOODLEIGH = "Woodleigh";
    static String SERANGOON = "Serangoon";
    static String KOVAN = "Kovan";
    static String HOUGANG = "Hougang";
    static String BUANGKOK = "Buangkok";
    static String SENGKANG = "Sengkang";
    static String PUNGGOL = "Punggol";
    
    // CCL
    // static String DHOBY_GHAUT = "Dhoby Ghaut";
    static String BRAS_BASAH = "Bras Basah";
    static String ESPLANADE = "Esplanade";
    static String PROMENADE = "Promenade";
    static String NICOLL_HIGHWAY = "Nicoll Highway";
    static String STADIUM = "Stadium";
    static String MOUNTBATTEN = "Mountbatten";
    static String DAKOTA = "Dakota";
    // static String PAYA_LEBAR = "Paya Lebar";
    static String MACPHERSON = "MacPherson";
    static String TAI_SENG = "Tai Seng";
    static String BARTLEY = "Bartley";
    // static String SERANGOON = "Serangoon";
    static String LORONG_CHUAN = "Lorong Chuan";
    static String BISHAN = "Bishan";
    static String MARYMOUNT = "Marymount";
    static String CALDECOTT = "Caldecott";
    static String BOTANIC_GARDENS = "Botanic Gardens";
    static String FARRER_ROAD = "Farrer Road";
    static String HOLLAND_VILLAGE = "Holland Village";
    // static String BUONA_VISTA = "Buona Vista";
    static String ONE_NORTH = "one-north";
    static String KENT_RIDGE = "Kent Ridge";
    static String HAW_PAR_VILLA = "Haw Par Villa";
    static String PASIR_PANJANG = "Pasir Panjang";
    static String LABRADOR_PARK = "Labrador Park";
    // static String HARBOURFRONT = "HarbourFront";
}

class Line {
    static String EW = "EW";
    static String NE = "NE";
    static String CC = "CC";
}

public class MRT {
    static HashMap<String, String[]> stations;
    static HashMap<String, String[]> lines;
    
    static void initialize() {
        stations = new HashMap<String, String[]>();
        
		// EWL
		stations.put(Station.PASIR_RIS, new String[] {Station.TAMPINES});
		stations.put(Station.TAMPINES, new String[] {Station.PASIR_RIS, Station.SIMEI, Station.CHINATOWN});
		stations.put(Station.SIMEI, new String[] {Station.TAMPINES, Station.TANAH_MERAH});
		stations.put(Station.TANAH_MERAH, new String[] {Station.SIMEI, Station.BEDOK});
		stations.put(Station.BEDOK, new String[] {Station.TANAH_MERAH, Station.KEMBANGAN});
		stations.put(Station.KEMBANGAN, new String[] {Station.BEDOK, Station.EUNOS});
		stations.put(Station.EUNOS, new String[] {Station.KEMBANGAN, Station.OUTRAM_PARK});
		stations.put(Station.PAYA_LEBAR, new String[] {Station.EUNOS, Station.ALJUNIED, Station.DAKOTA, Station.MACPHERSON});
		stations.put(Station.ALJUNIED, new String[] {Station.PAYA_LEBAR, Station.KALLANG});
		stations.put(Station.KALLANG, new String[] {Station.ALJUNIED, Station.LAVENDER});
		stations.put(Station.LAVENDER, new String[] {Station.KALLANG, Station.BUGIS});
		stations.put(Station.BUGIS, new String[] {Station.LAVENDER, Station.CITY_HALL});
		stations.put(Station.CITY_HALL, new String[] {Station.BUGIS, Station.RAFFLES_PLACE});
		stations.put(Station.RAFFLES_PLACE, new String[] {Station.CITY_HALL, Station.TANJONG_PAGAR});
		stations.put(Station.TANJONG_PAGAR, new String[] {Station.RAFFLES_PLACE, Station.OUTRAM_PARK});
		stations.put(Station.OUTRAM_PARK, new String[] {Station.TANJONG_PAGAR, Station.TIONG_BAHRU, Station.HARBOURFRONT, Station.CHINATOWN});
		stations.put(Station.TIONG_BAHRU, new String[] {Station.OUTRAM_PARK, Station.REDHILL});
		stations.put(Station.REDHILL, new String[] {Station.TIONG_BAHRU, Station.QUEENSTOWN});
		stations.put(Station.QUEENSTOWN, new String[] {Station.REDHILL, Station.COMMONWEALTH});
		stations.put(Station.COMMONWEALTH, new String[] {Station.QUEENSTOWN, Station.BUONA_VISTA});
		stations.put(Station.BUONA_VISTA, new String[] {Station.COMMONWEALTH, Station.DOVER, Station.HOLLAND_VILLAGE, Station.ONE_NORTH});
		stations.put(Station.DOVER, new String[] {Station.BUONA_VISTA, Station.CLEMENTI});
		stations.put(Station.CLEMENTI, new String[] {Station.DOVER, Station.JURONG_EAST});
		stations.put(Station.JURONG_EAST, new String[] {Station.CLEMENTI, Station.CHINESE_GARDEN});
		stations.put(Station.CHINESE_GARDEN, new String[] {Station.JURONG_EAST, Station.LAKESIDE});
		stations.put(Station.LAKESIDE, new String[] {Station.CHINESE_GARDEN, Station.BOON_LAY});
		stations.put(Station.BOON_LAY, new String[] {Station.LAKESIDE, Station.PIONEER});
		stations.put(Station.PIONEER, new String[] {Station.BOON_LAY, Station.JOO_KOON});
		stations.put(Station.JOO_KOON, new String[] {Station.PIONEER, Station.GUL_CIRCLE});
		stations.put(Station.GUL_CIRCLE, new String[] {Station.JOO_KOON, Station.TUAS_CRESCENT});
		stations.put(Station.TUAS_CRESCENT, new String[] {Station.GUL_CIRCLE, Station.TUAS_WEST_ROAD});
		stations.put(Station.TUAS_WEST_ROAD, new String[] {Station.TUAS_CRESCENT, Station.TUAS_LINK});
		stations.put(Station.TUAS_LINK, new String[] {Station.TUAS_WEST_ROAD});

		// NEL
		stations.put(Station.HARBOURFRONT, new String[] {Station.OUTRAM_PARK, Station.TELOK_BLANGAH});
		// OUTRAM_PARK
		stations.put(Station.CHINATOWN, new String[] {Station.OUTRAM_PARK, Station.TAMPINES});
		stations.put(Station.CLARKE_QUAY, new String[] {Station.CHINATOWN, Station.DHOBY_GHAUT});
		stations.put(Station.DHOBY_GHAUT, new String[] {Station.CLARKE_QUAY, Station.LITTLE_INDIA, Station.BRAS_BASAH});
		stations.put(Station.LITTLE_INDIA, new String[] {Station.DHOBY_GHAUT, Station.FARRER_PARK});
		stations.put(Station.FARRER_PARK, new String[] {Station.LITTLE_INDIA, Station.BOON_KENG});
		stations.put(Station.BOON_KENG, new String[] {Station.FARRER_PARK, Station.POTONG_PASIR});
		stations.put(Station.POTONG_PASIR, new String[] {Station.BOON_KENG, Station.WOODLEIGH});
		stations.put(Station.WOODLEIGH, new String[] {Station.POTONG_PASIR, Station.SERANGOON});
		stations.put(Station.SERANGOON, new String[] {Station.WOODLEIGH, Station.KOVAN, Station.LORONG_CHUAN, Station.BARTLEY});
		stations.put(Station.KOVAN, new String[] {Station.SERANGOON, Station.HOUGANG});
		stations.put(Station.HOUGANG, new String[] {Station.KOVAN, Station.BUANGKOK});
		stations.put(Station.BUANGKOK, new String[] {Station.HOUGANG, Station.SENGKANG});
		stations.put(Station.SENGKANG, new String[] {Station.BUANGKOK, Station.PUNGGOL});
		stations.put(Station.PUNGGOL, new String[] {Station.SENGKANG});

		// CC
		// DHOUBY_GHAUT
		stations.put(Station.BRAS_BASAH, new String[] {Station.DHOUBY_GHAUT, Station.ESPLANADE});
		stations.put(Station.ESPLANADE, new String[] {Station.BRAS_BASAH, Station.PROMENADE});
		stations.put(Station.PROMENADE, new String[] {Station.ESPLANADE, Station.NICOLL_HIGHWAY});
		stations.put(Station.NICOLL_HIGHWAY, new String[] {Station.PROMENADE, Station.STADIUM});
		stations.put(Station.STADIUM, new String[] {Station.NICOLL_HIGHWAY, Station.MOUNTBATTEN});
		stations.put(Station.MOUNTBATTEN, new String[] {Station.STADIUM, Station.DAKOTA});
		stations.put(Station.DAKOTA, new String[] {Station.MOUNTBATTEN, Station.PAYA_LEBAR});
		// PAYA_LEBAR
		stations.put(Station.MACPHERSON, new String[] {Station.PAYA_LEBAR, Station.TAI_SENG});
		stations.put(Station.TAI_SENG, new String[] {Station.MACPHERSON, Station.BARTLEY});
		stations.put(Station.BARTLEY, new String[] {Station.TAI_SENG, Station.SERANGOON});
		// SERANGOON
		stations.put(Station.LORONG_CHUAN, new String[] {Station.String, Station.BISHAN});
		stations.put(Station.BISHAN, new String[] {Station.LORONG_CHUAN, Station.MARYMOUNT});
		stations.put(Station.MARYMOUNT, new String[] {Station.BISHAN, Station.CALDECOTT});
		stations.put(Station.CALDECOTT, new String[] {Station.MARYMOUNT, Station.BOTANIC_GARDENS});
		stations.put(Station.BOTANIC_GARDENS, new String[] {Station.CALDECOTT, Station.FARRER_ROAD});
		stations.put(Station.FARRER_ROAD, new String[] {Station.BOTANIC_GARDENS, Station.HOLLAND_VILLAGE});
		stations.put(Station.HOLLAND_VILLAGE, new String[] {Station.FARRER_ROAD, Station.BUONA_VISTA});
		// BUONA_VISTA
		stations.put(Station.ONE_NORTH, new String[] {Station.BUONA_VISTA, Station.KENT_RIDGE});
		stations.put(Station.KENT_RIDGE, new String[] {Station.ONE_NORTH, Station.HAW_PAR_VILLA});
		stations.put(Station.HAW_PAR_VILLA, new String[] {Station.KENT_RIDGE, Station.PASIR_PANJANG});
		stations.put(Station.PASIR_PANJANG, new String[] {Station.HAW_PAR_VILLA, Station.LABRADOR_PARK});
		stations.put(Station.LABRADOR_PARK, new String[] {Station.PASIR_PANJANG, Station.TELOK_BLANGAH});
		stations.put(Station.TELOK_BLANGAH, new String[] {Station.LABRADOR_PARK, Station.HARBOURFRONT});
		// HARBOURFRONT
        
		lines = new HashMap<String, String[]>();
		   
		lines.put(Line.EW, new String[] {
			Station.PASIR_RIS,
			Station.TAMPINES,
			Station.SIMEI,
			Station.TANAH_MERAH,
			Station.BEDOK,
			Station.KEMBANGAN,
			Station.EUNOS,
			Station.PAYA_LEBAR,
			Station.ALJUNIED,
			Station.KALLANG,
			Station.LAVENDER,
			Station.BUGIS,
			Station.CITY_HALL,
			Station.RAFFLES_PLACE,
			Station.TANJONG_PAGAR,
			Station.OUTRAM_PARK,
			Station.TIONG_BAHRU,
			Station.REDHILL,
			Station.QUEENSTOWN,
			Station.COMMONWEALTH,
			Station.BUONA_VISTA,
			Station.DOVER,
			Station.CLEMENTI,
			Station.JURONG_EAST,
			Station.CHINESE_GARDEN,
			Station.LAKESIDE,
			Station.BOON_LAY,
			Station.PIONEER,
			Station.JOO_KOON,
			Station.GUL_CIRCLE,
			Station.TUAS_CRESCENT,
			Station.TUAS_WEST_ROAD,
			Station.TUAS_LINK,
		});
		
		lines.put(Line.NE, new String[] {
			Station.HARBOURFRONT,
			Station.OUTRAM_PARK,
			Station.CHINATOWN,
			Station.CLARKE_QUAY,
			Station.DHOBY_GHAUT,
			Station.LITTLE_INDIA,
			Station.FARRER_PARK,
			Station.BOON_KENG,
			Station.POTONG_PASIR,
			Station.WOODLEIGH,
			Station.SERANGOON,
			Station.KOVAN,
			Station.HOUGANG,
			Station.BUANGKOK,
			Station.SENGKANG,
			Station.PUNGGOL,
		});
		
		lines.put(Line.CC, new String[] {
			Station.DHOBY_GHAUT,
			Station.BRAS_BASAH,
			Station.ESPLANADE,
			Station.PROMENADE,
			Station.NICOLL_HIGHWAY,
			Station.STADIUM,
			Station.MOUNTBATTEN,
			Station.DAKOTA,
			Station.PAYA_LEBAR,
			Station.MACPHERSON,
			Station.TAI_SENG,
			Station.BARTLEY,
			Station.SERANGOON,
			Station.LORONG_CHUAN,
			Station.BISHAN,
			Station.MARYMOUNT,
			Station.CALDECOTT,
			Station.BOTANIC_GARDENS,
			Station.FARRER_ROAD,
			Station.HOLLAND_VILLAGE,
			Station.BUONA_VISTA,
			Station.ONE_NORTH,
			Station.KENT_RIDGE,
			Station.HAW_PAR_VILLA,
			Station.PASIR_PANJANG,
			Station.LABRADOR_PARK,
			Station.TELOK_BLANGAH,
			Station.HARBOURFRONT,
		});
    }
    
    public static void main(String[] args) {
        initialize();
        
        while (true){
            System.out.println("\nWelcome\n[0]View stations\n[1]Travel\n[2]Exit\n\nEnter a choice: ");

            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();

            if (choice != null) switch (choice) {
                case "0":
                    System.out.println("Enter line code to view:");
                    String input = sc.nextLine();
                    
                    System.out.println();
                    
                    String[] line = lines.get(input);
                    for (int i = 0; i < line.length; i++) {
                        System.out.println(line[i]);
                    }
                            
                    break;

                case "1":
                    System.out.println("Enter your starting station:");
                    String source = sc.nextLine();
                    
                    System.out.println("Enter your destination station:");
                    String dest = sc.nextLine();
                    
                    System.out.println();
                    
                    ArrayList<ArrayList<String>> routes = route(source, dest, new ArrayList<String>());
                    for (int i = 0; i < routes.size(); i++) {
                        System.out.println("Route " + (i+1));
                        
                        ArrayList<String> route = routes.get(i);
                        Collections.reverse(route);
                        
                        for (int j = 0; j < route.size(); j++) {
                            System.out.println(route.get(j));
                        }
                        
                        System.out.println();
                    }
                    
                    break;

                case "2":
                    System.exit(0);

                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
    
    public static ArrayList<ArrayList<String>> route(String current, String dest, ArrayList<String> visited) {
        ArrayList<ArrayList<String>> allRoutes = new ArrayList<ArrayList<String>>();
        
        String[] adjacent = stations.get(current);
        for (int i = 0; i < adjacent.length; i++) {
            if (adjacent[i].equals(dest)) {
                ArrayList<String> finalRoute = new ArrayList<String>();
                finalRoute.add(dest);
                finalRoute.add(current);
                allRoutes.add(finalRoute);
                
                break;
            }
            
            boolean found = false;
            for (int j = 0; j < visited.size(); j++) {
                if (adjacent[i].equals(visited.get(j))) {
                    found = true;
                    break;
                }
            }
            
            if (found) {
                continue;
            }
            
            ArrayList<String> newVisited = new ArrayList<String>(visited);
            newVisited.add(current);
            ArrayList<ArrayList<String>> routes = route(adjacent[i], dest, newVisited);
            
            for (int j = 0; j < routes.size(); j++) {
                ArrayList<String> newRoute = new ArrayList<String>(routes.get(j));
                newRoute.add(current);
                routes.set(j, newRoute);
                
                allRoutes.add(newRoute);
            }
        }
        
        return allRoutes;
    }
}
