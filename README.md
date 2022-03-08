# Lichess Tournament Automation Tool
A java automation tool that remotely sets up chess tournaments via Lichess API

### Usage

1. Generate a OAuth API Token here: [Lichess API Access Token Request](https://lichess.org/account/oauth/token/create "New Personal Lichess API Access Token")

2. Download the repo

3. Paste the token inside the "" on line 6 of the TournamentSetup.java file.

4. Open a Windows Powershell in the root directory

5. Run TournamentSetup.java using 

```
C:/"Program Files"/Java/jdk-17.0.2/bin/java -p . --add-modules chariot TournamentSetup.java
```

This tool was originaly written in python. However, the python client for the LichessAPI was missing a geat deal of documentation rendering the tool incomplete. The Java client has significantly better documentation, allowing this tool to be completed.
