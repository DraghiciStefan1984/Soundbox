package com.soundbox.draghicistefan.soundbox;

/**
 * Created by grant on 08/02/2016.
 */
public class Constants
{
    public interface ACTION
    {
        public static String MAIN_ACTION = "com.soundbox.draghicistefan.soundbox.action.main";
        public static String PREV_ACTION = "com.soundbox.draghicistefan.soundbox.action.prev";
        public static String PLAY_ACTION = "com.soundbox.draghicistefan.soundbox.action.play";
        public static String NEXT_ACTION = "com.soundbox.draghicistefan.soundbox.action.next";
        public static String STARTFOREGROUND_ACTION = "com.soundbox.draghicistefan.soundbox.action.startforeground";
        public static String STOPFOREGROUND_ACTION = "com.soundbox.draghicistefan.soundbox.action.stopforeground";
    }

    public interface NOTIFICATION_ID
    {
        public static int FOREGROUND_SERVICE = 101;
    }
}
