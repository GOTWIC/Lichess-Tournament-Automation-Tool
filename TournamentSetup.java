import java.time.*; 

class TournamentSetup {
    public static void main(String[] args) {

        String token = "lip_C9wjulgnvHqQq6kXegww";
        String team = "kings--queens-chess-academy";
        String stringTime;
        ZonedDateTime initialtime;
        ZonedDateTime time;

        int offset = 1;
        int days = 10;

        stringTime = LocalDateTime.now().toString().substring(0, 11) + "22:30:00.000Z";
        initialtime = ZonedDateTime.parse(stringTime);

        var client = chariot.Client.auth(token);

        for(int i = 0; i < days; i++){
            String name;
            if(i%2 == 0)
                name = "Pawn 1 and Pawn 2";
            else
                name = "Pawn 3 and Knight";
            
            time = initialtime.plusDays(i/2 + offset);
                
            final ZonedDateTime finalTime = time;

            var res = client.tournaments().createArena(params -> params
                    .clock(10, 5)
                    .minutes(70)
                    .rated(true)
                    .name(name)       
                    .conditionTeam(team)
                    .berserkable(false)
                    .startTime(s -> s.atDate(finalTime)));

            System.out.println("Working...");
        }

        System.out.println("Tournaments Successfully Created");
    }
}




// To Run: C:/"Program Files"/Java/jdk-17.0.2/bin/java -p . --add-modules chariot TournamentSetup.java