public class ServerNameGenerator {


        public static String[] adjectives = {"adorable", "better", "calm", "bored", "clumsy", "drab", "dizzy", "cruel", "awful", "average"};
        public static String[] nouns = {"gold", "hair", "airport", "hydrogen", "raincoat", "queen", "pillow", "ice", "banana", "grass"};

    public static int getRandom(){
        return (int) Math.floor(Math.random() * 9);
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:");
        System.out.println(adjectives[getRandom()] + "-" + nouns[getRandom()]);
    }

}
