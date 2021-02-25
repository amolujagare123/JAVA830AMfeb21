package Inheritance.Polymorphism;

public class TvShowRoom {

    void channel()
    {
        System.out.println("TvShow room Channels");
    }
    void volumeControl()
    {
        System.out.println("TvShow room volumeControl");
    }
    void settings()
    {
        System.out.println("TvShow room settings");
    }
}

class Samsang extends TvShowRoom{

    void channel()
    {
        System.out.println("Samsang Channels");
    }
    void volumeControl()
    {
        System.out.println("Samsang volumeControl");
    }
    void settings()
    {
        System.out.println("Samsang settings");
    }
}

class LG extends TvShowRoom{

    void channel()
    {
        System.out.println("LG Channels");
    }
    void volumeControl()
    {
        System.out.println("LG volumeControl");
    }
    void settings()
    {
        System.out.println("LG settings");
    }
}

class Onida extends TvShowRoom{

    void channel()
    {
        System.out.println("Onida Channels");
    }
    void volumeControl()
    {
        System.out.println("Onida volumeControl");
    }
    void settings()
    {
        System.out.println("Onida settings");
    }
}

class TestTvShowroom
{
    public static void main(String[] args) {

        TvShowRoom ob = new TvShowRoom();

        ob.channel();
        ob.settings();
        ob.volumeControl();

        ob = new Samsang();

        ob.channel();
        ob.settings();
        ob.volumeControl();

        ob = new LG();

        ob.channel();
        ob.settings();
        ob.volumeControl();

        ob = new Onida();

        ob.channel();
        ob.settings();
        ob.volumeControl();

    }
}


