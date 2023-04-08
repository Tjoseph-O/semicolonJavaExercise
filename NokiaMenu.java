package controlStructures;

import java.util.Scanner;

public class NokiaMenu {

        public static void main(String[] args) {

            int menu;
            Scanner input = new Scanner(System.in);
            System.out.println("List of Menu");
            System.out.println("Press 1 for PhoneBook");
            System.out.println("Press 2 for Messages");
            System.out.println("Press 3 for Chat");
            System.out.println("Press 4 for Call Register");
            System.out.println("Press 5 for Tones");
            System.out.println("Press 6 for Settings");
            System.out.println("Press 7 for Call Divert");
            System.out.println("Press 8 for Games");
            System.out.println("Press 9 for  Calculator");
            System.out.println("Press 10 Reminders");
            System.out.println("Press 11 for Clock");
            System.out.println("Press 12 for Profiles");
            System.out.println("Press 13 for Sim Services");

            menu = input.nextInt();
            switch (menu){


                case 1 -> {
                    int phoneBook;

                    System.out.println("list of book");


                    System.out.println("PhoneBook");
                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                            "1 search",
                            "2 Service",
                            "3 Add name",
                            "4 Erase",
                            "5 Edit",
                            "6 Assign Tone",
                            "7 Send b'card",
                            "8 Options", "9 Speed dials", "10 Voice tags"   );
                    phoneBook = input.nextInt();
                    if (phoneBook == 1) {
                        System.out.println("search");
                    }
                    if (phoneBook == 2) {
                        System.out.println("service");

                    }
                    if (phoneBook == 3) {
                        System.out.println("Add name");

                    }
                    if (phoneBook == 4) {
                        System.out.println("Erase ");

                    }
                    if (phoneBook == 5) {
                        System.out.println(" Edit");

                    }
                    if (phoneBook == 6) {
                        System.out.println(" Assign Tone");

                    }
                    if (phoneBook == 7) {
                        System.out.println(" Send b'card");

                    }
                    if (phoneBook == 8) {

                        System.out.printf("%s%n%s%n", "1 Type of view", "2 Memory status");
                        int options;
                        options = input.nextInt();
                        if (options == 1) {
                            System.out.println(" Type of view");

                        }else {
                            System.out.println("Memory status");
                        }

                    }








                }

                case 2 -> {
                    System.out.println("list of messages");

                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1 Write Messages",
                            "2 Inbox", "3 Outbox ", "4 Picture messages",
                            "5 Templates", "6 Smileys ", "7 Message settings",
                            "8 Info service", "9 Voice mailbox number", "10 Service command editor");
                    int messages;


                    messages = input.nextInt();
                    if (messages == 1) {
                        System.out.println("write messages");
                    }
                    if (messages == 2) {
                        System.out.println("inbox");
                    }
                    if (messages == 3) {
                        System.out.println("outbox");
                    }
                    if (messages == 4) {
                        System.out.println("picture messages");
                    }
                    if (messages == 5) {
                        System.out.println("Templates");
                    }
                    if (messages == 6) {
                        System.out.println("Smileys");
                    }
                    if (messages == 7) {

                        System.out.println("list of set");
                        System.out.printf("%s%n%s%n", "1  set ", "2  Common");
                        int set;

                        set = input.nextInt();
                        if (set == 1) {
                            System.out.println("list of set1");
                            System.out.printf("%s%n%s%n%s%n", "1  Message center number ", "2  Message sent as", "3 Message validity");


                        }
                        if (set == 2) {
                            System.out.println("list of set2");
                            System.out.printf("%s%n%s%n%s%n", "1 Delivery reports  ", "2 Reply via same centre", "3 Character support");
                            int set2;
                            set2 = input.nextInt();

                            if (set2 == 1) {
                                System.out.println("Delivery reports");

                            }
                            if (set2 == 2) {
                                System.out.println("Reply via same centre");

                            }
                            if (set2 == 3) {
                                System.out.println("Character support");

                            }break;




                        }
                        int set1;


                        set1 = input.nextInt();


                        if (set1 == 1) {
                            System.out.println("message center number");


                        }
                        if (set1 == 2) {
                            System.out.println("Message sent as");

                        }
                        if (set1 == 3) {
                            System.out.println("Message validity" );

                        }


                    }
                    if (messages == 8) {
                        System.out.println("Info service");

                    }
                    if (messages == 9) {
                        System.out.println("Voice mailbox number");

                    }
                    if (messages == 10) {
                        System.out.println("Service command editor");

                    }




                }
                case 3 -> System.out.println("Chat");
                case 4 -> {
                    System.out.println("Call Register");
                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1 Missed Calls", "2 Received Calls",
                            "3  Dialled numbers", "4 Erase recent call lists", "5 Show call duration",
                            "6 Show call costs ", "7 Call cost settings", "8 prepaid credit");

                    int register;
                    register = input.nextInt();
                    if (register == 1) {
                        System.out.println("Missed Calls");
                    }
                    if (register == 2) {
                        System.out.println("Received Calls");
                    }
                    if (register == 3) {
                        System.out.println("Dialled numbers");
                    }
                    if (register == 4) {
                        System.out.println("Erase recent call lists");
                    }
                    if (register == 5) {
                        System.out.println("Show call duration");
                        System.out.printf("%s%n%s%n%s%n%s%n%s%n", "1 Last call duration",
                                "2 All calls duration", "3 Received calls duration", "4 Dialled calls duration", "5 Clear timers");

                        int callduration;
                        callduration = input.nextByte();
                        if (callduration == 1) {
                            System.out.println("Last call duration");

                        }
                        if (callduration == 2) {
                            System.out.println("All calls duration");

                        }
                        if (callduration == 3) {
                            System.out.println("Received calls duration");

                        }
                        if (callduration == 4) {
                            System.out.println("Dialled calls duration");

                        }
                        if (callduration == 5) {
                            System.out.println("Clear timers");

                        }


                    }
                    if (register == 6) {
                        System.out.println("Show call cost");
                        System.out.printf("%s%n%s%n%s%n", "1 Last call cost",
                                "2 All calls cost", "3 Clear counters");

                        int showcost;
                        showcost = input.nextByte();
                        if (showcost == 1) {
                            System.out.println("Last call cost");

                        }
                        if (showcost == 2) {
                            System.out.println("All calls cost");

                        }
                        if (showcost == 3) {
                            System.out.println("Clear counters");

                        }


                    }
                    if (register == 7) {
                        System.out.println("cost settings");
                        System.out.printf("%s%n%s%n", "1 call cost limit",
                                "2 Show cost in");

                        int calllimit;
                        calllimit = input.nextByte();
                        if (calllimit == 1) {
                            System.out.println("call cost limit");

                        }
                        if (calllimit == 2) {
                            System.out.println("Show cost in");

                        }


                    }
                    if (register == 8) {
                        System.out.println("Prepaid credit");

                    }



                }
                case 5 -> {
                    System.out.println("Tones");
                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1  Ringing tone",
                            "2 Ringing volume", "3 Incoming call alert ", "4  Composer",
                            "5 Message alert tone", "6 Keypad tones ", "7  Warning and game tones",
                            "8  Vibrating alert", "9   Screen saver");
                    int tones;
                    tones = input.nextInt();
                    switch (tones){
                        case 1 -> {
                            System.out.println("Ringing Tone");
                        }
                        case 2 -> {
                            System.out.println("Ringing Volume");
                        }
                        case 3-> {
                            System.out.println("Incoming call alert");
                        }
                        case 4-> {
                            System.out.println("Composer");
                        }

                        case 5-> {
                            System.out.println("Message alert tone");
                        }
                        case 6-> {
                            System.out.println("Keypad tones");
                        }
                        case 7->{
                            System.out.println("Warning and game tones");
                        }
                        case 8->{
                            System.out.println("Vibrating alert");
                        }
                        case 9->{
                            System.out.println("Screen saver");
                        }



                    }



                }
                case 6 -> {
                    System.out.println("Settings");
                    System.out.printf("%s%n%s%n%s%n%s%n", "1 Call settings",
                            "2 Phone settings", "3 Security settings", "4 Restore Factory Settings");

                    int settings;
                    settings = input.nextInt();

                    if (settings == 1) {
                        System.out.println("Call settings");
                        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "1 Automatic redial",
                                "2 Speed dialing", "3 Call waiting", "4 Own number sending", "5 Phone line in use","6 Automatic answer");

                        int callSettings;
                        callSettings = input.nextByte();
                        if (callSettings == 1) {
                            System.out.println("Automatic redial");

                        }
                        if (callSettings == 2) {
                            System.out.println("Speed dialing");

                        }
                        if (callSettings == 3) {
                            System.out.println("Call waiting");

                        }
                        if (callSettings == 4) {
                            System.out.println("Own number sending");

                        }
                        if (callSettings == 5) {
                            System.out.println("Phone line in use");

                        }
                        if (callSettings == 6) {
                            System.out.println("Automatic answer");
                        }



                    }
                    if (settings == 2) {
                        System.out.println("Phone settings");
                        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "1 Language",
                                "2 Cell info display", "3 Welcome note", "4 Network selection", "5 Lights","6 Confirm SIM service actions");

                        int phoneSettings;
                        phoneSettings = input.nextByte();
                        if (phoneSettings == 1) {
                            System.out.println("Language");

                        }
                        if (phoneSettings == 2) {
                            System.out.println("Cell info display");

                        }
                        if (phoneSettings == 3) {
                            System.out.println("Welcome note");

                        }
                        if (phoneSettings == 4) {
                            System.out.println("Network selection");

                        }
                        if (phoneSettings == 5) {
                            System.out.println("Lights");

                        }
                        if (phoneSettings == 6) {
                            System.out.println("Confirm SIM service actions");
                        }

                    }
                    if (settings == 3) {

                        System.out.println("Security settings");
                        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "1 Pin code request",
                                "2 Call barring service", "3 Fixed dialling", "4 Closed user group", "5 Phone security","6 Change access codes");

                        int sSettings;
                        sSettings = input.nextByte();
                        if (sSettings == 1) {
                            System.out.println("Pin code request");

                        }
                        if (sSettings == 2) {
                            System.out.println("Call barring service");

                        }
                        if (sSettings == 3) {
                            System.out.println("Fixed dialling");

                        }
                        if (sSettings == 4) {
                            System.out.println("Closed user group");

                        }
                        if (sSettings == 5) {
                            System.out.println("Phone security");

                        }
                        if (sSettings == 6) {
                            System.out.println("Change access codes");
                        }


                    }
                    if (settings == 4) {
                        System.out.println("Restore factory settings");

                    }





                }

                case 7 -> System.out.println("Call Divert");

                case 8 -> System.out.println("Games");
                case 9 -> System.out.println("Calculator");
                case 10 -> System.out.println("Reminder");
                case 11 -> {
                    System.out.println("Clock");
                    System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "1  Alarm clock",
                            "2 Clock settings", "3 Date settings ", "4  Stopwatch",
                            "5 Countdown", "6 Auto update of date and time");
                    int clock;
                    clock = input.nextInt();

                    if (clock == 1) {
                        System.out.println("Alarm clock");

                    }
                    if (clock == 2) {
                        System.out.println("Clock settings");

                    }
                    if (clock == 3) {
                        System.out.println("Date settings");

                    }
                    if (clock == 4) {
                        System.out.println("Stopwatch");

                    }
                    if (clock == 5) {
                        System.out.println("Countdown");

                    }
                    if (clock == 6) {
                        System.out.println("Auto update of date and time");

                    }


                }

                case 12 -> System.out.println("Profiles");
                case 13 -> System.out.println("Sim Services");
                default -> System.out.println("null");
            }
        }
    }




