package com.view;

import com.processor.applicaion.ConsoleApplication;
import com.processor.applicaion.ConsoleInput;
import com.processor.applicaion.Option;
import com.processor.enumeration.ConsoleInputMode;
import com.viewmodel.application.PagodaApp;
import com.viewmodel.application.PagodaAppMenu;

public class Login extends PagodaAppMenu {
    public Login(PagodaApp application) {
        super(application, "Login", new Option[]{
                new Option("Hotel", (obj) -> {
                    application.clrscr();
                    ConsoleInput readUsername = new ConsoleInput();
                    String username= readUsername.input("Username");
                    ConsoleInput readPassword = new ConsoleInput(ConsoleInputMode.PASSWORD);
                    String password = readPassword.input("Password");
                    if(username.compareTo("linhlinh") == 0 && password.compareTo("111111") == 0) {
                        System.out.println("Login Successful");
                        application.pause();
                        application.clrscr();
                        Hotel hotel = new Hotel(application);
                        hotel.display();
                        hotel.forwardUser(PAGODA_MENU_DEFAULT_INPUT_MESSAGE);
                    }else {
                        System.out.println("Wrong Username or Password");
                        application.pause();
                        Home home = new Home(application);
                        home.display();
                        home.forwardUser(PAGODA_MENU_DEFAULT_INPUT_MESSAGE);
                    }
                    return null;
                }),

                new Option("Guest", (obj) -> {
                    application.clrscr();
                    ConsoleInput readUsername = new ConsoleInput();
                    String username= readUsername.input("Username");
                    ConsoleInput readPassword = new ConsoleInput(ConsoleInputMode.PASSWORD);
                    String password = readPassword.input("Password");
//                    MyInsertQuery insertQuery = new MyInsertQuery("guest",new HashMap<>() {{
//                        put("username",username);
//                        put("pass",password);
//                    }});
//                    System.out.println(insertQuery.toString());

                    if(username.compareTo("linhlinh2") == 0 && password.compareTo("333333") == 0) {
                        System.out.println("Login Successful");
                        application.pause();
                        application.clrscr();
                        Guest guest = new Guest(application);
                        guest.display();
                        guest.forwardUser(PAGODA_MENU_DEFAULT_INPUT_MESSAGE);
                    }else {
                        System.out.println("Wrong Username or Password");
                        application.pause();
                        Home home = new Home(application);
                        home.display();
                        home.forwardUser(PAGODA_MENU_DEFAULT_INPUT_MESSAGE);
                    }
                    return null;
                }),

                new Option("Back", (obj) -> {
                    application.clrscr();
                    Home home = new Home(application);
                    home.display();
                    home.forwardUser(PAGODA_MENU_DEFAULT_INPUT_MESSAGE);
                    return null;
                })
        });
    }
}
