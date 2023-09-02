package com.mjc.school;

import java.util.Optional;
import java.util.Scanner;

public class TerminalCommandsReader {

    private static final String PROMPT_ENTER_NUMBER_OF_OPERATION
            = "  " +
            "Enter the number of operation:";

    private final Scanner sc = new Scanner(System.in);

    public Optional<Command> getCommand() {
        printCommandPrompt();
        if (sc.hasNextLine()) {
            try {
                int commandCode = Integer.parseInt(sc.nextLine());
                Command command = getCommand(commandCode);
                return Optional.ofNullable(command);
            } catch (NumberFormatException e) {
                return Optional.empty();
            }
        }
        return Optional.empty();
    }

    public String reqResponse(String prompt) {
        System.out.println(prompt);
        return sc.nextLine();
    }

    private Command getCommand(int commandCode) {
        for (Command cmd : Command.values()) {
            if (cmd.code == commandCode)
                return cmd;
        }
        return null;
    }

    private void printCommandPrompt() {
        StringBuilder sb = new StringBuilder();
        sb.append(PROMPT_ENTER_NUMBER_OF_OPERATION).append('\n');
        for (Command command : Command.values()) {
            sb
                    .append(command.code)
                    .append(" - ")
                    .append(command.description)
                    .append('\n');
        }
        System.out.print(sb);
    }
}
