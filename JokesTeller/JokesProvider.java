package com.example.jokeslib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokesProvider {
    static List<Jokes> jokes = new ArrayList<>();
    public static String getJokes(){
        setJokes();
        Random random = new Random();
        int randIndex = random.nextInt(jokes.size());
        Jokes joke = jokes.get(randIndex);
        return joke.getJoke();
    }
    private static void setJokes(){
        jokes.add(new Jokes("I ate a clock yesterday, it was very time-consuming."));
        jokes.add(new Jokes("Have you played the updated kids' game? I Spy With My Little Eye . . . Phone."));
        jokes.add(new Jokes("A perfectionist walked into a bar...apparently, the bar wasn’t set high enough."));
        jokes.add(new Jokes("Did you hear about the monkeys who shared an Amazon account? They were Prime mates."));
        jokes.add(new Jokes("Don't use \"beef stew\" as a computer password. It's not stroganoff."));
        jokes.add(new Jokes("On my wedding day, my mom told my bride, “No refunds, no exchanges on sale items."));
        jokes.add(new Jokes("I can give you the cause of anaphylactic shock in a nutshell."));
        jokes.add(new Jokes("I asked God for a bike, but I know God doesn’t work that way. So I stole a bike and asked for forgiveness"));
        jokes.add(new Jokes("I want to die peacefully in my sleep, like my grandfather.. Not screaming and yelling like the passengers in his car."));
        jokes.add(new Jokes("If you think nobody cares if you’re alive, try missing a couple of payments."));
    }
}
