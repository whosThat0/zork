package zork;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner console = new Scanner(System.in);
    static Random random = new Random();
    static int randomNum1 = random.nextInt(5);
    static int randomNum2 = random.nextInt(3);
    static int randomNum3 = random.nextInt(6);
    static int randomNum4 = random.nextInt(4);
    static int randomNum5 = random.nextInt(2);


    public static void main(String[] args) {
        kitchen(true);
    }

    private static void living_room(boolean showintro) {
        String t;
        String s;
        if (showintro) {
            System.out.println("You made it to the living room");
            System.out.println("What do you want to do ?");
        }
        System.out.println("I would try to look around :)");
        t = console.nextLine();
        if (t.equalsIgnoreCase("look") || t.equalsIgnoreCase("look around")) {
            System.out.println("You find a small old box");
            System.out.println("Do you want to open it ?");
            s = console.nextLine();
            switch (s) {
                case "yes":
                    System.out.println("You found an old book in that box");
                    System.out.println("It was the famous book Ulysses by James Joyce");
                    System.out.println("You put the book back into the box not thinking about it anymore");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {

                        throw new RuntimeException(e);
                    }
                    kitchen(false);
                case "no":
                    leavethehouse(true);

                default:
                    living_room(false);
            }

        } else {
            System.out.println("Try again with the right word");
            living_room(false);
        }
    }

    private static void living_room2(){
        String h;
        String j;
        System.out.println("You made it into the living room again");
        System.out.println("What do you want to do ?");
        h = console.nextLine();
        if(h.equalsIgnoreCase("look")|| h.equalsIgnoreCase("look around")) {
            System.out.println("There is nothing in the room except for the empty box you found before.");

        }else {
            System.out.println("Try again with the right word");
            living_room2();
        }
    }

    private static void leavethehouse(boolean showintro) {
        String s;
        if (showintro) {
            System.out.println("Since you dont want to collect items that are necessary for escaping :(");
        }
        System.out.println("Do you want to get out of the house ?");
        s = console.nextLine();
        switch (s) {
            case ("yes"):
                System.out.println("Then you may continue");
                downstairs(false);
            case ("no"):
                System.out.println("Then it shall be. You lived another 3 days before you cancel the membership to life");
                console.close();
            default:
                System.out.println("Try yes or no");
                leavethehouse(false);
        }
    }

    private static void kitchen(boolean showintro) {
        if (showintro) {
            System.out.println("You woke up on a table in a old, rancid kitchen. You dont recall ever being there.");
            System.out.println("The old house that you are in has a very wierd smell and you hear a lot of commotion outside but you choose to ignore it.");
            System.out.println("You decide to investigate the house. Where do you want to go ?");
        }
        System.out.println("You can go into ;");
        System.out.println("1: The living room ");
        System.out.println("2: The front door  ");
        System.out.println("3: Upstairs ");
        String b;
        b = console.nextLine();

        switch (b) {
            case "1":
                living_room(true);
                break;
            case "2":
                front_door(true);
                break;
            case "3":
                upstairs(true);
                break;
            default:
                System.out.println("Try the numbers :)");
                kitchen(false);
        }
    }

    private static void front_door(boolean door) {
        if (door) {
            System.out.println("You went to the front door ");
            System.out.println("What do you want to do ?");
        }
        System.out.println("I would try to look around :)");
        String t;
        String s;
        t = console.nextLine();
        if (t.equalsIgnoreCase("look") || t.equalsIgnoreCase("look around")) {
            System.out.println("There is a clearly locked door \n" +
                    "Are you sure that you have the right number-code ?");
            s = console.nextLine();
            switch (s) {
                case "no":
                    System.out.println("Then you should go and find the code again");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    downstairs(false);
                    break;
                case "yes":
                    System.out.println("Then lets start the Test :)");
                    test(true);
                    break;
                default:
                    System.out.println("Try yes or no");
                    front_door(false);
            }
        } else {
            front_door(false);
        }
    }

    private static void test(boolean iffailed) {
        if (iffailed) {
            System.out.println(" You have one try to get it all right :) \n" +
                    "Good Luck");
        }
        System.out.println(9);
        System.out.println(randomNum1);
        System.out.println(6);
        int t;
        int w;
        int i;
        int c;
        int e;
        t = console.nextInt();
        if (t == randomNum1) {
            System.out.println("Yes that is correct. Try the next number.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException s) {
                throw new RuntimeException(s);
            }
            System.out.println(randomNum2);
            System.out.println(4);
            System.out.println(6);
            w = console.nextInt();
            if (w == randomNum2) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException s) {
                    throw new RuntimeException(s);
                }
                System.out.println("Yes that is correct. You didnt get caught. Good Job :p");
                System.out.println(9);
                System.out.println(randomNum3);
                System.out.println(7);
                i = console.nextInt();
                if (i == randomNum3) {
                    System.out.println("Yes that is correct. You can play another round");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException s) {
                        throw new RuntimeException(s);
                    }
                    System.out.println(8);
                    System.out.println(5);
                    System.out.println(randomNum4);
                    c = console.nextInt();
                    if (c == randomNum4) {
                        System.out.println("Yes good Job. only one more to go :]");
                        System.out.println(randomNum5);
                        System.out.println(7);
                        System.out.println(4);
                        e = console.nextInt();
                        if (e == randomNum5) {
                            woods(true);
                        } else {
                            deadintest();
                            console.close();
                        }

                    } else {
                        deadintest();
                        console.close();
                    }
                } else {
                    deadintest();
                    console.close();
                }
            } else {
                deadintest();
                console.close();
            }
        } else {
            System.out.println("Since it is your first try you can try again");
            System.out.println("Btw just so yk the next time you enter numbers you will die");
            test(false);
        }


    }

    private static void deadintest() {
        System.out.println("This is the wrong number. I have warned you about the consequences ");
        System.out.println("Tiny came to get you....");
        System.out.println("YOU HAVE DIED");
        console.close();
    }

    private static void bathroom(boolean showintro) {
                if (showintro) {
            System.out.println("You went into the bathroom ");
            System.out.println("What do you want to do ?");
        }
        System.out.println("I would try to look around :)");
        String t;
        String s;
        t = console.nextLine();
        if (t.equalsIgnoreCase("look") || t.equalsIgnoreCase("look around")) {
            System.out.println("There is a old small door in the left corner");
            System.out.println("Do you want to try to open it ?");
            s = console.nextLine();
            switch (s) {
                case "yes":
                    secret_room();
                case "no":
                    System.out.println("Then go do something else :(");
                    upstairs(true);
                default:
                    System.out.println("Try yes or no");
                    bathroom(false);
            }

        } else {
            bathroom(false);
        }
    }

    private static void bedroom(boolean showintro) {
        if (showintro) {
            System.out.println("You went into the bedroom ");
            System.out.println("What do you want to do ?");
        }
        System.out.println("I would try to look around :)");
        String b;
        String t;
        String s;
        String v;
        t = console.nextLine();
        if (t.equalsIgnoreCase("look") || t.equalsIgnoreCase("look around")) {
            System.out.println("There is nothing here. Except an old spider");
            System.out.println("Do you want to talk to it ?");
            s = console.nextLine();
            switch (s) {
                case "yes":
                    System.out.println("Old spider: Hello Wanderer, do you want a little help ? ");
                    b = console.nextLine();
                    switch (b) {
                        case "yes":
                            System.out.println("Then here you go enjoy the quick access to the code");
                            System.out.println("Here is the code for you use it wise ");
                            System.out.print(randomNum1);
                            System.out.print(randomNum2);
                            System.out.print(randomNum3);
                            System.out.print(randomNum4);
                            System.out.println(randomNum5);
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            upstairs(true);
                            break;
                        case "no":
                            System.out.println("Why wouldn't you not want help ?");
                            System.out.println("Is that your finale choice ?");
                            v = console.nextLine();
                            switch (v) {
                                case "yes":
                                    System.out.println("So then get out of my sight >:(");
                                    upstairs(false);
                                case "no":
                                    System.out.println("Then you may try again ");
                                    bedroom2();

                                default:
                                    System.out.println("Try yes and no");
                                    bedroom(false);
                            }
                    }

                case "no":
                    System.out.println("Old spider: You are a very wierd Wanderer");
                    System.out.println("*you here him mumble something but you cant really hear it*");
                    System.out.println("If this is your final choice enjoy some extremely pointless poetry");
                    System.out.println("""
                            In life's tapestry, woven with memory and time, I reflect on days of old. The world has danced through changing eras, much like a river on ancient stones.\s
                             Years teach patience, revealing our true selves. Wisdom embraces life's joys and sorrows. Through youth and reflection, I've learned value in relationships and laughter.
                             Sunsets remind us of fleeting beauty, urging us to cherish moments. Age has taught me patience and listening to nature and hearts around.\s
                             So, as you journey through time's tapestry, savor each stitch, for patches of the past shape your future's masterpiece.""");
                    System.out.println("""
                            In life's tapestry, I ponder old days. The world shifts, years sculpt essence. Wisdom cherishes joy, sorrow.\s
                             Through youth's reflection, I've learned bond richness.
                             Age teaches patience, listening. Amid time's fabric,\s
                             each stitch treasures past's shaping of future art.\s""");
                    System.out.println("Have fun getting something useful out of that");
                    try {
                        Thread.sleep(7500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("Now get out of my sight");
                    upstairs(true);

                default:
                    System.out.println("Try yes or no");
                    bedroom(false);

            }
        }

    }

    private static void bedroom2() {
        String s;
        System.out.println("So Wanderer do you want my help now ?");
        s = console.nextLine();
        switch (s) {
            case "yes":
                System.out.println("Very well then Wanderer.");
                System.out.println("Then here you go enjoy the quick access to the code");
                System.out.println("Here is the code for you use it wise ");
                System.out.print(randomNum1);
                System.out.print(randomNum2);
                System.out.print(randomNum3);
                System.out.print(randomNum4);
                System.out.println(randomNum5);
                try {
                    Thread.sleep(3400);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                upstairs(true);
            case "no":
                System.out.println("So then I guess not ");
                System.out.println("Then get out of my face");
                upstairs(true);
            default:
                System.out.println("Try yes or no");
                bedroom2();
        }

    }

    private static void secret_room() {
        System.out.println("You want to go into the secret room but are you sure that you know what you need to get into the room ?");
        String s;
        String k;
        String z;
        s = console.nextLine();
        switch (s) {
            case "yes":
                System.out.println("What was the title of the book ?");
                System.out.println("1: Wuthering Heights by Emily Brontë");
                System.out.println("2: War and Peace by Leo Tolstoy");
                System.out.println("3: Ulysses by James Joyce");
                k = console.nextLine();
                switch (k) {
                    case "1", "2":
                        System.out.println("This is not the right book. Better luck next time ");
                        secret_room();
                        break;
                    case "3":
                        System.out.println("This is the right book good job :)");
                        System.out.println("Here is a little list that may be useful on your Escape");
                        System.out.println("Just a little Head-start that if you leave this house there is no way back \n" +
                                " A List of Entities you may encounter ");
                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("""
                                - Entity 3 = The Smiler\s
                                 This Entity ist very hostile. If you see it what ever you do, do not run away from it\s
                                It is much much faster than you and will catch you. If you encounter it try throwing a light source\s
                                or if you get the Smiler Exterminator from a non-hostile Entity""");
                        try {
                            Thread.sleep(3500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("""
                                - Entity 194 = The Crystal Sisters\s
                                These Entities are 3 Sisters with the names Ruby, Amethyst and Turquoise\s
                                And they are non-hostile and wont attack you. If you are nice to them, they will maybe give you something useful""");
                        try {
                            Thread.sleep(2500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("""
                                - Entity 222 = The Soulsucker\s
                                The Soulsucker Entity is a very Hostile Entity and he will kill you if he reaches his fifth and finale phase\s
                                He will not kill you if you are not to loud and dont make any loud movement.""");
                        try {
                            Thread.sleep(2500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("""
                                - Entity 326 = The Cuddle Mares\s
                                The Cuddle Mares are non Hostile Entity's and wont attack you. Instead you can talk to them.\s
                                 If your nice to them they will maybe give you something""");
                        try {
                            Thread.sleep(2500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("""
                                - Entity 400 = The Mimic\s
                                This is a very hostile Entity and mimics familiar Stuff. So he will mimic houses from your Childhood\s
                                or even your families members and friends""");
                        try {
                            Thread.sleep(2500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("""
                                - Entity 720 = Tiny\s
                                This is a very hostile Entity and you can try talking to it and make him leave you alone.\s
                                I would not recommend trying to run away from it since it is a very fast entity.""");
                        try {
                            Thread.sleep(2500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("""
                                - Entity 41 =  The Artist\s
                                This is a non-hostile Entity. If you ever get to meet her talk about how her art is good\s
                                so you dont piss her off. If you are nice to her she will give you some advice :)""");
                        try {
                            Thread.sleep(2500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("""
                                - Entity 1 = Humans\s
                                This is a non-hostile Entity and they wont attack you at all. I would advise you to help them.\s
                                You will have a better chance of surviving if you help them.""");

                        try {
                            Thread.sleep(3500);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.println("- Just remember that there are nearly 1000 Entities ");
                        System.out.println("These are just the ones you will most likely encounter. Dont worry you wont encounter all of them :)");
                        upstairs(true);
                        break;
                    default:
                        System.out.println("Try the numbers");
                }
            case "no":
                System.out.println("Are you sure ?");
                z = console.nextLine();
                switch (z) {
                    case "no":
                        System.out.println("Then you get another chance :)");
                        secret_room();
                        break;

                    case "yes":
                        System.out.println("Then you will go back into the hallway upstairs");
                        upstairs(true);
                        break;
                    default:
                        System.out.println("Try yes or no");
                        secret_room();

                }
                break;

            default:
                System.out.println(" Try the words yes or no :) ");
                secret_room();
        }


    }

    public static void woods(boolean showstart) {
        String g;
        if (showstart) {
            System.out.println("""
                    You have finally escaped the house\s
                    There is no way back and the house disappeared right before your eyes \s
                    The only thing you can do is start running""");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException h) {
                throw new RuntimeException(h);
            }
            System.out.println("As soon you get to running you see that there are multiple curves and turns ");
            System.out.println("I would suggest to remember all the things that you found out in the secret room");
            try {
                Thread.sleep(450);
            } catch (InterruptedException h) {
                throw new RuntimeException(h);
            }
            System.out.println("You have a Choice to make. Choose wisely....");
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("You could go left or right ");
        }
        g = console.nextLine();
        if (g.equalsIgnoreCase("left")) {
            System.out.println("You have chose to go left. You will have to see if you chose the right direction");
            entity41();
        } else if (g.equalsIgnoreCase("right")) {
            System.out.println("You have chose to go right. You will have to see if you chose the right direction");
            entity194();
        } else {
            System.out.println("Try the words left or right");
            woods(false);
        }
    }

    public static void woodsright1(boolean showintro) {
        if (showintro) {
            System.out.println("wow pass the first choice, good");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
        System.out.println("On which side do you want to go now ?");
        String b;
        b = console.nextLine();
        if (b.equalsIgnoreCase("right")) {
            entity3();
        } else if (b.equalsIgnoreCase("left")) {
            entity326();
        } else {
            System.out.println("Try the words left or right");
            woodsright1(false);
        }
    }

    public static void woodsleft1(boolean showintro) {
        if (showintro) {
            System.out.println("you can make another choice, choose wisely");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
        System.out.println("On which side do you want to go now ?");
        String b;
        b = console.nextLine();
        if (b.equalsIgnoreCase("right")) {
            entity326();
        } else if (b.equalsIgnoreCase("left")) {
            System.out.println("You have encounter nothing");
            System.out.println("You made a really good choice");
            woodsright2(true);
        } else {
            System.out.println("Try the words left or right");
            woodsleft1(false);
        }
    }

    public static void woodsright2(boolean showintro) {
        if (showintro) {
            System.out.println("good job with choosing a decent way, dont loose now ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
        System.out.println("On which side do you want to go now ?");
        String b;
        b = console.nextLine();
        if (b.equalsIgnoreCase("right")) {
            entity720();
        } else if (b.equalsIgnoreCase("left")) {
            entity1();
        } else {
            System.out.println("Try the words left or right");
            woodsright2(false);
        }
    }

    public static void woodsleft4(boolean showintro) {
        if (showintro) {
            System.out.println("You live to make another choice");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
        System.out.println("On which side do you want to go now ?");
        String b;
        b = console.nextLine();
        if (b.equalsIgnoreCase("right")) {
            entity503();
            System.out.println("YOU WON");
            console.close();
        } else if (b.equalsIgnoreCase("left")) {
            System.out.println("You have encountered nothing");
            System.out.println("You have escaped the forest");
            System.out.println("YOU WON");
            console.close();
        } else {
            System.out.println("Try the words left or right");
            woodsleft4(false);
        }
    }

    public static void woodsright4(boolean showintro) {
        if (showintro) {
            System.out.println("You have a good choice as it seems, dont screw it up now");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
        System.out.println("On which side do you want to go now ?");
        String b;
        b = console.nextLine();
        if (b.equalsIgnoreCase("right")) {
            entity222();
        } else if (b.equalsIgnoreCase("left")) {
            entity400();
        } else {
            System.out.println("Try the words left or right");
            woodsright4(false);
        }
    }

    public static void entity3() {
        String b;
        System.out.println("You have encountered Entity 3 | The Smiler");
        System.out.println("How can you escape the Smiler?");
        System.out.println("""
                1: The Smiler Exterminator\s
                2: Throwing a light source after it\s
                3: Just making a run for it""");
        b = console.nextLine();
        switch (b) {
            case "1":
                System.out.println("That is a good idea :D");
                woodsright2(true);
                break;
            case "2":
                System.out.println("That is a really good idea :D");
                woodsright2(true);
                break;
            case "3":
                System.out.println("That is a really bad idea :o");
                System.out.println("YOU DIED");
                console.close();
                break;
            default:
                System.out.println("Try the numbers");
                entity3();
        }

    }

    public static void entity194() {
        String b;
        System.out.println("You have encountered Entity 194 | The Crystal Sisters");
        System.out.println("What are the Names of The Crystal Sisters ?");
        System.out.println("""
                1: Ruby, Amethyst, Turquoise\s
                2: Lapis Lazuli, Obsidian, Rose Quartz\s
                3: Tiger's Eye, Topaz, Amazonite""");
        b = console.nextLine();
        switch (b) {
            case "1":
                System.out.println("That is correct. They gave you The Smiler Exterminator");
                woodsright1(true);
                break;
            case "2", "3":
                System.out.println("That is incorrect. They wont attack but you get nothing from them");
                woodsright1(true);
                break;
            default:
                System.out.println("Try the numbers ");
                entity194();

        }
    }

    public static void entity222() {
        String b;
        System.out.println("You have encountered Entity 222 | The Soulsucker");
        System.out.println("How many Phases does the Soulsucker have ?");
        System.out.println("""
                1: It has four phases\s
                2: It has five phases\s
                3: It has two phases""");
        b = console.nextLine();
        switch (b) {
            case "1", "3":
                System.out.println("That is wrong.");
                System.out.println("YOU DIED");
                console.close();
                break;
            case "2":
                System.out.println("That is correct.");
                System.out.println("You got out of the forest.");
                System.out.println("YOU WON");
                console.close();
                break;
            default:
                System.out.println("Try the numbers");
                entity222();
        }
    }

    public static void entity326() {
        String b;
        String t;
        System.out.println("You have encountered Entity 326 | The Cuddle mares");
        System.out.println("What do you want to do to the Cuddle mares");
        System.out.println("""
                1: Leave them alone and keep walking\s
                2: Talk with them\s
                3: Trying to attack them""");
        b = console.nextLine();
        switch (b) {
            case "1":
                System.out.println("That is a okay idea. They dont follow you and dont want to attack you");
                woodsright2(true);
                break;
            case "2":
                System.out.println("They enjoy talking too you and they asked if you will take them with. You do you want to ?");
                t = console.nextLine();
                switch (t) {
                    case "yes":
                        System.out.println("You will take them with you and they are very happy about that");
                        woodsright2(true);
                        break;
                    case "no":
                        System.out.println("They are not really happy about that but they respect your decision :/");
                        woodsright2(true);
                        break;
                    default:
                        System.out.println("Try yes or no");
                        entity326();
                }
        }
    }

    public static void entity400() {
        String s;
        System.out.println("You have encountered Entity 400 | The Mimic");
        System.out.println("Do you know what the Mimic mimics ?");
        System.out.println("""
                1: Houses\s
                2: Humans\s
                3: Pets""");
        s = console.nextLine();
        switch (s) {
            case "1", "2":
                System.out.println("That is correct. You can see it before it attacks you");
                System.out.println("You have escaped the forest");
                System.out.println("YOU WON");
                console.close();
                break;
            case "3":
                System.out.println("That is incorrect. You could not make out what it was mimicking and it could catch and kill you");
                System.out.println("YOU DIED");
                console.close();
                break;
            default:
                System.out.println("Try the numbers");
                entity400();
        }

    }

    public static void entity503() {
        String k;
        System.out.println("You have encountered Entity 503 | The Volts");
        System.out.println("Do you know how many Entities haunt these Woods?");
        System.out.println("""
                1: These Woods are haunted by over 1000 Entities\s
                2: These Woods are haunted by over 200 Entities\s
                3: These Woods are not haunted at all""");
        k = console.nextLine();
        switch (k) {
            case "1":
                System.out.println("That is correct. Hope you didnt encounter too many of them :P");
                System.out.println("You have escaped the forest");
                System.out.println("YOU WON");
                console.close();
                break;
            case "2", "3":
                System.out.println("That is wrong. These woods are very haunted and you just got too from the Volt :|");
                System.out.println("YOU DIED");
                console.close();
                break;
            default:
                System.out.println("Try the numbers ");
                entity503();
        }
    }

    public static void entity720() {
        String b;
        System.out.println("You have encountered Entity 720 | Tiny");
        System.out.println("What do you want to do in the presence of Tiny ");
        System.out.println("""
                1: Make a run for it\s
                2: Trying to harm him\s
                3: Trying to talk to it""");
        b = console.nextLine();
        switch (b) {
            case "1", "2":
                System.out.println("That is very very bad idea ");
                System.out.println("YOU DIED");
                console.close();
                break;
            case "3":
                System.out.println("That actually work and you persuaded it into leaving you alone ");
                woodsleft4(true);
                break;
            default:
                System.out.println("Try the numbers");
                entity720();
        }

    }

    public static void entity41() {
        String b;
        System.out.println("You have encountered Entity 41 | The Artist");
        System.out.println("What do you want to do ?");
        System.out.println("""
                1: Talking to her\s
                2: Tell her, her art is really ugly :(\s
                3: Run away for her""");
        b = console.nextLine();
        switch (b) {
            case "1":
                System.out.println("She is very happy that you where talking to her. She gives you a ton of help and trys keeps the next Entity away from you :P");
                woodsleft1(true);
                break;
            case "2":
                System.out.println("She is very angry at you and will get another Entity that will attack you >:(");
                console.close();
                break;
            case "3":
                System.out.println("SHe is very disappointed that you completely ignored her and wont talk to her :C ");
                woodsleft1(true);
                break;
            default:
                System.out.println("Try the numbers");
                entity41();
        }

    }

    public static void entity1() {
        String b;
        System.out.println("You have you encountered Entity 1 | Humans ");
        System.out.println("What do you want to do ?");
        System.out.println("""
                1: Take them with you\s
                2: Leave them there \s
                3: Just ignore them""");
        b = console.nextLine();
        switch (b) {
            case "1":
                System.out.println("They are very happy that you are taking them with you and thank you a lot");
                woodsright4(true);
                break;
            case "2", "3":
                System.out.println("They wont do anything and just walk past you");
                woodsright4(true);
                break;
            default:
                System.out.println("Try the numbers");
                entity1();
        }
    }

    public static void upstairs(boolean showintro) {
        if (showintro) {
            System.out.println("You went upstairs");
            System.out.println("Where do you want to go ?");
        }
        System.out.println("You can go into ;");
        System.out.println("1: bathroom");
        System.out.println("2: bedroom ");
        System.out.println("3: downstairs ");
        String b;
        b = console.nextLine();

        switch (b) {
            case "1":
                bathroom(true);
                break;
            case "2":
                bedroom(true);
                break;
            case "3":
                downstairs(true);
                break;
            default:
                System.out.println("Try the numbers");
                upstairs(false);
        }


    }

    public static void downstairs(boolean showintro) {
        if (showintro) {
            System.out.println("You went Downstairs");
            System.out.println("Where do you want to go ?");
        }
        System.out.println("You can go into ;");
        System.out.println("1: The living room ");
        System.out.println("2: The front door  ");
        System.out.println("3: Upstairs ");
        Scanner player = new Scanner(System.in);
        String b;
        b = player.nextLine();
        switch (b) {
            case "1":
                living_room(true);
                break;
            case "2":
                front_door(true);
                break;
            case "3":
                upstairs(true);
                break;
            default:
                System.out.println("Try the numbers ");
                downstairs(false);

        }


    }

}