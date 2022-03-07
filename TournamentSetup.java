import java.time.*; 
import io.github.cdimascio.dotenv.Dotenv;

class TournamentSetup {
    public static void main(String[] args) {

        Dotenv env = Dotenv.load();
        String myToken = env.get("LICHESS_TOKEN");
        String token = "";
        String team = "kings--queens-chess-academy";
        String stringTime;
        ZonedDateTime initialtime;
        ZonedDateTime time;

        
        System.out.println(myToken);

        /*


        stringTime = LocalDateTime.now().toString().substring(0, 11) + "23:30:00.000Z";
        initialtime = ZonedDateTime.parse(stringTime);

        var client = chariot.Client.auth(token);

        for(int i = 0; i < 10; i++){
            String name;
            if(i%2 == 0)
                name = "Pawn 1 and Pawn 2";
            else
                name = "Pawn 3 and Knight";
            
            time = initialtime.plusDays(i/2);
                
            final ZonedDateTime finalTime = time;

            var res = client.tournaments().createArena(params -> params
                    .clock(10, 5)
                    .minutes(70)
                    .rated(true)
                    .name(name)       
                    .conditionTeam(team)
                    .berserkable(false)
                    .startTime(s -> s.atDate(finalTime)));
        }

        System.out.println("Tournaments Successfully Created");

        */
    }
}