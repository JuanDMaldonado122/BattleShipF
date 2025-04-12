package ui;
import model.Game;

import java.lang.ModuleLayer.Controller;
import java.util.Scanner;

public class Executable {

    private Scanner input;
    private Game game;

    public static void main(String[] args) {

        Executable exe = new Executable();
        exe.menu();

    }

    public Executable() {

        input = new Scanner(System.in);
        game = new Game(null, null, null, null);

    }

    public void menu(){

        System.out.println("-------------------------------------------");
        System.out.println("Bienvenido al juego de Batalla Naval ICESI");
        System.out.println("-------------------------------------------");
    
        int option = 0;
    
        do{
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Jugar");
            System.out.println("2. Ver estadísticas");
            System.out.println("3. Salir del juego");
            option = input.nextInt();
            while(option < 1 || option > 3){
                System.out.println("Opción no válida. Intente de nuevo.");
                option = input.nextInt();
            }
    
            switch(option){
                case 1:
                    System.out.println("\nMENU DE JUEGO");
                    System.out.println("1.Partida estandar");
                    System.out.println("2.Parida personalizada");
                    System.out.println("3.Salir del juego");
                    int optionGame = input.nextInt();
                    while(optionGame < 1 || optionGame > 3){
                        System.out.println("Opción no válida. Intente de nuevo.");
                        optionGame = input.nextInt();
                    }
    
                    switch(optionGame){
                        case 1:
                            System.out.println("PARTIDA ESTANDAR");
                            System.out.println(game.setStandarMatch());
                            break;
                        case 2:
                            System.out.println("PARTIDA PERSONALIZADA");
                            break;
                        case 3:
                            System.out.println("Ha salido del juego");
                            break;
                        default:
                            System.out.println("Opción no válida. Intente de nuevo.");
                    }
                    break;
    
                case 2:
                    showStatistics();
                    break;
    
                case 3:
                    System.out.println("Ha salido del juego");
                    break;
    
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
    
        }while(option != 3);
        }

        public void showStatistics(){
            System.out.println("\nESTADISTICAS DE JUEGO\n");
            System.out.println("Victorias del jugador: ");
            System.out.println("Victorias de la maquina:\n");
        }

        public void addUser(){

            System.out.println("Ingrese el nombre del jugador");
            String name = input.nextLine();

        }

        public void personalizedMatch(){

            System.out.println("Ingrese el numero de barcos que desea: (max 10)");
            int numberBoats = input.nextInt();
            while(numberBoats > 10 || numberBoats < 1){
                System.out.println("Opcion invalida, intente de nuevo");
                numberBoats = input.nextInt();
            }

            int[] boatCaracteristics = new int[numberBoats];

            for (int i = 0; i < boatCaracteristics.length; i++) {

                if (boatCaracteristics[i] == 0){
                System.out.println("Ingrese el tamaño del barco "+(i+1)+" (max 5 casillas)");
                int size = input.nextInt();
                while(size > 5 || size < 1){
                    System.out.println("Opcion invalida, intente de nuevo");
                    size = input.nextInt();
                }

                System.out.println("Ingrese el valor de la posicion que desea");
                System.out.println("1. Vertical");
                System.out.println("2. Horizontal");
                int orientation = input.nextInt();
                while(orientation > 2 || orientation < 1){
                    System.out.println("Opcion invalida, intente de nuevo");
                    orientation = input.nextInt();
                }
                
                }
            }

        }

        public void shipCoordinates(){

            System.out.println("Ingrese la coordenada en x del barco (min 0 / max 9)");
            int x = input.nextInt();
            while (x>9 || x<0) {
                System.out.println("Ubicacion fuera del tablero, intenta de nuevo");
                x = input.nextInt();
            }

            System.out.println("Ingrese la coordenada en y del barco (min 0 / max 9)");
            int y = input.nextInt();
            while (y>9 || y<0) {
                System.out.println("Ubicacion fuera del tablero, intenta de nuevo");
                y = input.nextInt();
            }
        }

        public void playTurn(){


        }

    }    