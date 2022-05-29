# Lichess Tournament Automation Tool
A java automation tool that remotely sets up chess tournaments via Lichess API, created by Swagnik Roychoudhury.

### Usage

1. Download the Chariot API from [Chariot API](https://github.com/tors42/chariot).

2. Generate a OAuth API Token here: [Lichess API Access Token Request](https://lichess.org/account/oauth/token/create "New Personal Lichess API Access Token")

3. Download the repo, put the file in the same directory where the chariot.jar file is installed.

4. Paste the token inside the "" on line 6 of the TournamentSetup.java file.

5. Open a Windows Powershell in the root directory

6. Run TournamentSetup.java using 

```
C:/"Program Files"/Java/jdk-17.0.2/bin/java -p . --add-modules chariot TournamentSetup.java
```

You can change the number of tournaments it creates by changing the _numOfTournaments_ variable on line 13. The default is 10 becuase there are 2 tournaments each day for 5 days a week.

The day offset can be changed on line 12, via the _dayOffset_ variable. The first tournament starts on Monday, so if you run this program on that day, then the offset should be 0. If you run it the day before (Sunday), then the offset will be 1. If you run it 3 days before on Friday, then the offset will be 3.

This tool generates tournaments for 1 week. If you want to do multiple weeks. You can run the program, add 7 to the offset, run the program, add 7 to the offset, run the program, etc.

This tool was originaly written in python. However, the python client for the LichessAPI was missing a geat deal of documentation rendering the tool incomplete. The Java client has significantly better documentation, allowing this tool to be completed.

Special thanks to Tors, the developer of the Java Client, for helping me out with the syntax.
