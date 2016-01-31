package com.pikuza;

/**
 * Created by m.pikuza on 30.01.2016.
 */
public class Constellation {
    private int[][] galaxy;
    private int star = 1;
    private int mark = 1;
    private int constellationQuantity;

    public Constellation(){
        Utils utils = new Utils();
        galaxy = utils.randomArrInitializer(0, 1, 20, 20);
    }

    public Constellation(int[][] galaxy){
       this.galaxy = galaxy;
    }

    public int getConstellationsQuantity(){

        for(int xPos = 0; xPos < galaxy.length; xPos++){
            for(int yPos = 0; yPos < galaxy[xPos].length; yPos++){
                if(isStar(xPos, yPos) && isConstellation(xPos, yPos)) constellationMarker(xPos, yPos);
            }
        }
        return  constellationQuantity = --mark;
    }

    private boolean isConstellation(int xPos, int yPos){

        int x,y;

        for(int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (i == 0 && j == 0 || i == 0 && j == -1 || i == -1 && j == 1 || i == -1 && j == 0 || i == -1 && j == -1) continue;
                x = xPos + i;
                y = yPos + j;
                if (x >= 0 && y >= 0 && x < galaxy.length && y < galaxy[x].length && isStar(x, y)) {
                    galaxy[xPos][yPos] = ++mark;
                    return true;
                }
            }
        }
        return false;
    }

    private void constellationMarker(int xPos, int yPos){

        int x,y;

        for(int i = -1; i < 2; i++){
            for(int j = -1; j < 2; j++){
                if(i == 0 && j == 0)continue;
                x = xPos + i;
                y = yPos + j;
                if (x >= 0 && y >= 0 && x < galaxy.length && y < galaxy[x].length && isStar(x,y)){
                    galaxy[x][y] = mark;
                    constellationMarker(x, y);
                }
            }
        }
    }

    private boolean isStar(int xPos, int yPos){
        return galaxy[xPos][yPos] == star;
    }

    public void printGalaxy(){
        for(int xPos = 0; xPos < galaxy.length; xPos++){
            for(int yPos = 0; yPos < galaxy[xPos].length; yPos++){
                System.out.print(galaxy[xPos][yPos] + " ");
            }
            System.out.println();
        }
    }
}
