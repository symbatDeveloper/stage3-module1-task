package com.mjc.school;

import com.mjc.school.exceptions.IdShouldBeNumberException;
import com.mjc.school.repository.exceptions.AuthorNotFoundException;
import com.mjc.school.repository.exceptions.NewsNotFoundException;
import com.mjc.school.service.exceptions.ContValidException;
import com.mjc.school.service.exceptions.TvalidException;

public class MainApplication {

    private static final String NOT_FOUND = "Command not found.";

    public static void main(String[] args) {
        TerminalCommandsReader terminalCommandsReader = new TerminalCommandsReader();

        CommandsExecutor commandsExecutor = new CommandsExecutor();

        while (true) {
            terminalCommandsReader.getCommand().ifPresentOrElse(cmd ->
                    {
                        try {
                            commandsExecutor.executeCommand(cmd);
                        } catch (NewsNotFoundException |
                                 AuthorNotFoundException |
                                 TvalidException |
                                 ContValidException |
                                 IdShouldBeNumberException e) {
                            System.out.println(e.getMessage());
                        }
                    },
                    () -> System.out.println(NOT_FOUND));
        }

    }
}
