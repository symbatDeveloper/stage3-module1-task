package com.mjc.school;

import com.mjc.school.controller.NewsController;
import com.mjc.school.controller.impl.NewsControllerImpl;
import com.mjc.school.exceptions.IdShouldBeNumberException;
import com.mjc.school.repository.exceptions.AuthorNotFoundException;
import com.mjc.school.repository.exceptions.NewsNotFoundException;
import com.mjc.school.service.dto.NewsCreateDtoRequest;
import com.mjc.school.service.dto.NewsDto;
import com.mjc.school.service.dto.UpdDtoRequest;
import com.mjc.school.service.exceptions.ContValidException;
import com.mjc.school.service.exceptions.TvalidException;

public class CommandsExecutor {

    private final NewsController<NewsDto> newsController = new NewsControllerImpl();

    private final TerminalCommandsReader commandsReader = new TerminalCommandsReader();

    public void executeCommand(Command command) throws
            IdShouldBeNumberException, NewsNotFoundException,
            AuthorNotFoundException, TvalidException,
            ContValidException {

        if (command == Command.EXIT)
            System.exit(0);

        System.out.print("Operation: ");
        System.out.println(command.description);
        switch (command) {
            case GET_ALL -> {
                for (NewsDto news : newsController.readAllNews()) {
                    System.out.println(news);
                }
            }
            case GET_BY_ID -> System.out.println(
                    newsController.readById(
                            requestNewsId()
                    ));
            case CREATE -> System.out.println(
                    newsController.createNews(
                            new NewsCreateDtoRequest(
                                    requestNewsTitle(),
                                    requestNewsContent(),
                                    requestAuthorId()
                            )));
            case UPDATE -> System.out.println(
                    newsController.updateNews(
                            new UpdDtoRequest(
                                    requestNewsId(),
                                    requestNewsTitle(),
                                    requestNewsContent(),
                                    requestAuthorId()
                            )));
            case REMOVE_BY_ID -> System.out.println(
                    newsController.deleteNews(
                            requestNewsId()
                    ));
        }
    }

    private long requestNewsId() {
        try {
            return Long.parseLong(commandsReader.reqResponse("Enter news id:"));
        } catch (NumberFormatException e) {
            throw new IdShouldBeNumberException("News Id should be number", e);
        }
    }

    private long requestAuthorId() {
        try {
            return Long.parseLong(commandsReader.reqResponse("Enter author id:"));
        } catch (NumberFormatException e) {
            throw new IdShouldBeNumberException("Author Id should be number", e);
        }
    }

    private String requestNewsContent() {
        return commandsReader.reqResponse("Enter news content:");
    }

    private String requestNewsTitle() {
        return commandsReader.reqResponse("Enter news title:");
    }
}
