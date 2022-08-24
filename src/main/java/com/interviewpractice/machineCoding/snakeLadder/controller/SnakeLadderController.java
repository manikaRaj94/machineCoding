package com.interviewpractice.machineCoding.snakeLadder.controller;

import com.interviewpractice.machineCoding.snakeLadder.model.Ladder;
import com.interviewpractice.machineCoding.snakeLadder.model.Player;
import com.interviewpractice.machineCoding.snakeLadder.model.Snake;
import com.interviewpractice.machineCoding.snakeLadder.service.SnakeLadderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SnakeLadderController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfSnakes = scanner.nextInt();
        List<Snake> snakes = new ArrayList<Snake>();
        for (int i = 0; i < noOfSnakes; i++) {
            snakes.add(new Snake(scanner.nextInt(), scanner.nextInt()));
        }

        int noOfLadders = scanner.nextInt();
        List<Ladder> ladders = new ArrayList<Ladder>();
        for (int i = 0; i < noOfLadders; i++) {
            ladders.add(new Ladder(scanner.nextInt(), scanner.nextInt()));
        }

        int noOfPlayers = scanner.nextInt();
        List<Player> players = new ArrayList<Player>();
        for (int i = 0; i < noOfPlayers; i++) {
            players.add(new Player(scanner.next()));
        }

        SnakeLadderService snakeAndLadderService = new SnakeLadderService();
        snakeAndLadderService.setPlayers(players);
        snakeAndLadderService.setSnakes(snakes);
        snakeAndLadderService.setLadders(ladders);

        snakeAndLadderService.startGame();
    }
}
